import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinFlag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinFlag extends Reward
{
    /**
     * Act - do whatever the WinFlag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        getImage().scale(34,44);
        if (isTouching(Hero.class))
        {
            Greenfoot.stop();
        }
        
    }    
}
