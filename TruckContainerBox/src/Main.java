import java.util.Scanner;
/* Вы доставляете гуманитарную помощь в виде ящиков одинакового размера. У вас есть грузовики и контейнеры.
В каждый грузовик влезает максимум 12 контейнеров. В каждый контейнер - не более 27 ящиков.
Ящики, контейнеры и грузовики пронумерованы. Напишите программу, которая будет распределять ящики по контейнерам и
грузовикам в зависимости от их количества, а также напечатает, сколько всего нужно грузовиков и контейнеров.
На вход программы через консоль должно подаваться число ящиков.
На выходе результат должен выглядеть следующим образом:
    Грузовик 1:
        Контейнер 1:
            Ящик 1
            Ящик 2
            . . .
        Контейнер 2
            Ящик 28
            Ящик 29 */

public class Main {
    public static void main(String[] args) {
        int box = 0;
        System.out.println("Enter the number of boxes:");
        Scanner scanner = new Scanner(System.in);
        box = scanner.nextInt();

        Cargo cargo = new Cargo(box);
        cargo.fullPrint();
    }
}
