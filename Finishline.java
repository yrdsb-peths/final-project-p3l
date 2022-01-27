import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Finishline here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Finishline extends Actor
{
    SimpleTimer lapTimer = new SimpleTimer();
    boolean lapStart = false;
    int lapTime;
    Label lapTimeLabel = new Label("lapTime", 60);
    //Car car = new Car();
    
    //Checkpoint1 checkpoint1 = new Checkpoint1();
    //Checkpoint2 checkpoint2 = new Checkpoint2();
    
    /**
     * Act - do whatever the Finishline wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    public boolean detect()
    {
        //Checkpoint1 checkpoint1 = new Checkpoint1();
        
        if(isTouching(Car.class))
        {
            return true;
        }
        return false;
    }
    public boolean lapStarted()
    {
        boolean touching;
        if(isTouching(Car.class))
        {
            touching = true;
        }
        else
        {
            touching = false;
        }
        return touching;
    }
    public boolean reset()
    {
        return true;
        //return false; 
        
    }
}
