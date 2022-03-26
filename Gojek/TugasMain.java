package Gojek;
import java.util.Scanner;


public class TugasMain {

    static boolean cek(int kend){
        return kend == 1 || kend == 2;
    }
    
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
    

    public static void main(String[] args) {
        String nama, tujuan;
        float jarak;
        int pilihan,kend;

        Tugas perjalanan = new Tugas();

        Scanner input = new Scanner(System.in);
        System.out.println("Tugas Modul 4");
        System.out.println("==============");
        System.out.println("Aplikasi Ojek Online");
        System.out.println("====================");
        System.out.print("Masukan nama anda : ");
        nama = input.nextLine();
        System.out.println("Baik " + nama + ", dimana kah tujuan anda ?");
        System.out.print("Tujuan : ");
        tujuan = input.nextLine();
        do {
            System.out.println("Pilih kendaraan yang anda inginkan");
            System.out.println("1. Motor");
            System.out.println("2. Mobil");
            kend = input.nextInt();
            boolean hasilcek = cek(kend);
            if (hasilcek){
                System.out.println("Berapa kah jarak anda ke tujuan ?");
                System.out.print("Jarak: ");
                jarak = input.nextFloat();
                perjalanan.harga_perjalanan(kend,jarak);
            }
            else{
                System.out.println("pilihan tidak tersedia");
            }

            System.out.print("Apakah anda ingin melakukan perjalanan lainnya ?");
            System.out.println("");
            pilihan = input.nextInt();
        } while (pilihan == 1);
        }
    }
}



