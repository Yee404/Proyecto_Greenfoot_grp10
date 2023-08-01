import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    public static int score= 0;
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 780, 1);
        prepare();
    }
    public void act()
    {
        showText("Score: " + score, 50, 25);
        if(score == 16)
        {
            Greenfoot.setWorld(new Final());
            
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        score = 0;
        showText("Score: " + score, 50, 25);
        Ground ground = new Ground();
        addObject(ground,258,507);
        Ground ground2 = new Ground();
        addObject(ground2,168,507);
        Player1_3 player1 = new Player1_3();
        addObject(player1,143,404); 
        Ground ground3 = new Ground();
        addObject(ground3,445,507);
        Ground ground4 = new Ground();
        addObject(ground4,750,507);
        Ground ground5 = new Ground();
        addObject(ground5,1027,507);
        Ground ground6 = new Ground();
        addObject(ground6,35,329);
        Ground ground7 = new Ground();
        addObject(ground7,1083,300);
        ground.setLocation(77,625);
        Ground ground8 = new Ground();
        addObject(ground8,1145,642);
        ground8.setLocation(1137,628);
        Ground ground9 = new Ground();
        addObject(ground9,138,756);
        Ground ground10 = new Ground();
        addObject(ground10,418,756);
        Ground ground11 = new Ground();
        addObject(ground11,698,756);
        Ground ground12 = new Ground();
        addObject(ground12,978,756);
        Ground ground13 = new Ground();
        addObject(ground13,1258,756);
        End end = new End();
        addObject(end,600,756);
        Ground ground14 = new Ground();
        addObject(ground14,524,237);
        Ground ground15 = new Ground();
        addObject(ground15,946,113);
        Ground ground16 = new Ground();
        addObject(ground16,128,97);
        Puntos puntos = new Puntos();
        addObject(puntos,713,426);
        Puntos puntos2 = new Puntos();
        addObject(puntos2,884,423);
        Puntos puntos3 = new Puntos();
        addObject(puntos3,1056,428);
        Puntos puntos4 = new Puntos();
        addObject(puntos4,1102,566);
        Puntos puntos5 = new Puntos();
        addObject(puntos5,1128,231);
        Puntos puntos6 = new Puntos();
        addObject(puntos6,1008,228);
        Puntos puntos7 = new Puntos();
        addObject(puntos7,940,42);
        Puntos puntos8 = new Puntos();
        addObject(puntos8,571,168);
        Puntos puntos9 = new Puntos();
        addObject(puntos9,460,171);
        puntos9.setLocation(468,165);
        Puntos puntos10 = new Puntos();
        addObject(puntos10,121,34);
        Puntos puntos11 = new Puntos();
        addObject(puntos11,76,267);
        Puntos puntos12 = new Puntos();
        addObject(puntos12,404,442);
        Puntos puntos13 = new Puntos();
        addObject(puntos13,327,690);
        Puntos puntos14 = new Puntos();
        addObject(puntos14,594,687);
        Puntos puntos15 = new Puntos();
        addObject(puntos15,865,685);
        Puntos puntos16 = new Puntos();
        addObject(puntos16,87,561);
    }
}
