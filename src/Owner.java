import enums.Gender;

public class Owner extends Person{
    private String email;
    private int age;
    private int yearsService;

    public Owner(String name, String surname, String contactNumber, Gender gender) {
        super(name, surname, contactNumber, gender);
        setAge(age);
        setYearsService(yearsService);

    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) throws IllegalArgumentException {
    if (email != null && email.contains("@")) {
        this.email = email;
    } else {
        throw new IllegalArgumentException("Email must contain @");
    }
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getYearsService(){
        return yearsService;
    }
    public void setYearsService(int yearsService){
        this.yearsService = yearsService;
    }
}
