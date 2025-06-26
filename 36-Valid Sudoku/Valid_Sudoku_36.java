import java.util.HashSet;


public class Valid_Sudoku_36
{

    public static boolean isValidSudoku(char[][] board)
    {
        HashSet<String> seen = new HashSet<>();
        //We loop through every cell of the board (i = row index, j = column index).
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                char current = board[i][j];//We take the character at (i, j) — can be a digit '1' to '9', or '.'.
                if(current != '.')//We skip empty cells. Only check non-empty cells.
                {
                    if(!seen.add(current + " in a Row " + i)|| //Checks for duplicates in the same row.
                    !seen.add(current + " in a Column " + j) || //Checks for duplicates in the same column.
                    !seen.add(current + " in a Box " + (i/3) + "-" + (j/3))) //Checks for duplicates in the same 3x3 box.
                    {
                        return false;
                    }
                    //We create unique strings for row, column, and box entries. For example, if current = '5' and i=0, j=1:

// "5 in row 0"

// "5 in col 1"

// "5 in box 0-0" → Because (0 / 3 = 0) and (1 / 3 = 0)

// The HashSet.add() method returns:

// true if it’s new (valid so far)

// false if it's already there (invalid)

// So, if any of these return false, we return false immediately (invalid Sudoku).
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'}
            ,{'6','.','.','1','9','5','.','.','.'}
            ,{'.','9','8','.','.','.','.','6','.'}
            ,{'8','.','.','.','6','.','.','.','3'}
            ,{'4','.','.','8','.','3','.','.','1'}
            ,{'7','.','.','.','2','.','.','.','6'}
            ,{'.','6','.','.','.','.','2','8','.'}
            ,{'.','.','.','4','1','9','.','.','5'}
            ,{'.','.','.','.','8','.','.','7','9'}
        };
        boolean ans = isValidSudoku(board);
        System.out.println(ans);
    }
}