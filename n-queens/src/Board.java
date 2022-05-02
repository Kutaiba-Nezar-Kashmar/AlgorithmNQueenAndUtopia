public class Board
{
  private int n;
  private int[][] board;

  public Board(int n)
  {
    this.n = n;
    createBoard();
  }

  public int getN()
  {
    return n;
  }

  public void setN(int n)
  {
    this.n = n;
  }

  public int[][] getBoard()
  {
    return board;
  }

  public void setBoard(int[][] board)
  {
    this.board = board;
  }

  public void createBoard()
  {
    int[][] board = new int[n][n];
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        board[i][j] = 0;
      }
    }
    this.board = board;
  }

  public void printBoard(int[][] board)
  {
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
        System.out.printf(" %d ", board[i][j]);
      System.out.print("\n");
    }
  }
}
