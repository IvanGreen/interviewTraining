package refactoring;

public class LightWeightCar extends Car implements Moveable, Stopable, Openable{
    //легковушка
    public LightWeightCar(Engine engineType, String color, String name) {
        super(engineType, color, name);
    }

    @Override
    public void move() {
        System.out.println("The car drove off");
    }

    @Override
    public void stop() {
        System.out.println("The car stopped");
    }

    @Override
    public void open() {
        System.out.println("The car opened");
    }
}
