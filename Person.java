import java.util.stream.Stream;

public class Person {
    private String Name;
    private Integer PhoneNumber;
    private String Gender;
    private String Addresss;
    private String EMail;

    public String getName(){
        this.Name=Name;
        return  Name;
    }

    public Integer getPhoneNumber() {
        this.PhoneNumber=PhoneNumber;
        return PhoneNumber;
    }

    public String getGender() {
        this.Gender=Gender;
        return Gender;
    }

    public String getAddresss() {
        this.Addresss=Addresss;
        return Addresss;
    }

    public String getEMail() {
        this.EMail=EMail;
        return EMail;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public void setAddresss(String addresss) {
        this.Addresss = addresss;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    public Person(String Name, Integer Phon_Number, String Gender,String Address,String Email){
        this.Name=Name;
        this.PhoneNumber=Phon_Number;
        this.Gender=Gender;
        this.Addresss=Address;
        this.EMail=Email;

    }

    public void DisplayInfo(){
        System.out.println("Name : "+this.getName());
        System.out.println("Mobile Number :"+this.getPhoneNumber());
        System.out.println("Gender : "+this.getGender());
        System.out.println("Address :"+this.getAddresss());
        System.out.println("Email : "+this.getEMail());

    }
}
