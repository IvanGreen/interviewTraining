package pingPong;

public class PingPongThread extends Thread{
    private String msg;

    public PingPongThread(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        Ball ball = Ball.getBall();
        while(ball.isInGame()){
            kickBall(ball);
        }
    }

    private void kickBall(Ball ball) {
        if(!ball.getSide().equals(getName())){
            ball.kick(getName(),msg);
        }
    }
}
