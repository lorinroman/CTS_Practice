package clase;

public class PersonalBrancardierFactory implements PersonalSpitalFactory{
    @Override
    public PersonalSpital getPersonalSpital(String nume) {
        return new PersonalBrancardier(nume);
    }
}
