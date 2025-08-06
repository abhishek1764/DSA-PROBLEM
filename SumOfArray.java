public class SumOfArray {
    static int doSum(int arr[],int index){
        if(index==arr.length)
        {
            return 0;
        }
        int sum=arr[index]+doSum(arr,index+1);
        return sum;
        //return arr[index]+doSum(arr,index+1);
        //doSum(arr,index+1);
        //int sum=0;
        //return arr[index]+sum;

    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int sum=doSum(arr,0);
        System.out.println(sum);
    }
}
