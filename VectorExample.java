import java.util.Vector;

class VectorExample {
  public static void main(String[] args) {
    Vector<Integer> list = new Vector<Integer>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
