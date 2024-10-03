import lotr.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import lotr.Character;

public class CharacterFactoryTest {
    private CharacterFactory factory;

    @BeforeEach
    public void setUp() {
        factory = new CharacterFactory();
    }

    @Test
    public void testCreateCharacterIsHobbit() {
        Character character = new Hobbit();
        assertTrue(character instanceof Hobbit, "Character should be an instance of Hobbit.");
    }

    @Test
    public void testCreateCharacterIsElf() {
        Character character = new Elf();
        assertTrue(character instanceof Elf, "Character should be an instance of Elf.");
    }

    @Test
    public void testCreateCharacterIsKing() {
        Character character = new King();
        assertTrue(character instanceof King, "Character should be an instance of King.");
    }

    @Test
    public void testCreateCharacterIsKnight() {
        Character character = new Knight();
        assertTrue(character instanceof Knight, "Character should be an instance of Knight.");
    }

    @Test
    public void testRandomCharacterCreation() {
        boolean hobbitCreated = false;
        boolean elfCreated = false;
        boolean kingCreated = false;
        boolean knightCreated = false;

        for (int i = 0; i < 100; i++) {
            Character character = factory.createCharacter();
            if (character instanceof Hobbit) hobbitCreated = true;
            if (character instanceof Elf) elfCreated = true;
            if (character instanceof King) kingCreated = true;
            if (character instanceof Knight) knightCreated = true;
        }

        assertTrue(hobbitCreated, "Hobbit should be randomly created.");
        assertTrue(elfCreated, "Elf should be randomly created.");
        assertTrue(kingCreated, "King should be randomly created.");
        assertTrue(knightCreated, "Knight should be randomly created.");
    }
}
