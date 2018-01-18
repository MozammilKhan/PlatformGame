import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends AnimatedActor
{
    private int speed = 1;
    private int vSpeed = 0;
    private int acceleration = 2;
    private int jumpHeight = -15;  // how high to jump
    public Hero()
    {
        getImage().scale(32,48);
    }

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        checkFalling();
        getImage().scale(32,48);
    }   

    private void fall()
    {
        setLocation(getX(),getY()+ vSpeed);
        vSpeed = vSpeed + acceleration;
    }

    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            animate (4,7);
            moveLeft();
        }
        if (Greenfoot.isKeyDown("right"))
        {
            animate (8,11);
            moveRight();
        }
        if (Greenfoot.isKeyDown("up"))
        {
            animate (12,15);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            animate (0,3);
        }
        if (Greenfoot.isKeyDown("space")&& (onGround() == true))

        {
            vSpeed = jumpHeight;
            fall();
        }

    }

    private boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2,Ground.class);
        return under != null;
    }

    private void checkFalling()
    {
        if (onGround() == false)
        {
            fall();
        }
    }

    public void moveRight()
    {
        setLocation ( getX() + speed, getY() );
    }

    public void moveLeft()
    {
        setLocation ( getX() - speed, getY() );
    }

}
