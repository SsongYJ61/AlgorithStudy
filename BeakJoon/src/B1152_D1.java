import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1152_D1 {
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0; // 몇번인지 세는 것
		// 공백을 기준으로 문자를 구분한다.
		String str = br.readLine().strip();
		
		String[] words = str.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			if(!words[i].equals("")) {
				num++;
			}
		}
		System.out.println(num);
	}

}
