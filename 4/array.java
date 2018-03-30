
// normal arrays
// dataType[] variable

public class array{
    public static void main(String[] args) {
                
        int[] intArr;
        intArr = new int[3];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        // or
        intArr = {1, 2, 3};

        // String array
        String[] strArr;
        strArr = {"a", "b", "c"};

        // 2d array
        int[][] _2dArr= {
            {1, 2, 3},
            {4, 1, 9},
            {1, 2, 1}
        };
        
        for (int[] row : _2dArr){
            for (int item : row){
                System.out.print(item + " ");
            }
            System.out.print("\n");
        }
    }
}