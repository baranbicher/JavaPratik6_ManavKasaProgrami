import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;
        double akg, ekg, dkg, mkg, pkg;
        System.out.print("Armut Kaç Kilo: ");
        akg = input.nextDouble();
        System.out.print("Elma Kaç Kilo: ");
        ekg = input.nextDouble();
        System.out.print("Domates Kaç Kilo: ");
        dkg = input.nextDouble();
        System.out.print("Muz Kaç Kilo: ");
        mkg = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo: ");
        pkg = input.nextDouble();

        double total = (armut * akg) + (elma * ekg) + (domates * dkg) + (muz * mkg) + (patlican * pkg);
        System.out.println("Toplam Tutar: " + total + "TL");



    }
}