import java.util.Random;
import java.util.Scanner;

public class HOMEWORK {
    public static void main(String[] args) {

        System.out.println("Задание 1 Вариант 7");
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите начальный x");
        double x1 = scan.nextDouble();

        System.out.println("Введите конечный x");
        double x2 = scan.nextDouble();

        System.out.println("Введите шаг (Десятичные вводить через запятую, а не через точку)");
        double dx = scan.nextDouble();

        double y = 0;

        double y1;

        if (x1 == -10 && x2 == 8 && dx != 0) {
            System.out.println("___________");
            System.out.println("| X  |  y |");
            System.out.println("|____|____|"); // выводим шапку
            while (x1 <= -6) {
                y = Math.sqrt((4 - x1 * x1 + (2 * x1 * (-8)) - 64)) - 2; //выносим y из уравнения окружности
                y1 = y;
                System.out.println(x1 + "  |  " + y1);
                x1 = x1 + dx;                  // наш шаг
            }
            while (x1 <= 2) {
                y = 0.5 * (x1 + 6) - 2;   // выносим y из уравнения прямой на плоскости
                y1 = y;
                System.out.println(x1 + "  |  " + y1);
                x1 = x1 + dx;
            }
            while (x1 <= 6) {
                y = x1;
                y1 = y;
                System.out.println(x1 + "  |  " + y1);
                x1 = x1 + dx;
            }
            while (x1 <= 8) {
                y = Math.pow(x1 - 6, 2);
                y1 = y;
                System.out.println(x1 + "  |  " + y1);
                x1 = x1 + dx;
            }
        } else {
            System.out.println("Неверные значения"); // проверка
        }
/////////////////////////////////////////////////////////////////////////////////////
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Задание 2 Вариант 7");

        int x = 9;
        int count = 0;
        int first;
        int second;
        int third;
        int z;

        while (x < 100) {
            x++;
            z = x * 3;

            first = z / 100;
            second = z / 10 % 10;
            third = z % 10;

            if ((first + second + third) % 5 == 0) {
                count++;
            }
        }
        System.out.println("Количество равно " + count);  // тут можно без пояснений
//////////////////////////////////////////////////////////////////////////////////////

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Задание 3 Вариант 7");

        Random ran = new Random();

        System.out.println("Введите кол-во элементов массива");
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = ran.nextInt(); // Присваеваем каждому эл-ту массива рандомное число
        }
        int count1 = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] >= 0){
                count1++;         // Получаем кол-во положительных элементов в массиве
            }
        }
        int min = arr[0];          // Присваеваем минимальому числу любой эл-т массива
                                // Чтобы в дальнейшем узнать действительно минимальный эл-т
        for (int i = 0; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++){
            if(arr[1] != min){
                sum = sum + arr[i];  // Высчитываем сумму до минимального эл-та
            }else{
                break;             // Без этого брейка почему то не правильно считает сумму
            }
        }

        System.out.println("Количество положительных эл-тов массива = "+count1);
        System.out.println("Сумма эл-тов массива до минимального эл-та = "+sum);

        System.out.println("____________");
        System.out.println("Массив:");
        for (int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
////////////////////////////////////////////////////////////////////////
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Задание 4 Вариант 7");

        System.out.println("Введите количество строк");
        n = scan.nextInt();

        System.out.println("Введите количество столбцов");
        int m = scan.nextInt();

        if (n != m){
            int[][] matr = new int[n][m];
            for (int i = 0; i < matr.length; i++){
                for (int j = 0; j < matr[1].length; j++){
                    matr[i][j] = ran.nextInt();  // Рандомные значения для матрицы
                }
            }
            for (int j = 0; j < m; j++){
                int i = 0;
                while (i < n && matr[i][j] >= 0){
                    i++;
                }
                if (i == n){
                    count++;
                }
            }
            System.out.println("Кол-во столбцов, не содержащих ни одного отриц эл-та: "+count);
            System.out.println();

            for (int i = 0; i < matr.length; i++){
                for (int j = 0; j < matr[i].length; j++){
                    System.out.print(matr[i][j] +" ");  // Вывод матрицы
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Преобразованная матрица:");

            for (int j = 0; j < m; j++){
                int matr2 = matr[(n-2)][j];
                matr[(n-2)][j] = matr[(n-1)][j];
                matr[(n-1)][j] = matr2;   // Замена последнего и предпоследнего эл-та
            }                       //я 2.5 часа промучался пока не попробовал скобочки [(n-1)]

            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++){
                    System.out.print(matr[i][j]+" ");
                }
                System.out.println();
            }
        }
        else System.out.println("Неверный ввод");  // проверка
    }
}
