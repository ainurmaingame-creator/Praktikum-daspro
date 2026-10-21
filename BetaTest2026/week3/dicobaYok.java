public class dicobaYok {
    public static void main(String[] args) {
        
        int[][] nilai = {
            {22, 12, 30},
            {32, 21, 3},
            {44, 55, 66}
        };
        //System.out.println(nilai[2][3]);

        int[][] myNumbers = {
            {1, 2, 3, 4},
            {11, 22, 33},
            {21, 12, 31, 32}
        };

        for (int row = 0; row < myNumbers.length; row++) {
            for (int col = 0; col < myNumbers[row].length; col++) {
                System.out.print(myNumbers[row][col] + " ");
            
            }
            System.out.println();
        } 
    }
}
