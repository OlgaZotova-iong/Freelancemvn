package ru.netology;

import ru.netology.services.VacationService;

public class Main {
    public static void main(String[] args) {
        VacationService service = new VacationService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int restMonths = service.calculate(income, expenses, threshold);
        System.out.println("Количество месяцев отдыха: " + restMonths);
    }
}

