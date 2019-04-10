package ie.tudublin;
import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Resistor extends PApplet

{	
    public int value;
    public int ones;
    public int tens;
    public int hundreds;
    public int x;
    public int y;

    public Resistor(UI ui, int x, int y){
        this.ui = ui;
        this.x = x;
        this.y = y;
        int hundreds = (value / 100);
        int tens = (value - (hundreds * 100)) / 10;
        int ones = value - ((hundreds * 100)  + (tens * 10));
        print(hundreds + ",");
        print(tens + ",");
        println(ones);
    }

	public void settings()
	{
       
	}

	public void setup() 
	{
	}
	
	public void draw()
	{		
        stroke(0);	
        rect(x,y,50,50);
	}
}