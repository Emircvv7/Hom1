public class Main {
    public static void main(String[] args) {
        String myString;
        final int NUM = 42;
        String word = "Hello";

        myString = NUM + word;

        System.out.println("myString: " + myString);
        System.out.println("NUM: " + NUM);
        System.out.println("word: " + word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
    }
}

