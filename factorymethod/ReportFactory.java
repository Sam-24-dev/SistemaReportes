package factorymethod;

/**
 * Clase Factory principal que maneja la creación de diferentes tipos de reportes
 */
public class ReportFactory {
    
    /**
     * Enumeración para los tipos de reportes disponibles
     */
    public enum ReportType {
        PDF, WORD, EXCEL
    }
    
    /**
     * Método factory principal para crear reportes
     * @param type Tipo de reporte a crear
     * @return Report instancia del reporte solicitado
     */
    public static Report createReport(ReportType type) {
        switch (type) {
            case PDF:
                return new PDFReport();
            case WORD:
                PdfReportCreator creator = new PdfReportCreator();
                return creator.WordReportCreator();
            case EXCEL:
                return new ExcelReportImpl();
            default:
                throw new IllegalArgumentException("Tipo de reporte no soportado: " + type);
        }
    }
    
    /**
     * Clase interna para implementar reportes Excel
     */
    private static class ExcelReportImpl implements Report {
        @Override
        public String crearReport() {
            return "Reporte generado en formato Excel (.xlsx)";
        }
    }
}