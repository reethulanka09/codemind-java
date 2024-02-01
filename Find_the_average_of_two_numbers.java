import java.util.Scanner;
public class Average{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float m = sc.nextFloat();
        float r = (n+m)/2;
        System.out.format("%.4f",r);
    }
}