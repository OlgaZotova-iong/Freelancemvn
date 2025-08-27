package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int restCount = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                restCount++;
                money = (money - expenses) / 3; // Расходы, потом траты на отдых
            } else {
                money += (income - expenses);
            }
        }
        return restCount;
    }
}


