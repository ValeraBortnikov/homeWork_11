//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задача № 1
        int valYear = 2000;
        System.out.println(getLeapYear(valYear));

        // Задача № 2
        valYear += 21;
        byte clientOS = 0;
        System.out.println(getLinkClientOS(valYear, clientOS));

        // Задача № 3
        int deliveryDistance = 95;
        System.out.println(getDeliveryDistance(deliveryDistance));
    }

    // Метод к задаче № 1
    public static String getLeapYear(int year) {
        String result;
        if (year <= 1584) {
            result = "Год должен быть больше значения 1584";
        } else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            result = year + " год является високосным";
        } else {
            result = year + " год не является високосным";
        }
        return result;
    }

    // Метод к задаче № 2
    public static String getLinkClientOS(int clientDeviceYear, byte clientOS) {
        String result;
        int checkYear = 2015;

        if (clientDeviceYear < checkYear) {
            result = "облегченную версию приложения";
        } else {
            result = "свежую версию приложения";
        }

        if (clientOS == 0) {
            result = "Установите " + result + " для iOS по ссылке";
        } else {
            result = "Установите " + result + " для Android по ссылке";
        }
        return result;
    }

    // Метод к задаче № 3
    public static String getDeliveryDistance(int deliveryDistance) {
        String result;
        if (deliveryDistance < 0) {
            result = "Дистанция не может содержать отрицательное значение";
        } else if (deliveryDistance <= 20) {
            result = "Потребуется дней: " + 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            result = "Потребуется дней: " + 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            result = "Потребуется дней: " + 3;
        } else {
            result = "Доставка не осуществляется";
        }
        return result;
    }
}