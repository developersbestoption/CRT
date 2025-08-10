import java.util.*;
public class Demo1{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter radius :");
double radius=sc.nextDouble();
final double pi=3.14;
double r=pi*Math.pow(radius,2);
System.out.println("radius of the circle is :"+r);
}
}