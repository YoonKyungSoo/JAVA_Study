package collection;

import java.util.HashSet;

public class HSetTest1 {
	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet<>();

		// HashSet에 요소 추가하기
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(40);
		hset.add(50);
		hset.add(60);
		hset.add(10);

		// HashSet 간단하게 구조 파악하기
		System.out.println(hset);

		// hashSet의 요소 개수
		for (int i = 0; i < hset.size(); i++) {
//			System.out.println(hset.get(i));
		}
		// HashSet의 요소 포함 여부 확인하기
		System.out.println(hset.contains(70));

		// HashSet의 요소 삭제하기
		hset.remove(20);
		System.out.println(hset);
	}

}
