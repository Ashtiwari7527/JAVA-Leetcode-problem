package Array;

public class problem_07 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 1, 3};

        int answer = goodpairs(nums);
        System.out.println(answer);
    }


    static int goodpairs(int[] pairs) {
        int count = 0;

        for (int i = 0; i < pairs.length; i++) {
            for (int j = i+1; j<pairs.length; j++) {

                if (pairs[i] == pairs[j] && j > i) {
                    count++;
                }

            }
        }

        return count;
    }
}