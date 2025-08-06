 public class fact{
    static int fact(int num) {
        // Base case
        if (num == 1) {
            return 1;
        }
        int smallResult = fact(num - 1); // 5 --> 4 --> 3 --> 2 --> 1
        // BackTrack
        return smallResult * num;
    }

    static void fact(int num, int result) {
        if (num == 1) {
            System.out.println("Fact is " + result);
            return;
        }
        fact(num - 1, result * num); // 5 --> 4 --> 3 --> 2 --> 1
    }

    public static void main(String[] args) {
        int r = fact(5);
        System.out.println(r);
        // fact(5, 1); // 5 * 4 * 3 * 2 * 1 = 120
    }
}