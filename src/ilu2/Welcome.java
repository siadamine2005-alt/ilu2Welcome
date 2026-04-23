package ilu2;

public class Welcome {

	public String welcome(String input) {

		if (input == null || (input = input.trim()).isEmpty()) {
			return "Hello, my friend";
		}

		String[] names = input.split(",");
		StringBuilder output = new StringBuilder();
		output.append("Hello");
		for (int i = 0; i < names.length; i++) {
			output.append(", ");
			if (Character.isLowerCase(names[i].charAt(0))) {
				output.append(Character.toUpperCase(names[i].charAt(0)));
				output.append(names[i].substring(1));
			} else {
				output.append(names[i]);
				if (names[i].equals(names[i].toUpperCase())) {
					output.append(" !");
				}
			}

		}
		return output.toString();
	}

}
