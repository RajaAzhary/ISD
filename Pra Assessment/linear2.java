public class linear2 {
    public static int linearSearch(int array[], int x) {
    int n = array.length;
  
    for (int i = 0; i < n; i++) {
      if (array[i] == x)
      return i;
    }
    return -1;
    }
  
    public static void main(String args[]) {
    int array[] = { 30, 4, 7, 10, 8, 100, 33 };
    int x = 9;
  
    int result = linearSearch(array, x);
  
    if (result == -1)
      System.out.print("elemen tidak ditemukan");
    else
      System.out.print("elemen ditemukan pada index: " + result);
    }
  }