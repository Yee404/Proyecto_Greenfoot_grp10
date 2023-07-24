import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Actor
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight= -20;
    /**
     * Act - do whatever the player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        moveAround();
        checkFalling();
    }
    private void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move(4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move(-4);
        }
        if (Greenfoot.isKeyDown("space")&&(onGround()==true))
        {
            vSpeed = jumpHeight;
            fall();
        }
    }
    boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Ground.class);
        return under != null;
    }
    public void checkFalling()
    {
        if (onGround()== false)
        {
            fall();
        }
        //if (onGround()== false)
        //{
        //    vSpeed = 0;
        //}
    }
    
}
