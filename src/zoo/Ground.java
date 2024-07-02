package zoo;

public class Ground {
	public static void main(String[] args) {
		//서로 다른 종류의 동물 세마리 울게하기
		Australopithecus australopithecus = new Australopithecus();
		FourFiveJung fourFiveJung = new FourFiveJung();
		Lizard lizard = new Lizard();
		
		australopithecus.makeSomeNoise();
		fourFiveJung.makeSomeNoise();
		lizard.makeSomeNoise();
		
		Animal[] cage = {
				new Australopithecus(),
				new FourFiveJung(),
				new Lizard()
		};
		
		while(true) {
			for (int i = 0; i < cage.length; i++) {
				cage[i].makeSomeNoise();
			}
		}
		
	}
}




