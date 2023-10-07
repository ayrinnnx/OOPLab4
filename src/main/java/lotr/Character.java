package lotr;

import kick.Kick;

public abstract class Character { //abstract 'cause we do not creating objects of it, just inherit
    private int power;
    private int hp;
    private Kick kickStrategy;

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
