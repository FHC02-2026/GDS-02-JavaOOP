public class PersonDemoApp {

    static void main() {
        System.out.println("HelloWorld PersonDemo");

        Person p1 = new Person();
        p1.firstName = "Max";
        p1.lastName = "Mustermann";
        //p1.age = 36;
        p1.setBirthDay(1988, 6 , 1);

        /*
        p1.birthDay = new BirthDay();
        p1.birthDay.day = 1;
        p1.birthDay.month = 5;
        p1.birthDay.year = 1990;*/

        //printPerson(p1);
        p1.print();

        Person p2 = new Person();
        p2.firstName = "Susi";
        p2.lastName = "Sorglos";
        //p2.age = 26;
        p2.setBirthDay(2000, 4 , 17);
        p2.print();

    }

    public static void printPerson(Person p) {
        System.out.println("p.firstName = " + p.firstName);
        System.out.println("p.lastName = " + p.lastName);
        System.out.println("p.age = " + p.getAge());
        System.out.println("p.birthDay (Speicheradresse) = " + p.birthDay);
        //System.out.println("p.birthDay = " + p.birthDay.year + "-" + p.birthDay.month + "-" + p.birthDay.day);
        p.birthDay.print();
        System.out.println("p.birthDay.getBirthDayAsString() = " + p.birthDay.getBirthDayAsString());
    }
}
