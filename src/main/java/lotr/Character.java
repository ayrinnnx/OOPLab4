package lotr;

import kick.Kick;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Character {
    private int power;
    private int hp;
    protected Kick kickStrategy;

    public Character(Kick kickStrategy) {
        this.kickStrategy = kickStrategy;
    }

    public void setHp(int hp) {
        this.hp = hp < 0 ? 0 : hp;
    }

    public void kick(Character c) {
        kickStrategy.kick(this, c);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}
