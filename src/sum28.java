public class sum28 {
    public Boolean sum28(Integer[] nums){
        Integer sum = 0;
        for(Integer num:nums){
            if (num==2){
                sum +=num;
            }
        }
        return sum == 8;
    }
}
