import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		//8단
		System.out.println("구구단 출력할 단은 ? : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("사용자가 입력한 값 : " + num);
		
		if(num < 2) {
			System.out.println("값을 잘못 입력하셨습니다. 최솟값은 2이상 입니다.");
		}else if(num > 9){
			System.out.println("값을 잘못 입력하셨습니다. 최댓값은 9이하 입니다.");
		}else {
			for(int i=1; i<10; i++) {
				System.out.println(num * i);
			}
		}
		
		//9단
		
		//6단
//		int i = 1;
//		while(i< 10) {
//			System.out.println(6 * i);
//			i = i + 1;
//		}
//		
//		//7단
//		for(int j = 1; j<10; j++) {
//			System.out.println(7 * j);
//		}
		
		//2단
	/*
		System.out.println("2단");
		System.out.println(2 * 1);
		System.out.println(2 * 2);
		System.out.println(2 * 3);
		System.out.println(2 * 4);
		System.out.println(2 * 5);
		System.out.println(2 * 6);
		System.out.println(2 * 7);
		System.out.println(2 * 8);
		System.out.println(2 * 9);
		System.out.println( );
		
		//3단
		System.out.println("3단");
		System.out.println(3 * 1);
		System.out.println(3 * 2);
		System.out.println(3 * 3);
		System.out.println(3 * 4);
		System.out.println(3 * 5);
		System.out.println(3 * 6);
		System.out.println(3 * 7);
		System.out.println(3 * 8);
		System.out.println(3 * 9);

		//4단
		System.out.println("4단");
		int result = 4 * 1;
		System.out.println(result);
		result = 4 * 2;
		System.out.println(result);
		result = 4 * 3;
		System.out.println(result);
		result = 4 * 4;
		System.out.println(result);
		result = 4 * 5;
		System.out.println(result);
		result = 4 * 6;
		System.out.println(result);
		result = 4 * 7;
		System.out.println(result);
		result = 4 * 8;
		System.out.println(result);
		result = 4 * 9;
		System.out.println(result);
			
		System.out.println("구구단 출력할 단은 ? : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(num * 1);
		System.out.println(num * 2);
		System.out.println(num * 3);
		System.out.println(num * 4);
		System.out.println(num * 5);
		System.out.println(num * 6);
		System.out.println(num * 7);
		System.out.println(num * 8);
		System.out.println(num * 9); 
		
		*/
	}
}
