import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1546_D3 {
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(br.readLine());
		// 시험 본 과목의 개수 N
		int N = Integer.parseInt(st.nextToken());
		float [] score = new float [N]; // 점수 저장
		float max = Integer.MIN_VALUE; // 최대값을 저장
		
		float sum = 0; // 누적합을 저장
		float result = 0; // 결과를 저장 > 평균값 저장
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			score[i] = Integer.parseInt(st.nextToken());
			if(score[i] > max) {
				max = score[i];
			} // 동시에 최대값을 찾는다.
		} // 입력값을 받아
		
		for (int i = 0; i < N; i++) {
			score[i] = (score[i] / max) * 100;
			sum += score[i];
		} // 최대값으로 나누고 100을 곱해 score를 초기화 시켜준다.
		
		
		result = sum / N;
		System.out.println(result);
	} // main

}
