import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class B2920_D2 {
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 8개 밖에 안되니 배열에 넣자
		String [] str = br.readLine().split(" ");
		
		int [] input = new int [str.length];
		
		for (int i = 0; i < str.length; i++) {
			input[i] = Integer.parseInt(str[i]);
		} // 8개의 숫자가 들어갈 배열 
// ============================ 입력 완료 ============================
		
		boolean isAsc = true;
		boolean isDesc = true;
		
		for (int i = 0; i < input.length-1; i++) {
			// desc
			if((input[i] > input[i+1])) {
				isAsc = false;
			} 
			// asc
			else if ((input[i] < input[i+1])) {
				isDesc = false;
			}
		}
		
		if(isAsc) {
			System.out.println("ascending");
		} else if (isDesc) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
		
		
	}

}
