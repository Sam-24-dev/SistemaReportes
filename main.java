public class main {
    public static void main(String[] args) {
        IReporte reporte = new StyleDecorator(
                                new ColorDecorator(
                                    new FontDecorator(
                                        new ReporteBase()
                                    )
                                )
                            );

        reporte.generar(); // Se espera una salida decorada paso a paso
    }
}