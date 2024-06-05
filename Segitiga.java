package week10;
import static java.lang.Math.sqrt;

public class Segitiga extends BangunDatar{
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi)
    {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void luas()
    {
        System.out.println(alas*tinggi/2.0);
    }

    public void keliling()
    {
        System.out.println(alas+(sqrt((alas/2)*(alas/2)+tinggi*tinggi)*2));
    }

    public int getTinggi() 
    {
        return this.tinggi;
    }

    public int getAlas()
    {
        return this.alas;
    }
}