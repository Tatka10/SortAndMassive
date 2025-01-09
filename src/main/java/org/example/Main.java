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
        System.out.println(Arrays.toString(sortByMinElement(mass)));
        // System.out.println(Arrays.toString(sortByBubble(mass)));
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

    public static String[] sortByBubble(String[] mass) {
        for (int b = 0; b < mass.length - 1; b++) {
            for (int a = 0; a < mass.length - 1 - b; a++) {
                if (mass[a].compareTo(mass[a + 1]) > 0) {
                    swap(mass, a, a + 1);
                }

            }
        }
        return mass;
    }

    //пузырьковая сортировка с проверкой необходимости итерации
    public static String[] sortByBubbleWithFlag(String[] mass) {
        boolean flag = false;// требуется проход
        while (flag == false) {
            flag = true;
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i].compareTo(mass[i + 1]) > 0) {
                    swap(mass, i, i + 1);
                    flag = false;
                }

            }
        }


        return mass;
    }

    //сортировка с выбором минимума/максимума
    public static String[] sortByMinElement(String[] mass) {
        for (int i = 0; i < mass.length; i++) {
            int x = i;
            String min = mass[i];
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[j].compareTo(min) < 0) {
                    x = j;
                    min = mass[j];
                }
            }

            mass[x] = mass[i];
            mass[i] = min;


        }
        return mass;
    }

    //челночная сортировка
    public static String[] sortByShuttleSort(String[] mass) {
        for (int i = 1; i < mass.length; i++) {
            if (mass[i].compareTo(mass[i - 1]) < 0) {
                swap(mass, i, i - 1);
                for (int z = i - 1; z - 1 >= 0; z--) {
                    if (mass[z].compareTo(mass[z - 1]) < 0) {
                        swap(mass, z, z - 1);
                    } else break;

                }

            }
        }
        return mass;
    }
    //сортировка слиянием

}