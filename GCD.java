public class GCD {
     public static void main(String[] args) {

        int x=12;
        int y=18;
        int smaller=x<y?x:y;
        int gcd=1;
        for(int i=1; i<=smaller;i++){
            if(x%i ==0 && y%i==0){
                gcd=i;
            }
        }
    System.out.println(gcd);

}
    
}
