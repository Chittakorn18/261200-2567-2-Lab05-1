
import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;
    public User(){
        name = null;
        dob = LocalDate.now();
    }
    public User(String name , int year ,int month , int day){
        this.name = name;
        this.dob = LocalDate.of(year, month, month);
    }

    public String getName(){
        return name;
    }
    public LocalDate getDob(){
        return dob;
    }

    public void displayInfo(){
        System.out.println("Name: "+ name);
        System.out.println("DOB(y-m-d): "+ dob);
    }

}
