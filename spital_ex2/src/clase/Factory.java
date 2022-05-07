package clase;

public class Factory {

    public PersonalSpital getPersonalSpital(TipPersonal tip, String nume){
        switch(tip){
            case BRANCARDIER:
                return new PersonalBrancardier(nume);
            case ASISTENT:
                return new PersonalAsistent(nume);
            case MEDIC:
                return new PersonalMedic(nume);
            default:
                return null;
        }
    }
}
