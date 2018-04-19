/*
/**
 * Write a description of class UIMain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UIMain
{
    
    protected static final int sizeX = 500;
    protected static final int sizeY = 250;
    public static void main(String[] args){
        UI OR = new UI("Welcome to the Order Entry Program!");
        OR.setSize(sizeX, sizeY);
        OR.setVisible(true);
    }
    
}
