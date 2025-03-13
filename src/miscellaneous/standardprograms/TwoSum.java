package miscellaneous.standardprograms;

/*
    Given an array and a target variable, find the indices in array that sums to that
 */

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] TwoSumProblem(int[] arr,int target){
        // O(n^2) can be done by using two for loop
        // we can do hashmap in O(n) time

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int compliment = target - arr[i];
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,5,6,7};
        int target = 131;
        System.out.println(Arrays.toString(TwoSum.TwoSumProblem(array,target)));
    }
}
