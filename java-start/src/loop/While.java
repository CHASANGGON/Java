package loop;

public class While {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;
        while (count <= 10) {
            sum += count;
            count += 1;
        }
        System.out.println(sum);
    }
}
