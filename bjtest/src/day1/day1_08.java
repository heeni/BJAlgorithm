//11719
//입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 
//각 줄은 100글자를 넘지 않으며, 빈 줄이 주어질 수도 있고, 각 줄의 앞 뒤에 공백이 있을 수도 있다.
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
