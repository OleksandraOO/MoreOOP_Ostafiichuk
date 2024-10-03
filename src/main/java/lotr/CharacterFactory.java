package lotr;

import java.util.Random;

public class CharacterFactory {
    private static Random random = new Random();

    static public Character createCharacter() {
        int choice = random.nextInt(4);
        switch (choice) {
            case 0: return new Hobbit();
            case 1: return new Elf();
            case 2: return new King();
            case 3: return new Knight();
            default: return new Hobbit();
        }
    }
}
