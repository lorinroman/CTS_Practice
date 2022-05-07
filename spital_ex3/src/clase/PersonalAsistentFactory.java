package clase;

public class PersonalAsistentFactory implements PersonalSpitalFactory{
    @Override
    public PersonalSpital getPersonalSpital(String nume) {
        return new PersonalAsistent(nume);
    }
}
