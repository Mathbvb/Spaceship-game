import greenfoot.*;

public class MyWorld extends World
{

    public MyWorld()
    {    
        super(1280, 720, 1); 

        addObject(new foguete(), 200, 360);

        prepare();
    }

    public void act(){
        criadorAsteroides();
    }
    

    public void criadorAsteroides(){
        int Y = Greenfoot.getRandomNumber(1000);
        if (Y<720 && Y%3==0 && Y%7==0){
            addObject(new meteoro(),1280, Y);
        }
    }
    
    private void prepare()
    {
        Counter counter = new Counter();
        addObject(counter,77,56);
    }
}
