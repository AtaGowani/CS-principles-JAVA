package DataStructures;

public class Stack {

  private int currentIndex = 0;
  private int[] array;

  public Stack() {
    this(50);
    System.out.println("Array has been intialized to 50 elements");
  }

  public Stack(int arraySize) {
    this.array = new int[arraySize];
  }

  public void push(int num) {
    if (this.currentIndex >= this.array.length) {
      int[] newArray = new int[this.array.length * 2];
      for (int i = 0; i < this.array.length; i++)
        newArray[i] = this.array[i];
      this.array = newArray;
    }

    this.array[this.currentIndex++] =  num;
  }

  public int pop() {
    if (this.currentIndex < 0) {
      System.out.println("Nothing to pop!");
      return -1;
    } else {
      int num = this.array[--this.currentIndex];
      return num;
    }
  }
}