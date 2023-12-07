import enums.Gender;

public abstract class Person {
    private String name;
    private String surname;
    private String contactNumber;
    private Gender gender;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) throws IllegalArgumentException{
        if (contactNumber.startsWith("+381")){
            this.contactNumber = contactNumber;
        } else {
            throw new IllegalArgumentException("Contact number must start with +381");
        }
    }
    public Gender getGender(){
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
