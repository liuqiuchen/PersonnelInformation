package com.personnelInformation;
/** 声明变量name
// 声明变量sex
// 声明静态变量age

（打印）
通过构造方法初始化name
通过初始化块初始化sex
通过静态初始化块初始化age

（先不做下面的运行一下程序观察效果）
show()方法打印出姓名、性别、年龄

/*main方法调用对象的show方法*/

public class MyPI {
	String name;
	char sex;
	static int age;
	
	//构造函数初始化name
	public MyPI(){
		name = "LQC";
		System.out.println("通过构造方法初始化name");
	}
	
	//初始化块初始化sex
	{
		sex = '女';
		System.out.println("通过初始化块初始化sex");
	}
	
	//静态初始化块初始化age
	static {	//程序直接执行最先执行且只执行一次
		age = 20;
		System.out.println("通过静态初始化块初始化age");
	}
	
	public void show(){
		System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age);
	}
		
	public static void main(String[] args) {
		//创建对象，实例化
		MyPI piOb = new MyPI();
		//调用show()方法
		piOb.show();
		MyPI piOb2 = new MyPI();
	}
}
