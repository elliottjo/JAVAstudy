package basic;

public class Variable {
	public static void main(String[] args) {
		
		boolean bb = true;
		bb = false;
		System.out.println(bb);
		
		char ch = 'a';
		ch = '��';
		System.out.println(ch);
		
		byte by = 127;
		//by = 128;  ���ָ� �Ѿ
 		System.out.println(by);
 		
 		short sh = 32767;
 		//short sh = 32767; �Ȱ��� �̸����� �������� �Ұ�. ������� ���Ը� ����
 		//sh = 32768; ���� ���
 		System.out.println(sh);
 		
 		int i;
 		//System.out.println(i);  ���� ���� ���� ���Ұ�
 		i = 214748666;
 		System.out.println(i);
 		
 		long lo = 123;
 		lo = 2147483647L; //���� �⺻ �ڷ����� int, int�� ���ָ� �Ѿ�� �ڿ� L�� ǥ���ؾ��Ѵ�.
 		System.out.println(lo);
 		
 		float ff = 123.456f; // f�� �־�����Ѵ�.
 		System.out.println(ff);
 		
 		double dd = 123.456;
 		System.out.println(dd);
 		
 		String str = "�Ʊ���!!!";// ���ڿ� - �⺻�ڿ��� �ƴ�!, Ŭ����
 		str = "��";
 		System.out.println(str);
 		
 		//int a = b = c = 123;  �ȵ�
 		int a,b,c;              //�ȴ�
 		a = b = c = 123;
 		System.out.println(a);
 		System.out.println(b);
 		System.out.println(c);
 		
 		System.out.println("casting 1 ====================================");
 		// ������ ����ȯ
 		by = 10;
 		sh = by;
 		i = sh;
 		lo = i;
 		System.out.println(by);
 		System.out.println(sh);
 		System.out.println(i);
 		System.out.println(lo);
 		
 		System.out.println("casting 2 ====================================");
 		//����� ����ȯ
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
 		ch = '��';
 		i = ch;
 		System.out.println(i);
 		
 		
 		
 		
	}
}
