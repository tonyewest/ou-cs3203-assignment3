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

public static int[] reverse(int[] numbers) {
    int reverseArray = new int[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
        reverseArray[i] = reverseArray[numbers.length - 1 - i];
    }

    return reverseArray;
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

<<<<<<< HEAD
    System.out.println("The sum of the numbers is: " + arraySum); // display result for sum
    System.out.println("The product of the numbers is: " + arrayProduct); // display result for product
=======
    int[] reverseTest = reverse(numbers);
    String reverse = "";

    for (int i = 0; i < reverseTest.length; i++) {
        reverse += reverseTest[i] + ", ";
    }

    System.out.println("The sum of the numbers is: " + arraySum);
    System.out.println("The product of the numbers is: " + arrayProduct);
    System.out.println("The reverse of your list is: " + reverse);
>>>>>>> b1994bdfe0b599b4620a831a9cb4a6149dab4f2e
}