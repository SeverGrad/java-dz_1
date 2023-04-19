package HW_1;

import com.sun.tools.javac.Main;

public class StartEx1 {
    public static void main(String[] args) {

        int[] our_array = MyLib.getSubsequence();
        int sum = 0;
        MyLib.printArray(our_array);

        for (int i = 0; i < our_array.length; i++) {
            if (PrimeNum.primeInt(our_array[i])) {
                System.out.print(our_array[i] + " ");
                sum += our_array[i];
            }
            System.out.println(PrimeNum.primeInt(our_array[i]));
        }
        System.out.println(String.format("Сумма простых чисел массива = %d", sum));
    }
}
