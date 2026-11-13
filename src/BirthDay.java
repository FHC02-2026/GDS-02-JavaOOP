public class BirthDay {

    public int year;
    public int month;
    public int day;

    public void setBirthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void print() {
        System.out.println(year + "-" + month + "-" + day);
    }

    public String getBirthDayAsString() {
        return (year + "-" + month + "-" + day);
    }
}
