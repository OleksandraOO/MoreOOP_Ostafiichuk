package lotr;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if (c.power < this.power) {
            c.hp = 0;
            System.out.println("Elf kills the weaker character.");
        } else {
            c.power -= 1;
            System.out.println("Elf decreases the opponent's power.");
        }
    }

    @Override
    public String toString() {
        return "Elf{hp=" + this.hp + ", power=" + this.power + "}";
    }
}
