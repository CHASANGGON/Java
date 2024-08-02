import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int now = 64;
        int rest = 64;
        int count = 0;
        int x = scanner.nextInt();

        while (x > 0) {
            if (rest <= x) { // x를 만드는데 반으로 자른 막대가 사용되는 경우
                x -= rest;
                count++;
            } else {
                rest /= 2;
            }
        }
        System.out.println(count);
    }
}