import java.util.Scanner;

public class Game {
    private Player player;
    private Player bot;
    private Scanner scanner;

    // ini fungsi yang namanya sama kayak nama classnya, sebutannya constructor, dia
    // bakal dipanggil pertama kali pas bikin objek
    public Game(String name1) {
        player = new Player(name1, false);
        bot = new Player("Bot", true);
        scanner = new Scanner(System.in);
    }

    // ini fungsi buat mulai gamenya
    public void mulai() {
        System.out.println("Permainan Batu Kertas Gunting");
        System.out.println("1. Batu");
        System.out.println("2. Gunting");
        System.out.println("3. Kertas");
        System.out.println("4. Keluar\n");

        while (true) {
            // sama kayak do Main, print() biar inputannya ga kebawah
            System.out.print(player.getName() + " memilih gerakan (1, 2, 3): ");
            String input1 = scanner.nextLine();

            if (input1.equals("4")) {
                // kalo user input 4, berarti dia mau keluar, jadi break loopnya
                break;
            }

            Gerakan gerakanPemain = Gerakan.fromString(Integer.parseInt(input1));
            if (gerakanPemain == null) {
                System.out.println("Gerakan tidak valid");
                // kalo inputnya ga valid, lanjut ke iterasi berikutnya, jadi gak keluar loop
                continue;
            }

            // manggil fungsi gerakanBot buat nentuin pilihan botnya secara random
            Gerakan gerakanBot = bot.gerakanBot();

            System.out.println("\n" + player.getName() + " memilih " + gerakanPemain);
            System.out.println(bot.getName() + " memilih " + gerakanBot);

            tentukanPemenang(gerakanPemain, gerakanBot);

        }
        System.out.println("Terima kasih sudah bermain");
    }

    // yang ini gaperlu dijelasin, dia buat nentuin pemenangnya
    private void tentukanPemenang(Gerakan gerakanPemain, Gerakan gerakanBot) {
        if (gerakanPemain == gerakanBot) {
            System.out.println("\nHasil: Seri\n");
        } else if (gerakanPemain.menang(gerakanBot)) {
            System.out.println("\nHasil: " + player.getName() + " menang\n");
        } else {
            System.out.println("\nHasil: " + bot.getName() + " menang\n");
        }
    }
}
