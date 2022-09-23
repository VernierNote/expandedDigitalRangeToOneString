import java.util.Scanner;

public class Main {

    public static void main(String[] args) {//точка входа
        String expanded = "";//Создание переменной expanded типа стринг
        Scanner input = new Scanner(System.in);//Создаем переменную input типа Scanner передаем параметр в конструктор System.in(это поток)
        System.out.println("Type your array length: ");//Выводим сообщение

        String str = input.next();//Вводим в переменную str данные с консоли
        System.out.println(str);//Вывод содержимого переменной str

        String[] result = new String[10];//Массив куда мы кладем эллементы в результате разделениия исходной строки
        result = str.split(",");//В переменной result делим наши эллементы

        String[] toAdd = new String[10];//Результирующий массив finalResult

        for (String s : result) {//Создаем чикл фор ич и бежим по элементам массива result
            if (s.contains("-")) {//Проверка на условие есть ли у нашего элемента тире
                toAdd = s.split("-");//Если содержиться то присваиваем в наш результирующий массив результат выполнения функции split
                for (int j = Integer.parseInt(toAdd[0]); j <= Integer.parseInt(toAdd[1]); j++) {//Создаем цикл по j от нулевого элемента массива finalResult до 1 элемента массива finalResult
                    expanded = expanded + j + ",";//В нашу строку результирующую добавляем значение индекса элемента тем самым изменяя её(каждый раз).То есть при каждом проходе в том случае если наша подстрока содержит тире мы прибаляем к строке expanded j-той иттерации
                }
            } else expanded = expanded + s + ",";//

        }
        System.out.println(expanded.substring(0, expanded.length() - 1));
        }
    }

