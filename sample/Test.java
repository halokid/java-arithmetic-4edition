public class Test
{
  public static void main(String[] args)
  {
//    System.out.println("java test");
//    System.out.println(true && false || true && true);
//    System.out.println((1+2+3+4.0));
    System.out.println('b');
    System.out.println('b' + 'c');
    System.out.println((char)('a' + 4));
//    ppr();
//    toBinary();
    joinStr();
  }

  public static void ppr()
  {
    int f = 0;
    int g = 1;
//    int i;
    for (int i = 0; i <= 15; i++)
    {
      System.out.println(f);
      f = f + g;
      g = f - g;
    }
  }

  public static void toBinary()
  {
    String s = "";
    for (int n = 10; n > 0; n /= 2) {
      s = (n % 2) + s;
    }
    System.out.println(s);
  }

  public static void joinStr()
  {
    String s = "";
    for (int i = 0; i < 10; i++ ) {
      s = i + s;
    }
    System.out.println(s);
  }
}


