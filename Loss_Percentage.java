import java.util.Scanner;
public class Per{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a - b ;
        double percentage = (c*100.0)/a;
        System.out.format("%.2f",percentage);
    }
}