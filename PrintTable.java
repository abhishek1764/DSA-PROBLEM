public class PrintTable {
    static void printTable(int num, int i) {
        // Base case
        if (i == 0) {
            return; // Exit from the function call
        }

        printTable(num, i - 1);
        System.out.println(num + " * " + i + " = " + (num * i));
        // BackTrack
        // Post Logic

    }

    static String printTable2(int num, int i) {
        if (i == 11) {
            return "";
        }
        String r1 = printTable2(num, i + 1);
        return num + " * " + i + " = " + (num * i) + "\n" + r1;
    }

    public static void main(String[] args) {
        // printTable(5, 10);
        String r = printTable2(5, 1);
        System.out.println(r);
    }
}