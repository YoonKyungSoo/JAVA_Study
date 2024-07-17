package zoo;

public class Cat extends Animal implements Runnable, Mammal{
	
	public Cat(String name, String gender, int age) {
		super(name, gender, age);
	}

	@Override
	void makeSomeNoise() {
		System.out.println("미야옹 냐옹 미옹");
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			makeSomeNoise();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}



