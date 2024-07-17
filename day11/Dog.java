package zoo;

public class Dog extends Animal implements Runnable, Mammal{

	public Dog(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	@Override
	void makeSomeNoise() {
		System.out.println("웡우어커어워우어엉퀑웡");
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
