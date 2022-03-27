package Gojek;
import java.util.Scanner;

public class TugasMain {

    public static void harga_perjalanan(int kend, float jarak) {
            float ht, hp, h;
            Hitung_cek nt = new Hitung_cek();

            if (kend == 1) {
                if (jarak < 10) {
                    hp = 1000;
                    ht = nt.hitung(jarak);
                    h = hp + ht;
                    System.out.print("Harga : ");
                    System.out.println(h);
                } else if (jarak >= 10 && jarak < 20) {
                    hp = 15000;
                    ht = nt.hitung(jarak);
                    h = ht + hp;
                    System.out.print("Harga : ");
                    System.out.println(h);
                } else if (jarak >= 20 && jarak < 30) {
                    hp = 18000;
                    ht = nt.hitung(jarak);
                    h = ht + hp;
                    System.out.print("Harga : ");
                    System.out.println(h);
                } else {
                    System.out.println("Jarak terlalu jauh. Silahkan menggunakan pilihan Mobil");
                    System.out.println("");
                }
            } else if (kend == 2) {
                if (jarak < 10) {
                    hp = 6000;
                    ht = nt.hitung(jarak);
                    h = hp + ht;
                    System.out.print("Harga : ");
                    System.out.println(h);
                } else if (jarak >= 10 && jarak < 25) {
                    hp = 18000;
                    ht = nt.hitung(jarak);
                    h = ht + hp;
                    System.out.print("Harga : ");
                    System.out.println(h);
                } else if (jarak >= 25 && jarak < 40) {
                    hp = 26000;
                    ht = nt.hitung(jarak);
                    h = ht + hp;
                    System.out.print("Harga : ");
                    System.out.println(h);
                } else if (jarak >= 40 && jarak < 60) {
                    hp = 30000;
                    ht = nt.hitung(jarak);
                    h = ht + hp;
                    System.out.print("Harga : ");
                    System.out.println(h);
                } else {
                    System.out.println("Jarak terlalu jauh");
                }
            }

        }

        public static void main(String[] args) {
            String nama, tujuan;
            float jarak;
            int pilihan, kend;

            Hitung_cek perjalanan = new Hitung_cek();

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
                System.out.println("Masukan 1 atau 2");
                kend = input.nextInt();
                boolean hasilcek = perjalanan.cek(kend);
                if (hasilcek) {
                    System.out.println("Berapa kah jarak anda ke tujuan ?");
                    System.out.print("Jarak: ");
                    jarak = input.nextFloat();
                    harga_perjalanan(kend, jarak);
                } else {
                    System.out.println("pilihan tidak tersedia");
                }


                System.out.println("Apakah anda ingin melakukan perjalanan lainnya ?");
                System.out.println("yes = 1 / no = 0");
                pilihan = input.nextInt();
            } while (pilihan == 1);
        }
}
