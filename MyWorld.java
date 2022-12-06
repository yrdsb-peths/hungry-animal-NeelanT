import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    Label score;
    int counter = 0;

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
        Apple apple = new Apple();

        addObject(apple, Greenfoot.getRandomNumber(getWidth()), 0);
    }
    public void gameOver()
    {
        Label gameEnd = new Label("Game Over", 100);
        addObject(gameEnd, getWidth()/2, getHeight()/2);
    }
    public void increaseScore()
    {
        counter++;
        score.setValue(counter);
        
    }
}
