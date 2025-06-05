import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2577 {
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] num = new int [10];
		
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		
		int result = A* B* C;
		
		while(true) {
			int remain = result % 10;
			num[remain]++;
			result /= 10;
			
			if(result == 0) {
				break;
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
	}

}
