package singleton;

public class Client {
    public static void main(String a[]) {
	IdentityCardNo no1, no2;
	no1 = IdentityCardNo.getInstance();
	no2 = IdentityCardNo.getInstance();
	System.out.println("no1 equals to no2: " + (no1 == no2));

	String str1, str2;
	str1 = no1.getIdentityCardNo();
	str2 = no1.getIdentityCardNo();
	System.out.println("��һ�κ��룺" + str1);
	System.out.println("�ڶ��κ��룺" + str2);
	System.out.println("�����Ƿ���ȣ�" + str1.equalsIgnoreCase(str2));
	System.out.println("�Ƿ�����ͬ����" + (str1 == str2));
    }
}