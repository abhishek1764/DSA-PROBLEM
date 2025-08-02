public class rotate {//rotation of single bit
    public static void main(String[] args) { 
        
        int num=12345;
        int copy=num;
        int div=1;
        int last=num%10;
        while(num!=0){
        num=num/10;
        div=div*10;
        }
      num=copy;
      div=div/10;
      int s=div/10;
      int first=num/div;
      int mid=num%div;
      mid=mid/10;
      int r=last*div+first*s+mid;
    
      System.err.println(r);




    }
    
}
