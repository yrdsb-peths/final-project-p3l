import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Checkpoint2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Checkpoint2 extends Actor
{
    Checkpoint1 checkpoint1 = new Checkpoint1();
    Finishline finishline = new Finishline();
    /**
     * Act - do whatever the Checkpoint2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
        
        
    }
    public boolean checkPoint2()
    {
        Race race = new Race();
        if(isTouching(Car.class))
        {
            return true;
        }
        return false;
    }
}
