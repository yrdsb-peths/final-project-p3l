import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class theCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    int speed = 0;
    int carHealth = 3;
    double lapTime;
    static int car1lapTime;
    SimpleTimer lapTimer = new SimpleTimer();
    //stopWatch stopwatch = new stopWatch(100, 50);
    
    boolean retire = false;
    boolean lapBegun;
    boolean checkPoint1;
    boolean checkPoint2;
    boolean lapFinish;
    
    Label lapStart = new Label("lap has started", 60);
    Label checkpoint1 = new Label("checkpoint 1 crossed", 60);
    Label checkpoint2 = new Label("checkpoint 2 crossed", 60);
    Label lapFinished = new Label("lap finished!", 60);
    
    //Label lapTimeLabel = new Label(lapTime, 60);
    /**
     * Act - do whatever the theCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //speed++; // apply acceleration to speed
        //setLocation(getX(), getY()+speed); // move new speed
        
        //controls();
        //int speed = 0;
        
        controls();
        
        sensory();
        if(isTouching(Finishline.class))
        {
            lapTimer.mark();
        }
        //getWorld().addObject(stopwatch, 950, 200);
        //stopwatch.setValue(0);
        //move(speed);
    }
    public void multiplayer()
    {
        int laps = Race.laps;
        
        
    }
    public void sensory()
    {
        
        //if touching other raccers take damage, once a certain amount of damage has been taken, car has to retire. 
        //if car is touching checkpoint, boolean checkpointPassed = true
        //during free practice or qualifying, if car crashes, put back at the last checkpoint
        
        if(isTouching(Finishline.class))
        {
            lapBegun = true;
        }
        if(lapBegun == true)
        {
            if(isTouching(Checkpoint1.class))
            {
                checkPoint1 = true;                
            }
        }        
        
        if(checkPoint1 == true)
        {
            if(isTouching(Checkpoint2.class))
            {
                checkPoint2 = true;
            }
        }
        if(checkPoint1 == true && checkPoint2 == true)
        {
            if(isTouching(Finishline.class))
            {
                lapFinish = true;
            }
        }
        if(lapFinish == true)
        {
            lapTime = lapTimer.millisElapsed();
            Label lapTimeLabel = new Label("Your lap time was: " + lapTime/1000 + " s", 60);
            getWorld().addObject(lapTimeLabel, 600, 500);
            Greenfoot.delay(100);
            
            getWorld().removeObject(lapTimeLabel);
            checkPoint1 = false;
            checkPoint2 = false;
            lapFinish = false;
        }
        if (isTouching(Barrier.class))
        {
            //Greenfoot.delay(10);
            //setLocation(getX() + speed, getY() + speed);
            //Greenfoot.delay(1000);
            carHealth -= 1;
            //Race.removeObject(this);
            
            if(carHealth <= 0)
            {
                retire = true;
            }
        }
        if (isTouching(Barrier2.class))
        {
            
            //setLocation(getX() + speed, getY() + speed);
            //Greenfoot.delay(1000);
            carHealth -= 1;
            //Race.removeObject(this);
            
            if(carHealth <= 0)
            {
                retire = true;
            }
        }
        if (isTouching(Barrier3.class))
        {
            //setLocation(getX() + speed, getY() + speed);

            //Greenfoot.delay(1000);
            carHealth -= 1;
            //Race.removeObject(this);
            
            if(carHealth <= 0)
            {
                retire = true;
            }
        }
        if (isTouching(Barrier4.class))
        {
            //setLocation(getX() + speed, getY() + speed);
            
            //Greenfoot.delay(1000);
            carHealth -= 1;
            //Race.removeObject(this);
            
            if(carHealth <= 0)
            {
                retire = true;
            }
        }
        if (isTouching(Barrier5.class))
        {
            
            //setLocation(getX() + speed, getY() + speed);
            
            //Greenfoot.delay(1000);
            carHealth -= 1;
            //Race.removeObject(this);
            
            if(carHealth <= 0)
            {
                retire = true;
            }
        }
        if (isTouching(Barrier6.class))
        {
            
            //setLocation(getX() + speed, getY() + speed);
            
            //Greenfoot.delay(1000);
            carHealth -= 1;
            //Race.removeObject(this);
            
            if(carHealth <= 0)
            {
                retire = true;
            }
        }
        if (isTouching(Car2.class))
        {
            carHealth -= 1;
            if(carHealth <= 0)
            {
                retire = true;
            }
        }
        
    }
    public void controls()
    {
        //accelerates the car to 100 while the user holds down the up button 
        if(retire == false)
        {
            if(Greenfoot.isKeyDown("space"))
            {
                if(speed > -3)
                { 
                    speed -= 1;
                    Greenfoot.delay(3);
                }
                if(Greenfoot.isKeyDown("right") && speed != 0)
                {
                    turn(3);
                
                }
                if(Greenfoot.isKeyDown("left") && speed != 0)
                {
                    turn(-3);
                }
            }
            else
            {
                if(speed < 0)
                {
                    speed += 1;
                    Greenfoot.delay(5);
                }
            }
            move(speed);
        }
    }
    public void resetCar()
    {
        //Race.removeObject(this);
    }
    public double getLapTime()
    {
        return lapTime;
    }
}
