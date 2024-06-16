package ru.netology.statistic;

public class Post {
    public String name;
    public String surname;
    public String patronymic;
    public String passport;
    public String phone;
    public boolean subscription;
    public FormDate birthday;

    public Post(String newName, String newSurname, String newPatronymic, String newPassport, String newPhone, boolean newSubscription) {
        name = newName;
        surname = newSurname;
        patronymic = newPatronymic;
        passport = newPassport;
        phone = newPhone;
        subscription = newSubscription;
    }
}
