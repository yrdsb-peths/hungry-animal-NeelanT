import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    Label score;
    int scoreValue = 1;
    int counter = 0;
    int level = 1;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        Elephant elephant = new Elephant();
        addObject(elephant, 40, 200);
        spawnApple();
        score = new Label(counter, 60);
        addObject(score, getWidth()/2, 50);

    }
    public void spawnApple()
    {
        if (Greenfoot.getRandomNumber(9) == 8)
        {
            Apple apple = new Apple(true);
            apple.setSpeed(level * 2);
            scoreValue = 5;
            addObject(apple, Greenfoot.getRandomNumber(getWidth()), 0);
        }
        else 
        {
            Apple apple = new Apple(false);
            apple.setSpeed(level);
            scoreValue = 1;
            addObject(apple, Greenfoot.getRandomNumber(getWidth()), 0);
        }
        
        
    }
    public void gameOver()
    {
        Label gameEnd = new Label("Game Over", 100);
        addObject(gameEnd, getWidth()/2, getHeight()/2);
    }
    public void increaseScore()
    {
        counter += scoreValue;
        score.setValue(counter);
        if(counter % 5 == 0)
        {
            level++;
        }
    }
}
