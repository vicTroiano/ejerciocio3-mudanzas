import java.util.ArrayList;

public class MedioDeTransporte {
    private ArrayList<ObjetoTransportable> transportables;
    private double capacidadMaxima;
    private double capacidadActual;
    private Dimension dimension;
    private int cantidadMaxima;

    MedioDeTransporte(double capacidadMaxima,
                      Dimension dimension,
                      int cantidadMaxima
            ){
        setTransportables(new ArrayList<ObjetoTransportable>());
        setCapacidadActual(0);
        setCantidadMaxima(cantidadMaxima);
        setCapacidadMaxima(capacidadMaxima);
        setDimension(dimension);


    }


    public ArrayList<ObjetoTransportable> getTransportables() {
        return transportables;
    }

    public void setTransportables(ArrayList<ObjetoTransportable> transportables) {
        this.transportables = transportables;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public void cargar(ObjetoTransportable objetoTransportable) {
    }
}
