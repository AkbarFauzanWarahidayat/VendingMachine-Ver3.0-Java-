import java.util.Scanner;

public class mainmenu {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pilihmainmenu;

        //object
        minuman minuman = new minuman();
        makanan makanan = new makanan();

        int i;
        System.out.println("SElAMAT DATANG DI PROGRAM INI ");
        System.out.println();
        System.out.println("Silahkan Pilih Ingin Minuman[1] atau Makanan[2]");
        System.out.print("input : ");
        pilihmainmenu = keyboard.nextInt();

        if(pilihmainmenu == 1){
            minuman.menuminuman();
        }
        else if(pilihmainmenu == 2){
            makanan.menumakanan();
        }


    }
}
