public class Person {

    public String firstName;
    public String lastName;
    public int age;
    public BirthDay birthDay; // 1990-05-01

    public void setBirthDay(int year, int month, int day) {
        birthDay = new BirthDay();
        birthDay.year = year;
        birthDay.month = month;
        birthDay.day = day;
    }
}
