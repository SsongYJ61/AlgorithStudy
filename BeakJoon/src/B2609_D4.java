import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2609_D4 {
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int max_num = Integer.MIN_VALUE;
		// num1과 2중 큰 친구
		if(num1 >= num2) {
			max_num = num1;
		} else {
			max_num = num2;
		}
		
		// 최대공약수 : 두 숫자의 약수 중 가장 큰 수
		int gcd = Integer.MIN_VALUE;
		for (int i = 1; i <= max_num; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				if(gcd < i) {
					gcd = i;
				}
			}
		}
		
		// 최소공배수 : 최대공약수로 num1, num2를 나눴을 때의 몫
		int num1_mok = num1 / gcd;
		int num2_mok = num2 / gcd;
		
		int lcm= num1_mok * num2_mok * gcd;

		
		System.out.println(gcd);
		System.out.println(lcm);
		
		
		
		
	} // main

}
