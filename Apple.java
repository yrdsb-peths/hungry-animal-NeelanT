 import greenfoot.*;

public class Apple extends Actor
{
    int level = 1;
    int speed = 1;
    public void act() {
        setLocation(getX(), getY() + 2);
        
        if(getY() >= getWorld().getHeight())
        {
            MyWorld world = (MyWorld)getWorld();
            world.removeObject(this);
            world.gameOver();
            
        }
    }

}
