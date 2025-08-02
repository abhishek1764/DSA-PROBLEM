

public class pattern {
    static void pattern1(){
        int n=5;
        for(int row=1; row<=n;row++){
            for(int col=1;col<=row; col++){
                System.out.print("*");//same line print

            }
            System.out.println();//new line

        }
    }
        public static void main(String[] args){
            pattern1();
        }
      
    
    
}
