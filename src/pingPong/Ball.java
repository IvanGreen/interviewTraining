package pingPong;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Ball {
    private int kicks = 0;
    private static  Ball instance = new Ball();
    private String side = "";
    private ReentrantLock lock = new ReentrantLock();

    public Ball() {
    }

    static Ball getBall(){
        return instance;
    }

    void kick(String playerName, String msg) {
        try {
            if (lock.tryLock(10, TimeUnit.SECONDS)) {
                kicks++;
                side = playerName;
                System.out.println(kicks + " " + side + " " + msg);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

//    Решение через synchronized
//     synchronized void kick(String playerName) {
//        kicks++;
//        side = playerName;
//        System.out.println(kicks + " " + side);
//    }


    public String getSide() {
        return side;
    }

    boolean isInGame(){
        return (kicks < 15);
    }
}
