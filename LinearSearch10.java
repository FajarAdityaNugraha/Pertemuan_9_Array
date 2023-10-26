/**
 * LinearSearch10
 */
import java.util.Scanner;
public class LinearSearch10 {
    public static void main(String[] args) {
     Scanner input10 = new Scanner(System.in);
        int key = 0;
        int hasil = 0;
        int jmlElemen = 0;
        boolean pencarian = false;
        System.out.print("Masukkan jumlah elemen array : ");
        jmlElemen = input10.nextInt();
        int[] arrayInt = new int[jmlElemen];
        for (int i = 0; i < arrayInt.length;i++) {
            System.out.print("Masukkan elemen array ke -"+i+" : ");
            arrayInt[i] = input10.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari : ");
        key = input10.nextInt();
        for (int i = 0; i < arrayInt.length;i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                pencarian = true;
                break;
            }
        }
        if (pencarian) {
            System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
        } else {
            System.out.println("Key tidak ditemukann dalam array");
        }
       }
}