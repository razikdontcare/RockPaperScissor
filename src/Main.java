import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nama: ");
            String name = scanner.nextLine();

            Game game = new Game(name);
            game.mulai();
        }
    }
}
