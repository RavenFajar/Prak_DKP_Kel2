package Gojek;

public class Tugas {

    public void harga_perjalanan(int kend, float jarak) {
        float ht, hp, h;

        if (kend == 1) {
            if (jarak < 10) {
                hp = 5000;
                ht = hitung(jarak);
                h = hp + ht;
                System.out.print("Harga : ");
                System.out.println(h);
            } else if (jarak >= 10 && jarak < 20) {
                hp = 15000;
                ht = hitung(jarak);
                h = ht + hp;
                System.out.print("Harga : ");
                System.out.println(h);
            } else if (jarak >= 20 && jarak < 30) {
                hp = 15000;
                ht = hitung(jarak);
                h = ht + hp;
                System.out.print("Harga : ");
                System.out.println(h);
            } else {
                System.out.println("jarak terlalu jauh");
            }
        } else if (kend == 2) {
            if (jarak < 10) {
                hp = 6000;
                ht = hitung(jarak);
                h = hp + ht;
                System.out.print("Harga : ");
                System.out.println(h);
            } else if (jarak >= 10 && jarak < 25) {
                hp = 18000;
                ht = hitung(jarak);
                h = ht + hp;
                System.out.print("Harga : ");
                System.out.println(h);
            } else if (jarak >= 25 && jarak < 40) {
                hp = 22000;
                ht = hitung(jarak);
                h = ht + hp;
                System.out.print("Harga : ");
                System.out.println(h);
            } else if (jarak >= 40 && jarak < 50) {
                hp = 27000;
                ht = hitung(jarak);
                h = ht + hp;
                System.out.print("Harga : ");
                System.out.println(h);
            }else{
                System.out.println("jarak terlalu jauh");
            }
        }

    }

    private float hitung(float input) {
        float hasil;
        hasil = (input % 10) * 2000;
        return hasil;
    }

}
