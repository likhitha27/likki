abstract class shape
{
protected String color;
protected boolean filled;
shape()
{
}
shape(String color,boolean filled)
{
this();
this.color=color;
this.filled=filled;
}
public String getColor()
{
return color;
}
public void setColor(String color)
{
this.color=color;
}
public boolean isFilled()
{
return filled;
}
public void setFilled(boolean filled)
{
this.filled=filled;
}
abstract double getArea();
abstract double getPerimeter();
public String toString()
{
return color+""+filled;
}
}
class circle extends shape
{
protected double radius;
//protected double y;
circle()
{
}
circle(double radius)
{
this();
}
circle(double radius,String color,boolean filled)
{
super(color,filled);
this.radius=radius;
}
public double getRadius()
{
return radius;
}
public void setRadius(double radius)
{
this.radius=radius;
}
public double getArea()
{
return 3.14 * (radius* radius );
}
public double getPerimeter()
{
return (2 * 3.14 * radius);
}
public String toString()
{
return "radius";
}
}
class rectangle extends shape
{
protected double width;
protected double length;
rectangle()
{
}
rectangle(double width,double length)
{
this();
}
rectangle(double width,double length,String color,boolean filled)
{
super(color,filled);
this.width=width;
this.length=length;
}
public double getWidth()
{
return width;
}
public void setWidth(double width)
{
this.width=width;
}

public double getLength()
{
return length;
}
public void setLength(double length)
{
this.length=length;
}
public double getArea()
{
return (width * length);
}
public double getPerimeter()
{
return (2 * (width + length ) );
}
public String toString()
{
return width+""+length;
}

}
public class square extends rectangle
{
protected double side;
square()
{
}
square(double side)
{
this();
}
square(double side,String color,boolean filled)
{
super();
this.side=side;
}
public double getSide()
{
return side;
}
public void setSide(double side)
{
this.side=side;
}
public double getArea()
{
return (4 * side);
}
public double getPerimeter()
{
return (side * side);
}
public String toString()
{
return "side";
}


public static void main(String args[])
{
circle c=new circle(2,"red",true);
System.out.println(c.getRadius());
System.out.println(c.getArea());
System.out.println(c.getPerimeter());
rectangle r=new rectangle(2,3,"red",true);
System.out.println(r.getArea());
System.out.println(r.getPerimeter());
square s=new square(2,"red",true);
System.out.println(s.getPerimeter());
System.out.println(s.getArea());

}
}

