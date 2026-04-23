package ilu2;

public class Welcome {
	
	public String welcome(String input) {
		
		if( input == null|| input.isBlank() || input.isEmpty()) {
			return "Hello, my friend";
		}
			
			
		StringBuilder output = new StringBuilder();
		output.append("Hello, ");
		
		if (Character.isLowerCase(input.charAt(0))) {
			output.append(Character.toUpperCase(input.charAt(0)));
			output.append(input.substring(1));
		}else {
			output.append(input);			
			if(input.equals(input.toUpperCase())) {
				output.append(" !");
			}
		}
		
		return output.toString();
	}
	
}
