
import greenfoot.*;

public class Elephant extends Actor
{
    SimpleTimer timer = new SimpleTimer();
    GreenfootImage [] images = new GreenfootImage[8];
    GreenfootSound sound = new GreenfootSound("sounds/elephantcub.mp3");
    public Elephant()
    {
        for(int i = 0; i < 8; i++)
        {
            images[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            images[i].scale(100, 100);
        }
        setImage(images[0]);
        timer.mark();
    }
    public void act() {
        animate();
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
        sound.play();
        world.spawnApple();
        world.increaseScore();
        
    }
    int i = 0;
    public void animate()
    {
        if(timer.millisElapsed() > 100)
        {
            setImage(images[(i + 1) % 8]);
            i++;
            timer.mark();
        }
            
        
    }
}
