//	 ���  - ���丮��

//	����
//	0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

//	�Է�
//	ù° �ٿ� ���� N(0 �� N �� 12)�� �־�����.
//	���
//	ù° �ٿ� N!�� ����Ѵ�.

//	�Է� ����

//	�Է�
//	10
//	���
//	3628800


package ����;

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
