int N = a.length

for (int i = 0; i < N/2; i++)
{
  double temp = a[i];
  a[i] = a[N-1-i];
  a[N-i-1] = temp;
}


