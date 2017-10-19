
public class Sphere extends Shape3D{
	public void area(double...args)
    {
		double a=4*3.1416;
		for(double i:args)
  	  {
  		  a=a*i*i;
  	  }
  	  System.out.println("The area of Sphere: "+a);
    }
}
