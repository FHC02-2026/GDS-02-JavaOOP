public class DemoStudentApp {

    public static void main() {
        System.out.println("HelloWorld Student");

        Student susi = new Student(); // mit new Student wird ein Objekt der Klasse erzeugt
        susi.firstName = "Susi"; // .-Operator
        susi.lastName = "Sorglos";
        susi.matrikelNumber = 1001;

        printStudent(susi);

        Student max = new Student();
        max.firstName = "Max";
        max.lastName = "Mustermann";
        max.matrikelNumber = 1002;

        printStudent(max);
    }

    public static void printStudent(Student s) {
        System.out.println(s.firstName + " " + s.lastName + " (" + s.matrikelNumber + ")");
    }
}
