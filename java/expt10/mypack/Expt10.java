/*
AIM: Develop a java application to implement currencyconverter(DollartoINR, 
EURO toINR,YentoINR and vice versa), distance converter (meter to KM, miles 
to KM and vice versa), timeconverter (hours to minutes, seconds and vice versa) 
using packages.
 */
package mypack;
import java.util.*;
import currencyconverter.*;
import distanceconverter.*;import timeconverter.*;
class Lab10{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int choice;
Currencyconversion c=new Currencyconversion();
Distanceconversion d=new Distanceconversion();
Timeconversion t=new Timeconversion();
System.out.println("###menu for operations###");
System.out.println("\n1.dollar to rupee \n2.rupee to dollar\n3.Euro to rupee");
System.out.println("4.rupee to Euro\n5.Yen to rupee\n6.Rupee to Yen\n7.Meter to kilometer");
System.out.println("8.kilometer to meter\n9.Miles  to kilometer\n10.kilometer to miles");
System.out.println("11.Hours to Minutes\n12.Hours to Seconds\n13.Seconds to Hours\n14.Minutes to Hours");
do{    System.out.println("Enter ur choice : ");
	choice=sc.nextInt();
switch(choice){
case 1:  c.dollartorupee();
break;
case 2: c.rupeetodollar();
break;
case 3:c.eurotorupee();
break;
case 4: c.rupeetoeuro();
break;
case 5: c.yentorupee();
break;
case 6 : c.rupeetoyen();
break;
case 7  :d.mtokm();
break;
case 8  :d.kmtom();
break;
case 9  :d.milestokm();
break;
case 10  :d.kmtomiles();
break;
case 11 :t.hourstominutes();
break;
case 12 :t.hourstoseconds();
break;
case 13 :t.secondstohours();
break;
case 14 : t.minutestohours();
break;
}
}while(choice!=15);
sc.close();
}
}
/*
 Output :
 ###menu for operations###

1.dollar to rupee
2.rupee to dollar
3.Euro to rupee
4.rupee to Euro
5.Yen to rupee
6.Rupee to Yen
7.Meter to kilometer
8.kilometer to meter
9.Miles  to kilometer
10.kilometer to miles
11.Hours to Minutes
12.Hours to Seconds
13.Seconds to Hours
14.Minutes to Hours
Enter ur choice :
1
Enter dollars:
500
Dollar to rupees is:40500.0
Enter ur choice :
2
Enter Rupee:
100000
Rupee to dollars is:1234.567901234568
Enter ur choice :
3
Enter euro:
500
Euro to rupee is:42235.0
Enter ur choice :
4
Enter Rupee:
100000
Rupee to euro is:1183.8522552385461
Enter ur choice :
5
Enter yen:
500
YEN to rupee is:291.95
Enter ur choice :
6
Enter Rupees:
100000
rupees to yen is:171262.20243192327
Enter ur choice :
7
Ente meter:50
meter to klometer is:0.05
Enter ur choice :
8
Enter km:50
kilometer to meter is:50000.0
Enter ur choice :
9
Enter miles:25
miles to kilometer is:40.2335
Enter ur choice :
10
Enter km:50
kilometer to miles is:31.068550000000002
Enter ur choice :
11
enter the no of hours
120
hours to minutes is:7200
Enter ur choice :
12
enter the no of hours
2
hours to seconds is:7200
Enter ur choice :
13
Enter the number of seconds:84000
Seconds to hours is:23
Enter ur choice :
14
Enter the number of minutes:120
Minutes to hours is:2
Enter ur choice :
15
 */