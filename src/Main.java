import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut_kg_fiyat = 2.14, elma_kg_fiyat = 3.67, domates_kg_fiyat = 1.11, muz_kg_fiyat = 0.95, patlican_kg_fiyat = 5;
        double armut_kg, elma_kg, domates_kg, muz_kg, patlican_kg, toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo?: ");
        armut_kg = input.nextDouble();

        System.out.print("Elma Kaç Kilo?: ");
        elma_kg = input.nextDouble();

        System.out.print("Domates Kaç Kilo?: ");
        domates_kg = input.nextDouble();

        System.out.print("Muz Kaç Kilo?: ");
        muz_kg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo?: ");
        patlican_kg = input.nextDouble();

        toplam = (armut_kg * armut_kg_fiyat) + (elma_kg * elma_kg_fiyat) + (domates_kg * domates_kg_fiyat) + (muz_kg * muz_kg_fiyat) + (patlican_kg * patlican_kg_fiyat);
        System.out.println("\n TOPLAM: " + toplam);

    }
}