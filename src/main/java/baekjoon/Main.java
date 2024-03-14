package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] cards = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < cards.length; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		
		
	}
	
	public void binarySearch (int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] < target) {
				left = mid + 1;
			} else if (arr[mid] > target) {
				right = mid - 1;
			} else {
				
			}
		}
		// 53 찾기 (이분탐색)
		// left, right는 index 번호임
//		int left = 0;
//		int right = arr.length - 1;
//		int findNum = 25;
//		while (left <= right) {
//			int mid = (left + right) / 2;
//			if (arr[mid] < findNum) {
//				left = mid + 1;
//			} else if (arr[mid] > findNum) {
//				right = mid - 1;
//			} else {
//				System.out.println(arr[mid]);
//				System.out.println(mid);
//				break;
//			}
//		}
	}
}

