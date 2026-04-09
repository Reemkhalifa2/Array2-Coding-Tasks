import java.util.*;

class post4 {
    public static Integer[] post4(Integer[] nums) {
        Integer i = nums.length - 1;
        while(nums[i] != 4)
            i--;
        Integer[] a = new Integer[nums.length - i - 1];
        for(Integer j = 0; j < a.length; j++)
            a[j] = nums[i + j + 1];
        return a;
    }
}