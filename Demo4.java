import java.util.*;
public class Demo4{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the bill value : ");
double bill=sc.nextDouble();
System.out.println("enter number of people:" ) ;
int a=sc.nextInt();
double b=bill/a;
int d=(int)b;
double c=bill%a;
System.out.println(d);
System.out.println(c);
}
}