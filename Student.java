public class Student extends Person {
    private String StudentID;
    private String ClassName;
    public Student(String Name,Integer Phon_Number, String Gender, String Address, String Email, String StudentID) {
        super(Name, Phon_Number, Gender, Address, Email);
        this.StudentID=StudentID;
        this.ClassName=ClassName;
    }

    public String getStudentID(){
        this.StudentID=StudentID;
        return StudentID;
    }
    public String getClassName(){
        this.ClassName=ClassName;
        return ClassName;
    }

    public void setClassName(String className) {
        this.ClassName = className;
    }

    public void setStudentID(String studentID) {
        this.StudentID = studentID;
    }

//    public  Student(){
//        this.StudentID=StudentID;
//        this.ClassName=ClasName;
//    }
    @Override
    public void DisplayInfo(){
       super.DisplayInfo();
        System.out.println("Student ID : "+this.getStudentID());
        System.out.println("Class Name : "+this.getClassName());


    }
}
