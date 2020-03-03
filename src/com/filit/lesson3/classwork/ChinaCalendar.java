package com.filit.lesson3.classwork;

import java.util.Scanner;

public class ChinaCalendar {
    public static void main(String... args) {
        var scanner = new Scanner(System.in);

        System.out.println("Введите год");
        var year = scanner.nextInt();

        switch (year % 10) {
            case 0:
            case 1: {
                System.out.println("Металл");
                break;
            }
            case 2:
            case 3: {
                System.out.println("Вода");
                break;
            }
            case 4:
            case 5: {
                System.out.println("Дерево");
                break;
            }
            case 6:
            case 7: {
                System.out.println("Огонь");
                break;
            }
            case 8:
            case 9: {
                System.out.println("Земля");
                break;
            }
        }

        switch ((year + 8) % 12) {
            case 0: {
                System.out.println("Крыса");
                break;
            }
            case 1: {
                System.out.println("Бык");
                break;
            }
            case 2: {
                System.out.println("Тигр");
                break;
            }
            case 3: {
                System.out.println("Кролик");
                break;
            }
            case 4: {
                System.out.println("Дракон");
                break;
            }
            case 5: {
                System.out.println("Змея");
                break;
            }
            case 6: {
                System.out.println("Лошадь");
                break;
            }
            case 7: {
                System.out.println("Овца");
                break;
            }
            case 8: {
                System.out.println("Обезьяна");
                break;
            }
            case 9: {
                System.out.println("Петух");
                break;
            }
            case 10: {
                System.out.println("Собака");
                break;
            }
            case 11: {
                System.out.println("Кабан");
                break;
            }
        }

    }
}

