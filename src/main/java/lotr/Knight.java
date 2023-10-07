package lotr;
import kick.kingKick;
import java.util.Random;

public class Knight extends Character{

    public Knight() {
        super(new kingKick());
        Random rand = new Random();
        setHp(rand.nextInt(13 - 2 + 1) + 2);
        setPower(rand.nextInt(13 - 2 + 1) + 2);
    }
}
