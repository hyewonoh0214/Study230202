
public class Ex3 {

	public static void main(String[] args) {
		//3-3
		int num = 10;
		//틀림 System.out.println(num>0?"양수":"음수");
		System.out.println(num>0?"양수":(num<0?"음수":"0"));
		//3-4
		num = 456;
		System.out.println(num/100*100);
		//3-5
		num = 333;
		System.out.println(num/10*10+1);
		//3-6
		num = 24;
		System.out.println( (num/10+1)*10-num );
		//3-7
		
		//3-8
		byte a = 10;
		byte b = 20;
		//int c = a + b;
		byte c = (byte)(a + b);
		char ch = 'A';
		ch = (char) (ch + 2);
		float f = 3 / 2.0f;
		long l = 3000L * 3000L * 3000L;
		float f2 = 0.1f;
		double d = 0.1f;
		boolean result = d==f2;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
		//3-9
		ch = 'z';
		/*
		char A = 'A';//65
		char Z = 'Z';//90
		char aa='a';//97
		char z='z';//122
		char one='1';//49
		char nine='9';//57
		*/
		/*유니코드 값이 아닌 그냥 문자 자체로 적었어도 가능*/
		
		boolean bb = (ch>=65&&ch<=90||ch>=97&&ch<=122||ch>=49&&ch<=57?true:false);
		System.out.println(bb);
		
		//3-10
		ch = 'A';
		char lowerCase = ch>=65&&ch<=90? (char)(ch+32): ch;
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
	}

}
