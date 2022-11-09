package pro.sky.skypro.onlinestore.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.skypro.onlinestore.model.Item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

@Component
@SessionScope
public class Basket {

    private final Collection<Item> items;

    public Basket(Collection<Item> items) {
        this.items = new ArrayList<>();
    }

    public void add(Collection<Item> items) {
        this.items.addAll(items);
    }

    public Collection<Item> get() {
        return Collections.unmodifiableCollection(items);
    }

}
