
public class DoSomething<T> {
	 public void dosomething(Shape T)
	 {
		 if(T instanceof Rectangle)
			{
				Rectangle r=(Rectangle)T;
			    r.main();
				r.show();
				r.print();
				r.area(5,3);			
	}
		 else if(T instanceof Square)
			{
				Square r=(Square)T;
				 r.main();
				r.show();
				r.print();
				r.area(5);			
	}
		 else if(T instanceof RightTriangle)
			{
				RightTriangle r=(RightTriangle)T;
				 r.main();
				r.show();
				r.print();
				r.area(10,5);			
	}
		 else if(T instanceof Sphere)
			{
				Sphere r=(Sphere)T;
				 r.main();
				r.show();
				r.area(5);			
	}
		 else if(T instanceof Cube)
		 {
				Cube r=(Cube)T;
				 r.main();
				r.show();
				r.area(5);			
	}
		 else
		 {
			 System.out.println("No match found");
		 }
	 }
}
