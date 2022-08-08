public class Main {
    public static void main(String[] args) {
        //Задание №1
        byte clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            System.out.println("Установите версию приложения для Android по ссылке");


        //Задание №2
        int YearOfIssue = 2014;
        if (clientOS == 0){
            if (YearOfIssue >= 2015){
                System.out.println("\nУстановите версию приложения для iOS по ссылке");
            } else
                System.out.println("\nУстановите облегченную версию приложения для iOS по ссылке");
        } else{
            if (YearOfIssue >= 2015){
                System.out.println("\nУстановите версию приложения для Android по ссылке");
            } else
                System.out.println("\nУстановите облегченную версию приложения для Android по ссылке");
        }

        //Задание №2 (вариант с else if)
        if ((clientOS == 0) && (YearOfIssue >= 2015)){
                System.out.println("\nУстановите версию приложения для iOS по ссылке");
            } else if ((clientOS == 0) && (YearOfIssue < 2015)) {
                System.out.println("\nУстановите облегченную версию приложения для iOS по ссылке");
            } else if ((clientOS != 0) && (YearOfIssue >= 2015)){
                System.out.println("\nУстановите облегченную версию приложения для Android по ссылке");
        } else{
                System.out.println("\nУстановите облегченную версию приложения для Android по ссылке");
        }
    }
}