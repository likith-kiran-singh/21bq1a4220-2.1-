package timeconverter;
import java.util.*;
public class Timeconversion{
	int hours,seconds,minutes;
	Scanner sc = new Scanner(System.in);
public void secondstohours(){
	System.out.print("Enter the number of seconds:");
	seconds= sc.nextInt();
	hours =seconds/3600;
	System.out.println("Seconds to hours is:"+hours);
}
public void minutestohours(){
	System.out.print("Enter the number of minutes:");
	minutes=sc.nextInt();
	hours=minutes/60;
	System.out.println("Minutes to hours is:"+hours);
}
public void hourstominutes(){ 
	System.out.println("enter the no of hours");
	hours=sc.nextInt();
	minutes=(hours*60);
	System.out.println("hours to minutes is:"+minutes);
}
public void hourstoseconds(){ 
	System.out.println("enter the no of hours");
	hours=sc.nextInt();
	seconds=(hours*3600);
	System.out.println("hours to seconds is:"+seconds);
}}
