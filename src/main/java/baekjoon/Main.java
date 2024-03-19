package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 대충 요약하자면 26개의 단어가 저장되어 있는 도감이 있다. 그중 M개의 문제를 맞춰야 이 도감을 가져갈 수 있는데, 숫자면 해당 숫자index의 포켓몬 이름을, 
		// 단어면 그 포켓몬이 몇번째 index에 있는지 출 력 !
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 1. map에다가 key = 포켓몬 이름, value = index number 넣기
		HashMap<String, Integer> info = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String name = br.readLine();
			info.put(name, i + 1);
		}
		// 2. 숫자랑 포켓몬 이름을 모두 String으로 받은 다음 if문으로 만약 map이 key를 contain하고 있으면 찾아서 value 출력
		// 만약 contain하지 않으면 해당 String을 숫자로 바꾼 다음 value 값으로 key 찾기(value값이 겹치지 않기 떄문에 key찾을 수 있을듯??)
		// 그리고 그 때 마다 출력
		
		for (int i = 0; i < M; i++) {
			String quiz = br.readLine();
			if (info.keySet().contains(quiz)) {
				bw.write(info.get(quiz) + "\n");
			} else {
				int quizIdx = Integer.parseInt(quiz);
				for (String key : info.keySet()) {
					if (info.get(key) == quizIdx) {
						bw.write(key + "\n");
					}
				}
				
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}


