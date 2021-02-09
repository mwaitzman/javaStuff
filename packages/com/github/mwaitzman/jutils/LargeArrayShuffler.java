import java.util.LinkedList;
import java.util.BitSet;
public class LargeArrayShuffler {

  public static Object[] shuffleArray(Object[] objArr) {
    Class ObjClass = objArr.getClass();
    final int arrLength = objArr.length;

    int[] destIndex = new int[arrLength];
    for(int i = 0; i < arrLength; i++) {
      destIndex[i] = i;
    }
    destIndex = shuffleInts(destIndex);

  int[] order = new int[arrLength];
  BitSet bs = new BitSet(arrLength);
  int n = 0;
  int incomplete = arrLength;
  LinkedList<Integer> preChain;
  LinkedList<Integer> chainStarts = new LinkedList<Integer>();
  int s = 0;
  LinkedList<Integer> chainSize = new LinkedList<Integer>();
    ObjClass tempObj = objArr[i].clone();
    bs.set(0, true);
    while(n < arrLength && incomplete > 0) {
      preChain = new LinkedList<Integer>(incomplete);
      n = bs.nextClearBit(n);
      chainStarts.add(n);
      preChain.add(destIndex[n]);
      bs.set(preChain.getLast(), true);
      while(!bs.get(s = destIndex[preChain.getLast()])) {
        preChain.add(destIndex[s]);
        bs.set(preChain.getLast(), true);
      }
      chainSize.add(preChain.size()-1);
      preChain.toArray(order);//how to append this to the end of the filled elements in the array?
      incomplete -= preChain.size();
      preChain = null;
    }
    bs = null;
    int[] savepoints = chainStarts.toArray(int[]::new);
    chainStarts = null;
    int[] sizes = chainSize.toArray(int[]::new);
    chainSize = null;
    int completed = 0;
    ObjClass tempObj; //= objArray[order[savepoints[0]].clone();
    while (completed < savepoints.length) {
      tempObj = objArray[order[savepoints[completed]]].clone();
      if (order[savepoints[completed]] == order[savepoints[completed]+chainSize[completed]]) {

        objArr = addToOutput(destIndex, Arrays.asList(order).subList(chainStarts[completed], sizes[completed]).toArray(Object[]::new), objArr);
        objArr[order[savepoints[completed]]+chainsize[completed]] = tempObj;
      }
      else {
        objArr = addToOutput(destIndex, Arrays.asList(order).subList(chainStarts[completed], sizes[completed]).toArray(Object[]::new), objArr);
      }
      completed++;
    }

    return ObjArr;
  }

  private static Object[] addToOutput(int[] indexes, int[] values, int startPos, Object[] objectArr) {
    for(int i = 0; i < values.length; i++) {
      objectArr[indexes[i+startPos]] = objectArr[values[i]];//this might be wrong
    }
  }

  public static int computePosition(int pos, BitSet bs) {
    int v = bs.nextSetBit(0);
    return (v >= pos || v == -1) ? pos : computePosition(pos, bs, v);
  }

  private static int computePosition(int pos, BitSet bs, int a) {
    int v = bs.nextSetBit(a);
    return (v >= pos || v == -1) ? pos : computePosition(pos, bs, v);
  }//TODO: change names of variables and methods to be more clear

  public static int[] shuffleInts(int[] ints) {
    BitSet availability = new BitSet(ints.length);
    int temp;
    int[] newPos = new int[ints.length];
    for (int i = ints.length; i > 0; i --) {
      temp = computePosition(randomInt(i), availability);
      availability.set(temp, true);
      newPos[i] = temp;
    }
    newPos[0] = computePosition(0, availability);
    return newPos;
  }
}
