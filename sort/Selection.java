public class Selection
{
  public static void sort(Comparable[] a)
  {
    int N = a.length;     //a[] is array
    for (int i = 0; i < N; i++) {
      int min = i;
      for (int j = i+1; j < N; j++) {
        if (less(a[j], a[min])) min = j;    //if a[j]<a[i]
      }
      exch(a, i, min);
    }
  }
}