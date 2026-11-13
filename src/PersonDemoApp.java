public class PersonDemoApp {

    static void main() {
        System.out.println("HelloWorld PersonDemo");

        Person p1 = new Person();
        p1.firstName = "Max";
        p1.lastName = "Mustermann";
        p1.age = 36;
        p1.setBirthDay(1990, 6 , 1);

        /*
        p1.birthDay = new BirthDay();
        p1.birthDay.day = 1;
        p1.birthDay.month = 5;
        p1.birthDay.year = 1990;*/

        printPerson(p1);
    }

    public static void printPerson(Person p) {
        System.out.println("p.firstName = " + p.firstName);
        System.out.println("p.lastName = " + p.lastName);
        System.out.println("p.age = " + p.age);
        System.out.println("p.birthDay = " + p.birthDay);
        //System.out.println("p.birthDay = " + p.birthDay.year + "-" + p.birthDay.month + "-" + p.birthDay.day);
        p.birthDay.print();
    }
}
