package greedy;

import java.util.Stack;

public class MakeBigNumber_stack {
	public static void main(String[] args) {
		MakeBigNumber_stack mbn = new MakeBigNumber_stack();
		mbn.solution("4725772841", 4);
	}
	public String solution(String number, int k) {
		char[] result = new char[number.length() - k];
		Stack<Character> stack = new Stack<>(); // �ٱ��� ����� 

		for (int i=0; i<number.length(); i++) { // �ִ� ���� ��ŭ�� for��
			char c = number.charAt(i);
			while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
				//stack �� ��������ʰ�  + c(���� ����) ���� �۰�  + k(����� �ִ� Ƚ��)�� �����־�� �Ѵ�. => ��θ� �����ϸ�  peek ���� ����
				stack.pop();
			}
			stack.push(c);
		}

		for (int i=0; i<result.length; i++){ // stack ���� �� ������ 
			result[i] = stack.get(i);
		}
		//System.out.println(result);
		return new String(result);
	}
}
// �� ... �ʹ� ����ϴ�. Stack is Awesome!!
