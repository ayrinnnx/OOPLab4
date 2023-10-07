package lotr;

import kick.Kick;
import kick.toCry;

public class Hobbit extends Character{

    public Hobbit() {
        super(new toCry());
        setPower(0);
        setHp(3);
    }

    @Override
    public void kick(Character c) {
        kickStrategy.kick(this, c);
    }
}
