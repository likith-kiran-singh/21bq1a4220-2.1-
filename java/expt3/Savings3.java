/*
 AIM: Create class Savings Account. Use a static variable annualInterestRate to store the annual 
 interest rate for all account holders. Each object of the class contains a private instance variable 
 savingsBalance indicating the amount the saver currently has on deposit. Provide method 
 calculateMonthlyInterest to calculate the monthly interest by multiplying the savingsBalance by 
 annualInterestRate divided by 12, this interest should be added to savings Balance. Provide a static 
 method modifyInterestRate that sets the annualInterestRate to a new value. Write a program to test class
 SavingsAccount3. Instantiate two savingsAccount objects, saver1 and saver2, with balances of $2000.00 and 
 $3000.00, respectively. Set annualConcentration Rate to 4%, then calculate the monthly interest and print 
 the new balances for both savers. Then set the annualInterestRate to 5%, calculate the next month’s interest
 and print the new balances for both savers.
 */

class Savings
{
    public static void main(String args[]) 
    {
    	//Creating two variables s1,s2 for two values into SavingsAccount class
    	SavingsAccount3 s1=new SavingsAccount3(2000);
        SavingsAccount3 s2=new SavingsAccount3(3000);
        //passing how much interest we will give for that time to modifyInterest method
        SavingsAccount3.modifyInterest(0.04);
        s1.calculateMonthlyInterestRate();
        SavingsAccount3.modifyInterest(0.04);
        s2.calculateMonthlyInterestRate();
        //now,we passed two different values and stored the results
        System.out.println("after changing interest rate from 4% to 5%");
        //so, again we have to run the code with new interest value
        SavingsAccount3.modifyInterest(0.05);
        s1.calculateMonthlyInterestRate();
        SavingsAccount3.modifyInterest(0.05);
        s2.calculateMonthlyInterestRate();
    }
}