package com.javaex.ex06;

public class Ex02 {
	public static void main(String args[]) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		//System.out.println(a.concat(b)); // 더하기
		//System.out.println(a+b);
		
		a = a.concat(b);
		System.out.println(a);
		
		a=a.trim();
		System.out.println(a.trim()); //앞 뒤 공백 없애기
		System.out.println("__" + a + "__");
		
		a = a.replace("ab", "12"); // 자리수 상관없이 바꿔준다
		System.out.println(a);
		
		System.out.println("=======================");
		
		String[] sArray = a.split(","); 
		// 콤마 기준으로 자르고 콤마는 사라짐
		// 배열로 넣어주기 때문에 배열로 받아야한다
		
		for(int i = 0 ; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println(a);
		
		System.out.println("=======================");
		
		String str = "Hello Java!";
		String result01 = str.substring(3); // 3번부터 끝까지
		System.out.println(result01);
		
		String result02 = str.substring(1,7); // 1번부터 7번 '전'까지
		System.out.println(result02);
		
		char result03 = str.charAt(8); //8번 꺼내기
		System.out.println(result03);
		
		
	}
}
