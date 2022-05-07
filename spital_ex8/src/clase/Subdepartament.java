package clase;

public class Subdepartament implements IItem{

    private String nume;

    public Subdepartament(String nume) {
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
        System.out.println("Subdepartament: "+nume);
    }

    @Override
    public IItem getItem(int pozitie) throws Exception {
        throw new Exception("Nepermis!");
    }
}
