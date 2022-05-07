package spital;

public class Medicament implements IMedicament{
    @Override
    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicamentul a fost achizitionat.");
    }

    @Override
    public void prezintaReteta() {
        System.out.println("Reteta a fost prezentata.");
    }
}
