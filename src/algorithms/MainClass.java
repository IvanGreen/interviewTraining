package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {

        //Начало первого задания
        LinkedList<String> states = new LinkedList<String>();

        states.add("Germany");
        states.add("France");
        states.addLast("Great Britain");
        states.addFirst("Spain");
        states.add(1, "Italy");

        System.out.printf("List has %d elements \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Portugal");
        for(String state : states){

            System.out.println(state);
        }

        if(states.contains("Germany")){

            System.out.println("List contains Germany");
        }

        states.remove("Germany");
        states.removeFirst();
        states.removeLast();

        LinkedList<Human> humans = new LinkedList<>();
        humans.add(new Human("Olga"));
        humans.addFirst(new Human("Igor"));
        humans.addLast(new Human("Ivan"));
        humans.remove(1);

        for(Human h : humans){

            System.out.println(h.getName());
        }
        Human first = humans.getFirst();
        System.out.println(first.getName());

        //Конец первого задания

        //начало второго задания

        ArrayList<Human> humanArrayList = new ArrayList<>();

        System.out.println("Проверка на пустоту: ");
        if (humanArrayList.isEmpty()) {
            System.out.println("ПУСТО");
        } else {
            System.out.println("НЕ ПУСТО");
        }

        System.out.println("Добавление: ");
        for (int i = 0; i < 10 ; i++) {
            Human human = new Human("Human" + i);
            humanArrayList.add(human);
        }

        System.out.println("Выводим по очереди всех: ");

        for (Human h : humanArrayList) {
            System.out.println(h.getName());
        }

        System.out.println("humanArrayList size: " + humanArrayList.size());

        System.out.println("Определенный элемент (он же первый): " + humanArrayList.get(0).getName());

        System.out.println("Последний элемент: " + humanArrayList.get(humanArrayList.size() - 1).getName());

        System.out.println("Удаляем конкретный элемент (можно по ключу): " + humanArrayList.remove(1).getName());

        ArrayList sortList = new ArrayList();
        sortList.add("Sunday");
        sortList.add("Monday");
        sortList.add("Tuesday");
        System.out.println("До сортировки");
        for (Object s : sortList) {
            System.out.println(s);
        }

        Collections.sort(sortList);

        System.out.println("После сортировки");
        for (Object s : sortList) {
            System.out.println(s);
        }

        Collections.sort(sortList,Collections.reverseOrder());

        System.out.println("После обратной сортировки");
        for (Object s : sortList) {
            System.out.println(s);
        }

        System.out.println("Поиск элемента: ");

        System.out.println("contains: ");
        if (sortList.contains("Monday")) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }

        System.out.println("indexOf: ");
        int i = sortList.indexOf("Monday");
        if (i !=-1) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }

        System.out.println("lastIndexOf: ");
        int y = sortList.lastIndexOf("Monday");
        if (y !=-1) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }

        System.out.println("Преобразование в массив");
        String[] arr = (String[])sortList.toArray(new String[sortList.size()]);
        for(String item : arr) {
            System.out.println(item);
        }

        System.out.println("Преобразование из массива");
        String days[]={"Sunday", "Monday", "Tuesday"};
        ArrayList < String> arrList= new ArrayList < String>(Arrays.asList(days));
        for(String item : arrList) {
            System.out.println(item);
        }

        System.out.println("Преобразование в строку: ");
        String result = String.join(",", sortList);
        System.out.println(result);

        System.out.println("Очистка списка, изначально в списке: " + humanArrayList.size() + " элементов");
        humanArrayList.clear(); //или можно humanArrayList.removeAll();
        System.out.println("После очистки в списке: " + humanArrayList.size() + " элементов");

        //Конец второго задания
    }
}
