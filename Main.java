import java.util.stream.IntStream;
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println(Palindrome("Hello"));

        System.out.println(Palindrome("World"));


        for (int i = 0; i < 150; i++) {

            if (Prime(i))
                System.out.println(i);
        }
    }


    public static boolean Palindrome(String string) {

        return new StringBuilder(string).reverse().toString().equals(string);
    }

    public static boolean Prime(final int num) {

        return num > 1 && IntStream.range(2, num).noneMatch(index -> num % index == 0);
    }
}