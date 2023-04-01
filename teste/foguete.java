import greenfoot.*;  

public class foguete extends Actor
{
    int velocidade = 9;
    SimpleTimer timer = new SimpleTimer();
    public void act() 
    {
        anda();
        atira();
    }
    
    public void anda(){
        if(Greenfoot.isKeyDown("D")){
        move(velocidade);
        setRotation(0);
    }
        else if(Greenfoot.isKeyDown("A")){
        move(velocidade);
        setRotation(180);
    }
        else if(Greenfoot.isKeyDown("S")){
        move(velocidade);
        setRotation(90);
    }
        else if(Greenfoot.isKeyDown("W")){
        move(velocidade);
        setRotation(-90);
    }   
    }
    
    public void atira(){
        if (timer.millisElapsed() > 500 && Greenfoot.isKeyDown("space")){
        getWorld().addObject(new laser(), getX(), getY());
        timer.mark();
        }
    }
}
