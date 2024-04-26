package labs;

public class Lab3 {

	public static void main(String[] args) {
	
	int[] nums = {1, 5, 2, 8, 13, 6};
	
	System.out.println(nums[0]);
	System.out.println(nums[nums.length-1]);
	//System.out.println(nums[6]);
	//System.out.println(nums[-1]);
	
	for (int i = 0; i < nums.length; i++) {
		System.out.println(nums[i]);
	}
	for(int num : nums) {
		System.out.println(num);
	}
	
	int sum = 0;
	for (int num : nums) {
		sum += num;
	} System.out.println(sum);
	
	int average = sum/nums.length; 
	System.out.println(average);
	
	for(int num : nums) {
		if (num % 2 == 1) {
			System.out.println(num);
		}
	}
	
	}
}
	
	
