public class 作业 {
    /**
     * 力扣：709. 转换成小写字母
     * 输入: "Hello"
     * 输出: "hello"
     * <p>
     * 输入: "here"
     * 输出: "here"
     * <p>
     * 输入: "LOVELY"
     * 输出: "lovely
     *
     * @param str
     * @return
     */
    public static String myToLowerCase(String str) {
        if (str == null) {
            return null;
        }
        char[] tmp = str.toCharArray();
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] |= 32;
        }
        return String.valueOf(tmp);
    }

    /**
     * 189. 旋转数组
     * 输入: nums = [1,2,3,4,5,6,7], k = 3
     * 输出: [5,6,7,1,2,3,4]
     * 解释:
     * 向右旋转 1 步: [7,1,2,3,4,5,6]
     * 向右旋转 2 步: [6,7,1,2,3,4,5]
     * 向右旋转 3 步: [5,6,7,1,2,3,4]
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/rotate-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param nums
     * @param k
     */
    public static void rotate1(int[] nums, int k) {
        int[] tmp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            tmp[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            tmp[(i + k) % nums.length] = nums[i];
        }
    }

    private static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }
    }

    public static void rotate2(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        if (k == 0) {
            return;
        }
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(myToLowerCase("HELLO"));
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        rotate1(nums, 3);
        rotate2(nums, 3);
    }
}
