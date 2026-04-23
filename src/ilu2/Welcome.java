package ilu2;

public class Welcome {

	public String welcome(String input) {

		if (input == null || (input = input.trim()).isEmpty()) {
			return "Hello, my friend";
		}

		String[] names = input.split(",");
		StringBuilder output = new StringBuilder();
		StringBuilder end = new StringBuilder();
		output.append("Hello");
		for (int i = 0; i < names.length; i++) {
			if (Character.isLowerCase(names[i].charAt(0))) {
				output.append(", ").append(Character.toUpperCase(names[i].charAt(0))).append(names[i].substring(1));
			} else {
				if (names[i].equals(names[i].toUpperCase())) {
					if(names.length == 1) {
						end.append("HELLO, ").append(names[i]).append(" !");
						return end.toString();
					}
					end.append(". AND HELLO, ").append(names[i]).append(" !");
				}else {					
					output.append(names[i]);
				}
			}
		}
		output.append(end);
		return output.toString();
	}

}
