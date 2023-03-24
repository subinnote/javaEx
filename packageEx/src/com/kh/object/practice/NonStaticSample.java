package com.kh.object.practice;

public class NonStaticSample {
	
	
	
	public void printLottoNumbers() {
		int[] numbers = new int[6];
		int random = 0;
		
		for(int i = 0; i<6; i++) {
			while(true) {
				random = (int)(Math.random() * 45 + 1);
				System.out.printf("%d", random);
				
				if(random == 0) {
					continue;
				}
				for(int j = 0; j<5; j++) {
					if(random == numbers[i]) {
						continue;
					}
				}break;
			}numbers[i] = random;
		}
		}
	public void outputChar(int num, char c) {
		
	}
	public char alphabette() {
		return 0;
	}
	public String mySubstring(String str, int index1, int index2) {
		return null;
	}
	
	
}
