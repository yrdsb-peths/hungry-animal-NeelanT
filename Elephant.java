import greenfoot.Greenfoot;
import greenfoot.Actor;

public class Elephant extends Actor
{
    public void act() {
        if (Greenfoot.isKeyDown("a")) {
            this.move(-4);
        }
        if (Greenfoot.isKeyDown("d")) {
            this.move(4);
        }
        if (Greenfoot.isKeyDown("s")) {
            this.setLocation(this.getX(), this.getY() + 4);
        }
        if (Greenfoot.isKeyDown("w")) {
            this.setLocation(this.getX(), this.getY() - 4);
        }
        if (this.isTouching((Class)Apple.class)) {
            this.eat();
        }
    }
    
    public void eat() {
        this.removeTouching((Class)Apple.class);
        final MyWorld world = (MyWorld)this.getWorld();
        world.spawnApple();
    }
}
