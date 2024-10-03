package lotr;

public class Hobbit extends Character {
    public Hobbit() {
        super(0, 3);
    }

    @Override
    public void kick(Character c) {
        toCry();
    }

    private void toCry() {
        System.out.println("Cry!");
    }

    @Override
    public String toString() {
        return "Hobbit{hp=" + this.hp + ", power=" + this.power + "}";
    }
}
