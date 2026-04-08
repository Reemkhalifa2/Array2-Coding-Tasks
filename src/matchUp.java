public class matchUp {
    public static Integer matchUp(Integer[] nums1 , Integer[] nums2){
        Integer count = 0;
        for(Integer num1:nums1){
            for (Integer num2:nums2){
                if(num1 != num2 && Math.abs(num1 - num2) <= 2){
                    count++;
                }
            }
        }
        return count;
    }
}
