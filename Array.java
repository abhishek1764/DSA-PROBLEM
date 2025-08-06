public class Array{
    
    public static void main(String[] args) {
        int p[][] = new int[3][4];
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {

            }
        }
        int[] p2[] = new int[3][4];
        int[][] p3 = new int[3][4];
        int[][] p4 = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 } };
        int[][] p5 = new int[3][];
        p5[0] = new int[10];
        p5[1] = new int[20];
        p5[2] = new int[30];
        int a[] = { 10, 20, 30 };
        int[] b = { 10, 20, 30 };
        b[0] = 1000; // Update
        int c[] = new int[10];
        int[] d = new int[10];
        int[] e = new int[] { 10, 20, 30 };
        // Array Traverse
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
        for (int i : d) {
            System.out.println(i);
        }
    }
}




    

