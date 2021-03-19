public class TimsTicTacToe
{
    public static void main(String[] args)
    {
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
            {'—', '+', '—', '+', '—'},
            {' ', '|', ' ', '|', ' '},
            {'—', '+', '—', '+', '—'},
            {' ', '|', ' ', '|', ' '}};
        for (char[] row: gameBoard)
        {
            for (char element: row)
            {
                System.out.print(element);
            }
            System.out.println();
        }
    }
}
