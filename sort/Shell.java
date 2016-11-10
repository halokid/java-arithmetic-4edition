
public class Shell
{
  public static void sort(Comparable[] a)
  {
    int N = a.length;
    int h = 1;
    while (h < N/3) h = 3*h + 1;    //取得shell排序的最大跨度， 这里我们分三层来做shell排序，所以是 N/3， 假如分四层， 我们可以是 N/4， 最后这样运算得出 h 就是我们以 3层 运算的shell排序的 最大跨度

    while (h >= 1)
    {
      for (int i = h; i < N; i++)
      {
        for (int j = i; j >= h && less(a[j], a[j-h]); j -= h)
          exch(a, j, j-h);
      }
      h = h/3;
    }
  }
}

/**

 上面的运算假如开始是输入 16 个数字

 输入                 2 32 89 23 76 29 3 8 2 9 2 12 87 23 89 34
 h = 13               一轮排序
 h = 13/3 = 4         二轮排序
 h = 4/3 = 1          三轮排序


**/