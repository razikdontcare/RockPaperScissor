import java.util.Random;

public class Player {
    private String name;
    private boolean isBot;
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

    public Gerakan gerakanBot() {
        int pick = random.nextInt(3) + 1;
        return Gerakan.fromString(pick);
    }
}
