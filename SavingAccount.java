import java.util.Date;

public class SavingAccount extends Account{
    private double minimumBalance;

    // Constructor and other methods here...
    public SavingAccount(String AccountNumber, double balance,String FullName){
        super(AccountNumber,balance,FullName);

        this.minimumBalance+=balance;
        Date dateCreated=new Date();

    }


    public double getMinimumBalance() {
        return minimumBalance;
    }

    @Override
    public void withdraw(double amount) {
        double fee = 2.00;
        if (minimumBalance >amount) {
            // System.out.println("before withdrawed is :" + "$"+this.getBalance());
            minimumBalance -= (amount + fee);
            //System.out.println("the Balance is :"+"$"+this.getBalance());
        }
        else {
            System.out.println("Insufficient funds."+"Your balance is:"+"$" +getMinimumBalance());

        }

    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public void setBalance(double balance) {
        super.setBalance(balance);
        minimumBalance+=balance;
    }

//    public void applyInterest(double annualInterestRate) {
//        double monthlyInterestRate = annualInterestRate / 12;
//        double monthlyInterest = balance * monthlyInterestRate;
//        balance += monthlyInterest;
//    }
//    @Override
//    public void withdraw(double amount) {
//        double fee = 2.00;
//        if (getBalance() - (amount + fee) >= 0) {
//            balance = (amount + fee);
//        } else {
//            System.out.println("Insufficient funds.");
//        }

    public void DisplaySavingAccount(){

        System.out.println("person that saved account  is :"+this.getFullName());
        System.out.println("the account Number is:" +this.getAccountNumber());
         System.out.println("before saved account is:"+"$"+minimumBalance+"\nyou are saved  your account is : "+"$"+this.getBalance());


    }

}


