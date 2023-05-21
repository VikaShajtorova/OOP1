package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();//создаем список обьектов типа стринг, второй раз стринг можем не писать <String>
        arrayList1.add("Roma");// если не писать<String> то в этот список можно добавлять и числа и классы, лучше так не делать
        arrayList1.add("Ivan");
        arrayList1.add("Masha");
        arrayList1.add("Lena");
        arrayList1. add(4, "Sam");// добавляем по индексу
        arrayList1.add(0, "Roma1");

        System.out.println("Число элементов: "+ arrayList1.size());
        System.out.println(arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<>(200);// создаем список обьектов типа стринг на 200 мест
        arrayList2.add("Roma");
        arrayList2.add("Ivan");
        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);//создаем еще один список обьектов типа стринг и помещаеи в него arrayList1
        System.out.println(arrayList4);// распечатываем
        System.out.println(arrayList1 == arrayList4);// проверяем что эти переменные хоть и одинаковые но ссылаются на разные обьекты, выдаст false

        List<User>arrayList = new ArrayList<>();
        arrayList.add(new User(11,"A"));
        arrayList.add(new User(12,"B"));
        arrayList.add(new User(13,"C"));
        arrayList.add(new User(14,"D"));

        System.out.println(arrayList);
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.remove(0));
        System.out.println(arrayList);


        Iterator <String> iterator = arrayList1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toUpperCase());
        }







    }
}
