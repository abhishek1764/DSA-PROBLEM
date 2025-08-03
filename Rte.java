public class Rte {
     public static void main(String[] args) {
        int num = 72456;
        int k = 3;
        // output = 45672
        int copy = num;

        int count = 0;
        while (num >= 10) {
            count++;
            num = num / 10;
        }
        num = copy;
        System.out.println(count);
        System.out.println(num);

        for (int i = 0; i < k; i++) {
            int lastDigit = num % 10;
            num = lastDigit * (int) Math.pow(10, count) + num / 10;
            // 40000
            // 5123
        }
        System.out.println(num);
    }
}
        
    
