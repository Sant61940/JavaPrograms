package Little_Complex;

public class NextGreateElement {
    public static void main(String[] args) {
        int[] inputArray = {4, 5, 2, 25};
        int[] result = findNextGreaterElements(inputArray);

        System.out.println("Input Array: [4, 5, 2, 25]");
        System.out.println("Next Greater Elements:");

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static  int[] findNextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = findNextGreater(nums, i);
        }

        return result;
    }

    private static int findNextGreater(int[] nums, int index) {
        int nextGreater = -1;
//(4,0);(5,1);(2,2);(25,3)
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] > nums[index]) {
                nextGreater = nums[i];
                break;  // Found the next greater element, exit loop
            }
        }

        return nextGreater;
    }
}
