import java.util.Arrays;

public class Esercizio_1 {
    public static void main(String[] args) {
        int result = prod(20,3);
        System.out.println("il risultato è " +result);


        String method2 = m2("Davide",20);
        System.out.println("Ciao "+ method2);


        String[] arrayFirst = {"Ciao", "a", "quanti", "sono", "Brasiliano"};
        String stringa = "tutti";

        String[] arrayMod = stringPlusArray(arrayFirst, stringa);
        String s = Arrays.toString(arrayMod);
        System.out.println(s);
    }

    public static int prod(int n1, int n2){
        return n1*n2;
    }

    public static String m2(String str, int num){
        return str+num;
    }

    public static String[] stringPlusArray (String[] array, String str)
    {
        if(array.length != 5){
            System.out.println("Inserisci un array di 5 elementi");
        }

        String[] newArr = new String[6];
        newArr[2] = str;
        for (int i=0; i<2; i++)
        {
            newArr[i]=array[i];
        }
        for (int i = 2; i < 5; i++) {
            newArr[i + 1] = array[i];
        }

        return newArr;
    }

}
