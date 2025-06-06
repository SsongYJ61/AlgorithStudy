import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3052_D1 {
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] remain = new int [42];
		int result = 0;
		
		for (int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			
			int a = num % 42;
			remain[a]++;
		}
		
		for (int i = 0; i < remain.length; i++) {
			if(remain[i] != 0) {
				result++;
			}
		}
		System.out.println(result);
		
	}

}
