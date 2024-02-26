package chap06.ex06;

public class Cast {

	public static void main(String[] args) {
		
		
		// 다형성에 의해서 Dog 와 Cat 은 부모 형태인 Mammal 안으로 들어갈 수 있다.
		Mammal mal = new Dog();
		mal.birth(); // 오버라이드 된 메서드는 내가 변경했다 하더라도 부모것이라 사용 가능
		mal.eat(); // 원래 부모의 메서드는 사용 가능
		//mal.bark(); // 하지만 내 고유의 메서드는 사용 불가.
		
		Dog dog = (Dog) mal; // 부모 형태에서 자식 형태로 되돌아 온다.
//		Cat cat = (Cat) mal; 되돌아갈때 원래 형태를 잘 기억해서 되돌아가자.
		
		dog.bark();
		
		mal = new Cat();
		mal.birth();
		mal.eat();
		
		Cat cat = (Cat) mal;
		cat.mew();
		
		
		
		
	}

}
