import java.util.Scanner; // import the Scanner Class

public static int arraySum(int[] numbers) { // Compute the sum of all the numbers in the array
    int sum = 0; 

    for(int number : numbers) {
        sum += number;
    }

    return sum;
}

public static int arrayProduct(int[] numbers) { // Compute the product of the numbers in the array
    int product = 1;
    
    for(int number : numbers) {
        product = product * number;
    }
    
    return product;
}

public static void main(String[] args) { // main method: collect user input for array numbers and print sum/product
    Scanner stdin = new Scanner(System.in);
    System.out.println("Hello! Enter your list of numbers:");
    int[] numbers = new int[10];

    numbers[0] = stdin.nextInt();
    int currInt;
    int count = 1;
    while (currInt != -1 && count < 9) {
        numbers[count] == stdin.nextInt();
    }

    System.out.println("The sum of the numbers is: " + arraySum); // display result for sum
    System.out.println("The product of the numbers is: " + arrayProduct); // display result for product
}