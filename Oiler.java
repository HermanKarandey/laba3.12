
package ua.lviv.iot.foodcontainer.models;

import ua.lviv.iot.foodcontainer.managers.IFoodcontainerManager;

public abstract class Oiler implements IFoodcontainerManager {

    private String surface;
    private double size;
    private String typeOfFrame;

    public Oiler(String surface, String typeOfFrame,
                 double material, double weight, String producer) {;
        this.surface = surface;
        this.size = size;
        this.typeOfFrame = typeOfFrame;
    }


    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public <size> double getSizeOfSurface() {
        return size;
    }

    public <size> void setSizeOfSurface(size sizeOfSurface) {
        this.size = (double) sizeOfSurface;
    }

    private void setTypeOfFrame(String typeOfFrame) {
        this.typeOfFrame = typeOfFrame;
    }

    @Override
    public String toString() {
        return "Oiler : " + "\nsurface : " + surface + "\nSize of surface : "
                + "\n\tlenght : " + getSizeOfSurface() + "\n\twidth : "
                + getSizeOfSurface() + "\n\theight : "
                + getSizeOfSurface() + "\ntypeOfFrame : " + typeOfFrame;

    }
}
