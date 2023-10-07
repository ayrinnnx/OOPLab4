package lotr;
import kick.kingKick;
import java.util.Random;

public class King extends Character{
    private Random rand = new Random();

    public King() {
        super(new kingKick());
        setHp(rand.nextInt(15 - 5 + 1) + 5);
        setPower(rand.nextInt(15 - 5 + 1) + 5);
    }

}
