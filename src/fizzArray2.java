public class fizzArray2 {
    public static String[] fizzArray2(Integer n) {
        String[] result = new String[n];

        for(Integer i = 0; i < n; i++) {
            result[i] = String.valueOf(i);
        }

        return result;
    }
}
