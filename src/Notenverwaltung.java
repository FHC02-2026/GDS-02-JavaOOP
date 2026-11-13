import java.util.Arrays;

public class Notenverwaltung {

    public static void main(String[] args) {
        String[] namen = {"Anna", "David", "Clara", "Ben", "Susi"};
        int[] matrikel = {1001, 1002, 1003, 1004, 1005};
        int[] notenGDS = {1, 2, 4, 1, 1};
        int[] notenMathe = {2, 2, 3, 1, 5};
        int[] notenBWL = {1, 1, 5, 2, 5};

        printStudent(0, namen, matrikel, notenGDS, notenMathe, notenBWL);
        System.out.println("printall:");
        printAll(namen, matrikel, notenGDS, notenMathe, notenBWL);

        System.out.println("avg: " + durchschnitt(notenGDS, notenMathe, notenBWL, 0));

        System.out.println("fachDurchschnitt(notenGDS) = " + fachDurchschnitt(notenGDS));

        int indexOfBestStudend = bestePerson(notenGDS, notenMathe, notenBWL);
        System.out.println("Die beste Person ist: " + namen[indexOfBestStudend]);

        System.out.println("anzahlNichtGenuegend(notenGDS, notenMathe, notenBWL) = " + anzahlNichtGenuegend(notenGDS, notenMathe, notenBWL));

        System.out.println("SetNote");
        printStudent(0, namen, matrikel, notenGDS, notenMathe, notenBWL);
        setNote(notenGDS, 0, 7);
        printStudent(0, namen, matrikel, notenGDS, notenMathe, notenBWL);
        setNote(notenGDS, 0, 2);
        printStudent(0, namen, matrikel, notenGDS, notenMathe, notenBWL);

        System.out.println("sort");
        Arrays.sort(namen); // führt ins Chaos
        printAll(namen, matrikel, notenGDS, notenMathe, notenBWL);

    }

    public static void printStudent(int i, String[] namen, int[] matrikel, int[] nGDS, int[] nMathe, int[] nBWL){

        double average = durchschnitt(nGDS, nMathe, nBWL, i);

        System.out.println(namen[i] + " (" + matrikel[i] + "): GDS=" + nGDS[i] + " Mathematik=" + nMathe[i] + " BWL=" + nBWL[i]
                + " Average=" + average);

        // Anna (1001): GDS=1 Mathematik=2 BWL=3
    }

    public static void printAll(String[] namen, int[] matrikel, int[] nGDS, int[] nMathe, int[] nBWL) {
        for (int i = 0; i < namen.length; i++){
            printStudent(i, namen, matrikel, nGDS, nMathe, nBWL);
        }
    }

    public static double durchschnitt(int[] gds, int[] mathe, int[] bwl, int index) {
        int summe = gds[index] + mathe[index] + bwl[index];
        return summe / 3.0;

        /*
        Variante 2:
        double average = (gds[index] + mathe[index] + bwl[index]) / 3.0;
        return average;

        Variante 3:
        return (gds[index] + mathe[index] + bwl[index]) / 3.0;
         */
    }
    /*

    Implementieren Sie folgende Methoden:
1. fachDurchschnitt(int[] noten) liefert den Durchschnitt eines Faches über alle
Personen, z. B. fachDurchschnitt(notenGDS) .
2. bestePerson(int[] gds, int[] mathe, int[] bwl) liefert den Index der Person
mit dem besten (= niedrigsten) Durchschnitt. Geben Sie in main den Namen dieser
Person aus.
3. anzahlNichtGenuegend(int[] gds, int[] mathe, int[] bwl) zählt, wie viele
Fünfer insgesamt vergeben wurden.
     */
    
    public static double fachDurchschnitt(int[] noten){
        int summe = 0;
        for (int i = 0; i < noten.length;i++) {
            summe = summe + noten[i];
        }
        System.out.println("summe = " + summe);
        System.out.println("noten.length = " + noten.length);
        System.out.println("noten.length * 1.0 = " + noten.length * 1.0);
        return summe / (noten.length * 1.0);
    }

    public static int bestePerson(int[] gds, int[] mathe, int[] bwl) {

        double[] averages = new double[gds.length];
        for (int i = 0; i < gds.length; i++) {
            averages[i] = durchschnitt(gds, mathe, bwl, i);
        }

        double bestAverage = 5.1;
        int indexOfBestAverage = -1;
        for (int i = 0; i < averages.length; i++) {
            if (averages[i] < bestAverage) {
                bestAverage = averages[i];
                indexOfBestAverage = i;
            }
        }
        return indexOfBestAverage;
    }

    public static int anzahlNichtGenuegend(int[] gds, int[] mathe, int[] bwl){

        int summeNichtGeuegend = 0;
        for (int i = 0; i < gds.length; i++) {
            if (gds[i] == 5)
                summeNichtGeuegend++;
        }

        for (int i = 0; i < mathe.length; i++) {
            if (mathe[i] == 5)
                summeNichtGeuegend++;
        }

        for (int i = 0; i < bwl.length; i++) {
            if (bwl[i] == 5)
                summeNichtGeuegend++;
        }

        return summeNichtGeuegend;
    }

    public static int anzahlNichtGenuegend2(int[] gds, int[] mathe, int[] bwl){

        int summeNichtGeuegend = 0;
        for (int i = 0; i < gds.length; i++) {
            if (gds[i] == 5)
                summeNichtGeuegend++;

            if (mathe[i] == 5)
                summeNichtGeuegend++;

            if (bwl[i] == 5)
                summeNichtGeuegend++;
        }

        return summeNichtGeuegend;
    }

    public static void setNote(int[] noten, int personIndex, int note) {

        if (note >= 1 && note <= 5) {
            noten[personIndex] = note;
        }
        else {
            System.out.println("Die Note " + note + " ist nicht erlaubt.");
        }
    }


}
