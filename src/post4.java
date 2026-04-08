import java.util.*;

class post4 {
    public static Integer[] post4(Integer[] nums) {
        Integer four = -1;
        for (Integer i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                four = i;
            }
        }

        Integer size = nums.length - four - 1;
        Integer[] result = new Integer[size];
        for (Integer i = 0; i < size; i++) {
            result[i] = nums[four + 1 + i];
        }

        return result;
    }
}