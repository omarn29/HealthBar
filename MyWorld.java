import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

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
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Button button = new Button();
        addObject(button,126,246);
        Button button2 = new Button();
        addObject(button2,462,234);
        HealthBar healthbar = new HealthBar();
        addObject(healthbar,320,104);

        Button button1 = new Button(Color.RED, Color.ORANGE, -40);
        addObject(button1, 463,246);
        removeObject(button2);
    }
}
