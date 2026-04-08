import com.sun.source.tree.BreakTree;

public class only14 {
    public static Boolean only14(Integer [] nums){
        Boolean found = true;
        for(Integer num:nums){
            if(!(num == 4 || num == 1)){
                found = false;
            }


        }

        return found;
    }
}
