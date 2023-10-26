/**
 * ArrayRataNilai10
 */
import java.util.Scanner;
public class ArrayRataNilai10 {

    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        int jmlMhs = 0;
        int lulus = 0;
        int tdkLulus = 0;
        int jmlLulus = 0;
        int jmlTdkLulus = 0;
        double rataLulus = 0;
        double rataTdkLulus = 0;
        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlMhs = input10.nextInt();
        double[] nilaiMhs = new double[jmlMhs];
        for (int i = 0;i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = input10.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length;i++) {
            if (nilaiMhs[i] > 70) {
                lulus += nilaiMhs[i];
                jmlLulus += 1;
                rataLulus = (double) lulus/jmlLulus;
            } else {
                tdkLulus += nilaiMhs[i];
                jmlTdkLulus += 1;
                rataTdkLulus = (double) tdkLulus/jmlTdkLulus;
            }
        }
        System.out.println("Rata-rata nilai lulus : "+ rataLulus);
        System.out.println("Rata-rata nilai tidak lulus : "+ rataTdkLulus);
    }
}