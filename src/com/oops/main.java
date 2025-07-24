package com.oops;

class shape{
	
	public double getArea() {
		return 0.0;
	}
	
}
 class Rectangle extends shape{
	  private double length;
	  private double width;
	  
	  public Rectangle(double length , double width) {
		  this.length=length;
		  this.width=width;
	  }
	  public double getArea() {
		return length*width;
		  
	  }
 }
public class main {

	public static void main(String[] args) {
	
		Rectangle obj=new Rectangle(3.0, 10.0);
		double Area =obj.getArea();
		System.out.println("the area of the rectangle is :" + Area);
		

	}

}
