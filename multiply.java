
import java.util.*;
public class multiply {
public static int calculatemultiply(int a,int b) {
    int multiply  = a * b;
    return multiply;
}
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc. nextInt();
        int multiply = calculatemultiply(a,b);
        System.out.print(multiply);
    }
}

