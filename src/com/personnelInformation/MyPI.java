package com.personnelInformation;
/** ��������name
// ��������sex
// ������̬����age

����ӡ��
ͨ�����췽����ʼ��name
ͨ����ʼ�����ʼ��sex
ͨ����̬��ʼ�����ʼ��age

���Ȳ������������һ�³���۲�Ч����
show()������ӡ���������Ա�����

/*main�������ö����show����*/

public class MyPI {
	String name;
	char sex;
	static int age;
	
	//���캯����ʼ��name
	public MyPI(){
		name = "LQC";
		System.out.println("ͨ�����췽����ʼ��name");
	}
	
	//��ʼ�����ʼ��sex
	{
		sex = 'Ů';
		System.out.println("ͨ����ʼ�����ʼ��sex");
	}
	
	//��̬��ʼ�����ʼ��age
	static {	//����ֱ��ִ������ִ����ִֻ��һ��
		age = 20;
		System.out.println("ͨ����̬��ʼ�����ʼ��age");
	}
	
	public void show(){
		System.out.println("������" + name + "���Ա�" + sex + "�����䣺" + age);
	}
		
	public static void main(String[] args) {
		//��������ʵ����
		MyPI piOb = new MyPI();
		//����show()����
		piOb.show();
		MyPI piOb2 = new MyPI();
	}
}
