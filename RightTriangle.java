
public class RightTriangle extends Triangle {
	public void area(double...args)
    {
		double a=0.5;
		for(double i:args)
  	  {
  		  a=a*i;
  	  }
  	  System.out.println("The area of rectangle: "+a);
    }
}
