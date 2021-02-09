package com.github.mwaitzman.jutils;

public class Utils {

  public static int randomInt(int min, int max) {
    return (int) (Math.random()*(max-min+1)+min);
  }
  public static int randomInt(int max) {
    return (int) (Math.random()*(max+1));
  }

  public static int randomIndex(int[] indexes) {
    //TODO: if length is below Short.MAX_SIZE instead return randomIndex(indexes.toShortArray())
    return randomInt(indexes.length);
  }

}
