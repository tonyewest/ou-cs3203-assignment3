public static int arraySum(int[] numbers) {
    int sum = 0;

    for(int number : numbers) {
        sum += number;
    }

    return sum;
}

public static int arrayProduct(int[] numbers) {
    int product = 1;
    
    for(int number : numbers) {
        product = product * number;
    }
    
    return product;
}

public static void main(String[] args) {
    int[] testNumbers = {1, 2, 3, 4, 5};
    int test = arraySum(testNumbers);

    System.out.println("The sum is: " + test);
}