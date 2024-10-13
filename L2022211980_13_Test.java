public class L2022211980_13_Test {
// 测试用例设计的总体原则：
    // 1. 等价类划分原则：将输入数据划分为包含所有颜色、仅包含部分颜色、空数组等类别。
    // 2. 边界值分析原则：选择数组长度的边界值，如空数组、单元素数组等。
    // 3. 错误猜测原则：考虑异常情况，如输入数组中的元素不在预期范围内。

    // 测试目的：验证Solution13方法能够正确排序包含红色、白色和蓝色的数组
    public static void test1() {
        Solution13 solution = new Solution13();
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums1);
        // 打印排序后的数组
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
        
    }
    
    // 测试目的：验证Solution13方法能够正确排序包含红色、白色和蓝色的数组
    public static void test2() {
        Solution13 solution = new Solution13();
        int[] nums2 = {2, 0, 1};
        solution.sortColors(nums2);
        // 打印排序后的数组
        for (int num : nums2) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

    // 测试目的：验证Solution13方法能够正确处理只包含红色和白色的数组
    public static void test3() {
        Solution13 solution = new Solution13();
        int[] nums3 = {0, 1, 0, 1};
        solution.sortColors(nums3);
        // 打印排序后的数组
        for (int num : nums3) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 测试目的：验证 sortColors 方法能够正确处理空数组,不会报错
    public static void test4() {
        Solution13 solution = new Solution13();
        int[] nums4 = {};
        solution.sortColors(nums4);
        // 打印排序后的数组
        for (int num : nums4) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {

        test1();
        test2();
        test3();
        test4();

    }
}
