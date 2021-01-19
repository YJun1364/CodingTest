package exhaustive_search; // 완전 탐색

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//완전 탐색이란? '무식하게 푼다(brute-force)'는 컴퓨터의 빠른 계산 능력을 이용해 가능한 경우의 수를 일일이 나열하면서 답을 찾는 방법을 의미. 이렇게 가능한 방법을 전부 만들어 보는 알고리즘
/*문제 설명
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...  -> 12345
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ... -> 21232425
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ... -> 3311224455

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
입출력 예
answers	return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]
입출력 예 설명
입출력 예 #1

수포자 1은 모든 문제를 맞혔습니다.
수포자 2는 모든 문제를 틀렸습니다.
수포자 3은 모든 문제를 틀렸습니다.
따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.

입출력 예 #2

모든 사람이 2문제씩을 맞췄습니다.*/
public class PracticeTest {// 모의고사


	public static void main(String[] args) {
		Random random=new Random();
		int randomAnswer1 = (int)(Math.random() * 5 + 1);
		int randomAnswer2 = (int)(Math.random() * 5 + 1);
		int randomAnswer3 = (int)(Math.random() * 5 + 1);
		int randomAnswer4 = (int)(Math.random() * 5 + 1);
		int randomAnswer5 = (int)(Math.random() * 5 + 1);
		//System.out.println(randomAnswer1+"/"+randomAnswer2);

		int q = (int)(Math.random() * 50 +1);
		ArrayList<Integer> answer = new ArrayList<Integer>(5);
		//System.out.println(q);
		for(int i=1;i<q;i++){
			int randomAnswer = (int)(Math.random() * 5 + 1);
			//System.out.println(randomAnswer);
			answer.add(randomAnswer);			
		}
		System.out.println(answer);	//정답지 만들기 완료
		
	}
	public int[] solution(int[] answers) {
		int[] answer = {};

		int person1 [] = {1,2,3,4,5};
		int person2 [] = {2,1,2,3,2,4,2,5};
		int person3 [] = {3,3,1,1,2,2,4,4,5,5};



		return answer;
	}


}
