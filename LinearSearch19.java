import java.util.Scanner;

public class LinearSearch19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int key;
        int hasil = 0;
        int Jmlh;

        System.out.print("Masukkan jumlah elemen array: ");
        Jmlh = sc.nextInt();
        int []arrayInt = new int[Jmlh];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-"+i+" : ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
                break;
            } else {
                System.out.print("Key tidak ditemukan");
                break;
            }
        }

    }
}
