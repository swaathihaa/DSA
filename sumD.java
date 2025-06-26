import java.util.Scanner;
public class sumD{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println(sumDigits(num));

}

    public static int sumDigits(int num) {
        
        if (num == 0) {
            return 0;
        } else {
            int digit=num%10;
            return digit + sumDigits(num / 10); 
        }
    }
}