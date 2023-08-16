package com.abc.graphics;

public class Rectangle 
{
   private double length , breadth;
   public Rectangle() {}
   public Rectangle(double length, double breadth) 
   {
	   this.length = length;	this.breadth = breadth;
   }
   public double getLength() 
   {
	  return length;
   }
   public void setLength(double length) 
   {
	  this.length = length;
   }
   public double getBreadth()
   {
	   return breadth;
   }
   public void setBreadth(double breadth) 
   {
	  this.breadth = breadth;
   }
   public double area()
   {
	   return length * breadth;
   }
}
