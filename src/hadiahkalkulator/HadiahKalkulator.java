package hadiahkalkulator;

import java.util.Scanner;

/**
 *
 * @author Fiskah Syela 29 RPL
 */
public class HadiahKalkulator {
    public static void main(String[] args) {
        int x,y;
        int kalkulator;

    Scanner input = new Scanner(System.in);

    System.out.print("Pilih Bilangan Pertama    :");
    x = input.nextInt();

    System.out.print("Pilih Bilangan Kedua      :");
    y = input.nextInt();


    System.out.println("Pilih Operasi Matematika");
    System.out.println("1. Ditambah 2.Dikurangi 3.Dikali 4.Dibagi");
    kalkulator = input.nextInt();

        switch (kalkulator) {
            case 1:
                System.out.println(x+ "+" +y+ "=" +(x + y));
                break;
            case 2:
                System.out.println(x+ "-" +y+ "="+(x - y));
                break;
            case 3:
                System.out.println(x+ "*" +y+ "="+(x * y));
                break;
            case 4:
                System.out.println(x+ ":" +y+ "="+(x / y));
                break;
            default:
                System.out.println("Pilih dengan angka 1,2,3 atau 4 ");
                break;
        }
    }
}


    
    

