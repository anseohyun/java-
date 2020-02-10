//	 재귀  - 팩토리얼

//	문제
//	0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

//	입력
//	첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
//	출력
//	첫째 줄에 N!을 출력한다.

//	입력 예시

//	입력
//	10
//	출력
//	3628800


package 백준;

import java.util.Scanner;

public class returnfactorial {

	public static void main(String[] args) {
		
		returnfactorial main = new returnfactorial();

		System.out.println(returnfactorial.factorial(sum));
	}
	
	public int factorial(int n)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 1;
		
		for(int i = 1 ; i < num ; i++)
		{
			sum = sum * i; 
		}
		return sum;
	}
}
