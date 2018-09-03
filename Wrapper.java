
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		for (int cnt =0; cnt < args.length; cnt++) {
			Integer obj = new Integer(args[cnt]);//명령형 파라미터로 받은 문자열을 가지고 integer 객체를 생성합니다
			total =+ obj.intValue();//integer 객체 안에 있는 int값을 가져옵니다
		}
		System.out.println(total);
	}

}
