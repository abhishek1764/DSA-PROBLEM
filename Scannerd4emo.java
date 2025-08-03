
    import java.util.Scanner;

public class Scannerd4emo {
    public static void main(String[] args) throws Exception {
        // BufferedReader

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Id");
        int id = scanner.nextInt();
        scanner.nextLine(); // eat \n
        System.out.println("Enter the Name");
        String name = scanner.nextLine();
        System.out.println("Id " + id);
        System.out.println("Name " + name);
        // scanner.close();
        scanner = new Scanner(System.in);
        System.out.println("Enter the Id");
        id = scanner.nextInt();
        System.out.println("Id " + id);
        scanner.close();
        // Scanner scanner = new Scanner(new
        // File("/Users/amitsrivastava/Documents/ims-batch-1-codes/ScannerDemo.java"));
        // // Scanner scanner = new Scanner("Hello How are You");
        // int word = 0;
        // while (scanner.hasNext()) {
        // word++;
        // System.out.println(scanner.next());
        // }
        // System.out.println("Total Words " + word);
        // scanner.close();
    }
}
    

