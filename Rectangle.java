package Shapes;

public class Rectangle extends GeometricObject {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {

        try {
            if (width != height) {
                this.width = width;
                this.height = height;
            } else {
                throw new ArithmeticException("The width and height can not be the same length");
            }
        } catch (ArithmeticException e) {
            throw e;
        }
    }

    /**
     * Return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set a new width
     */
    public void setWidth(double width) {
        try {
            if (width != getHeight()) {
                this.width = width;
            } else {
                throw new ArithmeticException("The Width equals the Height; width and height can not be equal");
            }
        } catch (ArithmeticException e) {
            throw e;
        }
    }

    /**
     * Return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set a new height
     */
    public void setHeight(double height) {
        try {
            if (height != getWidth()) {
                this.height = height;
            } else {
                throw new ArithmeticException("The Height equals the Width; height and width can not be equal");
            }
        } catch (ArithmeticException e) {
            throw e;
        }
    }
        /**
         * Return area
         */
    public double getArea() {
        return width * height;
    }

    /**
     * Return perimeter
     */
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
