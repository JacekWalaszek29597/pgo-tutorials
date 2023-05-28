import java.time.LocalDate;

public class Employee extends Person{
    int hireDate;
    String companyName;
    Double salary;


    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, Double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }

    public int getJobSeniority(){
        return LocalDate.now().getYear() - hireDate;
    }

    public double  getSalary(){
        return salary;
    }
}
