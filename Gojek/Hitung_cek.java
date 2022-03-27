package Gojek;

public class Hitung_cek {
    static boolean cek(int kend) {
        return kend == 1 || kend == 2;
    }
    public float hitung(float input) {
        float hasil;
        hasil = (input % 10) * 500;
        return hasil;
    }
}
