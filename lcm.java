public class lcm {
    public static void main(String[] args) {
        int x=4;
        int y=6;
        int big=x>=y?x:y;
        while (true) {
            if(big%x==0&&big%y==0){
                System.out.println("lcm of" +x +"lcm of" +y+ "lcm is");
            } 
            
        }
    }
}
