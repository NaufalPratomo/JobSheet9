import java.util.Scanner;

public class ProgramArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int elemen;
        System.out.print("Banyaknya elemen : ");
        elemen = sc.nextInt();
        int[] input = new int [elemen];
        int sum = 0, temp = 0;
        
        for (int i = 0; i < input.length; i++) {
            System.out.print("Masukkan nilai elemen ke-"+(i+1)+" : ");
            input[i] = sc.nextInt();
            sum += input[i];
        }

        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < input.length-i; j++) {
                if (input[j-1] > input[j]) {
                    //swap elemen
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }

        double average = (double) sum / input.length;

        System.out.println("Nilai tertinggi: " + input [elemen-1]);
        System.out.println("Nilai terendah: " + input [0]);
        System.out.println("Rata-rata: " + average);
    }
}
