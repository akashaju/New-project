public class project {
    public static void main(String[] args) {
        int r =3;
        int c = 3;
        int[][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;

        for (int i = 0;i < r;i++){
            for (int j =0; j< c;j++) {
                if (matrix[i] == matrix[j]) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
