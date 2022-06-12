class FunctionExample {
  public static void main(String[] args) {

    printSum(sum(10, 20));
  }

  static int sum(int a, int b) {
    int result = a + b;
    return result;
  }

  static void printSum(int result) {
    System.out.println("result: " + result);
  }
}