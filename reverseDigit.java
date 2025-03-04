class Main {
    public static void main(String[] args) {
        int n=325345,rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        System.out.print(rev);
    }
}
