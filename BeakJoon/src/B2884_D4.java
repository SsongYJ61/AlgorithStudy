import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2884_D4 {
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		st = new StringTokenizer(br.readLine());

		// 45분일찍 일어나기
		// 입력
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());

		// 출력
		int result_minute = minute - 45; // 45분 일찍이므로 실제 시간에서 빼준다.
		
		// 1. 음수일 때
		if(result_minute < 0) {
			
			// 0시 일 경우
			if((hour - 1) < 0) {
				hour = 23;
			} 
			// 0시 아닐경우
			else {
				hour -= 1;
			}
			
			result_minute += 60;
		}
		
		// 양수일 때는 어차피 시간 고려X
		
		// 정답
		System.out.println(hour + " " + result_minute);

	}// main

}
