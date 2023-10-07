package lotr;
import kick.kingKick;
import java.util.Random;

public class King extends Character{

    public King() {
        super(new kingKick());
        Random rand = new Random();
        setHp(rand.nextInt(5, 16));
        setPower(rand.nextInt(5, 16));
    }

}
