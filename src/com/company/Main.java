package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Здесь пишем код и вызываем другие методы

        int year = 1991;
        isLeapYear(year);

        int currentYear = LocalDate.now().getYear();
        int clientOS = 1;
        taskOsUpp(currentYear, clientOS);

        int deliveryDistance = 95;
        delivery(deliveryDistance);

        String str = "abcddefgghiijjkk";
        deletion(str);

        int[] massiv = {3, 2, 1, 6, 5};
        viceVersa(massiv);

        int[] arr = generateRandomArray();
        double midSum = findTheValue(arr);
        System.out.println("Искомая средняя величина - " + midSum);

    }

    public static void isLeapYear(int year) {
        boolean check = checkYear(year);
        if (check) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void taskOsUpp(int clientDeviceYear, int clientOS) {

        int yearOfUpdfte = 2015;

        if (clientOS == 1) {
            if (checkYearOs(clientDeviceYear, yearOfUpdfte)) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (checkYearOs(clientDeviceYear, yearOfUpdfte)) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

    }

    public static int delivery(int deliveryDistance) {

        int dayNeed = 0;
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            dayNeed = 3;
        } else {
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                dayNeed = 2;
            } else {
                dayNeed = 1;
            }
        }
        System.out.println("Потребуется дней: " + dayNeed);
        return dayNeed;
    }

    public static void deletion(String str) {
        char[] letters = str.toCharArray();
        //boolean check = true;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == letters[i + 1]) {
                System.out.println("Присутствует дубль. Это символ " + letters[i]);
                //check = false;
                return;
            }
        }
//        if(check)
//            System.out.println("Дублей нет");

    }

    public static void viceVersa(int[] solid) {
        int l = solid.length;
        int j = 0;
        for (int i = 0; i < l / 2; i++) {
            j = solid[l - i - 1];
            solid[l - i - 1] = solid[i];
            solid[i] = j;
        }
        System.out.println("измененый массив " + Arrays.toString(solid));

    }

    public static double findTheValue(int[] arr) {
        double middleSum = 0;
        middleSum = calcAverage(summOfArr(arr), arr.length);
        return middleSum;
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static double calcAverage(int sum, int len) {
        double middleSum = sum / len;
        return middleSum;
    }

    public static boolean checkYear(int year) {
        boolean yesOrNot = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        return yesOrNot;
    }

    public static boolean checkYearOs(int clientDeviceYear, int yearOfUpdfte) {
        boolean yesOrNot = clientDeviceYear >= yearOfUpdfte;
        return yesOrNot;
    }

    public static int summOfArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[0];
        return sum;

    }
}


