package test4;

public class Test410 {
	public static void main(String[] args){
		String[] target = new String[4];
		String[] generate = new String[4];
		for(int i = 10; i <= 99; i++){
			if(i % 100 == 0) continue;
			for(int j = i; j <= 99; j++){
				int targetNum = i * j;
				if(targetNum > 9999 || targetNum < 1000){
					continue;
				}
				target = String.valueOf(targetNum).split("");
				String generateString = String.valueOf(i) + String.valueOf(j);
				generate = generateString.split("");
				java.util.Arrays.sort(target); 
				java.util.Arrays.sort(generate);
				if (java.util.Arrays.equals(target, generate)){
					System.out.println(targetNum + "=" + i + "*" + j);
				}else{
					continue;
				}
				
			}
			
		}
	}
}
