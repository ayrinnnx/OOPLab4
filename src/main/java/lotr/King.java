package lotr;
import kick.kingKick;
import java.util.Random;

public class King extends Character{

    public King() {
        super(new kingKick());
        Random rand = new Random();
        setHp(rand.nextInt(16 - 5 + 1) + 5);
        setPower(rand.nextInt(16 - 5 + 1) + 5);
    }

}
