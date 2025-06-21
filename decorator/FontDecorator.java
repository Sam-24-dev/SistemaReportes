public class FontDecorator extends ReportDecorator {

    public FontDecorator(IReporte reporte) {
        super(reporte);
    }

    @Override
    public void generar() {
        super.generar();
        System.out.println("→ Aplicando fuente personalizada al reporte.");
    }
}

