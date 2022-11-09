package pro.sky.skypro.onlinestore.service;

import pro.sky.skypro.onlinestore.model.Item;

import java.util.Collection;
import java.util.List;

public interface StoreService {

    void add(List<Integer> id);

    Collection<Item> get();

}
