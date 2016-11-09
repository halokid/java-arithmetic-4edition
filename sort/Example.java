public class Example
{
  public static void sort(Comparable[] a)
  {

  }

  public static boolean less(Comparable v, Comparable w)
  {
    return v.compareTo(w) < 0;
  }

  private static void show(Comparable[] a)
  {
    for (int i = 0; i < a.length; i++) {
      StdOut.println(a[i] + " ");
    }
    StdOut.println();
  }

  public static boolean isSorted(Comparable[] a)
  {
    for (int i = 1; i < a.length; i++) {
      if (less(a[i], a[i-1])) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args)
  {
    String[] a = In.readStrings();
    sort(a);
    assert isSorted(a);
    show(a);
  }
}