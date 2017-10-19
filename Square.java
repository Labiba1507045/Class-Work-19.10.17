
public class Square extends Quadrilateral {
	public void area(double...args)
    {
		double a=1;
		for(double i:args)
  	  {
  		  a=a*i;
  	  }
  	  System.out.println("The area of Square: "+a);
    }
}
