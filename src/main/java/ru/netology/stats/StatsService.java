package ru.netology.stats;

public class StatsService {

    //    1. Сумма всех продаж.
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //    2. Средняя сумма продаж в месяц.
    public int calculateAverage(int[] sales) {
        return calculateSum(sales) / sales.length;

    }

    //    3. Номер месяца, в котором был пик продаж.
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //    4. Номер месяца, в котором был минимум продаж.
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //    5. Кол-во месяцев, в которых продажи были ниже среднего
    public int salesBelowAverage(int[] sales) {
        int monthCount = 0;
        int belowSale = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale < belowSale) {
                monthCount++;
            }
        }
        return monthCount;
    }

    //    6. Кол-во месяцев, в которых продажи были выше среднего.
    public int salesAboveAverage(int[] sales) {
        int monthCount = 0;
        int aboveSale = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale > aboveSale) {
                monthCount++;
            }
        }
        return monthCount;
    }
}
