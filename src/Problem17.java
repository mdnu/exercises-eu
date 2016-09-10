/** 
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, 
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, 
 * how many letters would be used?
 */
 
public class Problem17 {
	public static String regularExpression = "[^A-z]";
	
	public static String numConvert(int number) {
		String numString = "";

		if (number < 10) {
			switch (number) {
				case 1: numString = "one";
						break;
				case 2: numString = "two";
						break;
				case 3: numString = "three";
						break;
				case 4: numString = "four";
						break;
				case 5: numString = "five";
						break;
				case 6: numString = "six";
						break;
				case 7: numString = "seven";
						break;
				case 8: numString = "eight";
						break;
				case 9: numString = "nine";
			}
		} else if ((number>=10)&&(number<=19)) {
			switch (number) {
				case 10: numString = "ten";
						break;
				case 11: numString = "eleven";
						break;
				case 12: numString = "twelve";
						break;
				case 13: numString = "thirteen";
						break;
				case 14: numString = "fourteen";
						break;
				case 15: numString = "fifteen";
						break;
				case 16: numString = "sixteen";
						break;
				case 17: numString = "seventeen";
						break;
				case 18: numString = "eighteen";
						break;
				case 19: numString = "nineteen";
						break;
			}
		} 
		return numString;
	}
	
	public static int getStrCount(String numString) {
		numString = numString.toLowerCase().replaceAll(regularExpression, "");
		int stringCount = numString.length();
		return stringCount;
	}
	
	public static int getFirstDigit(int number) {
		while (number > 9) {
			number/= 10;
		} 
		return number;
	}
	
	public static int temp(int i) {
		int count = 0;
		
		switch (getFirstDigit(i)) {
			case 2: {
				String numString = numConvert(i%20);
				count+=getStrCount(numString) + 6;
				break;
			}
			case 3: {
				String numString = numConvert(i%30);
				count+=getStrCount(numString) + 6;
				break;
			}
			case 4: {
				String numString = numConvert(i%40);
				count+=getStrCount(numString) + 5;
				break;
			}
			case 5: {
				String numString = numConvert(i%50);
				count+=getStrCount(numString) + 5;
				break;
			}
			case 6: {
				String numString = numConvert(i%60);
				count+=getStrCount(numString) + 5;
				break;
			}
			case 7: {
				String numString = numConvert(i%70);
				count+=getStrCount(numString) + 7;
				break;
			}
			case 8: {
				String numString = numConvert(i%80);
				count+=getStrCount(numString) + 6;
				break;
			}
			case 9: {
				String numString = numConvert(i%90);
				count+=getStrCount(numString) + 6;
				break;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int finCount = 0;
		
		for (int i=1;i<=19;i++) {
			String numString = numConvert(i);
			finCount+=getStrCount(numString);
		}
		
		for (int i=20;i<=99;i++) {
			finCount+=temp(i);
		}
		
		for (int i=100;i<=1000;i++) {
			if (i!=1000) {
				if ((i%100==0)) {
					String numString = numConvert(i/100);
					finCount+=getStrCount(numString)+7;
				} else {
					String hdStr = numConvert(getFirstDigit(i));
					String numString = numConvert(i%100);
					
					if ((i%100)<=19) {
						finCount+=getStrCount(numString)+
						getStrCount(hdStr)+10;
					} else if (((i%100)>=20)&&((i%100)<=99)) {
						finCount+=getStrCount(hdStr)+temp(i%100) + 10;
					}
				}
			} else {
				finCount+=11;
			}
		}
		System.out.println(finCount);
	}
}
