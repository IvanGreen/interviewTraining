package refactoring;

public abstract class Car {
    //второе задание
    private Engine engineType;
    private String color;
    private String name;

    public Car(Engine engineType, String color, String name) {
        this.engineType = engineType;
        this.color = color;
        this.name = name;
    }

    public Engine getEngineType() {
        return engineType;
    }

    public void setEngineType(Engine engineType) {
        this.engineType = engineType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car: " + getName() + " color: " + getColor() + " Engine: " + getEngineType();
    }
}