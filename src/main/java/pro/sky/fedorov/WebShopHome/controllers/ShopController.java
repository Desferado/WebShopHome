package pro.sky.fedorov.WebShopHome.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.fedorov.WebShopHome.services.Basket;
import pro.sky.fedorov.WebShopHome.services.ShopServiceImpl;

@RestController
public class ShopController {
    private final Basket basket;
    public ShopController(Basket basket) {
        this.basket = basket;
    }

@GetMapping("/add")
    public String addBasket (@RequestParam Integer [] id, ShopServiceImpl shopService) {
       basket.addBasket(id,shopService);
    return "items is added";
}
  @GetMapping("/get")
    public String getBasket () {
       return basket.toString();
    }
}
