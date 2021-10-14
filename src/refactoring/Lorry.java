package refactoring;

public class Lorry extends Car implements Moveable, Stopable{
    //грузовик
    public Lorry(Engine engineType, String color, String name) {
        super(engineType, color, name);
    }

    @Override
    public void move() {
        System.out.println("The lorry drove off");
    }

    @Override
    public void stop() {
        System.out.println("The lorry stopped");
    }
}
