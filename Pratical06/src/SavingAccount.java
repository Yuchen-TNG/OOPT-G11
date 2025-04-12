import java.util.Date;

public class SavingAccount extends Account {
    private static double interestRate = 0.5;

    public SavingAccount(String accountnumber, double balance, Date datecreated){
        super(accountnumber, balance, datecreated);
    }

    
    
}

//calculate the interest amount
// adding the interest to the balance 