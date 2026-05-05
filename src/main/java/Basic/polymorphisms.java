package Basic;

class Calculator { 
    int add(int a, int b) { 
        return a + b; 
    } 

    double add(double a, double b) { 
        return a + b; 
    }
}

class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        int result1 = c.add(10, 20);
        double result2 = c.add(20.6, 50.7);

        System.out.println("The result1 is: " + result1);
        System.out.println("The result2 is: " + result2);
    }
}	