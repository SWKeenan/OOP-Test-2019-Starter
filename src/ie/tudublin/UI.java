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
	Resistor r1, r2, r3;
	Table table1, table2;
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

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
		r2 = new Resistor(10,70);
		r3 = new Resistor(10,140);
		Table table1 = loadTable("colours.csv");
        for(TableRow tr:table1.rows())
        {
            Colour c = new Colour(value, value, value);
            colours.add(c);
		}   
		Table table2 = loadTable("resistors.csv");
        for(TableRow tr:table2.rows())
        {
            Resistor r = new Resistor(value, value);
            resistors.add(r);
        }   
	}
	
	public void draw()
	{		
		// Not working
		background(127);
		// r1.render();	
		// r2.render();
		// r3.render();

		stroke(0);
		noFill();
		rect(225,10,50,50);
		line(300,35,275,35);
		line(200,35,225,35);
		strokeWeight(3);
		fill(48,55,242);
		rect(230,10,5,50);
		fill(181,78,47);
		rect(240,10,5,50);
		fill(120,120,120);
		rect(250,10,5,50);

		stroke(0);
		noFill();
		rect(225,80,50,50);
		line(300,105,275,105);
		line(200,105,225,105);
		strokeWeight(3);
		fill(10,10,10);
		rect(230,80,5,50);
		fill(255,0,0);
		rect(240,80,5,50);
		fill(210,0,190);
		rect(250,80,5,50);

		stroke(0);
		noFill();
		rect(225,150,50,50);
		line(300,175,275,175);
		line(200,175,225,175);
		strokeWeight(3);
		fill(200,50,30);
		rect(230,150,5,50);
		fill(255);
		rect(240,150,5,50);
		fill(60,200,60);
		rect(250,150,5,50);

		stroke(0);
		noFill();
		rect(225,220,50,50);
		line(300,245,275,245);
		line(200,245,225,245);
		strokeWeight(3);
		fill(10,10,10);
		rect(230,220,5,50);
		fill(255);
		rect(240,220,5,50);
		fill(240,150,60);
		rect(250,220,5,50);
	}
}
