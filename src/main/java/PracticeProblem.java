public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(recaman(6));
	}

	public static int[] recaman(int n) {

		if (n == 1) {
			return new int[]{n};
		}
		if (n <= 0){
			return new int[]{};
		}

		int[] nums = new int[n];
		nums[0] = 1;
		nums[1] = 3;

		recamanHelper (n, nums, 2);
		return nums;

	}

	public static void recamanHelper (int n, int[] nums, int index) {
		if (index >= n){
			return;
		}

		int pre = nums[index - 1];
		int next = pre - (index + 1);

		if (next > 0 && !contains(nums, index, next)) {
			nums[index] = next;
		} else {
			nums[index] = pre + index + 1;
		}

		recamanHelper(n, nums, index + 1);
	}

	private static boolean contains(int[] arr, int length, int value) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == value) return true;
        }
        return false;
    }
}
