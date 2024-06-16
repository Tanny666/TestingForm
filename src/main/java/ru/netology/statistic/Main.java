package ru.netology.statistic;

public class Main {
    public static void main(String[] args) {

        Post post = new Post(
                "Иван",
                "Иванов",
                "Иванович",
                "4444 № 44444444",
                "+7 (999)-999-99-99",
                true);

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 06;
        post.birthday.year = 1999;

        System.out.println("Name: " + post.name);
        System.out.println("Surname: " + post.surname);
        System.out.println("Patronymic: " + post.patronymic);
        System.out.println("Passport: " + post.passport);
        System.out.println("Phone: " + post.phone);
        System.out.println("Subscription: " + post.subscription);
        System.out.println("Birthday: " + post.birthday.day + "." + post.birthday.month + "." + post.birthday.year);
    }
}