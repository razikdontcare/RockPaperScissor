import java.util.Random;

public class Player {
    private String name;
    private boolean isBot;
    // buat ngerandom pilihan botnya
    private static final Random random = new Random();

    public Player(String name, boolean isBot) {
        this.name = name;
        this.isBot = isBot;
    }

    public String getName() {
        return name;
    }

    public boolean isBot() {
        return isBot;
    }

    // fungsi yang buatin pilihan untuk botnya
    public Gerakan gerakanBot() {
        // random angka 1-3
        int pick = random.nextInt(3) + 1;
        return Gerakan.fromString(pick);
    }
}
