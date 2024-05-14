import java.util.Date;

public class Faculty extends Employee{
    private  Integer FacultyID;
    private  String FacultyName;
    private String officeHours;
    private String rank;

    public Integer getFacultyID() {
        this.FacultyID=FacultyID;

        return FacultyID;
    }

    public String getFacultyName() {
        this.FacultyName=FacultyName;
        return FacultyName;
    }

    public void setFacultyID(Integer facultyID) {

        this.FacultyID = facultyID;
    }

    @Override
    public Date getHired_date() {
        return super.getHired_date();
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setFacultyName(String facultyName) {
        this.FacultyName = facultyName;
    }
    public   Faculty(String EmpID,String Name,String office,Integer Phon_Number,int EmpSalary, String Gender, String Address, String Email,String Hired_date){
        super(EmpID,Name,office,Phon_Number,EmpSalary,Gender,Address,Email,Hired_date);
        this.FacultyID=FacultyID;
        this.FacultyName=FacultyName;
        this.officeHours=officeHours;
        this.rank=rank;

    }

    public  void  DisplayFaculty(){
        System.out.println("Faculty ID : "+this.getFacultyID());
        System.out.println("Faculty Name : "+this.getFacultyName());
        System.out.println("the office hours worked is:"+this.getOfficeHours());
        System.out.println("the Rank of Employee : "+this.getRank());
        super.DisplayInfo();
    }
}
