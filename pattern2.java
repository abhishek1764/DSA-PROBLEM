public class pattern2 {
    static void pattern2() {
         int n=4;
        for(int row=1; row<=n;row++){
            for(int col=row;col<=n-row+1; col++){
                System.out.print("*");//same line print

            }
            System.out.println();//new line

        }
    }
        public static void main(String[] args){
            pattern2();
        }
      
    
    
}


    
    

