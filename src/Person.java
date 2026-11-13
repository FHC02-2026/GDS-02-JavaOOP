public class Person {

    public String firstName;
    public String lastName;
    //public int age;
    public BirthDay birthDay; // 1990-05-01

    public void setBirthDay(int year, int month, int day) {
        birthDay = new BirthDay();
        birthDay.year = year;
        birthDay.month = month;
        birthDay.day = day;
    }

    public int getAge() {
        int age = 2026 - birthDay.year;
        return age;
    }

    public void print() {
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("age = " + getAge());
        System.out.println("birthDay = " + birthDay.getBirthDayAsString());
        System.out.println("------ ------- ------");
    }
}
