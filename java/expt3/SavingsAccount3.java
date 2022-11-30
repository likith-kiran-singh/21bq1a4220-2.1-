class SavingsAccount3{
	private static double a_i;
    private double s_b;
    public SavingsAccount3() 
    {
        s_b=0; // for savings balance initialized  with zero
	    a_i=0; //for annual interest rate initialized  with zero
	}
    public SavingsAccount3(double balance) 
    {
    	//getting the balance amount and replacing 0 with it
	    s_b=balance;
	    a_i=0;
	}
    static void modifyInterest(double new_interest) 
    {
    	//getting new_interest value and storing it into a_i
        a_i=new_interest;
    }
	public void calculateMonthlyInterestRate() 
	{
		/*here, we calculate the MonthlyIntrestRate 
		the savings balance will be multiplied with interest rate
		and then divided by  12 for getting interest rate of 1 month*/
	    System.out.println("current balance:"+s_b);
	    double mi;
	    mi=(s_b*a_i)/12;
	    //we have to store that value in the savings balance
	    s_b=s_b+mi;
	    System.out.println("new balance:"+s_b);
	}
    
    
}