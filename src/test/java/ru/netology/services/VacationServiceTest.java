package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {

    @Test
    public void testCalculateRestMonthsExample1() {
        VacationService service = new VacationService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expectedRestMonths = 3;
        int actualRestMonths = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expectedRestMonths, actualRestMonths);
    }

    @Test
    public void testCalculateRestMonthsExample2() {
        VacationService service = new VacationService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expectedRestMonths = 2;
        int actualRestMonths = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expectedRestMonths, actualRestMonths);
    }
}

