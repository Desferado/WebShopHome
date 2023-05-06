package pro.sky.fedorov.WebShopHome.services;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class ShopServiceImpl implements ShopService {

public HashMap <Integer, String> priceList = new HashMap<>(Map.of(
        1, "pen",
        2, "pencil",
        3, "eraser",
        4, "paper",
        5,"stepler",
        6, "marker",
        7,"basket"

));


@Override
    public HashMap<Integer, String> getPriceList() {
        return priceList;
    }



    @Override
    public String addItem(Integer id, String item) {
       return priceList.put(id,item);
    }
}
