
package ua.lviv.iot.foodcontainer.models;

import ua.lviv.iot.foodcontainer.managers.IFoodcontainerManager;

public abstract class Sugarbowl implements IFoodcontainerManager {

    private String type;
    private int bitSize;
    private String corpsSize;
    private double getField;




    public Sugarbowl(String type, int bitSize, String corpsSize, double price, String color,
                     double weight, String producer, double getField) {

        this.type = type;
        this.bitSize = bitSize;
        this.corpsSize = corpsSize;
        this.getField = getField;
    }

    private void Tye(double price, double color, double weight, String producer) {
    }

    public Sugarbowl() {
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



    public void setCorpsSize(String corpsSize) {
        this.corpsSize = corpsSize;
    }

    @Override
    public String toString() {
        return "Sugarbowl : " + "\nType : " + type + "\nBit size : " + bitSize
                + "\ncorpus size : " + "\n\tlenght : " + corpsSize().getLenght()
                + "\n\twidth : " + corpsSize () .getWidth() + "\n\theight : "
                + corpsSize().getHeight() + getField();
    }

    protected abstract String getField();

    protected abstract ua.lviv.iot.foodcontainer.models.Size corpsSize();


}
