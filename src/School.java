public class School {
    private String name;
    private int schoolAge;
    private String email;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getSchoolAge(){
        return schoolAge;
    }
    public void setSchoolAge(int schoolAge){
        this.schoolAge = schoolAge;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) throws IllegalArgumentException {
        if (email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email must contain @");
        }
    }
}
