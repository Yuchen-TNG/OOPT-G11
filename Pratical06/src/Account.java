import java.util.Date;

public class Account {
    private String accountnumber;
    private double balance;
    private Date datecreated;


public Account(String accountnumber, double balance, Date datecreated){
    this.accountnumber = accountnumber;
    this.balance = balance;
    // datecreated = new Date()
    this.datecreated = datecreated;
}

public String getaccountnumber(){
    return accountnumber;
}

public double getbalance(){
    return balance;
}

public Date getdatecreated(){
    return datecreated;
}

public void setaccountnumber(String accountnumber){
    this.accountnumber = accountnumber;
}

public void setbalance(double balance){
    this.balance = balance;
}

public void setdatecreated(Date datecreated){
    this.datecreated = datecreated;
}
//所以就是通过这个double amount来操作这个叫deposit的function
public void deposit (double amount){
    if(amount > 0){
        balance += amount;
    }else{
        System.out.print("cannot save negative amount");
    }

}
}

    

