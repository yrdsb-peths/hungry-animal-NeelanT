import greenfoot.Actor;

public class Apple extends Actor
{
    public void act() {
        this.setLocation(this.getX(), this.getY() + 1);
    }
}
