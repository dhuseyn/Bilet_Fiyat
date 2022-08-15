import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double ucret, indrm, tutar;
        int yol, tur, yas;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe gir : ");
        yol = input.nextInt();
        System.out.print("Yaşınız : ");
        yas = input.nextInt();
        System.out.print("Yolculuk türü (1-Tek yön 2-Gidiş-Dönüş : ");
        tur = input.nextInt();

        if (yol>0 && yas>0 && (tur==1 || tur==2)) {

            ucret = yol*0.10 ;

            if (yas<12) indrm = ucret*0.50;
            else if (yas<24) indrm = ucret*0.10;
            else if (yas>=65) indrm = ucret*0.30;
            else indrm=0;

            ucret -= indrm;

            if (tur==2) {
                indrm = ucret*0.20;
                tutar = (ucret - indrm)*2;
            }else tutar = ucret - indrm;

            System.out.println("Bilet tutarı : "+ tutar+" TL");
        } else System.out.println("Hatalı giriş...");

    }
}