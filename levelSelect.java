import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class levelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class levelSelect extends World
{
    Race race = new Race();
    static int levelNumber;
    Label instructionsLabel = new Label("Choose your game mode", 60);
    Label freePracticeLabel = new Label("Free practice - key 1", 50);
    Label multiplayerLabel = new Label("Multiplayer - key 2", 50);
    Label multiplayerInstructions = new Label("Player One Controls                 Player Two Controls", 50);
    Label multiplayerInstructions2 = new Label("Throttle: Space                           Throttle: Shift", 40);
    Label multiplayerInstructions3 = new Label("Steering: left and right arrow keys                Steering: keys 'A' and 'D'", 40);
    Label proceedLabel = new Label("hit 'enter' to proceed", 40);
    boolean levelChosen = false;
    /**
     * Constructor for objects of class levelSelect.
     * 
     */
    public levelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        addObject(instructionsLabel, 600, 200);
        addObject(freePracticeLabel, 300, 600);
        addObject(multiplayerLabel, 900, 600);
        
    }
    public void act()
    {
        
        if(Greenfoot.isKeyDown("2"))
        {
            levelNumber = 2;
            levelChosen = true;
            removeObject(instructionsLabel);
            removeObject(freePracticeLabel);
            removeObject(multiplayerLabel);
            addObject(multiplayerInstructions, 600, 200);
            addObject(multiplayerInstructions2, 600, 300);
            addObject(multiplayerInstructions3, 600, 400);
            addObject(proceedLabel, 600, 700);
            if(Greenfoot.isKeyDown("enter"))
            {
                switchWorld();
            }
        }
        if(Greenfoot.isKeyDown("1") && levelChosen == false)
        {
            levelNumber = 1;
            levelChosen = true;
            switchWorld();
        }
    }
    public void switchWorld()
    {
        Greenfoot.setWorld(race);
    }
}
