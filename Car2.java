import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class theCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car2 extends Actor
{
    int speed = 0;
    int carHealth = 3;
    static int car2lapTime;
    boolean retire = false;
    
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
        lapStarted();
        sensory();
        
        //move(speed);
    }
    public int CarX()
    {
        return this.getX();
    }
    public void controls()
    {
        //accelerates the car to 100 while the user holds down the up button 
        if(retire == false)
        {
            if(Greenfoot.isKeyDown("shift"))
            {
                if(speed > -4)
                { 
                    speed -= 1;
                    Greenfoot.delay(4);
                }
                if(Greenfoot.isKeyDown("d") && speed != 0)
                {
                    turn(3);
                }
                if(Greenfoot.isKeyDown("a") && speed != 0)
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
    public void sensory()
    {
        if (isTouching(Barrier.class))
        {
            //Greenfoot.delay(10);
            setLocation(getX() + speed, getY() + speed);
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
            
            setLocation(getX() + speed, getY() + speed);
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
            setLocation(getX() + speed, getY() + speed);

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
            setLocation(getX() + speed, getY() + speed);
            
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
            
            setLocation(getX() + speed, getY() + speed);
            
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
            
            setLocation(getX() + speed, getY() + speed);
            
            //Greenfoot.delay(1000);
            carHealth -= 1;
            //Race.removeObject(this);
            
            if(carHealth <= 0)
            {
                retire = true;
            }
        }
        
        if (isTouching(Car.class))
        {
            carHealth -= 1;
            if(carHealth <= 0)
            {
                retire = true;
            }
        }
    }
    public void resetCar()
    {
        //Race.removeObject(this);
    }
    public boolean lapStarted()
    {
        //boolean touching;
        if(isTouching(Finishline.class))
        {
             return true;
        }
        else
        {
            return false;
        }
    }
}
