package Gojek;
import java.util.Scanner;


public class TugasMain {

    static boolean cek(int kend){
        return kend == 1 || kend == 2;
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
            pilihan = input.nextInt();
        } while (pilihan == 1);
    }
}



