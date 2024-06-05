package week10;

public class Persegi extends BangunDatar{
    private int sisi;

    public Persegi(int sisi)
    {
        this.sisi = sisi;
    }

    public void luas()
    {
        System.out.println(sisi*sisi);
    }

    public void keliling() {
        System.out.println(sisi*4);
    }

    public int getSisi() 
    {
        return this.sisi;
    }
}