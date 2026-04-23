package ilu2;

public class Welcome {

    public String welcome(String input) {

        if (input == null || (input = input.trim()).isEmpty()) {
            return "Hello, my friend";
        }

        String[] names = input.split(",");

        int upSize = 0, loSize = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(names[i].toUpperCase())) upSize++;
            else loSize++;
        }

        String[] upper = new String[upSize];
        String[] lower = new String[loSize];

        int j = 0, k = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(names[i].toUpperCase())) upper[j++] = names[i];
            else lower[k++] = names[i];
        }

        StringBuilder result = new StringBuilder();
        result.append(buildLowerGreeting(lower));
        result.append(buildUpperGreeting(upper, lower.length > 0));
        return result.toString();
    }

    private String capitalize(String s) {
        return new StringBuilder()
                .append(Character.toUpperCase(s.charAt(0)))
                .append(s.substring(1))
                .toString();
    }

    private String buildLowerGreeting(String[] lower) {
        if (lower.length == 0) return "";

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");

        if (lower.length == 1) {
            return sb.append(", ").append(capitalize(lower[0])).toString();
        }

        for (int i = 0; i < lower.length - 1; i++) {
            sb.append(", ").append(capitalize(lower[i]));
        }
        sb.append(" and ").append(capitalize(lower[lower.length - 1]));
        return sb.toString();
    }

    private String buildUpperGreeting(String[] upper, boolean hasLower) {
        if (upper.length == 0) return "";

        StringBuilder sb = new StringBuilder();
        if (hasLower) sb.append(". AND ");
        sb.append("HELLO");

        if (upper.length == 1) {
            return sb.append(", ").append(upper[0]).append(" !").toString();
        }

    
        for (int i = 0; i < upper.length - 1; i++) {
            sb.append(", ").append(upper[i]);
        }
        sb.append(" AND ").append(upper[upper.length - 1]).append(" !");
        return sb.toString();
    }
}