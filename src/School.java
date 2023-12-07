public class School {
    private String name;
    private int year;
    private String webAddress ;

    public School(String name, int year, String webAddress){
        this.name = name;
        this.year = year;
        try{
            setWebAddress(webAddress);
        } catch (IllegalArgumentException e){
            System.err.println("Error setting Web Address: " + e.getMessage());
        }

    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getWebAddress(){
        return webAddress;
    }
    public void setWebAddress(String webAddress) throws IllegalArgumentException {
        if (webAddress.startsWith("http://") || webAddress.startsWith("https://")) {
            if (webAddress.contains(".")) {
                this.webAddress = webAddress;
            } else {
                throw new IllegalArgumentException("Web address must contain at least one period.");
            }
        } else {
            throw new IllegalArgumentException("Web address must start with http:// or https://");
        }
    }
}
