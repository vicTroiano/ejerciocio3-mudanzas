public class Main {
    public static void main(String[] args) {
    MedioDeTransporte camionDisponible = new MedioDeTransporte(
            500.0,
            new Dimension(2.5, 1.5, 4.0 ),
            3
    );

    ObjetoTransportable silla = new ObjetoTransportable(
            "mesa de Vicky",
            20.0,
            new Dimension(0.30, 1.0, 2.0),
            false
    );

        ObjetoTransportable televisor = new ObjetoTransportable(
                "televisor de Vicky",
                8.0,
                new Dimension(1.30, 1.0, 2.0),
                true
        );

        camionDisponible.cargar(silla);
    }
}
