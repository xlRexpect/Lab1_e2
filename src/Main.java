

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String nume_fis = "in.txt ";
        BufferedReader flux_in;
        flux_in = new BufferedReader(new FileReader(nume_fis));
        PrintStream flux_out = new PrintStream ("out.txt");
        String linie;
        float sum = 0;
        int n=0;
        float min=Float.MAX_VALUE;
        float max=Float.MIN_VALUE;
        System.out.println("Continutul fisierului:");
        while ((linie = flux_in.readLine()) != null) {
            float x = Float.parseFloat(linie);
            System.out.println(x);
            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
            sum = sum + x;
            n++;
        }

        flux_in.close();

        System.out.println("suma:"+sum);
        flux_out.println(sum);
        if(n!=0) {
            System.out.println("media aritmetica:" + sum / n);
            flux_out.println(sum / n);
        }
        System.out.println("valoarea minima:"+min);
        flux_out.println(min);
        System.out.println("valoarea maxima:"+max);
        flux_out.println(max);
        flux_out.close();
    }
}

