//10998
//�� ���� A�� B�� �Է¹��� ����, A��B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)
package day2;

import java.util.Scanner;

public class day2_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt(); 
		
		if(0 < a && b < 10) {
			System.out.println(a*b);
		}
	}
}
