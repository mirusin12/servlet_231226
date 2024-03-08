package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[][] info = new String[N][2];
		
		// String 배열에 값 넣기
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			info[i][0] = st.nextToken();
			info[i][1] = st.nextToken();
		}
		
		Arrays.sort(info, new Comparator<String[]>() {
			public int compare (String[] s1, String[] s2) {
				if (s1[0].equals(s2[0]) ) {
					return -1;
				} else {
					return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
				}
			}
		});
		
		for (int i = 0; i < info.length; i++) {
			System.out.println(info[i][0] + " " + info[i][1]);
		}
	}
}

//		Arrays.sort(words, new Comparator<String>() {
//			public int compare (String s1, String s2) {
//				if (s1.length() == s2.length()) {
//					return s1.compareTo(s2); // 사전순 정렬
//				} else {
//					return s1.length() - s2.length();
//				}
//			}
//		});
//		System.out.println(words[0]);
//		for (int i = 1; i < words.length; i++) {
//			if (words[i].equals(words[i - 1]) == false) {
//				System.out.println(words[i]);
//			}
//		}

// 람다식
//		Arrays.sort(coordinate, (e1, e2) -> {
//			if (e1[1] == e2[1]) {
//				return e1[0] - e2[0];
//			} else {
//				return e1[1] - e2[1];
//			}
//		});