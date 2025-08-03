import java.util.LinkedList;

public class wrapper {

     public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        int x = 10;// 4 byte
        byte y = (byte) x;
        int z = y;
        Integer h = 1000;
        byte g = h.byteValue(); // h.xxxValue()
        String g1 = "1000";
        int b2 = Integer.parseInt(g1);
        System.out.println(Integer.toHexString(45));
        System.out.println(Integer.toOctalString(55));
        System.out.println(Integer.toBinaryString(22));
    }
}
    


