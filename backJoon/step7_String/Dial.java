package step7_String;

import java.util.Scanner;

public class Dial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int time = 0;
		for(int i=0;i<line.length();i++){
			int asc = line.charAt(i);
			if(asc>=65&&asc<=67){
				time+=3;
			}else if(asc >=68 && asc <=70){
				time+=4;
			}else if(asc >=71 && asc <=73){
				time+=5;
			}else if(asc >=74 && asc <=76){
				time+=6;
			}else if(asc >=77 && asc <=79){
				time+=7;
			}else if(asc >=80 && asc <=83){
				time+=8;
			}else if(asc >=84 && asc <=86){
				time+=9;
			}else if(asc >=87 && asc <=90){
				time+=10;
			}
		}
		System.out.println(time);
	}
}
/*
A	65
B	66	
C	67	
D	68
E	69	
F	70	
G	71	
H	72
I	73	
J	74	
K	75
L	76
M	77
N	78
O	79
P	80
Q	81
R	82
S	83
T	84
U	85
V	86
W	87
X	88
Y	89
Z	90*/
/*문제
상근이의 할머니는 아래 그림과 같이 오래된 다이얼 전화기를 사용한다.



전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.

숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.

상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.

할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.

출력
첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.

예제 입력 1 
UNUCIC
예제 출력 1 
36
*/