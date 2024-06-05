package week10;

import java.util.Scanner;

public class PolymorphismMain{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih Bangun Datar yang akan kau hitung luas dan keliling nya : ");
        System.out.println("1) Persegi");
        System.out.println("2) Persegi Panjang");
        System.out.println("3) Lingkaran");
        System.out.println("4) Segitiga");
        int option = scanner.nextInt();
        switch(option){
            case 1 :
                System.out.println("Ketikan sisi : ");
                int sisi = scanner.nextInt();
                Persegi persegi = new Persegi(sisi);
                System.out.print("Luas : "); persegi.luas();
                System.out.print("Keliling : "); persegi.keliling();
                break;
            case 2 :
                System.out.println("Ketikan sisi dan pangjang : ");
                int sisi2 = scanner.nextInt();
                int panjang = scanner.nextInt();
                PersegiPanjang persegiPanjang = new PersegiPanjang(sisi2,panjang);
                System.out.print("Luas : "); persegiPanjang.luas();
                System.out.print("Keliling : "); persegiPanjang.keliling();
                break;
            case 3 :
                System.out.println("Ketikan sisi dan pangjang : ");
                int radius = scanner.nextInt();
                Lingkaran lingkaran = new Lingkaran(radius);
                System.out.print("Luas : "); lingkaran.luas();
                System.out.print("Keliling : "); lingkaran.keliling();
                break;
            case 4 :
                System.out.println("Ketikan sisi dan pangjang : ");
                int alas = scanner.nextInt();
                int tinggi = scanner.nextInt();
                Segitiga segitiga = new Segitiga(alas,tinggi);
                System.out.print("Luas : "); segitiga.luas();
                System.out.print("Keliling : "); segitiga.keliling();
                break;
            default:
                System.out.println("Ok then ...");
                break;
        }
    }
}