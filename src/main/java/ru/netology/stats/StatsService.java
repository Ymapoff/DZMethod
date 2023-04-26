package ru.netology.stats;

public class StatsService {

    public int allSale(int[] sales) {
        int sum = 0; // сумма всех продаж
        for (int i : sales) {
            sum = sum + i;
        }

        return sum;
    }


    public int averageSum(int[] sales) {
        int average = allSale(sales); // средняя сумма продаж

        return average / sales.length;
    }

    public int maxMonthSales(long[] sales) {
        int maxMonth = 0; // макс продаж

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minMonthSales(long[] sales) {
        int minMonth = 0; // мин продаж

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int monthBelowAverage(int[] sales) {
        int belowAverage = averageSum(sales); // ниже среднего
        int month = 0;
        for (int i : sales) {
            if (i < belowAverage) {
                month = month + 1;
            }
        }

        return month;
    }


    public int monthAboveAverage(int[] sales) {
        int aboveAverage = averageSum(sales); // выше среднего
        int month = 0;
        for (int i : sales) {
            if (i > aboveAverage) {
                month = month + 1;
            }
        }

        return month;
    }


}
