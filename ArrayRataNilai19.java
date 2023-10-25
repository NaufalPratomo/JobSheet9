import java.util.Scanner;

public class ArrayRataNilai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total1 = 0, total2 = 0;
        double rataLulus, rataTidakLulus;
        int Mahasiswa;
        int counterLulus = 0, counterTidakLulus = 0; 
        
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        Mahasiswa = sc.nextInt();
        int[] nilaiMhs = new int[Mahasiswa];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                counterLulus++;
                total1 += nilaiMhs[i];
            } else {
                counterTidakLulus++;
            total2 += nilaiMhs[i];
            }
        }

        rataLulus = total1/counterLulus;
        rataTidakLulus = total2/counterTidakLulus;
        System.out.println("Rata-rata nilai lulus = "+rataLulus);
        System.out.println("Rata-rata tidak lulus = "+rataTidakLulus );
    }
}
