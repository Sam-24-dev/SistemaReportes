public abstract class ReportDecorator implements IReporte {
    protected IReporte reporte; // Composición: el componente que se va a decorar

    public ReportDecorator(IReporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public void generar() {
        reporte.generar(); // Delegación de comportamiento base
    }
}
