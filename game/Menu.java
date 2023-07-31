import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    flecha flecha = new flecha();
    private int opcion=0;
    // 0: 1 player
    // 1: 2 player

    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 780, 1);
        prepararNivel();
    }

    private void prepararNivel()
    {
        addObject(new Startgame(),590,107);
        addObject(new Oneplayer(),595,441);
        addObject(new Twoplayer(),600,626);
        addObject(flecha,606,500);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("UP") && opcion !=0) {opcion++;}
        if (Greenfoot.isKeyDown("DOWN") && opcion !=1) {opcion--;}
        
        if (opcion >= 2) opcion=0;
        if (opcion < 0) opcion=1;
        
        flecha.setLocation(606,500 +(opcion*190));
        
        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER"))
        {
            switch(opcion)
            {
                case 0:
                    Greenfoot.setWorld(new Level1());
                    break;
                case 1:
                    Greenfoot.setWorld(new Level1_1());
                    break;
            }
        }
    }
}
