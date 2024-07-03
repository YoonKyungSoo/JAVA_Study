package zoo;

public class Otter extends Animal implements Mammal{
	
	public Otter(String name, String gender, int age) {
		super(name, gender, age);
	}

	@Override
	void makeSomeNoise() {
		System.out.println("쯔끄에이이익");
	}
	
	@Override
	public void breed() {
		System.out.println("물가에 안전한 자리를 찾아 끙 하고 낳는다.");
	}
}
