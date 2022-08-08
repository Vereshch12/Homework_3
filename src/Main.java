public class Main {
    public static void main(String[] args) {
        //Задание №1
        byte clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            System.out.println("Установите версию приложения для Android по ссылке");


        //Задание №2
        int yearOfIssue = 2014;
        if (clientOS == 0){
            if (yearOfIssue >= 2015){
                System.out.println("\nУстановите версию приложения для iOS по ссылке");
            } else
                System.out.println("\nУстановите облегченную версию приложения для iOS по ссылке");
        } else{
            if (yearOfIssue >= 2015){
                System.out.println("\nУстановите версию приложения для Android по ссылке");
            } else
                System.out.println("\nУстановите облегченную версию приложения для Android по ссылке");
        }

        //Задание №2 (вариант с else if)
        if ((clientOS == 0) && (yearOfIssue >= 2015)){
                System.out.println("\nУстановите версию приложения для iOS по ссылке");
            } else if ((clientOS == 0) && (yearOfIssue < 2015)) {
                System.out.println("\nУстановите облегченную версию приложения для iOS по ссылке");
            } else if ((clientOS != 0) && (yearOfIssue >= 2015)){
                System.out.println("\nУстановите облегченную версию приложения для Android по ссылке");
        } else{
                System.out.println("\nУстановите облегченную версию приложения для Android по ссылке");
        }

        //Задание №3
        int year = 2020;
        if (year % 4 == 0) {
            System.out.println("\n" + year + " год високосный!");
        }else
            System.out.println("\n" + year + " год не високосный!");

        //Задание №4
        int deliveryDistance = 15;
        int deliveryPeriod = 1;
        if (deliveryDistance < 20){
            System.out.println("\nПотребуется дней на доставку: " + deliveryPeriod);
        }else {
            deliveryPeriod += 1 + (deliveryDistance - 20) / 40;
            System.out.println("\nПотребуется дней на доставку: " + deliveryPeriod);
        }

        //Задание №5
        int monthNumber = 10;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("\nЭто зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("\nЭто весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("\nЭто летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("\nЭто осенний месяц");
                break;
            default:
                System.out.println("\nТакого месяца существует");
        }


        //Задание №6
        byte age = 25;
        int salary = 60000;
        int limit;
        if (age < 23){
            limit = salary*2;
        } else{
            limit = salary*3;
        }
        if (salary >= 80000){
            limit *= 1.5;
        }else if (salary >= 50000){
            limit *= 1.2;
        }
        System.out.println("\nМы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");


        //Задание №7
        //P.S переменная age и salary названа в задании №6;
        int wantedSum = 330000;
        float loanRate = 0.1f;
        if ((age >= 23) && (age < 30)) loanRate += 0.005;
        if (age < 23) loanRate += 0.01;
        if (salary >= 80000) loanRate -= 0.007;
        int maxPayment = salary/2;
        float CreditPayment = (wantedSum + wantedSum*loanRate)/12;
        if (maxPayment >= CreditPayment){
            System.out.println("\nМаксимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. \nПлатеж по кредиту: " + CreditPayment + " рублей. \nОдобрено!");
        }else System.out.println("\nМаксимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. \nПлатеж по кредиту: " + CreditPayment + " рублей. \nОтказано!");
    }
}