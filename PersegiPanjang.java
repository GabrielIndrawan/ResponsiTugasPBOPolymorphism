package week10;

public class PersegiPanjang {
    private int panjang;
    private int lebar;

    PersegiPanjang(int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    void luas()
    {
        System.out.println(panjang*lebar);
    }

    void keliling()
    {
        System.out.println((panjang+lebar)*2);
    }

    int getPanjang()
    {
        return panjang;
    }

    int getLebar()
    {
        return lebar;
    }
}
