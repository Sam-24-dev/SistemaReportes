public class StyleDecorator extends ReportDecorator {

    public StyleDecorator(IReporte reporte) {
        super(reporte);
    }

    @Override
    public void generar() {
        super.generar();
        System.out.println("→ Aplicando estilos visuales especiales.");
    }
}