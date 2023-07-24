import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Actor
{
    public Ground()
    {
        getImage().scale(getImage().getWidth()*6,getImage().getHeight());
    }
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //if(Greenfoot.isKeyDown("space"))
        if(Greenfoot.isKeyDown("right"))
        {
            //setLocation(getX(),getY()+5);
            move(-4);
        }
        //if(Greenfoot.isKeyDown("down"))
        if(Greenfoot.isKeyDown("left"))
        {
            move(4);
        }
    }
}
