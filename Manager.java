final class Manager extends Employee{
    double bonus;


    public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, Double salary, double bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary(){
        return salary + bonus;
    }

    @Override
    public String toString() {
        return "Manager with " +
               "lastName " + lastName +
                " and age " + getAge() +
                " has salary " + getSalary()

                ;
    }
}
