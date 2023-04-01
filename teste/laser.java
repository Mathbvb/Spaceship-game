import greenfoot.*;  

public class laser extends Actor
{
    int velocidade = 30;
    public void act() 
    {
        atira();
        colisao();
        apaga();
    }
    
    public void atira(){
            move(velocidade);
    }
    
    public void colisao(){
        if(isTouching(meteoro.class)){
            removeTouching(meteoro.class);
            Counter counter = (Counter)getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
        }
    }
    
    public void apaga(){
        if(getX()>=1270 ){
          getWorld().removeObject(this);
        }    
    }
}
