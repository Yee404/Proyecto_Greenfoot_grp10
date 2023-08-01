import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Final here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Final extends World
{

    public Final()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 780, 1);
        finalScreen();
        prepare();
    }

    private void finalScreen()
    {
        addObject(new Gameover(),590,350);
        addObject(new Playagain(),590,600);
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER"))
        {
            Greenfoot.setWorld(new Menu());
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
