import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // inisiasi scannernya buat baca input user
        try (Scanner scanner = new Scanner(System.in)) {
            // disini masukin nama usernya
            System.out.print("Masukkan nama: ");
            String name = scanner.nextLine();

            // disini bikin objek game trus panggil fungsi mulai buat mulai gamenya
            Game game = new Game(name);
            game.mulai();
        }
    }
}
