package HW_1;

public class StartEx2 {
    public static void main(String[] args) {
        int[] myArray = MyLib.getSubsequence();
        if (AscendingSequence.IsAcsending(myArray)) {
            System.out.println("Последовательность возрастает");
        } else {
            System.out.println("Последовательность НЕ возрастает");
        }
    }
}
