import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class checkpointOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Checkpoint1 extends Actor
{
    //Finishline finishline = new Finishline();
    /**
     * Act - do whatever the checkpointOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
        /*if(Finishline.reset() == true)
        {
            CheckPoint1 = false;
        }*/
        /*Race race = new Race();
        race.addObject(this, 350, 290);
        this.setRotation(-50);*/
        
        checkPoint1();
    }
    public boolean checkPoint1()
    {
        Race race = new Race();
        if(isTouching(Car.class))
        {
            return true;
        }
        
        return false;
    }
}
