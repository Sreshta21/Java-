package programs;
class Shape{
	public void getArea() {
		System.out.println("Calulates the area of any shape");
	}
    public class Rectangle extends Shape{
    	int length=10,breadth=9;
		public void getArea() {
			System.out.println("Area of rectangle:"+(length*breadth));
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape myobj = new Shape();
		Shape.Rectangle obj = myobj.new Rectangle();
		obj.getArea();
	}
   }
