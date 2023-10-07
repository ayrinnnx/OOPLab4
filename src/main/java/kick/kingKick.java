package kick;
import lotr.Character;
import java.util.Random;

public class kingKick implements Kick{
    @Override
    public void kick(Character attacker, Character target) {
        Random rand = new Random();
        target.setHp(target.getHp()-rand.nextInt(attacker.getPower()+1));
    }
}
