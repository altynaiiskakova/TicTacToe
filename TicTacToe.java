public class TicTacToe {
    int[][] field;
    TicTacToe(){
        field = new int[3][3];
    }

    void print(){
        String gameBoard = "";
        for (int i=0; i< field.length; i++){
            for (int j=0; j< field.length; j++) {
                if (field[i][j] == 1) {
                    gameBoard= "o";
                }
                if (field[i][j] == 2) {
                    gameBoard= "x";
                }
                if (field[i][j] == 0) {
                    gameBoard = "_";
                }
                System.out.print("["+ gameBoard + "]");
            }
            System.out.println();
        }
        System.out.println();
    }

    boolean mark(int x, int y, int player){
        if (x>= field.length || y>=field.length){
            return false;
        }
        if (field[x][y] == 0){
            field[x][y] = player;
            return true;
        }else{
            return false;
        }
    }

    void reset() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = 0;
            }
        }
    }

    boolean wins(int player){
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == player && field[i][1] == player && field[i][2] == player) {
                System.out.println("Player " + player + "wins!!!");
                return true;
            }
        }
        for (int i = 0; i < field.length; i++) {
            if(field[0][i]==player && field[1][i]==player && field[2][i]==player){
                System.out.println("Player " + player + "wins!!!");
                return true;
            }
        }
        if((field[0][0]==player && field[1][1]==player && field[2][2]==player) || (field[0][2]==player && field[1][1]==player && field[2][0]==player)){
            System.out.println("Player " + player + " wins!!!");
            return true;
        }
        System.out.println("Keep going Player " + player + "! The winner will be known soon!");
        return false;
    }

    public static void main(String[] args){
        TicTacToe game = new TicTacToe();
        game.print();

        game.mark(0, 1, 1);
        game.print();
        game.wins(1);

        game.mark(0, 0, 2);
        game.print();
        game.wins(2);

        game.mark(2, 1, 1);
        game.print();
        game.wins(1);

        game.mark(1, 1, 2);
        game.print();
        game.wins(2);

        game.mark(2, 2, 2);
        game.print();
        game.wins(2);
        System.out.println();

        System.out.println("New game!");
        game.reset();
        game.print();

        game.mark(0,0,1);
        game.print();
        game.wins(1);

        game.mark(0,2,2);
        game.print();
        game.wins(2);

        game.mark(0,1,1);
        game.print();
        game.wins(1);

        game.mark(2,1,2);
        game.print();
        game.wins(2);

        game.mark(1,1,1);
        game.print();
        game.wins(1);

        game.mark(1,2,2);
        game.print();
        game.wins(2);

        game.mark(2,2,1);
        game.print();
        game.wins(1);
    }

}
