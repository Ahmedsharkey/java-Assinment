import java.awt.image.PackedColorModel;

public class Main {
    public static void main(String[] args) {

       // Faculty faculty =new Faculty();
        //faculty.DisplayFaculty();


//        Employee Emp=new Employee("001","Mohamed Abdi Ali","Exam",617689045,50,"Male",
//                "Hodan","Mohamedabdi904@gmail.com","29-02-2025");
//        Emp.DisplayInfo();
//
//        System.out.println(" ");
//
//        ClassStaff Clas=new ClassStaff("1001",201,"Full-Time","Hassan Jama Abdi",616453421,
//                "Male","Howl-wadaag","Hassanjama421@gmail.com","C1220019");
//        Clas.DisplayInfo();
        //System.out.printl;

        System.out.println("___________________________________");
        Account account =new Account("234976,",10,"Mohamed Abdi Ahmed");
        account.DisplayAccountInfo();
//        account.withdraw(8);
//        System.out.println("Account Balance is : "+ " $" +account.getBalance());
//        account.withdraw(120);
//        account.withdraw(300);
//        System.out.println("Account Balance is : "+ " $" +account.getBalance());
//        account.withdraw(200);
//        System.out.println("Account Balance is : "+ " $" +account.getBalance());
//        account.withdraw(4);
//        System.out.println("Account Balance is : "+ " $" +account.getBalance());
//        account.withdraw(1);
//        System.out.println("Account Balance is :"+ "$" +account.getBalance());
//        account.Deposit(1200);
//        System.out.println("Account Balance is : "+ " $" +account.getBalance());
//        account.withdraw(200);
//        System.out.println("Account Balance is : "+ " $" +account.getBalance());


       // System.out.println("you are withdrawed is of account is:");
        account.Deposit(900);
        System.out.println("Account Balance is : "+ " $" +account.getBalance());

        account.withdraw(800);
        System.out.println("Account Balance is : "+ " $" +account.getBalance());
        account.withdraw(800);

        System.out.println("Account Balance is : "+ " $" +account.getBalance());
        account.withdraw(440);
        System.out.println("before deposit the Account Balance is : "+ " $" +account.getBalance());

        account.Deposit(900);
        System.out.println("after deposit the Account Balance is : "+ " $" +account.getBalance());

//        System.out.println("___________________________________________________________________");
//        SavingAccount savingAccount =new SavingAccount("809039",9000,"Ahmed Abdi Ali");
//        savingAccount.DisplaySavingAccount();
//        savingAccount.setBalance(100000);
//        System.out.println("the balance of saving account is : " +"$"+savingAccount.getMinimumBalance());
//        savingAccount.withdraw(100000);
//        System.out.println("the balance After withdrawed  is : " +"$"+savingAccount.getMinimumBalance());
//
//        savingAccount.withdraw(8998);
//        System.out.println("the balance After withdrawed  is : " +"$"+savingAccount.getMinimumBalance());

        System.out.println("_____________________________________________________________________");
//        Complex complex1=new Complex(3.5,5.5);
//        Complex complex2=new Complex(-3.5,1);
//        System.out.println("complex1 + complex2: " + complex1.add(complex2));
//        System.out.println("complex1 - complex2: " + complex1.subtract(complex2));
//        System.out.println("complex1 * complex2: " + complex1.multiply(complex2));
//        System.out.println("complex1 / complex2: " + complex1.divide(complex2));
//        System.out.println("|complex1|: " + complex1.abs());
//       // System.out.println("|complex2|: " + complex2.abs());
//
//        System.out.println("Comparison result: " + complex1.compareTo(complex2));
//        complex1.DisplayComplex();
//        complex2.DisplayComplex();


    }

}