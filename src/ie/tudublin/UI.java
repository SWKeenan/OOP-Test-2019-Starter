package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	
	int value;
	ArrayList<Resistor> resistors = new ArrayList<Resistor>();
	ArrayList<Colour> colours = new ArrayList<Colour>();
	Resistor r1;
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}
	// Table table = loadTable("resistors.csv");
    //     for(TableRow tr:table.rows())
    //     {
    //         Resistor p = new Resistor(tr);
    //         resistors.add(r);
    //     }   

	// public void loadColours()
	// {
	// 	Table colours = loadTable("colours.csv", "header");
    //     for(TableRow tr:colours.rows())
    //     {
    //         Colour c = new Colour(tr);
    //         colours.add(c);
    //     }  
	// }

	// public void printColours()
	// {
	// 	for(int i=0;i<colours.length;i++)
	// 	{

	// 	}
	// }

	// public Colour findColour(int value)
	// {
	// 	return value;
	// }

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		r1 = new Resistor(10,10);
	}
	
	public void draw()
	{		
		background(127);
		r1.draw();	
	}
}
