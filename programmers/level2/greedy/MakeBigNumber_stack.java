package greedy;

import java.util.Stack;

public class MakeBigNumber_stack {
	public static void main(String[] args) {
		MakeBigNumber_stack mbn = new MakeBigNumber_stack();
		mbn.solution("4725772841", 4);
	}
	public String solution(String number, int k) {
		char[] result = new char[number.length() - k];
		Stack<Character> stack = new Stack<>(); // 바구니 만들기 

		for (int i=0; i<number.length(); i++) { // 있는 숫자 만큼만 for문
			char c = number.charAt(i);
			while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
				//stack 이 비어있지않고  + c(다음 숫자) 보다 작고  + k(지울수 있는 횟수)가 남아있어야 한다. => 모두를 만족하면  peek 제거 가능
				stack.pop();
			}
			stack.push(c);
		}

		for (int i=0; i<result.length; i++){ // stack 에서 답 꺼내기 
			result[i] = stack.get(i);
		}
		//System.out.println(result);
		return new String(result);
	}
}
// 와 ... 너무 대단하다. Stack is Awesome!!
