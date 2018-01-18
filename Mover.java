import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mover extends AnimatedActor
{
    private int speed = 7;  
    /**
     * Act - do whatever the Mover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void move() 
    {
        checkKeys();
    }    

    public Mover()  	// Default constructor – speed 7
    {
        speed = 7;
    }

    public Mover(int anySpeed)
    {
        speed = anySpeed;
    }
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() - speed, getY());
            
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() + speed, getY());
        }
    }


}
