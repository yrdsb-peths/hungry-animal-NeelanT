 import greenfoot.*;

public class Apple extends Actor
{
    
    int speed = 1;
    public void act() {
        setLocation(getX(), getY() + speed);
        
        if(getY() >= getWorld().getHeight())
        {
            MyWorld world = (MyWorld)getWorld();
            world.removeObject(this);
            world.gameOver();
            
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
        
    }

}
