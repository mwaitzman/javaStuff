/*
Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with these additional constraints: all multiples of 5 in the array must be included in the group. If the value immediately following a multiple of 5 is 1, it must not be chosen. (No loops needed.)
*/
public class GroupSum5 {
  public static void main(String[] args) {

  }
  public static boolean groupSum5(int start, int[] nums, int target) {
    ifn
  }
}
/*first attempt (with iteration)
public boolean groupSum5(int start, int[] nums, int target) {
  LinkedList<Integer> numList = new LinkedList<Integer>(nums.length);
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 5 == 0) {
      if (i > nums.length || nums[i+1] != 1) {
        target -= nums[i];
      }
    }
    else {
      numList.add(nums[i]);
    }
  }
  if (target < 0) {return false;}
  int temp;
  nums = numList.stream().mapToInt(i->i).toArray();
  for(int i = 0; i < nums.length; i++) {
    temp = 0;
    for(int j = i; j < nums.length; j++) {
      for (int k = j; k < nums.length; k++) {
        if (nums[k] + temp == target) {
          return true;
        }
        else if (nums[k] + temp > target) {
          //k++;
        }
        else {
          temp += nums[k];
        }
      }
    }
  }
  return false;
}
*/
