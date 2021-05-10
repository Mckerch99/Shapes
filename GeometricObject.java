package Shapes;





// this super class has all shared features between the subclass', but not specific ones (like radius or height, becasue those are specific to the objects

// this super class has all shared features between the subclass', but not specific ones (like radius or height, becasue those are specific to the objects
public abstract class GeometricObject /*extends Object -- this done by deafult if there is not super class*/ {

    private String color = "white";
    private boolean filled; //default for boolean is false
    private java.util.Date dateCreated;

    /**
     * Construct a default geometric object
     */
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /**
     * Construct a geometric object with the specified color and filled value
     */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /**
     * Return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set a new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Return filled. Since filled is boolean, its get method is named isFilled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Set a new filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Get dateCreated
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /**
     * Return a string representation of this object
     */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " \nfilled: " + filled + "\n";
    }
    
    	public abstract double getArea();// never use "{}" becasue the abstract method can not be implemented which means it can't have a body

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();
}
