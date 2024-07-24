package loop;

public class Continue {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i); // 짝수 일 때만 출력
            }
            i++;
        }

        int j = 1;
        while (j <= 10) {
            if (j % 2 == 1) {
                j++;
                continue; // 홀수 일 때는 통과
            }
                System.out.println(j); // 짝수 일 때만 출력
                j++;
        }
    }
}
