public class no14 {
    public static Boolean no14(Integer[] nums) {
        Boolean count1 = false;
        Boolean count4 = false;
        for (Integer num: nums) {
            if (num == 1){
                count1 = true;}
            if (num == 4){
                count4 = true;}

        }
        if(count1&&count4){
        return false;}
        return true;
    }
}
