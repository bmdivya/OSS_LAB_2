package twoDShapes;

public class Triangle extends Closed2DShapes{

private double side1;
private double side2;
private double side3;
private double base;
private double length;
private double height;	

public void surfaceArea()
	{
	double area=0;
	double s= (side1+side2+side3)/2;
	area= s*(s-side1)*(s-side2)*(s-side3);
	System.out.println("Surface Area is: "+ area);	
	}	
public void perimeter()
	{
	double peri=0;
	peri = side1+side2+side3;
	System.out.println("Perimeter is: "+ peri);		
	}
public void volume()
    {
        double vol = (0.5 * base * height * length);
        System.out.println("Volume is: "+ vol);
    }
}