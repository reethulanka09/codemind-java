import java.util.Scanner;
public class Frames{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int f = ((a+b)*c)*2;
        System.out.println(f);
    }
}