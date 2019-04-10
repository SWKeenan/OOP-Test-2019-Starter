package ie.tudublin;
import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Colour extends PApplet

{	
    UI ui;
    public int r, g, b;
    private String colorTable;

    public Colour(UI ui, int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }

	public void settings()
	{
        Table colorTable = loadTable("colours.csv", "header");

	}

	public void setup() 
	{
	}
	
	public void draw()
	{			
	}
}