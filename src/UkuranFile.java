import java.util.Scanner;

public class UkuranFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.int);

        System.out.print("Nama file   : ");
        String namafile = scanner.nextLine();

        System.out.print("Ukuran (byte) : ");
        long ukuranByte = scanner.nextLong();

        final double SATU_KB = 1024.0;

        double ukuranKB = ukuranByte / SATU_KB;

        double ukuranMB = ukuranKB / SATU_KB;

        double ukuranGB = ukuranMB / SATU_KB;

        double hasikPembulatanMB = Math.round(ukuranMB);

        int ukuranMBBulat = (int) hasikPembulatanMB;

        double selisihPembulatan = ukuranMB - ukuranMBBulat;



     }
}