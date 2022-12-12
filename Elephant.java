
import greenfoot.*;

public class Elephant extends Actor
{
    int level = 1;
    String facing = "right";
    SimpleTimer timer = new SimpleTimer();
    GreenfootImage [] images = new GreenfootImage[8];
    GreenfootImage [] imagesLeft = new GreenfootImage[8];
    GreenfootSound sound = new GreenfootSound("sounds/elephantcub.mp3");
    public Elephant()
    {
        for(int i = 0; i < 8; i++)
        {
            images[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            images[i].scale(100, 100);
        }
        for(int i = 0; i < 8; i++)
        {
            imagesLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            imagesLeft[i].scale(100, 100);
            imagesLeft[i].mirrorHorizontally();
        }
        setImage(images[0]);
        timer.mark();
    }
    public void act() {
        animate();
        if (Greenfoot.isKeyDown("a")) {
            move(-4);
            facing = "left";
        }
        if (Greenfoot.isKeyDown("d")) {
            move(4);
            facing = "right";
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
            if(facing.equals("right"))
            {
                setImage(images[(i + 1) % 8]);
            }
            else
            {
                setImage(imagesLeft[(i + 1) % 8]);
            }
            i++;
            timer.mark();

        }
            
        
    }
}
