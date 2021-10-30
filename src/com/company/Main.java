package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Здесь пишем код и вызываем другие методы

        int year=1991;
        task1(year);

        int currentYear = LocalDate.now().getYear();
        int clientOS =1;
        task2(currentYear,clientOS);

        int deliveryDistance = 95;
        task3(deliveryDistance);

        String str= "aabccddefgghiijjkk";
        task4(str);

        int[] massiv = {3, 2, 1, 6, 5};
        task5(massiv);

        int[] arr = generateRandomArray();
        double midSum=task6(arr);
        System.out.println("Искомая средняя величина - " + midSum);

    }

    public static void task1(int year) {
        boolean check = year%4==0&&year%100!=0||year%400==0;
        if (check){
            System.out.println(year +" — високосный год");
        }
        else {
            System.out.println(year +" - не високосный год");
        }
    }

    public static void task2(int clientDeviceYear,int clientOS) {

        int yearOfUpdfte=2015;

        if(clientOS==1){
            if(clientDeviceYear>=yearOfUpdfte){
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            else{
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        else{
            if(clientDeviceYear>=yearOfUpdfte){
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            else{
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

    }

    public static void task3(int deliveryDistance){

        int dayNeed = 0;
        if(deliveryDistance>60&&deliveryDistance<=100){
            dayNeed=3;
        }
        else{
            if(deliveryDistance > 20 && deliveryDistance <= 60) {
                dayNeed = 2;
            }
            else{
                dayNeed = 1;
            }
        }
        System.out.println("Потребуется дней: " + dayNeed);
    }

    public static void task4(String str){
        char[] letters= str.toCharArray();
        boolean check = true;
        for (int i = 0; i < letters.length; i++) {
            if(letters[i]==letters[i+1]){
                System.out.println("Присутствует дубль. Это символ "+letters[i]);
                check = false;
                break;
            }
        }
        if(check)
            System.out.println("Дублей нет");

    }

    public static void task5(int[] massiv){
        int l=massiv.length;
        int j=0;
        for (int i = 0; i < l/2; i++) {
            j=massiv[l-i-1];
            massiv[l-i-1]=massiv[i];
            massiv[i]=j;
        }
        System.out.println("измененый массив " + Arrays.toString(massiv));

    }

    public static double task6(int[] arr){
        int sum=0;
        double middleSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[0];

        }
        middleSum=sum/arr.length;
        return sum;

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
