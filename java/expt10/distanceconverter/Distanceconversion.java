package distanceconverter;
import java.util.*;
public class Distanceconversion
{
	double km,m,miles;
	Scanner sc = new Scanner(System.in);
public void kmtom(){
	System.out.print("Enter km:");
	km=sc.nextDouble();
	m=(km*1000);
	System.out.println("kilometer to meter is:"+m);
}
public void mtokm(){
	System.out.print("Ente meter:");
	m=sc.nextDouble();
	km=(m/1000);
	System.out.println("meter to klometer is:"+km);
}
public void milestokm(){ 
	System.out.print("Enter miles:");
	miles=sc.nextDouble();
	km=(miles*1.60934);
	System.out.println("miles to kilometer is:"+km);
}
public void kmtomiles(){
	System.out.print("Enter km:");
	km=sc.nextDouble();
	miles=(km*0.621371);
	System.out.println("kilometer to miles is:"+miles);
}}
