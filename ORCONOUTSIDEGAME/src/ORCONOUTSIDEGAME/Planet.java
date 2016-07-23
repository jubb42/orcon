package ORCONOUTSIDEGAME;
//package ORCONOUTSIDEGAME;

import java.awt.Color;
import java.awt.Point;
import java.awt.image.BufferedImage;

import javax.swing.JLabel;

public class Planet{

private int maxPopulation;
private int currentPopulation;
private int localFood;
private int localCredit;
private String planetName;
private Point coordinates; // use to show the location of the planet
private String starMapImageName; // use to reference the name of the image
private BufferedImage starMapImage; // used to store the image seen on star map
private JLabel jlabel;
private Color planetColor;

//null Constructor 
public Planet(){
	planetName = "SOL";
	coordinates	= new Point(1,1);
	planetColor = new Color(255,255,255);
}

public String toString(){
	System.out.println("maxPopulation: " + maxPopulation);
	System.out.println("currentPopulation: " + currentPopulation);
	System.out.println("localFood: " + localFood);
	System.out.println("localCredit: " + localCredit);
	System.out.println("planetName: " + planetName);
	System.out.println("the planet is locationed at: " + coordinates);
	System.out.println("starMapImageName: " + starMapImageName);
		
	return (planetName);
}

public BufferedImage getStarMapImage(){
	return starMapImage;
	}

public void setStarMapImage(BufferedImage starMapImage){
	this.starMapImage=starMapImage;
}
public String getPlanetName(){
return planetName;
}
public void setPlanetName(){

}
public int getXCoordinates(){
	return coordinates.x;
}
public void setCoordinates(int x, int y){
	coordinates.setLocation(x, y);
}

public int getYCoordinates(){
	return coordinates.y;
}	
public void setPlanetColor(int r, int b, int g){
	planetColor = new Color(r,b,g);
}
public Color getPlanetColor(){
	return planetColor;
}




}