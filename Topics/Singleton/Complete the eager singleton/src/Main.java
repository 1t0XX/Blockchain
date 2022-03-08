import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[2];
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        String st = sc.next();
        int[] numArr = Arrays.stream(st.split("")).mapToInt(Integer::parseInt).toArray();
        String answer = "";
        for (int i = n[1]; i < numArr.length; i = i + n[1]) {
            if (numArr[i] == 1) {
                answer = "YES";
            } else {
                answer = "NO";
            }
        }
        System.out.println(answer);
    }
}