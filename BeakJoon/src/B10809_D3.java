import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class B10809_D3 {
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		// 1. 입력받은 문자열을 배열안에 넣기
		char [] arr = str.toCharArray();
		
		// 걔의 아스키값을 기준으로 a의 아스키값을 빼서 한다.
		// 2. 알파벳 배열을 만든다. > 26개
		int [] alphabet = new int [26];

		// -1로 초기화
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = -1;
		}
		
		// 3. alphabet의 arr의 위치를 채워넣는다.
		for (int i = 0; i < arr.length; i++) {
			int idx = arr[i] - 'a';

			if(alphabet[idx] == -1) {
				alphabet[idx] = i;
			}
		}
		
		for (int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
		
		
	}// main

}
