public class more14 {
    public Boolean more14(Integer [] nums){
        Integer count1 = 0;
        Integer count4 = 0;
        for(Integer num:nums){
            if(num==1){
                count1++;
            }
            if(num==4){
                count4++;
            }
        }
        return count1>count4;
    }
}
