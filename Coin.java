import greenfoot.*;
public class Coin extends Reward
{
    private int var=0;
    public Coin(){
        
    }

    public void act() 
    {
        move();
        if(isTouching(Hero.class))
        {
            getWorld().removeObject(this);
        }
        animation();
    }    

    public void animation(){
        var++;
        if(var<5){
            setImage("coinGold.png");
        }else{
            if(var<10){
                setImage("coinGold0.png");
            }else{
                if(var<15){
                    setImage("coinGold1.png");
                }else{
                    setImage("coinGold2.png");
                }
            } 
        }
        if(var>20){
            var=0;
        }
    }
}
