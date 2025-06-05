
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2562 {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //9 개의 서로다른 자연수가 띄어쓰기 기준으로 주어짐
        int [] arr = new int [9];
        int max = Integer.MIN_VALUE;
        int maxIdx = Integer.MIN_VALUE;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());

            if(max < arr[i]){
                max = arr[i];
                maxIdx = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIdx+1);

    }
}
