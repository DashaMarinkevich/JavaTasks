public class Task1_4 {
    public static void main(String[] args) {
        //4. Получить из строки "012312" переменную типа Long несколькими способами (изучите структуру класса
        //Long)
        String strLong = new String("012312");
        long num1 = Long.parseLong(strLong);
        System.out.println ("Способ parseLong() ="+ num1 );
        long num2= Integer.parseInt(strLong);
        System.out.println ( "Способ parseInt() ="+ num2 );
        long  num3 = Integer.valueOf( strLong );
        System.out.println ( "Способ valueOf() ="+num3 );
        long  num4 = new Long(strLong);
        System.out.println ( "Способ Long() ="+num4 );


    }
}
