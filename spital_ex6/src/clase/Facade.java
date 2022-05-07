package clase;

public class Facade {

    public void verificaInternarePacient(Pacient pacient, Salon salon){
        if(pacient.isConfirmatMedic() && pacient.isGravitate() && salon.arePaturiLibere())
        {
            System.out.println("Pacientul a fost internat.");
        }
        else{
            System.out.println("Pacientul nu a fost internat!!!!!!!!!!!!!!!!!!!!");

        }
    }
}
