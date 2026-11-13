public class BirthDay {

    public int year;
    public int month;
    public int day;

    public void print() {
        System.out.println(year + "-" + month + "-" + day);
    }

    public String getBirthDayAsString() {
        return (year + "-" + month + "-" + day);
    }
}
