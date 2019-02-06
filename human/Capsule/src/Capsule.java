
public class Capsule {
	public static void main(String[] args){
		Person taro = new Person("山田太郎",20);
		System.out.println(taro.getName());

		taro.setName("花子");
		System.out.println(taro.getName());



		Person inu = new Person("犬",3);
		System.out.println(inu.getAge());

		inu.setAge(30);
		System.out.println(inu.getAge());

	}

}
