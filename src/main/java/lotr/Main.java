package lotr;

public class Main {
    public static void main(String[] args) {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();

        GameManager gameManager = new GameManager();

        gameManager.fight(c1, c2);
    }
}