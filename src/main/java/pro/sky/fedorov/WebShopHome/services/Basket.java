package pro.sky.fedorov.WebShopHome.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;


@Service
@SessionScope
public class Basket {
    public List <String> basket;

    public Basket(List<String> basket) {
        this.basket = basket;
    }

    public void addBasket(Integer [] id, ShopServiceImpl shopService) {
        for (Integer i : id) {

            basket.add(shopService.getPriceList().get(i));
        }
    }
 public void getItem (){ basket.toString(); }

    @Override
    public String toString() {
        return "Basket{" + basket +
                '}';
    }
}
