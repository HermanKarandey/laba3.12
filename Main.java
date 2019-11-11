
package ua.lviv.iot.foodcontainer;

import bradboxjava.breadbox;
import ua.lviv.iot.foodcontainer.managers.SortType;
import ua.lviv.iot.foodcontainer.models.*;
import ua.lviv.iot.foodcontainer.managers.*;
import ua.lviv.iot.foodcontainer.models.Color;
import ua.lviv.iot.foodcontainer.models.Material;
import ua.lviv.iot.foodcontainer.models.Oiler;
import ua.lviv.iot.foodcontainer.models.Size;
import ua.lviv.iot.foodcontainer.models.Termoss;

import java.util.*;

public class Main {

    private static Foodcontainer Sugarbowl;
    private static Sugarblow Sugarblow = new Sugarblow(0.7, 2, 26.0, new Color(0, 0, 0), 100.0,
            "Buromax", Material.METAL_PLUS_PLASTIC);
    private static Object Oiler;

    public static <foodcontainer> void main(String[] args) {
        List<foodcontainer> foodcontainer = new LinkedList<>();

         breadbox = new breadbox("chalky", new Size(100.0, 80.0, 5.0), "aluminum", 250.0,
                new Color(0, 128, 128), 25.0, "Economix", Material.METAL);

        Termoss termoss = new Termoss(2.0, 50.0,
                new Color(128, 128, 128), 0.2, "ABC", Material.METAL) {
            @Override
            public List<Foodcontainer> findByColor(ua.lviv.iot.foodcontainer.models.Color color) {
                return null;
            }

            @Override
            public void sortByPrice(List<Foodcontainer> Foodcontainer) {

            }

            @Override
            public void sortByWeight(List<Foodcontainer> Foodcontainer) {

            }

            @Override
            public void sortByPrice(List<Foodcontainer> foodcontainer, SortType sortType) {

            }

            @Override
            public void sortByWeight(List<Foodcontainer> foodcontainer, SortType sortType) {

            }

            @Override
            protected double printFields() {
                return 0;
            }
        };

        Oiler oiler= new oiler("engineering", 64, new Size(15.2, 5.0, 0.5),
                35.0, new Color(128, 128, 128), 0.1, "Company", Material.PLASTIC);

        foodcontainer.add(Termoss);
        foodcontainer.add(breadbox);
        foodcontainer.add((foodcontainer) Sugarbowl);
        foodcontainer.add(Oiler);

        FoodcontainerManager manager = new FoodcontainerManager(foodcontainer);
        System.out.println("Вибірка за матеріалом");
        System.out.println(manager.findByMaterial(new Color(128, 128, 128)));
        System.out.println("Сортування за зростанням за кольором");

        manager.sortByColor(foodcontainer, SortType.ASCENDING);
        System.out.println(foodcontainer);
        manager.sortByColor(foodcontainer, SortType.DESCENDING);
        System.out.println("Сортування за спаданням за кольором");
        System.out.println(foodcontainer);
        System.out.println("Сортування за зростанням за вагою");
        manager.sortByWeight(foodcontainer, SortType.ASCENDING);
        System.out.println(foodcontainer);
        manager.sortByWeight(foodcontainer, SortType.DESCENDING);
        System.out.println("Сортування за спаданням за вагою");
        System.out.println(foodcontainer);
    }
}
