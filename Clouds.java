import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Clouds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clouds extends Mover
{
    /**
     * Act - do whatever the Clouds wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Clouds()
    {
        super(1);  //Move slowly
    }
    public void act()
    {
        move();
        if (getX() < 10)  //off screen to the left
        {
            setLocation(2400,96);
        }
        if (getX() > 810)  //off screen to the right
        {
            setLocation(-800,96);
        }
    } 

}
