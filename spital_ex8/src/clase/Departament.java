package clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IItem{

    private String nume;
    private List<IItem> items;

    public Departament(String nume) {
        this.nume = nume;
        this.items = new ArrayList<>();
    }


    @Override
    public void adaugaItem(IItem item) throws Exception {
        items.add(item);
    }

    @Override
    public void stergeItem(IItem item) throws Exception {
        items.remove(item);
    }

    @Override
    public void descriereItem() {
        System.out.println(nume);
        for(IItem item : items) {
            item.descriereItem();
        }
    }

    @Override
    public IItem getItem(int pozitie) throws Exception {
        return items.get(pozitie);
    }
}
