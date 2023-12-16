package Arrays;



public class printSpiral {
    public static  void display(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void Spiral(int[][]a,int r,int c){
        int topRow = 0 , bottomRow = r-1, leftCol = 0,rightCol = c-1;
        int totalElements = 0;

        while(totalElements < r * c){
            //topRow -> leftCol to rightCol
            for(int j = leftCol ; j <= rightCol && totalElements < r * c ; j++){
                System.out.print(a[topRow][j]+" ");
                totalElements++;
            }
            topRow++;

            //rightCol -> topRow to bottomRow
            for(int i = topRow ; i <=bottomRow && totalElements < r * c ;i++){
                System.out.print(a[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            //bottomRow -> rightCol to leftCol

            for(int j = rightCol ; j >= leftCol && totalElements < r * c ;j--){
                System.out.print(a[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            //leftCol -> bottomRow to topRow
            for(int i = bottomRow ; i >= topRow  && totalElements < r * c ; i--){
                System.out.print(a[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int r  = arr.length;
        int c = arr[0].length;
        System.out.println("Origina :");
        display(arr);
        System.out.println("Spiral :");
        Spiral(arr, r, c);
        // List<Integer> s = Spiral(arr, r, c);
        // System.out.println(s);

    }
}
