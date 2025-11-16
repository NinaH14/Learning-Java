public class PracticeProblems {
Name: Nina Huang


1.Write a function called countOccurrences that takes an integer array arr and an integer n, and returns the number of times that n appears in arr.

public static int countOccurrences (int[]arr,int n) {
    int count = 0

    for element in arr; {
    if (int element == n );{
    count++ }
}
public static void main(String[] args) {
    int[] arr = {0, 1, 1, 0, 0, 1, 0};
     System.out.println(countOccurrences(arr int, 1));
}
return count;
}


2.Write a function called reverseArray that takes an integer array arr and returns a new array with the elements of arr but in reverse order.

public static void main(String[] args) {
    int[] arr = {0, 1, 2, 3};        
    System.out.print("The arr: ");
    for (int x : arr) {
        System.out.print(x+ " ");
    }
   int[] reversed = reverseArray(arr);
 System.out.print("\nThe reversed arr: ");
    for (int x : reversed) {
        System.out.print(x + " ");}
 return rev; 
    }
   

3.Write a function called sumGrid that takes a 2d double array grid and returns the sum of all the elements. Hint: you can do this with nested for loops (look up what that is).

public static double sumGrids(double[][] grid) {
   double[][] grid = new double[2][3];
    double[][] mygrid = {
        {1.0, 2.0, 3.o},
        {4.0, 5.0, 6.0},
        {7.0, 8.0, 9.0}
    };
    double sum = sumGrid(my grid);
    System.out.println("The sum of all elements in the grid is: " + sum); 
}
  
    
4.Write a function called fib that takes an integer n and returns the nth number in the fibonacci sequence (starting with0 0 1 ).
// Series 0 1 1 2 3 5 8 13 21 34 ....
// nth number = Sum of (n-1)th and (n-2)th numbers


  public static int fib(int n) {
        if (n <= 1) {      
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);  
        }
    }

