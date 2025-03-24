import java.util.*;

public class PrimeSum {
    static List<Integer>sieve(int n){
        boolean[]p=new boolean[n+1];
        Arrays.fill(p,true);
        p[0]=p[1]=false;
        for(int i=2;i*i<=n;i++){
            if(p[i])for(int j=i*i;j<=n;j+=i)p[j]=false;
        }
        List<Integer>l=new ArrayList<>();
        for(int i=2;i<=n;i++)if(p[i])l.add(i);
        return l;
    }

    static int sumPrimes(int L,int R){
        List<Integer>primes=sieve(R);
        int s=0;
        for(int p:primes)if(p>=L)s+=p;
        return s;
    }

    public static void main(String[]args){
        System.out.println("Sum="+sumPrimes(10,20));
        System.out.println("Sum="+sumPrimes(15,25));
    }
}
