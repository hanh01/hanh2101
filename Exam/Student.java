package Exam;

public class Student {
    private String StudentID;
    private String Name;
    private String Address;
    private int Phone;

    public Student(String StudentID, String Name, String Address, int Phone){
        this.StudentID= StudentID;
        this.Name= Name;
        this.Address= Address;
        this.Phone= Phone;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getStudentID() {
        return StudentID;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getAddress() {
        return Address;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public int getPhone() {
        return Phone;
    }

    @Override
    public String toString() {
        return "Student[" +
                "StudentID='" + StudentID + '\'' +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone=" + Phone +
                ']';
    }
}
