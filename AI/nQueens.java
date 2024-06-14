public class nQueens {
    public static int solutions=0;
    public static void printBoard(char board[][]){
        System.out.println("Chess board is:");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static boolean isSafe(char board[][],int row,int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<board[0].length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void queenplace(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            solutions++;
            return;
        }
        for(int j=0;j<board[0].length;j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                queenplace(board,row+1);
                board[row][j]='.';
            }
           
        }
        
    }
    public static void main(String[] args) {
        char board[][]=new char[8][8];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]='.';
            }
        }
        queenplace(board, 0);

        System.out.println("total solutions are"+ solutions);
    }   
    
}
