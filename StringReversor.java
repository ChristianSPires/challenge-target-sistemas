import java.util.Scanner;

public class StringReversor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string que deseja inverter: ");
        String stringOriginal = sc.nextLine();

        System.out.print("String invertida: " + inverterString(stringOriginal));
    }

    private static String inverterString(String stringOriginal) {
        char[] charArray = stringOriginal.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        return new String(charArray);
    }
}
