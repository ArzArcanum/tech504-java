package placeholder;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("'Ello World");


        String[] fruit = new String[]{"Organe", "Strawberry", "Cherry"};
        System.out.println(fruit[1]);

        LocalDate now = LocalDate.now();
        LocalDate christmas = LocalDate.of(2025,12,25);
        int daysToGo = christmas.getDayOfYear() - now.getDayOfYear();
        System.out.printf("Only %d days until Christmas ", daysToGo);
        System.out.println();
    }

    private static int add(int num1, int num2){
        return num1 + num2;
    }
}