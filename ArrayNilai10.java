/**
 * ArrayNilai10
 */
import java.util.Scanner;
public class ArrayNilai10 {

    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masuskkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = input10.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-"+i+" lulus!");
            }
            else {
                System.out.println("Mahasiswa ke-"+i+" tidak lulus!");

            } 
        }
    }
}