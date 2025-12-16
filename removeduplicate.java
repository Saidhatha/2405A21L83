import java.util.LinkedHashSet;
import java.util.Set;
public class removeduplicate {
    public static void main(String[] args) {
      int[] nums={1,1,2,3,4,4,4,6,7,9,9};
      Set<Integer>unique=new LinkedHashSet<>();
      for(int a:nums){
        unique.add(a);
      }
      System.out.println("unique elements"+unique);
    }
}