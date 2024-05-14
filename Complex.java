public class Complex {

    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(double real) {
        this(real, 0);
    }

    public Complex() {
        this(0, 0);
    }

    // Getters
    public double getRealPart() {
        return real;
    }

    public double getImaginaryPart() {
        return imaginary;
    }

    // Methods for complex number operations
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
            if (denominator == 0) {
                throw new ArithmeticException(" waxaa dhacay Tiro aan la qeybi karin!!.,"+denominator);
            }
        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Complex(realPart, imaginaryPart);

    }
    public double abs() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }
    // Override toString method
    @Override
    public String toString() {
        if (imaginary == 0) {
            return String.format("%.2f", real);
        } else if (real == 0) {
            return String.format("%.2fi", imaginary);
        } else {
            return String.format("%.2f + %.2fi", real, imaginary);
        }
    }

    // Override clone method
    @Override
    public Complex clone() {
        return new Complex(this.real, this.imaginary);
    }

    // Override compareTo method for comparing by absolute values

    public int compareTo(Complex other) {
        return Double.compare(this.abs(), other.abs());
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }


    public  void DisplayComplex(){
        System.out.println(" the Imaginary Number is : " +this.getImaginary());
        System.out.println("the Real Number is : " + this.getReal());

       // System.out.println("c1 + c2: " );

    }


}
