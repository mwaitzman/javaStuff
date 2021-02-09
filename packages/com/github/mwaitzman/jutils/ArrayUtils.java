package com.github.mwaitzman.jutils;

public class ArrayUtils {

  public cla




  public static Object[] shuffleArray(Object[] objArr) {
    final int arrLength = objArr.length;
    int[] indexes = new int[arrLength];
    for(int i = 0; i < arrLength; i++) {
      indexes[i] = i;
    }
    indexes = shuffleInts(indexes);
    objArr.getClass() temp1, temp2;
    int tempInt;
    objArr
    int[] newPos

    temp1 = objArr[0];
    for(int i = 0; i < arrLength; i++) {
      temp = objArr[indexes[i]]
    }

    int[] order = new int[arrLength];
    int temp;
    for (int i = 0; i <= arrLength; i++) {
      indexes[i]
    }
  }
  public static int computePosition(int pos, BitSet bs) {
    int v = bs.nextSetBit(0);
    return (v >= pos || v == -1) ? pos : computePosition(pos, bs, v);
  }
  private static int computePosition(int pos, Bitset bs, int a) {
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
