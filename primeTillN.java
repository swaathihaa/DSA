class Main {
    static int n=11;
    public static void main(String[] args) {
        Disp(n);
    }
    
    public static boolean isPrime(int n){
        if (n<2) return false;
        for(int i=2;i*i<=n;i++){
            if ((n%i)==0) return false;
        }
        return true;
    }
    
    public static void Disp(int n){
        for(int i=2;i<=n;i++){
            if (isPrime(i)==true){
                System.out.print(i+" ");
    }
}
}
}
