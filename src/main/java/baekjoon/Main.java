package baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException{
//		＊n명의 게임 캐릭터 정보가 주어진다.
//		＊필요한 파티원 조건:
//		- myCharacter와 같은 서버의 "힐러" 직업을 가진 멤버 후보를 모두 출력한다.
//
//		보너스 문제: 같은 서버의 힐러 중 레벨이 가장 높은 사람만 출력하세요.
		Map<String, String> mirusin12 = new HashMap<>();
		mirusin12.put("닉네임", "승훈전사1");
		mirusin12.put("직업", "검사");
		mirusin12.put("서버", "호계");
		mirusin12.put("레벨", "125");
	
		List<Map<String, String>> members = new ArrayList<>();
		Map<String, String> member1 = new HashMap<>();
		member1.put("닉네임", "이상호93");
		member1.put("직업", "힐러");
		member1.put("서버", "호계");
		member1.put("레벨", "38");
		
		Map<String, String> member2 = new HashMap<>();
		member2.put("닉네임", "김민교.");
		member2.put("직업", "표도");
		member2.put("서버", "의왕");
		member2.put("레벨", "58");
		
		Map<String, String> member3 = new HashMap<>();
		member3.put("닉네임", "토마토");
		member3.put("직업", "힐러");
		member3.put("서버", "호계");
		member3.put("레벨", "82");
		
		Map<String, String> member4 = new HashMap<>();
		member4.put("닉네임", "문월");
		member4.put("직업", "힐러");
		member4.put("서버", "천안");
		member4.put("레벨", "100");
		
		Map<String, String> member5 = new HashMap<>();
		member5.put("닉네임", "뜨뜨뜨뜨");
		member5.put("직업", "마법사");
		member5.put("서버", "호계");
		member5.put("레벨", "98");
		
		members.add(member1);
		members.add(member2);
		members.add(member3);
		members.add(member4);
		members.add(member5);
		
		// 1. 나랑 같은 서버에 힐러 직업
		Map<String, String> recommend = new HashMap<>();
		int maxLevel = Integer.MIN_VALUE;
		for (int i = 0; i < members.size(); i++) {
			String server = members.get(i).get("서버");
			String job = members.get(i).get("직업");
			if (server.equals("호계") && job.equals("힐러")) {
				if (Integer.parseInt(members.get(i).get("레벨")) > maxLevel) {
					maxLevel = Integer.parseInt(members.get(i).get("레벨"));
					recommend = members.get(i);
				}
			}
		}
		
		// 2. 거기에 레벨이 가장 높은 힐러 찾기
		System.out.println(recommend);
		
		
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
//				Syste)m.out.println(words[i]);
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