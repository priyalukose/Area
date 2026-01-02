package Area;
public class FindArea
{
public static void main(String args[])
{
int a=5;
int c=10;
System.out.println("Area of Rectangle="+FindArea.area(a,c));
System.out.println("Area of Triangle="+FindArea.area(.5f,a,c));
System.out.println("Area of Circle="+FindArea.area(3.14f,a,a));

} 
public static int area(int x,int y)
{
int area=x*y;
return area;
}

public static float area(float d,int b,int h)
{
float area=d*b*h;
return area;
}
public static float area(float y,int r)
{
float area=y*r*r;
return area;
}
}
