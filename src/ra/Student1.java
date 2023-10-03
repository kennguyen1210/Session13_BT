package ra;

public class Student1 {
    private int id;
    private int age;
    private double dtb;
    private String name;
    private boolean gender;

    public Student1() {
    }

    public Student1(int id, int age, double dtb, String name, boolean gender) {
        this.id = id;
        this.age = age;
        this.dtb = dtb;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Id:"+this.id+ "| Name: " +this.name+ "| Age: " +this.age+"| Gender: " +(this.gender ? "Nam" : "Nu")+ "| DTB: " +this.dtb;
    }
}
