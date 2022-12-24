public class Penjual extends DataCust {

    private int idCust;

    public Penjual(int idCust) {
        this.idCust = idCust;
    }

    @Override
    int getIdCust(){
        return this.idCust;
    }

}
