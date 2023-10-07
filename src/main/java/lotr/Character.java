package lotr;

import kick.Kick;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public abstract class Character { //abstract 'cause we do not creating objects of it, just inherit
    private int power;
    private int hp;
    protected Kick kickStrategy;

    public Character(Kick kickStrategy) {
        this.kickStrategy = kickStrategy;
    }

    public void kick(Character c) {
        kickStrategy.kick(this, c);
    }

    public boolean isAlive() {
        return hp > 0;
    }

}
