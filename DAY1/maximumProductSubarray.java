public class maximumProductSubarray {
    

    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // If current number is negative, swap
            if (nums[i] < 0) {
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }

            // Update max and min ending at index i
            maxEndingHere = Math.max(nums[i], nums[i] * maxEndingHere);
            minEndingHere = Math.min(nums[i], nums[i] * minEndingHere);

            // Update global maximum
            maxProduct = Math.max(maxProduct, maxEndingHere);
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray = " + maxProduct(arr));
    }
}

