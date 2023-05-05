package pro.sky.fedorov.WebShopHome.services;

import java.util.HashMap;

public interface ShopService {

    HashMap<Integer, String> getPriceList();

    void addItem (Integer id, String item);
}
