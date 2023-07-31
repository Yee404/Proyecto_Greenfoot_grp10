import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1_1 extends World
{

    /**
     * Constructor for objects of class Level1_1.
     * 
     */
    public Level1_1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 780, 1);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,159,431);
        Ground ground2 = new Ground();
        addObject(ground2,376,596);
        Player1 player1 = new Player1();
        addObject(player1,125,342);
        Player2 player2 = new Player2();
        addObject(player2,388,515);
    }
}
