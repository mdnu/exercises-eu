/* If the numbers 1 to 5 are written out in words: one, two, three, four, five, 
then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, 
how many letters would be used?
 */
 
class Problem17 {
	
	public static String regularExpression = "[^A-z]";
	
	public String numConvert(int number) {
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
	
	public int getStrCount(String numString) {
		numString = numString.toLowerCase().replaceAll(regularExpression, "");
		int stringCount = numString.length();
		return stringCount;
	}
	
	public int getFirstDigit(int number) {
		while (number > 9) {
			number/= 10;
		} return number;
	}
	
	public int temp(int i) {
		Problem17 im = new Problem17();
		int count = 0;
		switch (im.getFirstDigit(i)) {
			case 2: {
				String numString = im.numConvert(i%20);
				count+=im.getStrCount(numString) + 6;
				break;
			}
			case 3: {
				String numString = im.numConvert(i%30);
				count+=im.getStrCount(numString) + 6;
				break;
			}
			case 4: {
				String numString = im.numConvert(i%40);
				count+=im.getStrCount(numString) + 5;
				break;
			}
			case 5: {
				String numString = im.numConvert(i%50);
				count+=im.getStrCount(numString) + 5;
				break;
			}
			case 6: {
				String numString = im.numConvert(i%60);
				count+=im.getStrCount(numString) + 5;
				break;
			}
			case 7: {
				String numString = im.numConvert(i%70);
				count+=im.getStrCount(numString) + 7;
				break;
			}
			case 8: {
				String numString = im.numConvert(i%80);
				count+=im.getStrCount(numString) + 6;
				break;
			}
			case 9: {
				String numString = im.numConvert(i%90);
				count+=im.getStrCount(numString) + 6;
				break;
			}
		} return count;
	}
	
	public static void main(String[] args) {
		
		Problem17 im = new Problem17();
		int finCount = 0;
		for (int i=1;i<=19;i++) {
			String numString = im.numConvert(i);
			finCount+=im.getStrCount(numString);
		}
		for (int i=20;i<=99;i++) {
			finCount+=im.temp(i);
		}
		for (int i=100;i<=1000;i++) {
			if (i!=1000) {
				if ((i%100==0)) {
					String numString = im.numConvert(i/100);
					finCount+=im.getStrCount(numString)+7;
				} else {
					String hdStr = im.numConvert(im.getFirstDigit(i));
					String numString = im.numConvert(i%100);
					if ((i%100)<=19) {
						finCount+=im.getStrCount(numString)+
						im.getStrCount(hdStr)+10;
					} else if (((i%100)>=20)&&((i%100)<=99)) {
						finCount+=im.getStrCount(hdStr)+im.temp(i%100) + 10;
					}
				}
			} else {
				finCount+=11;
			}
		}
		System.out.println(finCount);
		
	}
	
}
