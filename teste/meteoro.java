import greenfoot.*;  

public class meteoro extends Actor
{
    int velocidade = 5;
   
    public void act() 
    {
        anda();
        colisao();
        apaga();
    }    
    
    public void anda(){
        move(-velocidade);
    }
    
    public void colisao(){
        if(isTouching(foguete.class)){
            Perdeu p = new Perdeu();
            getWorld().addObject(p, 640, 360);
            Greenfoot.stop();
        }
    }
    
    public void apaga(){
        if(getX()<=10){
          getWorld().removeObject(this);
        }    
    }
}
