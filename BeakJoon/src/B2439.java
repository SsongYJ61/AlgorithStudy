
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2439 {

    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine()); // 단어를 한개만 받을 예정

        int N = Integer.parseInt(st.nextToken());

        // 처음에는 몇 줄을 하느냐의 반복문
        for (int i = 1; i <= N; i++) {
            // 띄어쓰기 4번 + 별 1번
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
