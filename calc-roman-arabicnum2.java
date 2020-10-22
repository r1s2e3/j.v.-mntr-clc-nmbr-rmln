package library.util;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

 
public class RomanNumeral {

    private final String representation;
    private final int value;

    private RomanNumeral(String representation, int value) {
        this.representation = representation;
        this.value = value;
    }

    @Override
    public String toString() {
        return representation;
    }

    public int getValue() {
        return value;
    }

    public static RomanNumeral of(String representation) throws
            NumberFormatException,
            ArithmeticException {
        // Zero wasn't supported then...
        if (representation.isEmpty()) {
            throw new NumberFormatException("Empty String.");
        }
        int value = 0, previous = 0;
        StringBuilder builder = new StringBuilder(representation);
        builder.reverse();  // go in the opposite manner
        for (int i = 0; i < builder.length(); i++) {
            try {
                int current = map.get(String.valueOf(builder.charAt(i)));
                // If the value suddenly drops then subtract, don't add.
                value += current < previous ? -current : current;
                previous = current;
            } catch (NullPointerException e) {
                // A NullPointerException will be thrown only if the
                // character is not present in the map.
                throw new NumberFormatException
                        ("Unrecognised character : " + builder.charAt(i));
            }
        }
        // calling representationOf() makes sure that "IIIII" becomes "V".
        return new RomanNumeral(representationOf(value), value);
    }

    public static RomanNumeral valued(int value) {
        return new RomanNumeral(representationOf(value), value);
    }

    public static String representationOf(int value)
            throws ArithmeticException {
        // The valid range is (0, 5000)
        if (value <= 0 || value >= 5_000) {
            throw new ArithmeticException("Unsupported value : " + value);
        }
        int copy = value;
        StringBuilder builder = new StringBuilder(10);  // 4999 gives 10 chars
        // The descending order is maintained
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int v = entry.getValue();
            String k = entry.getKey();
            while (copy >= v) {
                copy -= v;
                builder.append(k);
            }
        }
        return builder.toString();
    }

    private static final Map<String, Integer> map;

    static {
         
    }

}