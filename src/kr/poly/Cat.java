package kr.poly;

public class Cat extends Animal{
//	public void eat() {
//		System.out.println("고양이가 먹다.");
//	}
	public void night() {
		System.out.println("밤에 눈에서 빛이 난다.");
	}

	@Override
	public void eat() {
//		super.eat();
		System.out.println("고양이가 먹다.");
		
	}
	
	
}
