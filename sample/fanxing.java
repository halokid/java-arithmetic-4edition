// java的泛型示例代码

public class GenericTestW
{
  public static void main(String[] args)
  {
    List list = new ArrayList();
    list.add("qquiwuew");
    list.add("corn");
    list.add(100);

    for (int i = 0; i < list.size(); i++) {
      String name = (String) list.get(i);   //compile wrong, because 100 is integer
      System.out.println("name: " + name);
    }
  }
}


public class GenericTestR
{
  public static void main(String[] args)
  {
    List<String> list = new ArrayList<String>();
    list.add("uiqweuqwe");
    list.add("cron");
    list.add(100);      //compile error, just string

    for (int i = 0; i < list.size(); i++) {
      String name = list.get(i);
      System.out.println("name: " + name);
    }
  }
}



public interface List<E> extends Collection<E>
{
  int size();

  boolean isEmpty();

  boolean contans(Object o);

  Iterator<E> iterator();

  Object[] toArray();

  <T> T[] toArray(T[] a);

  boolean add(E e);

  boolean remove(Object o);

  boolean containsAll(Collection<?> c);

  boolean addAll(Collection<? extends E> c);

  boolean removeAll(Collection<?> c);

  boolean retainAll(Collection<?> c);

  void clear();

  boolean equals(Object o);

  int hashCode();

  E get(int index);

  E set(int index, E element);

  void add(int index, E element);

  E remove(int index);

  int indexOf(Object o);

  int lastIndexOf(Object o);

  ListIterator<E> listIterator(int index);

  List<E> subList(int fromIndex, int toIndex);
}



public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable
{
  public boolean add(E e)
  {
    ensureCapacityInternal(size + 1);
    elementData[size++] = e;
    return true;
  }

  public E get(int index)
  {
    rangeCheck(index);
    checkForComodification();
    return ArrayList.this.elementData(offset + index);
  }


}






























