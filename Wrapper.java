
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		for (int cnt =0; cnt < args.length; cnt++) {
			Integer obj = new Integer(args[cnt]);//����� �Ķ���ͷ� ���� ���ڿ��� ������ integer ��ü�� �����մϴ�
			total =+ obj.intValue();//integer ��ü �ȿ� �ִ� int���� �����ɴϴ�
		}
		System.out.println(total);
	}

}
