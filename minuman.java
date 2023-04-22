import java.util.Scanner;

public class minuman extends makanan{

    public void menuminuman(){
        Scanner keyboard = new Scanner(System.in);
        int pilihminuman;
        System.out.println("Selamat Datang Di Vending Machine!");
        System.out.println("Silahkan Pilih Minuman..");
        System.out.println("[1] Teh Pucuk Rp3.000");
        System.out.println("[2] CocaCola Rp5.000");
        System.out.println("[3] Yakult Rp2.000");
        System.out.println("[4] Sprite Rp5.000");
        System.out.println("[5] Aqua Rp3.000");

        System.out.println();

        System.out.println("Silahkan Pilih Selera Anda : ");
        pilihminuman = keyboard.nextInt();

        if(pilihminuman == 1){
            int uang,totalminum;
            System.out.println("Terima Kasih Telah Memilih");
            System.out.println();
            System.out.print("Masukan uang : ");
            uang = keyboard.nextInt();

            totalminum = 3000 - uang;

            System.out.println("Kembalian anda sebesar Rp"+totalminum);
            System.out.println("Terima Kasih");
        }
        else if(pilihminuman == 2){
            int uang,totalminum;
            System.out.println("Terima Kasih Telah Memilih");
            System.out.println();
            System.out.print("Masukan uang : ");
            uang = keyboard.nextInt();
            totalminum = 5000 - uang;

            System.out.println("Kembalian anda sebesar Rp"+totalminum);
            System.out.println("Terima Kasih");
        }
        else if(pilihminuman == 3){
            int uang,totalminum;
            System.out.println("Terima Kasih Telah Memilih");
            System.out.println();
            System.out.print("Masukan uang : ");
            uang = keyboard.nextInt();
            totalminum = 2000 - uang;

            System.out.println("Kembalian anda sebesar Rp"+totalminum);
            System.out.println("Terima Kasih");
        }
        else if(pilihminuman == 4){
            int uang,totalminum;
            System.out.println("Terima Kasih Telah Memilih");
            System.out.println();
            System.out.print("Masukan uang");
            uang = keyboard.nextInt();
            totalminum = 5000 - uang;

            System.out.println("Kembalian anda sebesar Rp"+totalminum);
            System.out.println("Terima Kasih");
        }
        else if(pilihminuman == 5){
            int uang,totalminum;
            System.out.println("Terima Kasih Telah Memilih");
            System.out.println();
            System.out.print("Masukan uang");
            uang = keyboard.nextInt();
            totalminum = 3000 - uang;

            System.out.println("Kembalian anda sebesar Rp"+totalminum);
            System.out.println("Terima Kasih");
        }

    }
    
}
