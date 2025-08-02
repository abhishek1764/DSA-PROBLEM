class swap{
    public static void main(String[] args) {
        int num=12345;
        int copy=num;
        int last=num%10;
        int div =1;
        while(num!=0){
            num=num/10;
            div=div*10;
        }
        num=copy;
        div=div/10;
        int first=num/div;
        int mid=num%div;//ffirst digit remove
        mid =mid/10;//last digit remove
        int r = last*div+mid*10+first;
        System.out.println(r);

    }

}