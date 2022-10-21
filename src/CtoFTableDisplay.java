import java.util.Scanner;

public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String convert = "";
        convert = CtoF();
    }
//=============================================================

    public static double CtoF(Scanner pipe,) {
        //celsius = pipe.nextDouble();
        //pipe.nextLine();
        double fahr = 0;
        System.out.println("Celcius Temp \t Fahrenheit Temp \n-------------- \t -------------");

        double celsius;
        for (celsius = 0; celsius <= 20; celsius++)
            fahr = (((double) 9 / 5) * celsius) + 32;
        System.out.println("\t%.1f\t\t%.1f\n");

        return fahr;
    }



}
