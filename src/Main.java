import java.util.ArrayList;
import java.util.Scanner;
    public class Main {

        public static void main(String[] args) {

            Scanner entrada = new Scanner ( System.in );
            int numero[] = new int[20];
            boolean creciente = true;
            boolean decreciente = true;


            System.out.println ( " llenar el arreglo" );
            for (int i = 0; i < 19; i++) ;
            {
                System.out.println ( " digite un numero" );
                int i = 0;
                numero[i] = entrada.nextByte ();
            }

            for (int i = 0; i < 19; i++) {
                if (numero [i] < numero [i + 1]) ; // creciente
                creciente = true;
            }
            final boolean a = creciente == true && decreciente == false;
            System.out.println ("el arreglo esta de forma creciente");
            for (int i = 0; i < 19; i++) {
                if (numero[i] > numero[i + 1]) ; //decreciente
                decreciente = true;
                final boolean b = creciente == false && decreciente == true;
                System.out.println ("el arreglo esta de forma decreciente");
                }
            }

        }
