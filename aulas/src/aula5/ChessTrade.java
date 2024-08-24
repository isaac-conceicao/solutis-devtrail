package aula5;

public class ChessTrade {
    public static void main(String[] args) {
        final int SIZE = 8;
        long[][] paymentTable = new long[SIZE][SIZE];
        long previous = paymentTable[0][0] = 1;

        for(int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if (i == 0 && j == 0){
                    continue;
                } else {
                    previous *= 2;
                    paymentTable[i][j] = previous;
                }
                System.out.println("matrix["+ i +"]["+ j +"] ="+previous);
            }
        }
    }
}
