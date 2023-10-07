package lotr;
import kick.kingKick;
import java.util.Random;

public class Knight extends Character{
    private Random rand = new Random();

    public Knight() {
        super(new kingKick());
        setHp(rand.nextInt(13 - 2 + 1) + 2);
        setPower(rand.nextInt(13 - 2 + 1) + 2);
    }
}
