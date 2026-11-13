public class DemoStudentApp {

    public static void main() {
        System.out.println("HelloWorld Student");

        Student susi = new Student(); // mit new Student wird ein Objekt der Klasse erzeugt
        susi.firstName = "Susi"; // .-Operator
        susi.lastName = "Sorglos";
        susi.matrikelNumber = 1001;
        susi.department = "IWI";

        printStudent(susi);

        Student max = new Student();
        max.firstName = "Max";
        max.lastName = "Mustermann";
        max.matrikelNumber = 1002;
        max.department = "Marketing";

        printStudent(max);

        Student john = new Student();
        john.firstName = "John";
        john.lastName = "Doe";
        printStudent(john);
    }

    public static void printStudent(Student s) {
        System.out.println(s.firstName + " " + s.lastName + " (" + s.matrikelNumber + ") " + s.department);
    }
}
