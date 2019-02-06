public class Test {
	public static void main(String[] args){
		Person taro = new Person();
		taro.name= " 山田太郎";
		taro.age=20;
		taro.phoneNumber="080-5511-0011";
		taro.address="東京";
		taro.talk();
		taro.walk();
		taro.run();

	System.out.println(taro.name);
	System.out.println(taro.age);
	System.out.println(taro.phoneNumber);
	System.out.println(taro.address);

	Person jiro = new Person();
	jiro.name= " 木村次郎";
	jiro.age=18;
	jiro.phoneNumber="080-1122-3344";
	jiro.address="神奈川";
	jiro.talk();
	jiro.walk();
	jiro.run();

System.out.println(jiro.name);
System.out.println(jiro.age);
System.out.println(jiro.phoneNumber);
System.out.println(jiro.address);

Person hanako = new Person();
hanako.name= " 鈴木花子";
hanako.age=16;
hanako.phoneNumber="080-5566-7788";
hanako.address="千葉";
hanako.talk();
hanako.walk();
hanako.run();

System.out.println(hanako.name);
System.out.println(hanako.age);
System.out.println(hanako.phoneNumber);
System.out.println(hanako.address);

Person ryuya = new Person();
ryuya.name= " 山本竜也";
ryuya.age=23;
ryuya.phoneNumber="080-5536-7403";
ryuya.address="東京";
ryuya.talk();
ryuya.walk();
ryuya.run();

System.out.println(ryuya.name);
System.out.println(ryuya.age);
System.out.println(ryuya.phoneNumber);
System.out.println(ryuya.address);

Robot aibo = new Robot();
aibo.name="aibo";
aibo.talk();
aibo.walk();
aibo.run();

Robot asimo = new Robot();
asimo.name="asimo";
asimo.talk();
asimo.walk();
asimo.run();

Robot pepper = new Robot();
pepper.name="pepper";
pepper.talk();
pepper.walk();
pepper.run();

}}
