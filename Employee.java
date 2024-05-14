import java.util.Date;

public class Employee extends  Person {
    private String EmpID;
    private String office;
    private double EmpSalary;
    private Date Hired_date;

   public Employee(String EmpID,String Name,String office,Integer Phon_Number,int EmpSalary, String Gender, String Address, String Email,String Hired_date){
       super(Name,Phon_Number,Gender,Address,Email);
       this.EmpID=EmpID;
       this.EmpSalary=EmpSalary;
       this.office=office;
       this.Hired_date= new Date();
   }

    public String getEmpID() {
        return EmpID;
    }

    public double getEmpSalary() {
        return EmpSalary;
    }

    public String getOffice() {
        return office;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public void setEmpSalary(int empSalary) {
        this.EmpSalary = empSalary;

    }
    public Date getHired_date() {
        return Hired_date;
    }

    public void setHired_date(Date hired_date) {
        this.Hired_date = hired_date;
    }

    @Override
    public void DisplayInfo(){
        System.out.println("Employee ID : "+this.getEmpID());
        System.out.println("Employee Name : "+this.getName());
        System.out.println("Employee Salary : "+"$"+this.getEmpSalary());
       // System.out.println("Employee Deduction Salary : "+"$"+this.getDeduct());
        System.out.println("Employee Number : "+this.getPhoneNumber());
        System.out.println("Gender : "+this.getGender());
        System.out.println("Address :"+this.getAddresss());
        System.out.println("Email : "+this.getEMail());
        System.out.println("The Hired Date is  : "+this.getHired_date());

    }
}
