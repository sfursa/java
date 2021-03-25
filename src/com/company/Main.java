package com.company;

public class Main {

    public static void main(String[] args) {

        int yearOfBirthDay = 1990;
        int monthOfBirthDay = 9;
        int dayOfBirthDay = 1;
        int sum = (yearOfBirthDay + monthOfBirthDay + dayOfBirthDay);

        System.out.println("Сумма моего года, месяца и дня рождения: " + sum);

        boolean monthBiggerDay = (monthOfBirthDay > dayOfBirthDay);

        System.out.println("Месяц моего рождения больше даты рождения: " + monthBiggerDay);

        System.out.print("Массив с моим именем: ");
        char[] name = new char[6];
        name[0] = 'С';
        name[1] = 'е';
        name[2] = 'р';
        name[3] = 'г';
        name[4] = 'е';
        name[5] = 'й';
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]);
        }
        System.out.println();

        double myAge = 30.0;
        double partYear = 6.0 / 12.0;
        double summ = (myAge + partYear);

        System.out.println("Мне " + summ + " лет");

    }
}