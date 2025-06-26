import java.util.Scanner;
public class countD{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println(countDigits(num));

}

    public static int countDigits(int num) {
        // Base case: if number becomes 0, stop recursion
        if (num == 0) {
            return 0;
        } else {
            return 1 + countDigits(num / 10); // Remove one digit and recurse
        }
    }
}