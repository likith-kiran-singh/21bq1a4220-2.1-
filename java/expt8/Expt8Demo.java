import java.util.Scanner;
public class Expt8Demo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                Employee p = new Programmer();
                System.out.println("Enter the Basic pay of Programmer:");
                double bp = s.nextDouble();
                double g = p.gross(bp);
                double n = p.net(bp);
                System.out.println("----Programmer----");
                p.display();
                System.out.println("Gross salary : " + g);
                System.out.println("Net salary : " + n);
                System.out.println("    -------");
            }
            if (i == 1) {
                Employee ap = new AssistantProfessor();
                System.out.println("Enter the Basic pay of Assistant Professor:");
                double bp = s.nextDouble();
                double g = ap.gross(bp);
                double n = ap.net(bp);
                System.out.println("----AssistantProfessor----");
                ap.display();
                System.out.println("Gross salary : " + g);
                System.out.println("Net salary : " + n);
                System.out.println("    -------");
            }
            if (i == 2) {
                Employee asp = new AssociateProfessor();
                System.out.println("Enter the Basic pay of Associate Professor:");
                double bp = s.nextDouble();
                // Employe e = new Employe();
                System.out.println("----AssociateProfessor----");
                double g = asp.gross(bp);
                double n = asp.net(bp);
                asp.display();
                System.out.println("Gross salary : " + g);
                System.out.println("Net salary : " + n);
                System.out.println("    -------");
            }
            if (i == 3) {
                Employee pf = new Professor();
                System.out.println("Enter the Basic pay of Professor:");
                double bp = s.nextDouble();
                double g = pf.gross(bp);
                double n = pf.net(bp);
                System.out.println("----Professor----");
                pf.display();
                System.out.println("Gross salary : " + g);
                System.out.println("Net salary : " + n);
                System.out.println("    -------");
            }
        }
        s.close();
    }
}
/*
 Output :
  Enter Employee name:
Raju
Enter Employee Id:
1 
Enter Addresss:
Earth
Enter Mail ID:
Raju@vvit.net
Enter Moblie Number:
1122
Enter the Basic pay of Programmer:
100000
----Programmer----
Name:Raju
Employee id:1
Address:Earth
Mail Id:Raju@vvit.net
Mobile number:1122
Gross salary : 207000.0
Net salary : 194900.0
    -------
Enter Employee name:
Ravi
Enter Employee Id:
2
Enter Addresss:
Mars
Enter Mail ID:
Ravi@vvit.net
Enter Moblie Number:
3344
Enter the Basic pay of Assistant Professor:
200000
----AssistantProfessor----
Name:Ravi
Employee id:2
Address:Mars
Mail Id:Ravi@vvit.net
Mobile number:3344
Gross salary : 414000.0
Net salary : 389800.0
    -------
Enter Employee name:
Ramu
Enter Employee Id:
3
Enter Addresss:
Sun
Enter Mail ID:
Ramu@vvit.net
Enter Moblie Number:
5566
Enter the Basic pay of Associate Professor:
300000
----AssociateProfessor----
Name:Ramu
Employee id:3
Address:Sun
Mail Id:Ramu@vvit.net
Mobile number:5566
Gross salary : 621000.0
Net salary : 584700.0
    -------
Enter Employee name:
Remo
Enter Employee Id:
4
Enter Addresss:
Unknown
Enter Mail ID:
Remo@vvit.net
Enter Moblie Number:
9988
Enter the Basic pay of Professor:
400000
----Professor----
Name:Remo
Employee id:4
Address:Unknown
Mail Id:Remo@vvit.net
Mobile number:9988
Gross salary : 828000.0
Net salary : 779600.0
    -------
 */