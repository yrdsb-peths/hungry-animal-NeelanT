import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class TitleScreen extends World
{

    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Label title = new Label("Hungry Animal", 100);
        addObject(title, getWidth()/2, getHeight()/2); 
        Label space = new Label("Press space to start", 45);
        addObject(space, getWidth()/2, 300); 
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);

        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,501,105);
        elephant.setLocation(514,81);
        Label label = new Label("Use 'a' and 'd' to move", 40);
        addObject(label,getWidth()/2,345);


    }
}
