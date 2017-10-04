
package lab_1_7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ilona on 29.10.14.
 */
public class Main {
    public static void main(String[] args) {
        //Из текста удалить все слова заданной длины, начинающиеся на согласную букву.

        // Иициализация текста
        System.out.println("Enter text string");
        Scanner sc1 = new Scanner(System.in);
        String text = sc1.nextLine();
        //string N=[a,e,i,o];
        System.out.println("Enter number");
        int n = 0;
        Scanner sc2 = new Scanner(System.in);
        try {
            n = sc2.nextInt();
        } catch (InputMismatchException fg) {
            System.out.print("Not number");
            return;
        }

        String[] strArr = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {

            char first = strArr[i].charAt(0);

            if (!((strArr[i].length() == n)
                   && ((first != 'a')
                   && (first != 'e')
                   && (first != 'i')
                    && (first != 'o')
                    && (first != 'u')
                    && (first != 'y')))) {

                sb.append(strArr[i] + " ");
            }

        }
        String output = sb.toString().trim();
        System.out.print(output);
    }
}