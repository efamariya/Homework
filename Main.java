package Homework1;

public class Main {

    public static void main(String[] args) {

        float coat = 70; // цена пальто
        byte coatDiscount = 77; // скидка в процентах на пальто
        float hat = 25; // цена шляпы
        byte hatDiscount = 37; // скидка в процентах на шляпу
        float businessSuit = 53; // цена делового костюма
        byte businessSuitDiscount = 44; // скидка в процентах на деловой костюм
        float shirt = 19; // цена сорочки
        float shoes = 41; // цена туфлей
        byte shoesDiscount = 32; // скидка в процентах на туфли

        float account = 312; // счёт пользователя в серебряных монетах

        System.out.println("Сейчас узнаем, хватит ли имеющихся средств для покупки делового гардероба");

        // метод подсчёта стоимости делового костюма
        // создание и инициализация переменной подсчёта стоимости
        float count = (coat * (100 - coatDiscount) + hat * (100 - hatDiscount)
                + businessSuit * (100 - businessSuitDiscount) + shirt
                + shoes * (100 - shoesDiscount)) / 100;

        if (count < account)
            System.out.println("Денег хватает :)");
        else System.out.println("Денег не хватило");
    }


}
