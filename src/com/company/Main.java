package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        int n = 0, num = 0;
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите задание");
        System.out.println("1. Задание №1\n2. Задание №2\n3. Задание №3");
        while (num != 7) {

            num = in.nextInt();
            switch (num) {
                case 1:
                    n=0;
                    System.out.println("Введите строку");  in.nextLine();
                    str = in.nextLine();
                    String1 str1=new String1(str);
                    while (n != 6) {
                        System.out.println("Выберите операцию\n1. Перевод в нижний регистр");
                        System.out.println("2. Сформировать массив из слов\n3. Сформировать и вывести массив вхождений каждого слова");
                        System.out.println("4. Определить, сколько слов начинаются с заданного префикса\n5. Вывести строку\n6. Выбрать другую операцию");
                        n=in.nextInt();
                        switch (n){
                            case 1:
                                str1.toLCase();
                                break;
                            case 2:
                                String []strArray=str1.SplitReg();
                                System.out.println(Arrays.toString(strArray));
                                break;
                            case 3:
                                str1.WordCounter();
                                break;
                            case 4:
                                in.nextLine(); String prefix=in.nextLine();
                                System.out.println("Кол-во найденных слов с этим префиксом = "+str1.PrefCounter(prefix));
                                break;
                            case 5:
                                System.out.println(str1.out());
                                break;
                            default:
                                //System.out.println("Неверно");
                        }
                    }
                    break;
                case 2:
                    n=0;
                    System.out.println("Введите строку"); in.nextLine();
                    str = in.nextLine();
                    String2 str2=new String2(str);
                    while (n!=5) {

                        System.out.println("Выберите операцию\n1. Найти двухзначные числа и заменить их на +");
                        System.out.println("2. Добавить в самое короткое предложение \"КОНЕЦ\"\n3. Перевернуть трехзначные числа");
                        System.out.println("4. Вывести строку\n5. Выбрать другую операцию");
                        n=in.nextInt();
                        switch (n){
                            case 1:
                                str2.InsertPlus();
                                break;
                            case 2:
                                str2.AppendEnd();
                                break;
                            case 3:
                                str2.ReversNumber();
                                break;
                            case 4:
                                System.out.println(str2.out());
                                break;
                            default:
                               // System.out.println("Неверно");
                        }
                    }

                    break;
                case 3:
                    n=0;
                    System.out.println("Введите строку"); in.nextLine();
                    str = in.nextLine();
                    String3 str3=new String3();
                    while (n!=4) {
                        System.out.println("Выберите операцию\n1. Определить, является ли дата корректной");
                        System.out.println("2. Перевести амереканский формат в православный\n3. Вывести строку");
                        System.out.println("4. Выбрать другую операцию");
                        n=in.nextInt();
                        switch (n){
                            case 1:
                                System.out.println(str3.Check(str));
                                break;
                            case 2:
                              str=str3.ReplaceAmer(str);
                                break;
                            case 3:
                                System.out.println(str);;
                                break;
                        }
                    }
                    break;


        }
    }
}}

        //"аждая ячейка массива H является указателем на связный список (цепочку) пар ключ-значение";
       // "p";;
        //("10текст10. Эт322о вопрос900? 132321Восклиц!310");
        //("11-21-2001,09-31-1999 12.12.1888");


