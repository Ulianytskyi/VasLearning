package Vas05_Arrays;

public class Show2DArrayApplication {
    static void show(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] alpha = {{1,2,3},{4,5,6}};
        int[][] bravo = {{34,45,66},{77,78},{92,97,100,112}};
        System.out.println("Array \"ALPHA\":");
        show(alpha);
        System.out.println("Array \"BRAVO\":");
        show(bravo);
    }
}
