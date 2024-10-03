package lotr;

public class GameManager {

    public void fight(Character c1, Character c2) {
        System.out.println(c1.getClass().getSimpleName() + " vs " + c2.getClass().getSimpleName());
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            if (c2.isAlive()) {
                c2.kick(c1);
            }
            printStats(c1, c2);
        }
        if (c1.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " wins!");
        } else {
            System.out.println(c2.getClass().getSimpleName() + " wins!");
        }
    }

    private void printStats(Character c1, Character c2) {
        System.out.println(c1.getClass().getSimpleName() + " HP: " + c1.getHp() + ", Power: " + c1.getPower());
        System.out.println(c2.getClass().getSimpleName() + " HP: " + c2.getHp() + ", Power: " + c2.getPower());
    }
}
