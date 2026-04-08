public class countEvens {
    public Integer countEvens(Integer [] nums){
        Integer count=0;
        for(Integer num : nums){
            if (num % 2 == 0) {
                count++;
            }

        }
        return count;
    }
}
