//10430
//(A+B)%C는 (A%C + B%C)%C 와 같을까?
//(A×B)%C는 (A%C × B%C)%C 와 같을까?
//세 수 A, B, C가 주어졌을 때, 위의 네가지 값을 구하는 프로그램을 작성하시오.
//첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
//첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.
package day2;

import java.util.Scanner;

public class day2_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt(); 
		c = sc.nextInt(); 
		
		if(2 <= a && c <= 10000) {
			System.out.println((a+b)%c);
			System.out.println((a%c + b%c)%c);
			System.out.println((a*b)%c);
			System.out.println((a%c * b%c)%c);
		}
	}
}
