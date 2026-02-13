public class task5 {
    
    public static void main(String[] args) {
        
        // Целочисленные типы
        byte b_1 = 10;
        short s_1 = 20;
        int i_1 = 30;
        long l_1 = 40;

        int result1 = b_1 + s_1; // byte + short → оба расширяются до int → результат int
        int result2 = b_1 + i_1; // byte + int → byte расширяется до int → результат int
        long result3 = i_1 + l_1; // int + long → int расширяется до long → результат long

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        
        // Целочисленные и типы с плавающей точкой
        int i_2 = 5;
        float f_1 = 2.5f;
        double d_1 = 3.0;

        float result4 = i_2 + f_1;       // int + float → int расширяется до float → результат float
        double result5 = i_2 + d_1;       // int + double → int расширяется до double → результат double
        double result6 = f_1 + d_1;       // float + double → float расширяется до double → результат double

        System.out.println(result4);  
        System.out.println(result5);  
        System.out.println(result6);  

        // Смешанные операции

        byte b_2 = 10;
        short s_2 = 20;
        int i_3 = 30;
        long l_2 = 40L;
        float f_2 = 1.5f;
        double d_2 = 2.5;

        // Цепочка операций
        double result = b_2 + s_2 + i_3 + l_2 + f_2 + d_2;
        // 10 + 20 = 30 (int)
        // 30 + 30 = 60 (int)
        // 60 + 40 = 100 (long)
        // 100 + 1.5 = 101.5 (float)
        // 101.5 + 2.5 = 104.0 (double)

        System.out.println(result);
    }

}