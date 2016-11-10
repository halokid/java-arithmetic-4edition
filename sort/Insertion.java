
public class Insertion
{
  public static void sort(Comparable[] a)
  {
    int N = a.length;
    for (int i = 1; i < N; i++) {
      for (int j = i; j > 0 && less(a[j], a[i]); j--) {
        exch(a, j, j-1);
      }
    }
  }


  //下面这种是优化的一种做法， 在内循环里面不用每次都交换两个元素， 而是把比较大的元素都向右移动
  public static void sortImprove(Comparable[] a)
  {
    int N = a.length;
    for (int i = 1; i < N; i++) {
      int temp;
      int k = 0;
      for (int j = i; j > 0; j--) {
        temp = a[i];
        if (a[j] > temp)
        {
          a[j+1] = a[j];
          k++;
        }
      } //END 内循环
      a[i - k] = temp;
    }
  }
}