public class Staff extends Student {

    private int ClassID;
    private String ClassMode;
    private String StaffID;
    private String title;


    public Staff(String StaffID, int ClassID, String ClassMode, String Name, Integer Phon_Number, String Gender, String Address, String Email, String ClassName) {
        super(Name, Phon_Number, Gender, Address, Email, ClassName);
        this.StaffID=StaffID;
        this.title=title;
        this.ClassID=ClassID;
        this.ClassMode=ClassMode;
    }
    public String getTitle() {
        return title;
    }

    public String getStaffID() {
        return StaffID;
    }

    public int getClassID() {
        return ClassID;
    }

    public String getClassMode() {
        return ClassMode;
    }

    public void setStaffID(String staffID) {
        this.StaffID = staffID;
    }

    public void setClassID(int classID) {
        this.ClassID = classID;
    }

    public void setClassMode(String classMode) {
        this.ClassMode = classMode;
    }

    @Override
    public void DisplayInfo(){
        System.out.println("Staff ID : "+this.StaffID);
        System.out.println("Staff Name : "+this.getName());
        System.out.println("Staff Title : "+this.getTitle());
        System.out.println("Class ID : "+this.getClassID());
        System.out.println("Class Mode : "+this.getClassMode());
        System.out.println("Staff  Number : "+this.getPhoneNumber());
        System.out.println("Gender : "+this.getGender());
        System.out.println("Address :"+this.getAddresss());
        System.out.println("Email : "+this.getEMail());

    }
}
