import greenfoot.Greenfoot;
import greenfoot.Actor;

public class Elephant extends Actor
{
    public void act() {
        if (Greenfoot.isKeyDown("a")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("d")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 4);
        }
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 4);
        }
        if (isTouching(Apple.class)) 
        {
            eat();
        }
    }
    
    public void eat() {
        removeTouching(Apple.class);
        MyWorld world = (MyWorld)getWorld();
        world.spawnApple();
        world.increaseScore();
        
    }
}
