package pro.sky.skypro.onlinestore.service;

import org.springframework.stereotype.Service;
import pro.sky.skypro.onlinestore.component.Basket;
import pro.sky.skypro.onlinestore.model.Item;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StoreServiceImpl implements StoreService {

    private final Basket basket;
    private Map<Integer, Item> items;


    public StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @PostConstruct
    public void initItems() {
        items = Map.of(
                1,new Item(1,"Монитор",56325),
                2,new Item(2,"Клавиатура", 5578),
                3,new Item(3,"Системный блок",34678)
        );
    }

    @Override
    public void add(List<Integer> id) {
         basket.add(id.stream()
                 .map(items::get)
                 .collect(Collectors.toList()));
    }

    @Override
    public Collection<Item> get() {
        return basket.get();
    }
}
