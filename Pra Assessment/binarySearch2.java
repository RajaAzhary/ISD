public class binarySearch2 {
    int binarySearch(int array[], int x, int low, int high) {
  
      while (low <= high) {
        int mid = low + (high - low) / 2;
  
        if (array[mid] == x)
          return mid;
  
        if (array[mid] < x)
          low = mid + 1;
  
        else
          high = mid - 1;
      }
  
      return -1;
    }
  
    public static void main(String args[]) {
      binarySearch2 ob = new binarySearch2();
      int array[] = { 4, 7, 10, 8, 9, 30, 33, 100 };
      int n = array.length;
      int x = 33;
      int result = ob.binarySearch(array, x, 0, n - 1);
      if (result == -1)
        System.out.println("elemen tidak ditemukan");
      else
        System.out.println("elemen ditemukan pada index " + result);
    }
  }