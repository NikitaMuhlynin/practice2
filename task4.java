public class task4 {

    public static void main(String[] args) {
        
        // 1. String + base types
        String str1 = "Число: " + 67;
        String str2 = "Число с плавающей запятой: " + 2.72;
        String str3 = "Логическое значение: " + true;
        String str4 = "Символ: " + 'A';

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        // 2. String + objects
        Object obj = new Object();
        String str5 = "Объект: " + obj;

        System.out.println(str5);

        // 3. String + string
        String hello = "Hello";
        String world = "World";
        String str6 = hello + " " + world;
        System.out.println(str6);

        // 4. Mixed expressions
        String str7 = "Результат: " + 10 + 20;
        String str8 = 10 + 20 + " результат";

        System.out.println(str7);        
        System.out.println(str8);

        // 5. String + null
        String str9 = "null значение: " + null;
        System.out.println(str9);
    }

}