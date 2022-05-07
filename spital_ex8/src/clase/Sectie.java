package clase;

public class Sectie implements IItem{

    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaItem(IItem item) throws Exception {
        throw new Exception("Nepermis!");
    }

    @Override
    public void stergeItem(IItem item) throws Exception {
        throw new Exception("Nepermis!");
    }

    @Override
    public void descriereItem() {
        System.out.println("Sectie: " + nume);
    }

    @Override
    public IItem getItem(int pozitie) throws Exception {
        throw new Exception("Nepermis!");
    }
}
