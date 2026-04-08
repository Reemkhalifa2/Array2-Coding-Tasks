public class lucky13 {
    public static Boolean lucky13(Integer[] nums) {
        for (Integer num: nums) {
            if (num == 1 || num== 3) {
                return false;
            }
        }
        return true;
    }
}
