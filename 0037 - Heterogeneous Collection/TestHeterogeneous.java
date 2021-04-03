class Man {
  public void fly() {
    System.out.println("Man can not fly");
  }
}

class SuperMan extends Man {
  public void fly() {
    System.out.println("SuperMan can fly");
  }
}

class SpiderMan extends Man {
  public void fly() {
    System.out.println("Spiderman can't fly, but can jump");
  }
}


public class TestHeterogeneous {
  public static void main(String[] args) {
    Man[] arr = new Man[3];
    arr[0] = new Man();
    arr[1] = new SuperMan();
    arr[2] = new SpiderMan();
  }
}
