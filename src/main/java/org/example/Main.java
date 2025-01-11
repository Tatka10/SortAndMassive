package org.example;

import java.util.Arrays;

//демонстрация сортировок на примере массива имен

//Задание: 0. Выделить пузырьковую сортировку в отдельный метод
//1. покрыть тестами - Assertarraysequals
//2. реализовать и объяснить как и для какого случая использовать обменную сортировку с флагом
// (пузырьковую сортировку с проверкой необходимости дальнейших итераци neediteration)
//3.реализация с выбором максимума или минимума!  string
// 4. челночная сортировка
//2,3,4 тесты такие же как для 0
//доп бонус -сортировка слиянием
public class Main {
    public static void main(String[] args) {

        String[] mass = {"Petya", "Vasya", "Anya", "Masha", "Igor"};

        System.out.println(Arrays.toString(mass));
        String[] mass2 = sortByMinElement(mass);
//        System.out.println(Arrays.toString(mass));
//        System.out.println(Arrays.toString(mass2));
        // System.out.println(Arrays.toString(mass2));
        System.out.println(Arrays.toString(sortByBubble(mass)));
        //System.out.println(Arrays.toString(sortByBubbleWithFlag(mass)));
//        for (int b = 0; b < mass.length - 1; b++) {
//            for (int a = 0; a < mass.length - 1 - b; a++) {
//                if (mass[a].compareTo(mass[a + 1]) > 0) {
//                    swap(mass, a, a + 1);
        //System.out.println(Arrays.toString(sortByShuttleSort(mass)));
//                }
//
//
//            }
//        }
//        System.out.println(Arrays.toString(mass));

    }

    public static void swap(String[] mass, int x, int y) {
        String a = mass[x];
        mass[x] = mass[y];
        mass[y] = a;
    }
//final  не работает, так как ссылка на массив не меняется, меняются только элементы в массиве

    public static String[] sortByBubble(final String[] mass) {
        String[] copy = Arrays.copyOf(mass, mass.length);
        for (int b = 0; b < copy.length - 1; b++) {
            for (int a = 0; a < copy.length - 1 - b; a++) {
                if (copy[a].compareTo(copy[a + 1]) > 0) {
                    swap(copy, a, a + 1);
                }
            }
        }
        return copy;
    }

    //пузырьковая сортировка с проверкой необходимости итерации-!!!переделать
    public static String[] sortByBubbleWithFlag(String[] mass) {
        String[] copy = Arrays.copyOf(mass, mass.length);
        boolean flag = false;// требуется проход
        for (int i = 0; i < copy.length - 1; i++) {
            if (flag == false) {
                flag = true;
                for (int y = 0; y < copy.length - 1 - i; y++) {
                    if (copy[y].compareTo(copy[y + 1]) > 0) {
                        swap(copy, y, y + 1);
                        flag = false;
                    }
                }
            }
        }


        return copy;
    }

    //сортировка с выбором минимума/максимума
    public static String[] sortByMinElement(final String[] mass) {
        String[] copy = Arrays.copyOf(mass, mass.length);

        for (int i = 0; i < copy.length; i++) {
            int numberMin = i;
            String min = copy[i];
            for (int j = i + 1; j < copy.length; j++) {
                if (copy[j].compareTo(min) < 0) {
                    numberMin = j;
                    min = copy[j];
                }
            }
            swap(copy, i, numberMin);
//            copy[numberMin] = copy[i];
//            copy[i] = min;


        }
        return copy;
    }

    //челночная сортировка
    public static String[] sortByShuttleSort(String[] mass) {
        String[] copy = Arrays.copyOf(mass, mass.length);
        for (int i = 1; i < copy.length; i++) {
            if (copy[i].compareTo(copy[i - 1]) < 0) {
                swap(copy, i, i - 1);
                for (int z = i - 1; z - 1 >= 0; z--) {
                    if (copy[z].compareTo(copy[z - 1]) < 0) {
                        swap(copy, z, z - 1);
                    } else break;
                }
            }
        }
        return copy;
    }
    //сортировка слиянием
    //Колода карт- отработать сортировка  12 карт по номиналу
    //реализовать процедуру слияния!
    // задача

}