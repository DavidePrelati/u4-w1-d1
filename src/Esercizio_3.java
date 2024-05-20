import java.util.Scanner;

public class Esercizio_3 {
    public static void main(String[] args) {

        double perimetroRettangolo = periRett(30, 27.57);
        System.out.println("Il perimetro del rettangolo è " + perimetroRettangolo);


        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int numero = Integer.parseInt(scan.nextLine());
        int risult = pariDispari(numero);
        System.out.println(risult);



        Scanner scn = new Scanner(System.in);
        System.out.println("Primo lato");
        double n1 = Double.parseDouble(scn.nextLine());
        System.out.println("Secondo lato");
        double n2 = Double.parseDouble(scn.nextLine());
        System.out.println("Terzo lato");
        double n3 = Double.parseDouble(scn.nextLine());
        double areaTri = areaTriangolo(n1,n2,n3);
        System.out.println("L'area del triangolo è " + areaTri);


    }

    public static double periRett (double l1, double l2)
    {
        return l1*2+l2*2;
    }

    public static int pariDispari (int n)
    {
        if(n % 2 == 0)
        {
            return 0;

        }else{
            return 1;
        }
    }

    public static double areaTriangolo(double a, double b, double c)
    {
        double semiPerimetro = (a+b+c)/2;
        double areaAlQuadrato = semiPerimetro * (semiPerimetro-a) * (semiPerimetro-b) * (semiPerimetro-c);
        return Math.sqrt(areaAlQuadrato);
    }
}
