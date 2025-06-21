public class ColorDecorator extends ReportDecorator {

    public ColorDecorator(IReporte reporte) {
        super(reporte);
    }

    @Override
    public void generar() {
        super.generar();
        System.out.println("→ Agregando color al diseño del reporte.");
    }
}