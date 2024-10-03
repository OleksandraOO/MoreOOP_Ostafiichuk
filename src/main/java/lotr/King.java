package lotr;

import java.util.Random;

public class King extends Human {
    private static Random random = new Random();

    public King() {
        super(5, 15, 5, 15);  // King has power and hp between 5 and 15
    }

    @Override
    public String toString() {
        return "King{hp=" + this.hp + ", power=" + this.power + "}";
    }
}
