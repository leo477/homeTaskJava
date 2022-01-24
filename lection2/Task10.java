package lection2;

import java.util.Arrays;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[5];
        int[] b = new int[5];
        int suma=0;
        int sumb = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = random.nextInt(6);
            b[i] = random.nextInt(6);
            suma+=a[i];
            sumb+=b[i];
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(b[i] + " ");
        }

        double ab = (double) sumb/b.length;
        double aa = (double) suma/a.length;
        System.out.println();
        System.out.println("Average a = " + aa);
        System.out.println("Average b = " + ab);
        if (aa>ab){
            System.out.println("Average (a) > Average(b)");
        } else if (aa<ab) {
            System.out.println("Average (a) < Average(b)");
        }else {  System.out.println("Average (a) == Average(b)"); }
    }
}