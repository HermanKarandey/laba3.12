
package ua.lviv.iot.foodcontainer.models;


import ua.lviv.iot.foodcontainer.managers.IFoodcontainerManager;

public abstract class Termoss implements IFoodcontainerManager {

    private String type;
    private int bitSize;
    protected ua.lviv.iot.foodcontainer.models.Size Size;
    private double Material;
    private String Color;
    private String producer;

    public Termoss(String type, int bitSize, double size, String color ,
                   double weight, String producer, double material ) {
        this.type = type;
        this.bitSize = bitSize;
        this.Size = Size;
    }

    public Termoss() {
        // this("0",0,0);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getBitSize() {
        return bitSize;
    }

    public void setBitSize(int bitSize) {
        this.bitSize = bitSize;
    }

    public ua.lviv.iot.foodcontainer.models.Size getCorpsSize() {
        return Size;
    }

    public void setCorpsSize(ua.lviv.iot.foodcontainer.models.Size corpsSize) {
        this.Size = corpsSize;
    }

    @Override
    public String toString() {
        return "Termoss : " + "\nType : " + type + "\nBit size : " + bitSize
                + "\ncorpus size : " + "\n\tlenght : " + getCorpsSize().getLenght()
                + "\n\twidth : " + getCorpsSize().getWidth() + "\n\theight : "
                + getCorpsSize().getHeight() + printFields();
    }

    protected abstract double printFields();
}
