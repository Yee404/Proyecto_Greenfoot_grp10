import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1_2 extends Actor
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight= -20;
    
    Level2_2 thisGame;
    /**
     * Act - do whatever the player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        moveAround();
        checkFalling();
        points();
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
            if(getX()>-5)
                move(4);
            else
                move(-4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            //move(-4);
            if(getX()<1240)
                move(-4);
            else
                move(4);
        }
        if (Greenfoot.isKeyDown("up")&&(onGround()==true))
        {
            vSpeed = jumpHeight;
            fall();
        }
        //if (Greenfoot.isKeyDown("up")&&(onEnd()==false))
        //{
        //    fall();
        //}
    }
    boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Ground.class);
        return under != null;

    }
    boolean onEnd()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, End.class);
        return under != null;

    }
    public void checkFalling()
    {
        if (onGround()== false)
        {
            fall();
            
        }
        
    }
    
    public void points()
    {
        Actor ficha = getOneIntersectingObject(Puntos.class);
        if(ficha != null)
        {
            getWorld().removeObject(ficha);
            thisGame.score++;
        }
    }
}
