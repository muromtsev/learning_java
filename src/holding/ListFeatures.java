package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static net.mindview.util.Print.print;

public class ListFeatures {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        print("1. Начальный размер listInt " + listInt.size());
        for (int i = 1; i <= 10; i++) {
            listInt.add(i);
        }
        print("2. Размер listInt после добавления " + listInt.size());
        print("3. listInt: " + listInt);
        print("4. Получение первого элемента: " + listInt.get(0));
        print("5. Есть ли 10 в списке: " + listInt.contains(10));
        int one = listInt.get(0);
        print("6. Элемент " + one + " находится под индексом " + listInt.indexOf(one));
        listInt.add(4, -100);
        print("7. Добавили элемент на 4 позицию: " + listInt);
        List<Integer> subList = listInt.subList(1, 5);
        print("8. Частичный список " + subList);
        print("9. " + listInt.containsAll(subList));
        Collections.sort(subList); // Сортировка на месте
        print("После сортировки: " + subList);
        Collections.shuffle(subList);
        print("После перемешивания " + subList);
        List<Integer> copy = new ArrayList<Integer>(listInt);
        subList = Arrays.asList(listInt.get(1), listInt.get(4));
        print("subList: " + subList);
        copy.retainAll(subList);
        print("10. copy " + copy);
    }




}
