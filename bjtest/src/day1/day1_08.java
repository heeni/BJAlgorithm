//11719
//�Է��� �־�����. �Է��� �ִ� 100�ٷ� �̷���� �ְ�, ���ĺ� �ҹ���, �빮��, ����, ���ڷθ� �̷���� �ִ�. 
//�� ���� 100���ڸ� ���� ������, �� ���� �־��� ���� �ְ�, �� ���� �� �ڿ� ������ ���� ���� �ִ�.
/*
    Hello

Baekjoon     
   Online Judge      
*/
package day1;

import java.util.Scanner;

public class day1_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
            String input_text = sc.nextLine();
            if (!(input_text.length() > 100)){
                System.out.println(input_text);
            }
        }
		sc.close();
	}
}
