package lotr;

import java.util.Random;

public class Knight extends Human {
    private static Random random = new Random();

    public Knight() {
        super(2, 12, 2, 12);  // Knight has power and hp between 2 and 12
    }

    @Override
    public String toString() {
        return "Knight{hp=" + this.hp + ", power=" + this.power + "}";
    }

    
}
