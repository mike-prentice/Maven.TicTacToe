package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private final Character[][] game;


    public Board(Character[][] matrix) {
        game = matrix;
    }


    public Boolean isInFavorOfX() {
        if (game[0][0] == 'X' && game[0][1] == 'X' && game[0][2] == 'X') {

        } else if (game[1][0] == 'X' && game[1][1] == 'X' && game[1][2] == 'X') {
            return true;
        } else if (game[2][0] == 'X' && game[2][1] == 'X' && game[2][2] == 'X') {
            return true;
        } if (game[0][0] == 'X' && game[1][1] == 'X' && game[2][2] == 'X') {
            return true;
        } else if (game[2][0] == 'X' && game[1][1] == 'X' && game[0][2] == 'X') {
            return true;
        } else if (game[0][0] == 'X' && game[1][0] == 'X' && game[2][0] == 'X') {
            return true;
        } else if (game[0][1] == 'X' && game[1][1] == 'X' && game[2][1] == 'X') {
            return true;
        } else return game[0][2] == 'X' && game[1][2] == 'X' && game[2][2] == 'X';
    }


    public Boolean isInFavorOfO() {

        if (game[0][0] == 'O' && game[0][1] == 'O' && game[0][2] == 'O') {
            return true;
        } else if (game[1][0] == 'O' && game[1][1] == 'O' && game[1][2] == 'O') {
            return true;
        } else if (game[2][0] == 'O' && game[2][1] == 'O' && game[2][2] == 'O') {
            return true;
        } else if (game[0][0] == 'O' && game[1][1] == 'O' && game[2][2] == 'O') {
            return true;
        } else if (game[2][0] == 'O' && game[1][1] == 'O' && game[0][2] == 'O') {
            return true;
        } else if (game[0][0] == 'O' && game[1][0] == 'O' && game[2][0] == 'O') {
            return true;
        } else if (game[0][1] == 'O' && game[1][1] == 'O' && game[2][1] == 'O') {
            return true;
        } else return game[0][2] == 'O' && game[1][2] == 'O' && game[2][2] == 'O';
    }


    public Boolean isTie() {

        return !isInFavorOfX() && !isInFavorOfO();
    }

    public String getWinner() {
        if (isInFavorOfX()) {
            return "X";
        } else if (isInFavorOfO()) {
            return "O";
        } else {
            return "";
        }
    }
}


//init game state......no winner, plyer x winner, player o winner. change game state based on that. boolean?
