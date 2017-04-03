package Test;

public class Test {
	
	public static void main(String[] args) {
		
		
		Boolean a = Boolean.FALSE;
		
		if("false".equals(Boolean.toString(a))){
			System.out.println("OK");
		}else{
			System.out.println("NG");
		}
		
		
		Boolean b = Boolean.getBoolean("true");
		System.out.println(b);
		
		Boolean c  =  Boolean.parseBoolean("false");
		System.out.println(c);
		
		String str = String.valueOf(false);
		System.out.println(str);
	}
		
	}
