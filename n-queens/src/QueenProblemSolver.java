public class QueenProblemSolver
{
  private Board board;

  public QueenProblemSolver(int n)
  {
    this.board = new Board(n);
  }

  private boolean isOk(int row, int col)
  {
    // Check for left col
    for (int i = 0; i < col; i++)
    {
      if (board.getBoard()[row][i] == 1)
      {
        return false;
      }
    }

    // Check for diagonal up
    for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
    {
      if (board.getBoard()[i][j] == 1)
      {
        return false;
      }
    }
    // Check for diagonal low
    for (int i = row, j = col; j >= 0 && i < board.getN(); i++, j--)
    {
      if (board.getBoard()[i][j] == 1)
      {
        return false;
      }
    }
    return true;
  }

  public boolean solveProblem(int col)
  {
    if (col >= board.getN())
    {
      return true;
    }

    for (int i = 0; i < board.getN(); i++)
    {
      if (isOk(i, col))
      {
        board.getBoard()[i][col] = 1;

        if (solveProblem(col + 1))
        {
          return true;
        }
        board.getBoard()[i][col] = 0;
      }
    }
    return false;
  }

  public void showResults()
  {
    board.printBoard(board.getBoard());
  }
}
