import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Clouds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class foreGround extends Mover
{
    /**
     * Act - do whatever the Clouds wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public foreGround()
    {
        super(5);  //Move slowly
    }
    public void act()
    {
        move();
        if (getX() < 10)  //off screen to the left
        {
            setLocation(403,576);
        }
        if (getX() > 810)  //off screen to the right
        {
            setLocation(403,576);
        }
    } 

}
