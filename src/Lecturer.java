import java.util.List;

public class Lecturer extends Person{
    private List<String> languagesTeach;
    private int yearsOfExperience;
    private boolean hasExperience;

    public List<String> getLanguagesTeach(){
        return languagesTeach;
    }
    public void setLanguagesTeach(List<String> languagesTeach){
        this.languagesTeach = languagesTeach;
    }
    public int getYearsOfExperience(){
        return yearsOfExperience;
    }
    public void setYearsOfExperience(int yearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isHasExperience() {
        return hasExperience;
    }
    public void setHasExperience(boolean hasExperience){
        this.hasExperience = hasExperience;
    }

    public int CompareTo(int yearsOfExperience, List<String> languagesTeach){
        if (this.yearsOfExperience > yearsOfExperience) {
            return 1;
        } else if (this.yearsOfExperience == yearsOfExperience) {
            if (this.languagesTeach.toArray().length > languagesTeach.toArray().length){
                return 0;
            }
        }
        return -1;}
}
