package CPBook;

public class PathsInAGrid {
    public static void main(String[] args) {
        int n = 5;
        int[][] value = {



                {3, 7, 9, 2, 7},
                {9, 8, 3, 5, 5},
                {1, 7, 9, 8, 5},
                {3, 8, 6, 4, 10},
                {6, 3, 9, 7, 8}

//                {3,1,9,9},
//                {9,1,9,9},
//                {1,1,1,9},
//                {1,1,1,1}
        };
//{3, 7, 9, 2, 7},
//{9, 8, 3, 5, 5},
//{1, 7, 9, 8, 5},
//{3, 8, 6, 4, 10},
//{6, 3, 9, 7, 8}
        int[][] sum = new int[n][n];

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (x == 0 || y == 0) {
                    if (x == 0 && y == 0)
                        sum[y][x] = value[x][y];
                    else if (y == 0)
                        sum[y][x] = value[y][x] + sum[y][x-1];
                    else
                        sum[y][x] = value[y][x] + sum[y-1][x];
                }
                else {
                    sum[y][x] = Math.max(sum[y][x-1],sum[y-1][x])+value[y][x];
                }
            }
        }

        System.out.println(sum[n-1][n-1]);
    }
}
