import java.time.LocalDate;

abstract class Person {
    String firstName;
    String lastName;
    int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }

    public int getAge(){
        return LocalDate.now().getYear() - birthdayYear;
    }


}
