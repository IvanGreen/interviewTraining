import refactoring.Engine;
import refactoring.LightWeightCar;
import refactoring.Lorry;
import refactoring.Moveable;

import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        //Первое задание
        Person myPerson = new Person.Builder()
                .withFirstName("Ivan")
                .withMiddleName("Ivanovich")
                .withLastName("Ivanov")
                .withAge(22)
                .withAddress("Moscow")
                .withPhone("+7(999)999-99-99")
                .withGender("M")
                .build();

        System.out.println(myPerson.toString());

        //Второе и третье задание (правда не на примере фигур, но смысл тот же)

        Moveable electricCar = new LightWeightCar(Engine.ELECTRIC,"White","Tesla Model X");
        Moveable car = new LightWeightCar(Engine.PETROL,"Blue","Honda Civic");
        Moveable lorry = new Lorry(Engine.DIESEL,"Black","Man");

        List<Moveable> cars = Arrays.asList(electricCar,car,lorry);

        for (Moveable m : cars) {
            System.out.println(m);
            m.move();
        }

    }
}