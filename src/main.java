import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Agata on 2015-04-15.
 */
public class main {
    public static void main(String [] args) {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String linia = inputReader.readLine();
            String[] czesc1;
            double prawy;
            double lewy;

                if(linia.contains("+")) {
                    czesc1 = linia.split("\\+");
                    prawy = Double.parseDouble(czesc1[0]);
                    lewy = Double.parseDouble(czesc1[1]);
                    double wynik = prawy+lewy;
                    System.out.println("="+wynik);

                }
                if(linia.contains("-")) {
                    czesc1 = linia.split("\\-");
                    prawy = Double.parseDouble(czesc1[0]);
                    lewy = Double.parseDouble(czesc1[1]);
                    double wynik= prawy-lewy;
                    System.out.println("="+wynik);

                }
                if(linia.contains("*")) {
                    czesc1 = linia.split("\\*");
                    prawy = Double.parseDouble(czesc1[0]);
                    lewy = Double.parseDouble(czesc1[1]);
                    double wynik= prawy*lewy;
                    System.out.println("="+wynik);

                }
                if(linia.contains("/")) {
                czesc1 = linia.split("\\/");
                    prawy = Double.parseDouble(czesc1[0]);
                    lewy = Double.parseDouble(czesc1[1]);
                    double wynik= prawy/lewy;
                    System.out.println("="+wynik);

            }





        } catch (IOException e1) {
            e1.printStackTrace();
        }


    }
}
