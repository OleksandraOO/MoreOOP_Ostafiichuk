package lotr;

import java.util.Random;

public abstract class Human extends Character {
    private static final Random random = new Random();

    public Human(int minPower, int maxPower, int minHp, int maxHp) {
        super(minPower + random.nextInt(maxPower - minPower + 1), minHp + random.nextInt(maxHp - minHp + 1));
    }

    @Override
    public void kick(Character c) {
        int damage = random.nextInt(this.power + 1);
        c.hp -= damage;
        System.out.println("King inflicts " + damage + " damage to " + c.getClass().getSimpleName());
    }

}
