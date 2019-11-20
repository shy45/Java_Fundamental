package Java_20191119;

public class charLiteralDemo {
    public static void main(String[] args){
    	//1. 유니코드 표현 => '/uxxxx';
    	char c1 = '\uC2E0';
    	char c2 = '\uD558';
    	char c3 = '\uC601';
    	System.out.println(c1);
    	System.out.println(c2);
    	System.out.println(c3);
    	
    	//2. 아스키코드 표현 =>
    	// 48 - 57=> 0-9
    	// 65 - 90=> A-Z
    	// 97 - 122 => a-z
    	
    	char c4 = 97;
    	System.out.println(c4);
    	
    	//3 문자 표현 => ''
    	char c5 = 'a';
    	char c6 = '성';
    	System.out.println(c5);
    	System.out.println(c6);
    	
    	//escape char
    	// \n => line feed
    	// \t=> tab
    	// \\ => \
    	// \\" => "
    	// \' => '
    	
    	System.out.println("hello/n"+"world");
    	System.out.println("hello/t"+"world");
    	
    	String path = "C://dev//eclipse";
    	System.out.println(path);
       

     
    
    }
}
