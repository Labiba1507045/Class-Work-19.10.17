
public class Cube extends Shape3D {
	public void area(double...args)
    {
		double a=1;
		for(double i:args)
  	  {
  		  a=a*i;
  	  }
  	  System.out.println("The area of cube: "+a);
    }
}
