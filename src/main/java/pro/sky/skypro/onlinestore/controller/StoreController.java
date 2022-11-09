package pro.sky.skypro.onlinestore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skypro.onlinestore.model.Item;
import pro.sky.skypro.onlinestore.service.StoreService;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public void addProduct(@RequestParam("id")List<Integer> id) {
        storeService.add(id);
    }

    @GetMapping("/get")
    public Collection<Item> getProducts() {
        return storeService.get();
    }

}
