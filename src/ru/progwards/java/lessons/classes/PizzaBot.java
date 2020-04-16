package ru.progwards.java.lessons.classes;

import org.telegram.telegrambots.ApiContextInitializer;
import ru.progwards.java1.testlesson.ProgwardsTelegramBot;

public class PizzaBot extends ProgwardsTelegramBot {

    @Override
    public String processMessage(String text) {
        checkTags(text);
        return "Под твой запрос подходит: \n" + extract();
    }

    public static void main(String[] args) {
        ApiContextInitializer.init();


        PizzaBot bot = new PizzaBot();
        bot.username = "dashakrasnoperova_bot";
        bot.token = "1206095966:AAEAkE5PgwCjNlousUng5zH-hC0C9ar6mck";




        bot.addTags("Пицца гавайская", "гавайск, пицц, ананас, куриц");
        bot.addTags("Пицца маргарита", "маргарит, пицц, моцарелла, сыр, кетчуп, помидор");
        bot.addTags("Пицца пеперони", "пеперони, пицц, салями, колбас, сыр, кетчуп, помидор");



        bot.start();
    }
}
