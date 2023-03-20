package lesson_2.hw_2;

public class main {
    public static void main(String[] args) {
        //Задача 1. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе?
        //Вывести на косоль
        byte Summa = 5;
        byte Kassa = 2;
        float SummaVKasse;

        SummaVKasse = Summa/Kassa;
        System.out.println(SummaVKasse + " - Сумма в каждой кассе");
    }
}
