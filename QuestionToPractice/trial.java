package QuestionToPractice;

import java.util.ArrayList;

public class trial {

	public static void main(String[] args) {
		
		String op = "lor,em, ip,sum, lor,em, ipsum";
		
		String output[] = op.split(" ");
		ArrayList<String> list = new ArrayList<>();
		
		 int start = 0;
		 //int count = 0;
		 for (int i = 0; i < output.length; i++) {
			 String s[] = output[i].split("\\b");
			 for (int j = 0; j < s.length; j++) {
				list.add(s[j]);
			}
		}
		 
		 for(String ss : list) {
			 System.out.println(ss);
		 }
		
	}
	
}
