import java.util.Scanner;
public class Area{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double a = 3.14*r*r;
        System.out.format("%.2f",a);
    }
}