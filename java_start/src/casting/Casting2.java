package casting;

public class Casting2 {
    public static void main(String[] args) {
        long MaxIntValue = 2147483647; // int 최고값
        long MaxIntOver = 2147483648L; // int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) MaxIntValue;
        System.out.println(intValue); // 2147483647

        intValue = (int) 2147483648L;
        System.out.println(intValue); // -2147483648
    }
}
