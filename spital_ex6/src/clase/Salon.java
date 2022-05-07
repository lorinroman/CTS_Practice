package clase;

public class Salon {
    private int[] paturi;

    public Salon(int[] paturi) {
        this.paturi = paturi;
    }

    public int[] getPaturi() {
        return paturi;
    }

    public boolean arePaturiLibere(){
        for(int i =0;i<paturi.length;i++){
            if(paturi[i] == 1)
            {
                return true;
            }
        }
        return false;
    }
}
