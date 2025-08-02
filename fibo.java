

class fibo{
    public static void main(String[] args) {
        int first=0;
        int second=1;
        int n=10;

        for(int i=1;i<=10;i++){
            System.err.println(first);

            int next=first+second; 
            first=second;
            second=next;
            

        }
        
    }
}