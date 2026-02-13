public class task6 {
    
    public static void main(String[] args) {
        
        // Целочисленные типы

        // long → int (64 бита → 32 бита)
        long longValue = 100_000_000_000L;  // 100 миллиардов
        int intValue = (int) longValue;      // явное приведение
        System.out.println("long: " + longValue);
        System.out.println("int после сужения: " + intValue);
        // Результат: произойдет потеря данных, т.к. значение выходит за пределы int

        // int → short (32 бита → 16 бит)
        int bigInt = 100000;
        short shortValue = (short) bigInt;
        System.out.println("int: " + bigInt);
        System.out.println("short после сужения: " + shortValue);

        // short → byte (16 бит → 8 бит)
        short shortNum = 200;  // 200 выходит за пределы byte (-128 до 127)
        byte byteValue = (byte) shortNum;
        System.out.println("short: " + shortNum);
        System.out.println("byte после сужения: " + byteValue); // будет -56 (из-за переполнения)

        // Типы с плавающей точкой → целочисленные типы

        // double → int (теряется дробная часть)
        double pi = 3.14159;
        int intPart = (int) pi;
        System.out.println("double: " + pi);
        System.out.println("int после сужения: " + intPart); // 3 (дробная часть отброшена)

        // double → long
        double bigDouble = 123456789.987;
        long longPart = (long) bigDouble;
        System.out.println("double: " + bigDouble);
        System.out.println("long после сужения: " + longPart); // 123456789

        // float → byte
        float floatNum = 130.5f;
        byte byteFromFloat = (byte) floatNum;
        System.out.println("float: " + floatNum);
        System.out.println("byte после сужения: " + byteFromFloat); // -126 (переполнение)

        // Сужение с потерей точности для чисел с плавающей точкой

        // double → float (теряется точность)
        double preciseDouble = 0.1234567890123456789;
        float lessPreciseFloat = (float) preciseDouble;
        System.out.println("double: " + preciseDouble);
        System.out.println("float после сужения: " + lessPreciseFloat);
        // float имеет меньшую точность (6-7 знаков вместо 15-16)

        // double → float для очень больших чисел
        double hugeDouble = 1.7e308;  // почти максимальное значение double
        float hugeFloat = (float) hugeDouble;
        System.out.println("double: " + hugeDouble);
        System.out.println("float после сужения: " + hugeFloat); // Infinity (переполнение)

        // char и целочисленные типы

        // int → char (32 бита → 16 бит, беззнаковый)
        int code = 1000;
        char charValue = (char) code;
        System.out.println("int: " + code);
        System.out.println("char после сужения: " + charValue); // символ с кодом 1000

        // int → char с потерей данных
        int largeCode = 70000;  // больше максимального char (65535)
        char truncatedChar = (char) largeCode;
        System.out.println("int: " + largeCode);
        System.out.println("char после сужения: " + (int) truncatedChar); // 4464 (остаток от деления на 65536)

        // char → byte (16 бит → 8 бит)
        char letter = 'Я';  // код 1071 (больше 127)
        byte byteFromChar = (byte) letter;
        System.out.println("char: " + letter + " (код " + (int)letter + ")");
        System.out.println("byte после сужения: " + byteFromChar); // отрицательное значение
    }

}
