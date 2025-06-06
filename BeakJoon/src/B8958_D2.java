import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B8958_D2 {
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 몇 번 입력할지 받기
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();// 문자열을 읽어오고
			int result = 0; // 전체 누적합을 출력할 변수
			int plus = 0; 

			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j); // 하나씩 본다
				// 이 라인에 plus = 0을 놓으면 계속 초기화되서 불필요
				// c가 0이면 누적합
				if(c == 'O') {
					plus ++;
				}
				// c가 X이면 0을 더하고 누적합은 초기화
				else {
					plus += 0;
					plus = 0;
				}
				result += plus;
			}
			System.out.println(result);
		}
		
		
	}

}
