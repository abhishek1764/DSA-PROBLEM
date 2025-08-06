public class ArrayTraverse {
    
 static void traverse(int a[], int index) {
        if (index == a.length) {
            return;
        }
        System.out.println(a[index]);
        index++;
        traverse(a, index);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };// reference
        traverse(arr, 0);
    }
}
    

