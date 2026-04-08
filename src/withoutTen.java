public class withoutTen {
    public static Integer[] withoutTen(Integer [] nums){
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 10) {
                    nums[index] = nums[i];
                    index++;
                }
            }
            for (int i = index; i < nums.length; i++) {
                nums[i] = 0;
            }

            return nums;

    }
}
