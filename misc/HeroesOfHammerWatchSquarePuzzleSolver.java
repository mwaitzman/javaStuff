import java.util.Random;
public class HeroesOfHammerWatchSquarePuzzleSolver {
  public static void main(String[] args) {
    boolean[][] squares = parseArg0(args[0]);
    int[] steps = new int[Integer.MAXMAX_VALUE];
    while(allSquaresOn()==false) {
      flipTilesAdjacentTo(changeRandomTile());
    }
    for(int step: steps) {
      System.out.print(step + ", ");
    }
    System.out.print("end of program");
  }

static boolean[][] parseArg0(String arg) {

}

  static boolean allSquaresOn(boolean[][] squares) {
    for(int i = 0; i < 3; i++) {
       for (int j = 0; j < 3; j++) {
         if (squares[i][j] == false) return false;
       }
    }
    return true;
  }
}
