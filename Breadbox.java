/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.lviv.iot.foodcontainer.models;



import ua.lviv.iot.foodcontainer.managers.FoodcontainerManager;

import java.util.Arrays;



public class  Breadbox extends FoodcontainerManager {

    private String surface;
    private String sizeOfSurface;
    private String typeOfFrame;
    private Object String;

    public Breadbox(String surface, String sizeOfSurface, String typeOfFrame,
                 double price, double color, double weight, String producer,
                 double material) {

        this.surface = surface;
        this.sizeOfSurface = sizeOfSurface;
        this.typeOfFrame = typeOfFrame;
    }

    public Breadbox() {
        // this(0, 0, 0);
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public String getSizeOfSurface() {
        return sizeOfSurface;
    }

    public void setSizeOfSurface(String sizeOfSurface) {
        this.sizeOfSurface = sizeOfSurface;
    }

    public String getTypeOfFrame() {
        return typeOfFrame;
    }

    public void setTypeOfFrame(String typeOfFrame) {
        this.typeOfFrame = typeOfFrame;
    }

    @Override
    public String toString() {
        try {
            String = "Breadbox: " + "\nsurface : " + surface + "\nSize of surface : "
                    + "\n\tlenght : " + Arrays.toString(new int[]{getSizeOfSurface().length()}) + "\n\twidth : "
                    + getSizeOfSurface().wait() + "\n\theight : "
                    + getSizeOfSurface().getBytes() + "\ntypeOfFrame : " + typeOfFrame
                    + printFielsds();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
        {
        }
    }
}
