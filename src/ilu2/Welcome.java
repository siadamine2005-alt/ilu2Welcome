package ilu2;

public class Welcome {

	public String welcome(String input) {

		if (input == null || (input = input.trim()).isEmpty()) {
			return "Hello, my friend";
		}

		String[] names = input.split(",");
		StringBuilder loOutput = new StringBuilder();
		StringBuilder upOutput = new StringBuilder();

		int upSize = 0;
		int loSize = 0;

		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(names[i].toUpperCase())) {
				upSize++;
			} else {
				loSize++;
			}
		}

		String upper[] = new String[upSize];
		String lower[] = new String[loSize];

		int j = 0, k = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(names[i].toUpperCase())) {
				upper[j] = names[i];
				j++;
			} else {
				lower[k] = names[i];
				k++;
			}
		}

		if (lower.length > 1) {
			loOutput.append("Hello");

			for (int i = 0; i < lower.length - 1; i++) {
				loOutput.append(", ").append(Character.toUpperCase(lower[i].charAt(0))).append(lower[i].substring(1));
			}

			loOutput.append(" and ").append(Character.toUpperCase(lower[lower.length - 1].charAt(0)))
					.append(lower[lower.length - 1].substring(1));

		}else {
			if(lower.length != 0) loOutput.append("Hello, ").append(Character.toUpperCase(lower[0].charAt(0))).append(lower[0].substring(1));
		}

		if (lower.length != 0 && upper.length != 0) upOutput.append(". AND ");
		if(upper.length != 0) upOutput.append("HELLO");
		if (upper.length > 1) {

			upOutput.append(", ").append(upper[0]);
			
			for (int i = 1; i < upper.length - 1; i++) {
				upOutput.append(", ").append(upper[i]);
			}

			upOutput.append(" AND ").append(upper[upper.length - 1]).append(" !");

		}else {
			if(upper.length != 0) upOutput.append(", ").append(upper[0]).append(" !");
		}

		loOutput.append(upOutput);

		return loOutput.toString();

	}

}
