import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Race extends World
{
    //delcaring other classes
    Car2 car2 = new Car2();
    Car car = new Car();
    Finishline finishline = new Finishline();
    Checkpoint1 checkpoint1 = new Checkpoint1();
    Checkpoint2 checkpoint2 = new Checkpoint2();
    //levelSelect levelselect = new levelSelect();
    SimpleTimer raceTimer = new SimpleTimer();
    racerTwo racer2 = new racerTwo();
    //ints
    int gameMode;
    int lapTime;
    int numOfLaps;
    int qualiLaps = 5;
    static int laps;
    
    //strings
    String winner;
    
    //booleans
    //boolean displayLapTime = false;

    //labels
    Label laphasbegun = new Label("LAP HAS BEGUN", 60);
    Label lapTimeLabel = new Label(lapTime + " seconds", 60);
    Label gameModeLabel = new Label("Choose Game Mode", 60);
    Label fpInstructionsLabel = new Label("familiarization and practice", 50);
    Label mpInstructionsLabel = new Label("race against another racer!", 50); 
    //ArrayLists
    //ArrayList<lapTime> lapTimes = new ArrayList<lapTime>();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public Race()
    {
        super(1200, 800, 1);
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //booleans
        
        
        //creates a car on the road
        
        
        //addObject(timer,950, 200);
        
        
        placeBarriers();
        
        //labels
        addObject(finishline, 410, 672);
        finishline.setRotation(90);
        
        addObject(checkpoint1, 350, 290);
        checkpoint1.setRotation(-50);
        
        addObject(checkpoint2, 790, 250);
        
        
    }
    public void act()
    {    
        //multiplayer();
        if(levelSelect.levelNumber == 1)
        {
            freePractice();
        }
        if(levelSelect.levelNumber == 2)
        {
            multiplayer();
        }
    }
    public void freePractice()
    {
        //print instructions
        
    }
    public void qualifying()
    {
        //set the fastest lap possible!
        //lapsremaining
    }
    public void sundayRace()
    {
        //addObject(racer2, 460, 692);
        //racerTwo.lightsOut();
    }
    public void multiplayer()
    {
        //addObject(car2, 460, 687);
        //how many laps? 
        
        
        //laps = numOfLaps;
        addObject(car, 460, 662);
        addObject(car2, 460, 687);
        Greenfoot.delay(3);
        if(Greenfoot.isKeyDown("1"))
        {
            laps = 1;
        }
        
        //Label winnerLabel = new Label(winner, 60);
        
        //countdown with lights
        int car1lapTime = Car.car1lapTime;
        int car2lapTime = Car2.car2lapTime;
        if(car1lapTime < car2lapTime)
        {
            //car 1 wins
            winner = "Car 1 wins!";
            //addObject(winnerLabel, 600, 500);
        }
        if(car1lapTime > car2lapTime)
        {
            //car 2 wins
            winner = "Car 1 wins!";
            //addObject(winnerLabel, 600, 500);
        }
    }
    public void createTable(double num)
    {
        ArrayList<lapTime> lapTimes = new ArrayList<lapTime>();
        
    }
    public void gameOver()
    {
        
    }
    public void placeBarriers()
    {
        Barrier barrierOne = new Barrier();
        addObject(barrierOne, 433, 741);
        
        Barrier barrierTwo = new Barrier();
        addObject(barrierTwo, 856, 400);
        barrierTwo.setRotation(90);
        
        Barrier barrierThree = new Barrier();
        addObject(barrierThree, 32, 400);
        barrierThree.setRotation(90);
        
        Barrier barrierFour = new Barrier();
        addObject(barrierFour, 460, 50);
        
        Barrier2 barrier2One = new Barrier2();
        addObject(barrier2One, 460, 604);
        
        Barrier2 barrier2Two = new Barrier2();
        addObject(barrier2Two, 320, 182);
        barrier2Two.setRotation(40);
        
        Barrier3 barrier3One = new Barrier3();
        addObject(barrier3One, 720, 380);
        barrier3One.setRotation(90);
        
        Barrier3 barrier3Two = new Barrier3();
        addObject(barrier3Two, 603, 450);
        barrier3Two.setRotation(126);
        
        Barrier3 barrier3Three = new Barrier3();
        addObject(barrier3Three, 90, 750);
        barrier3Three.setRotation(45);
        
        Barrier3 barrier3Four = new Barrier3();
        addObject(barrier3Four, 780, 750);
        barrier3Four.setRotation(135);
        
        Barrier3 barrier3Five = new Barrier3();
        addObject(barrier3Five, 825, 70);
        barrier3Five.setRotation(43);
        
        Barrier4 barrier4One = new Barrier4();
        addObject(barrier4One, 260, 302);
        barrier4One.setRotation(44);
        
        Barrier4 barrier4Two = new Barrier4();
        addObject(barrier4Two, 457, 389);
        barrier4Two.setRotation(124);
        
        Barrier4 barrier4Three = new Barrier4();
        addObject(barrier4Three, 582, 222);
        barrier4Three.setRotation(40);
        
        Barrier4 barrier4Four = new Barrier4();
        addObject(barrier4Four, 607, 169);
        barrier4Four.setRotation(1);
        
        Barrier4 barrier4Five = new Barrier4();
        addObject(barrier4Five, 433, 247);
        barrier4Five.setRotation(39);
        
        Barrier4 barrier4Six = new Barrier4();
        addObject(barrier4Six, 270, 430);
        barrier4Six.setRotation(-53);
        
        Barrier5 barrier5One = new Barrier5();
        addObject(barrier5One, 198, 400);
        barrier5One.setRotation(90);
        
        Barrier5 barrier5Two = new Barrier5();
        addObject(barrier5Two, 380, 590);
        
        Barrier6 barrier6One = new Barrier6();
        addObject(barrier6One, 700, 585);
        barrier6One.setRotation(-45);
        
        Barrier6 barrier6Two = new Barrier6();
        addObject(barrier6Two, 220, 580);
        barrier6Two.setRotation(45);
        
        Barrier6 barrier6Three = new Barrier6();
        addObject(barrier6Three, 705, 185);
        barrier6Three.setRotation(45);
    }
    
}
