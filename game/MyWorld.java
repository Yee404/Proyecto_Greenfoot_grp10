import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,61,551);
        Ground ground2 = new Ground();
        addObject(ground2,355,490);
        Ground ground3 = new Ground();
        addObject(ground3,117,375);
        Ground ground4 = new Ground();
        addObject(ground4,622,432);
        Ground ground5 = new Ground();
        addObject(ground5,600,312);
        Ground ground6 = new Ground();
        addObject(ground6,318,248);
        Ground ground7 = new Ground();
        addObject(ground7,111,130);
        Ground ground8 = new Ground();
        addObject(ground8,628,170);
        Ground ground9 = new Ground();
        addObject(ground9,417,49);
        Player1 player1 = new Player1();
        addObject(player1,61,520);
        Cloud cloud = new Cloud();
        addObject(cloud,404,141);
        Cloud cloud2 = new Cloud();
        addObject(cloud2,697,65);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,147,53);
        Cloud cloud4 = new Cloud();
        addObject(cloud4,706,246);
        Cloud cloud5 = new Cloud();
        addObject(cloud5,41,194);
        Ground ground10 = new Ground();
        addObject(ground10,594,609);
        Ground ground11 = new Ground();
        addObject(ground11,150,728);
        Ground ground12 = new Ground();
        addObject(ground12,456,850);
        Ground ground13 = new Ground();
        addObject(ground13,150,971);
        Ground ground14 = new Ground();
        addObject(ground14,131,1148);
        Ground ground15 = new Ground();
        addObject(ground15,320,1148);
        removeObject(ground15);
        Ground ground16 = new Ground();
        addObject(ground15,299,1146);
        removeObject(ground15);
        Ground ground17 = new Ground();
        addObject(ground15,295,1147);
        removeObject(ground15);
        Ground ground18 = new Ground();
        addObject(ground15,293,1148);
        Ground ground19 = new Ground();
        addObject(ground16,623,1090);
        Ground ground20 = new Ground();
        addObject(ground17,433,1029);
        Ground ground21= new Ground();
        addObject(ground18,659,728);
        Ground ground22 = new Ground();
        addObject(ground19,329,609);
        Cloud cloud6 = new Cloud();
        addObject(cloud6,20,889);
        Cloud cloud7 = new Cloud();
        addObject(cloud7,143,619);
        Cloud cloud8 = new Cloud();
        addObject(cloud8,767,881);
        Cloud cloud9 = new Cloud();
        addObject(cloud9,433,747);
        player1.setLocation(171,1082);
        player1.setLocation(143,1128);
        player1.setLocation(279,450);
        removeObject(cloud7);
        player1.setLocation(88,502);
        cloud6.setLocation(416,347);
        cloud6.setLocation(416,347);
        cloud6.setLocation(416,347);
        removeObject(cloud6);
        ground12.setLocation(421,596);
        cloud9.setLocation(356,388);
        ground12.setLocation(425,451);
        ground10.setLocation(356,444);
        ground10.setLocation(342,406);
        cloud8.setLocation(329,374);
        ground12.setLocation(382,389);
        ground10.setLocation(376,397);
        ground17.setLocation(297,457);
        removeObject(ground17);
        removeObject(ground18);
        removeObject(cloud8);
        removeObject(cloud9);
        removeObject(ground16);
        removeObject(ground12);
        removeObject(ground10);
        removeObject(ground4);
        ground19.setLocation(748,421);
        ground15.setLocation(439,561);
        ground11.setLocation(431,552);
        ground11.setLocation(323,539);
        ground11.setLocation(339,563);
        removeObject(ground15);
        removeObject(ground11);
        removeObject(ground13);
        ground14.setLocation(233,549);
    }
}
