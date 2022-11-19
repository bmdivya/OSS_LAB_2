package twoDShapes;

public class Rectangle extends Closed2DShapes{
private double length;
private double breadth;
private double height;
Rectangle(double len, double bre, double hei)
	{   
	length= len;
	breadth= bre; 
    height= hei; 
	}
public void surfaceArea()
	{
	double area=(length * breadth);
	System.out.println("Surface Area is :"+area);
	}
public void perimeter()
	{
	double peri=2* (length + breadth);
	System.out.println("Perimeter is: "+ peri);
	}
public void volume()
    {
        double vol=(length * breadth * height);
        System.out.println("Volume is: "+ vol);
    }
}