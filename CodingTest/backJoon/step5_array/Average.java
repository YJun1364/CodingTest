package step5_array;
/*문제
세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 
이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 
이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.

출력
첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.

예제 입력 1 
3
40 80 60

예제 출력 1 
75.0*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Average {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // N<=1000
		String scores = br.readLine(); // 0<=scores<=100 그중 적어도 하나는 0보다 크다. 
		ArrayList<Double> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(scores+" ");
		for(int i=0;i<N;i++){// 배열에 값 삽입
			Double score = Double.parseDouble(st.nextToken());
			list.add(score);
		}
		Collections.sort(list);
		Double max = list.get(N-1);
		//System.out.println(max);
		for(int i=0;i<N;i++){
			Double score= list.get(i)/max*100;
			list.set(i, score);
		}
		Double sum = 0.0;
		for (Double val : list) {
			sum += val;
		}
		Double average = Math.round(sum*100)/100.0/N; // 소수점 반올림
		System.out.println(average);
	}
}
