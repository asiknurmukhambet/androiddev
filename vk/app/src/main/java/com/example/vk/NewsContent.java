package com.example.vk;

import java.util.ArrayList;
import java.util.List;

public class NewsContent {

    public static ArrayList<News> getNews() {
        create();
        return news;
    }

    private static ArrayList<News> news = new ArrayList<>();


    static void create() {
        String name = "Асыланбек Нурмухамбет";
        String text = "Ранее утро… 8 марта. Будильник зазвенел и, даже не успев как следует начать свою песню, умолк под натиском моего пальца. Почти в темноте оделся, тихо прикрыв входную дверь, направился к базару. Стало чуть светать. Старотипный плащ, фасона 1965 года, на нём не было места, которое было бы не зашито. Но этот заштопанный и перештопанный плащ был чистым. Брюки, такие же старые, но до безумия наутюженные.";
        News new1 = new News(name, "16 фев в 2:18", text, 56, 12, 34, 899, R.drawable.picture);
        news.add(new1);

        text = "Сейчас я не могу сказать, что именно, но в его облике меня что-то привлекло.\n" +
                "Старотипный плащ, фасона 1965 года, на нём не было места, которое было бы не зашито. Но этот заштопанный и перештопанный плащ был чистым. Брюки, такие же старые, но до безумия наутюженные.";
        News new2 = new News(name,"29 дек 2019", text, 426, 1, 29, 560, R.drawable.picturetwo);
        news.add(new2);

        text = "Сегодня был праздник, и я уже понял, что дед не мог быть небритым в такой день. На его лице было с десяток порезов, некоторые из них были заклеены кусочками газеты.\n" +
                "Деда трусило от холода, его руки были синего цвета… Его очень трусило, но он стоял на ветру и ждал.";
        News new3 = new News(name, "17 дек 2019", text, 345, 12, 23, 789, R.drawable.picturethree);
        news.add(new3);

        text = "Она несла в руках отвратительные, тревожные желтые цветы.\n" +
                "Черт их знает, как их зовут, но они первые почему-то появляются в Москве.\n" +
                "И эти цветы очень отчетливо выделялись на черном ее весеннем пальто.\n" +
                "Она несла желтые цветы! Нехороший цвет.\n" +
                "Она повернула с Тверской в переулок и тут обернулась. Ну, Тверскую вы знаете? По Тверской шли тысячи людей, но я вам ручаюсь, что увидела она меня одного и поглядела не то что тревожно, а даже как будто болезненно.\n" +
                "И меня поразила не столько ее красота, сколько необыкновенное, никем не виданное одиночество в глазах!";
        News new4 = new News(name, "3 июл 2019", text, 345, 12, 23, 786, R.drawable.picturefour);
        news.add(new4);

        text = "Я буквально силой впихнул деду в руки цветы, торт и вино, развернулся, и, вытирая глаза, сделал шаг к выходу.\n" +
                "- Мы… мы… 45 лет вместе… Она заболела… Я не мог её оставить сегодня без подарка, - тихо сказал дед, спасибо тебе...";
        News new5 = new News(name, "6 мая 2019", text, 567, 12, 34, 787, R.drawable.picturefive);
        news.add(new5);

        text = "У деда хлынули слёзы… Они текли по его щекам и падали на плащ, у него задрожали губы.\n" +
                "Больше я на это смотреть не мог, у меня у самого слёзы стояли в глазах.";
        News new6 = new News(name, "24 фев 2019", text, 78, 123, 546, 97, R.drawable.picture6);
        news.add(new6);

        text = "Какой-то нехороший комок подкатил к моему горлу.\n" +
                "Я начал замерзать, а продавщицы всё не было.\n" +
                "Я продолжал рассматривать деда. По многим мелочам я догадался, что дед не алкаш, он просто старый измученный бедностью и старостью человек.";
        News new7 = new News(name, "6 фев 2019", text, 76, 12, 3, 988, R.drawable.picture7);
        news.add(new7);


        text = "Дед подошёл к продавщице, я остался чуть позади него.\n" +
                "- Хозяюшка… милая, а сколько стоит одна веточка мимозы? - дрожащими от холода губами спросил дед.";
        News new8 = new News(name, "29 дек 2018", text, 56, 12, 2, 656, R.drawable.pictureeight);
        news.add(new8);

        text = "Я продолжал рассматривать деда. По многим мелочам я догадался, что дед не алкаш, он просто старый измученный бедностью и старостью человек.";
        News new9 = new News(name, "9 дек 2018", text, 456, 12, 23, 454, R.drawable.picture9);
        news.add(new9);
    }
}
