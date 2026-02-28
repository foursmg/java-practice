public class G4_multiDimensionArray {
    public static void main(String[]args){
        //multi dimension array - 2d array
        int[][] a= new int[3][4]; //total elements- 3*4=12
        //3-d array
        int[][][] b= new int[3][4][2]; // total 24 elements

        //initialization of 2-d array // jagged array
        //below is jagged array, not a normal 2-d array
        //total element 7, not 9
        int[][] c= {
                   {3,4,5},
                   {43,-21,0},
                   {7}
                   };
        //first row : 3  5  3
        //2nd         23 54 23
        //3rd         4

        // to calculate the number of rows in 2-d array
        System.out.println("Number of rows in an array: "+c.length);

        //calculate length/elements of particular row
        System.out.println("Number of element in 2nd row: "+c[0].length);
        System.out.println("Number of element in 3rd row: "+c[1].length);

        System.out.println(c[1][1]);

        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}
//in 2-d array
// arr.length -> number of rows
// arr[i].length -> no. of elements in that particular row