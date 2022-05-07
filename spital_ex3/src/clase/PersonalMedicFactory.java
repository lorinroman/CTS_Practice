package clase;

public class PersonalMedicFactory implements PersonalSpitalFactory{


    @Override
    public PersonalSpital getPersonalSpital(String nume) {
        return new PersonalMedic(nume);
    }
}
