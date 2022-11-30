package currencyconverter;
import java.util.*;
public class Currencyconversion{
	double inr,dollar;
	double euro,yen;
	Scanner sc=new Scanner(System.in);
public void dollartorupee(){
	System.out.println("Enter dollars:");
	dollar=sc.nextInt();
	inr=dollar*81;
	System.out.println("Dollar to rupees is:"+inr);
}
public void rupeetodollar(){
	System.out.println("Enter Rupee:");
	inr=sc.nextInt();
	dollar=inr/81;
	System.out.println("Rupee to dollars is:"+dollar);
}
public void eurotorupee(){
	System.out.println("Enter euro:");
	euro=sc.nextInt();
	inr=euro*84.47;
	System.out.println("Euro to rupee is:"+inr);
}
public void rupeetoeuro(){
	System.out.println("Enter Rupee:");
	inr=sc.nextInt();
	euro=(inr/84.47);
	System.out.println("Rupee to euro is:"+euro);
}
public void yentorupee(){
	System.out.println("Enter yen:");
	yen=sc.nextInt();
	inr=yen*0.5839;
	System.out.println("YEN to rupee is:"+inr);
}
public void rupeetoyen(){
	System.out.println("Enter Rupees:");
	inr=sc.nextInt();
	yen=(inr/0.5839);
	System.out.println("rupees to yen is:"+yen);
}}
