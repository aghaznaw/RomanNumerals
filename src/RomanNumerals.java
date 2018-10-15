
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		// To be Implemented
		
		int resultOfRomanToInt = 0;
	
		boolean foundIII = romanNum.contains("III");
		
		if(foundIII) {
			
			resultOfRomanToInt += 3;
			
		}else {
			
			boolean foundII = romanNum.contains("II");
			
			if(foundII) {
				
				resultOfRomanToInt += 2;
				
			}else {
				boolean foundIV = romanNum.contains("IV");
				
				if(foundIV) {
					
					resultOfRomanToInt += 4;
					
				}else {
					boolean foundIX = romanNum.contains("IX");
					
					if(foundIX) {
						
						resultOfRomanToInt += 9;
						
					}else {
						boolean foundI = romanNum.contains("I");
						
						if(foundI) {
							
							resultOfRomanToInt += 1;
							
						}
					}
				}
			}
		}
		
		boolean foundIX = romanNum.contains("IX");
		boolean foundXC = romanNum.contains("XC");
		
		
		if(!foundIX && !foundXC) {
			
			boolean foundXL = romanNum.contains("XL");
			if(foundXL) {
				
				resultOfRomanToInt += 40;
			}else {
					
				boolean foundXXX = romanNum.contains("XXX");
				if(foundXXX) {
					
					resultOfRomanToInt += 30;
				}else {
					
					boolean foundXX = romanNum.contains("XX");
					if(foundXX) {
						
						resultOfRomanToInt += 20;
					}else {
						boolean foundX = romanNum.contains("X");
						if(foundX) {
							
							resultOfRomanToInt += 10;
						}
					}
				}
			}	
		}
		
		
		boolean foundXL = romanNum.contains("XL");
		
		
		if(!foundXL) {
			boolean foundL = romanNum.contains("L");
			if(foundL) {
				
				resultOfRomanToInt += 50;
			}
			
		}
		
		boolean foundCD = romanNum.contains("CD");
		boolean foundDC1 = romanNum.contains("DC");
		boolean foundCM = romanNum.contains("CM");
		if(!foundCD && !foundDC1 && !foundCM) {
			boolean foundXC1 = romanNum.contains("XC");
			if(foundXC1) {
				
				resultOfRomanToInt += 90;
			}else {
				
				boolean foundCCC = romanNum.contains("CCC");
				if(foundCCC) {
					
					resultOfRomanToInt += 300;
				}else {
							
					boolean foundCC = romanNum.contains("CC");
					if(foundCC) {
						
						resultOfRomanToInt += 200;
					}else {
						boolean foundC = romanNum.contains("C");
						if(foundC) {
							
							resultOfRomanToInt += 100;
						}
					
					}
				}
			}
		}		
		
		boolean foundXC1 = romanNum.contains("CD");
		if(foundXC1) {
			
			resultOfRomanToInt += 400;
		}else {
			
			boolean foundDCCC = romanNum.contains("DCCC");
			if(foundDCCC) {
				
				resultOfRomanToInt += 800;
			}else {
						
				boolean foundDCC = romanNum.contains("DCC");
				if(foundDCC) {
					
					resultOfRomanToInt += 700;
				}else {
					boolean foundDC = romanNum.contains("DC");
					if(foundDC) {
						
						resultOfRomanToInt += 600;
					}else {
						boolean foundD = romanNum.contains("D");
						if(foundD) {
							
							resultOfRomanToInt += 500;
						}
					}
				}
			}
		}
		
		boolean foundCM1 = romanNum.contains("CM");
		if(foundCM1) {
			
			resultOfRomanToInt += 900;
		}else {
			for(int i = 0; i < romanNum.length(); i++) {
				
				if(romanNum.charAt(i) == 'M') {
					resultOfRomanToInt += 1000;  
				}
			}
			
		}
		
		return resultOfRomanToInt;
	}
}
