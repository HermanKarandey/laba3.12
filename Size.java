
package ua.lviv.iot.foodcontainer.models;


public class Size {

    private double lenght;
    private double width;
    private double height;

    public Size(double lenght, double width, double height) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public Size() {
        this(0.0, 0.0, 0.0);
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        if (lenght >= 0.0) {
            this.lenght = lenght;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width >= 0.0) {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height >= 0.0) {
            this.height = height;
        }
    }
}
