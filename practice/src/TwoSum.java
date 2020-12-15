// import java.io.*;
import java.util.*;

public class TwoSum {

   public int[] twoSumIndexes(int[] nums, int target){
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (indexMap.containsKey(target - nums[i])){
                return new int[] {indexMap.get(target - nums[i]), i};
            }
            indexMap.put(nums[i], i);
        }
        return new int[] {-1, -1};
   }
  public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of input array: ");
        int size = s.nextInt();
        int[] elements = new int[size];
        System.out.println("Enter the elements of the array: ");  
        for(int i = 0; i < size; i++){  
            //reading array elements from the user   
            elements[i]=s.nextInt();  
        }
        System.out.println("Enter the target: ");
        int target = s.nextInt();
        TwoSum ts = new TwoSum();
        int[] sol = ts.twoSumIndexes(elements, target);
        System.out.println(Arrays.toString(sol));
        s.close();
   }
}