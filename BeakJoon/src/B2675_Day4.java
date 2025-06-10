import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2675_Day4 {
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		st= new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 입력받기
		
		// 1. 문자열 S를 입력받기
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			
			// 3. 새 문자열 P를 만들고 출력하는 프로그램
			String result = "";
			
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);

				// 2. 각 문자를 R번 반복해
				for (int k = 0; k < num; k++) {
					result += c;
				}
			}

			// 3. 새 문자열 P를 만들고 출력하는 프로그램
			System.out.println(result);
			
		} // testcase
		
		
		
		
		
		
		
	}// main

}
