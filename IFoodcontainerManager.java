
package ua.lviv.iot.foodcontainer.managers;

import ua.lviv.iot.foodcontainer.models.Color;
import ua.lviv.iot.foodcontainer.models.Foodcontainer;
import java.util.List;

public interface IFoodcontainerManager {

    List<Foodcontainer> findByColor(Color color);

    void sortByPrice(List<Foodcontainer> Foodcontainer);

    void sortByWeight(List<Foodcontainer> Foodcontainer);

    void sortByPrice(List<Foodcontainer> foodcontainer, ua.lviv.iot.foodcontainer.managers.SortType sortType);

    void sortByWeight(List<Foodcontainer> foodcontainer, ua.lviv.iot.foodcontainer.managers.SortType sortType);
}
