import java.util.Scanner;

public class Gugudan {
/*
 * ================================================		
 * // 메소드를 활용한 구구단 구현
 * ================================================
 *		
 */	
	public static int[] caculate(int times) {
 		int[] result = new int[9];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}
	
	public static void outov(int[] time2) {
		for(int i=0; i < time2.length; i++) {
			System.out.println(time2[i]);
		}	
	}
	public static void main(String[] args) {
		
		for(int i = 2; i < 10; i++) {
			int[] time2 = caculate(i);
			outov(time2);
		}
/*
 * ================================================		
 * // 메소드 구구단 출력
 * ================================================
 *
		
		int[] time2 = caculate(2);
		outov(time2);
		
		int[] time3 = caculate(3);
		outov(time3);		

		int[] time4 = caculate(4);
		outov(time4);
		
		int[] time5 = caculate(5);
		outov(time5);		

*/
		
/*
 * ================================================		
 * // 배열 응용 중첩for문 구구단 출력 2단부터
 * ================================================
 *
		int subc = 2;
		int[] arrgu = new int[9];
		
		for(int i = 1; i < arrgu.length; i++) {
			for(int j = 0; j<arrgu.length; j++) {
				arrgu[j] = subc * (j+1);
				System.out.println(arrgu[j]);
			}
			subc++;
		}
*/
		
/*
 * ================================================		
 * // 배열 2단 , 3단 구현
 * ================================================
 *
 		int[] result = new int[9];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = 2 * (i + 1);
		}
		
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	
	//배열 3단
	 * 
		int[] result3 = new int[9];
		
		for(int i = 0; i < result3.length; i++) {
			result3[i] = 3 * (i + 1);
		}
		
		for(int i=0; i < result3.length; i++) {
			System.out.println(result3[i]);
		}
*/
		
//		입력 받고 출력
//		System.out.println("구구단 출력할 단은 ? : ");
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		System.out.println("사용자가 입력한 값 : " + num);
//		
//		if(num < 2) {
//			System.out.println("값을 잘못 입력하셨습니다. 최솟값은 2이상 입니다.");
//		}else if(num > 9){
//			System.out.println("값을 잘못 입력하셨습니다. 최댓값은 9이하 입니다.");
//		}else {
//			for(int i=1; i<10; i++) {
//				System.out.println(num * i);
//			}
//		}
		
		
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
