package zoo;

public class UpaRupa extends Animal implements Runnable{

	public UpaRupa(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	@Override
	void makeSomeNoise() {
		System.out.println("삑삑삑");
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
