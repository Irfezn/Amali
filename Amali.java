import java.util.Scanner;
public class Amali {
    public static void main(String arg[]){
        Scanner input = new Scanner (System.in);

        String namapekerja;
        int bilhari;
        int gaji;

        System.out.print("Masukkan nama : ");
        namapekerja = input.nextLine();
        System.out.print("Masukkan bilangan hari bekerja : ");
        bilhari = input.nextInt();

        gaji = 160 *bilhari;

        if ( bilhari <= 30 ){
            gaji = 160 *bilhari;
        }else{
            System.out.println("Bilangan hari tidak boleh melebihi 31 hari");
            System.out.print("Masukkan semula bilangan hari bekerja : ");
            bilhari = input.nextInt();
            gaji = 160 *bilhari;
        }

        System.out.println("Rumusan gaji bulanann bagi "+namapekerja );
        System.out.println("Jumlah hari bekerja "+bilhari );
        System.out.println("GAJI BULANAN ADALAH RM "+gaji );
    }
}
