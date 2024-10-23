//atm
import java.util.scanner;

public class javaScannerTest;
{
    static int pin = 3214;
    public static void main(String[] args)

{
    scanner sc = new scanner(System.in);
    System.out.println(X:"Please enter your atm pin");
    if (sc.hasNextInt())
    {
        int userpin = sc.nextInt();
        if(userPin ==pin)
    {
        System.out.println(x:"print entered valid pin");
    }
    else
    {
        System.out.println(X:"your pin is not matched");
    }
}