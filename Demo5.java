import java.util.*;
public class Demo{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter name of the student:");
String name=sc.next();
System.out.println("enter student class:");
String cls=sc.next();
System.out.println("enter student age:");
int age=sc.nextInt();
System.out.println("enter student gender:");
String gen=sc.next();
System.out.println("enter subject 1 marks:");
double m1=sc.nextDouble();
System.out.println("enter subject 2 marks:");
double m2=sc.nextDouble();
System.out.println("enter subject 3 marks:");
double m3=sc.nextDouble();
double total=m1+m2+m3;
double avg=total/3;
double per=(total/300)*100;
String a=(m1>=40)?"pass":"fail";
String b=(m2>=40)?"pass":"fail";
String c=(m3>=40)?"pass":"fail";
System.out.println("total marks:"+total);
System.out.println("average marks:"+avg);
System.out.println("percentage:"+per);
System.out.println("m1 pass or fail:"+a);
System.out.println("m2 pass or fail:"+b);
System.out.println("m3 pass or fail:"+c);
}
}