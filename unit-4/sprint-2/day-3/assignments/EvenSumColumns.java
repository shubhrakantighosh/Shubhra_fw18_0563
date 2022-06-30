public class EvenSumColumns {
    public void SumOfEvenColumns(int[][] matrix){
        for (int i=0;i<matrix.length;i++){
            int sum=0;
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]%2==0){
                    sum +=matrix[j][i];
                }
            }
            System.out.println(sum);
        }

    }
    public static void main(String[] args) {
        EvenSumColumns object=new EvenSumColumns();
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        object.SumOfEvenColumns(matrix);
    }
}
