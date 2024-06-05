package week10;

public class Lingkaran{
    private int radius;
    private static final double pi = 3.14;

    public Lingkaran(int radius)
    {
        this.radius = radius;
    }

    public void luas()
    {
        System.out.println(radius*radius*pi);
    }

    public void keliling()
    {
        System.out.println(radius*2*pi);
    }

    public int getRadius()
    {
        return radius;
    }
}