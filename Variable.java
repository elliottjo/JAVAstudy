package basic;

public class Variable {
	public static void main(String[] args) {
		
		boolean bb = true;
		bb = false;
		System.out.println(bb);
		
		char ch = 'a';
		ch = '가';
		System.out.println(ch);
		
		byte by = 127;
		//by = 128;  범주를 넘어섬
 		System.out.println(by);
 		
 		short sh = 32767;
 		//short sh = 32767; 똑같은 이름으로 변수선언 불가. 만들고나서 대입만 가능
 		//sh = 32768; 범위 벗어남
 		System.out.println(sh);
 		
 		int i;
 		//System.out.println(i);  값이 없는 변수 사용불가
 		i = 214748666;
 		System.out.println(i);
 		
 		long lo = 123;
 		lo = 2147483647L; //숫자 기본 자료형은 int, int의 범주를 넘어서면 뒤에 L을 표시해야한다.
 		System.out.println(lo);
 		
 		float ff = 123.456f; // f를 넣어줘야한다.
 		System.out.println(ff);
 		
 		double dd = 123.456;
 		System.out.println(dd);
 		
 		String str = "아기상어!!!";// 문자열 - 기본자요형 아님!, 클래스
 		str = "빠";
 		System.out.println(str);
 		
 		//int a = b = c = 123;  안됨
 		int a,b,c;              //된다
 		a = b = c = 123;
 		System.out.println(a);
 		System.out.println(b);
 		System.out.println(c);
 		
 		System.out.println("casting 1 ====================================");
 		// 묵시적 형변환
 		by = 10;
 		sh = by;
 		i = sh;
 		lo = i;
 		System.out.println(by);
 		System.out.println(sh);
 		System.out.println(i);
 		System.out.println(lo);
 		
 		System.out.println("casting 2 ====================================");
 		//명시적 형변환
 		lo = 4294967298L;
 		i = (int)lo;
 		
 		sh = 255; 		//0~127, 128,  129,      255,256
 		by = (byte)sh;  //0~127 , -128 -127, -3,-2,-1,0
 		sh = by;
 		System.out.println(lo);
 		System.out.println(i);
 		System.out.println(sh);
 		System.out.println(by);
 		
 		//bb = (boolean)by; 
 		
 		//by = (byte)bb; 
 		
 		ch = 'A';
 		ch = '한';
 		i = ch;
 		System.out.println(i);
 		
 		
 		
 		
	}
}
