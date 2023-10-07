package lotr;
import java.util.Random;

public class CharacterFactory {
    private static Random rand = new Random();

    public static Character createCharacter() {
        CharacterTypes[] characterTypes = CharacterTypes.values();
        CharacterTypes characterType = characterTypes[rand.nextInt(characterTypes.length)];

        switch (characterType) {
            case HOBBIT:
                return new Hobbit();
            case KING:
                return new King();
            case KNIGHT:
                return new Knight();
            default:
                return new Elf();
        }

    }
}
