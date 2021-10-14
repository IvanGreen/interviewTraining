package pingPong;

public class MainClass {
    public static void main(String[] args) {
        PingPongGame game = new PingPongGame();
        try {
            game.startGame();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
