import enums.Education;

public class Student extends Person{
    private Education education;
    private boolean oneOrMoreLanguages;
    public Education getEducation(){
        return education;
    }
    public void setEducation(Education education){
        this.education = education;
    }
    public boolean isOneOrMoreLanguages(){
        return oneOrMoreLanguages;
    }
    public void setOneOrMoreLanguages(boolean oneOrMoreLanguages){
        if (oneOrMoreLanguages){
            System.out.println("Student is studying more than one language");
        } else {
            System.out.println("Student is studying only one language");
        }
        this.oneOrMoreLanguages = oneOrMoreLanguages;
    }
    public int compareStudents(boolean oneOrMoreLanguages){
        if (oneOrMoreLanguages){
            return 1;
        } else {
            return 0;
        }

    }
}
