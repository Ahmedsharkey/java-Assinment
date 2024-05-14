import java.util.Date;
public class Account {

    private String AccountNumber;
    private double balance;
    private Date dateCreated;
    private String FullName;
//    public double Deposit;
//    public  double withdraw;
//    public  double Checkbalance;

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        this.FullName = fullName;
    }

    public Account(String AccountNumber, double balance, String fullName) {
        this.AccountNumber = AccountNumber;
        this.FullName = fullName;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



    public String getAccountNumber() {
        return AccountNumber;
    }
 public  double Deposit(double Amount){
        if (balance >Amount){
            throw new IllegalArgumentException("Deposit Amount can't be Negative Amount. "+"before Deposit the balance is "+this.getBalance());
        }
        this.balance+=Amount;
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public void withdraw(double amount) {
        double fee = 2.00;
        if (balance >amount) {
           // System.out.println("before withdrawed is :" + "$"+this.getBalance());
            balance -= (amount + fee);
            //System.out.println("the Balance is :"+"$"+this.getBalance());
        }
        else {
            System.out.println("Insufficient funds."+"Your balance is:"+"$" +getBalance());

        }

    }

    public void  DisplayAccountInfo(){
        System.out.println("Account Number is : "+ this.getAccountNumber());
        System.out.println("the name of person  is : "+ this.getFullName());
        System.out.println("Account Balance is : "+ " $ " +this.getBalance());
        System.out.println("date create of Account   is : "+ this.getDateCreated());
        //System.out.println("before deposit is:"+balance+ " ,and after deposit you are deposited your accounis : "+ this.Deposit(0));
        System.out.println("you are deposited your account is : "+ "$"+this.Deposit(100));
        System.out.println("you are deposited your account is : "+ "$"+this.Deposit(230));


    }
}


