package kick;
import lotr.Character;

public class elfKick implements Kick{
    @Override
    public void kick(Character attacket, Character target) {
        if (attacket.getPower() > target.getPower()) {
            target.setHp(0);
        } else {
            target.setHp(target.getHp() - 1);
        }
    }
}
