package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    //    1. Сумма всех продаж.
    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSumTestCheck() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 181;

        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    //    2. Средняя сумма продаж в месяц.
    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageTestCheck() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 16;

        int actual = service.calculateAverage(sales);

        assertEquals(expected, actual);
    }

    //    3. Номер месяца, в котором был пик продаж.
    @Test
    void shouldCalculateMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxSalesTestCheck() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    //    4. Номер месяца, в котором был минимум продаж.
    @Test
    void shouldCalculateMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinSalesTestCheck() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 10;

        int actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    //    5. Кол-во месяцев, в которых продажи были ниже среднего
    @Test
    void shouldCalculateBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.salesBelowAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateBelowAverageTestCheck() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;

        int actual = service.salesBelowAverage(sales);

        assertEquals(expected, actual);
    }

    //    6. Кол-во месяцев, в которых продажи были выше среднего.
    @Test
    void shouldCalculateAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.salesAboveAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAboveAverageTestCheck() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;

        int actual = service.salesAboveAverage(sales);

        assertEquals(expected, actual);
    }
}