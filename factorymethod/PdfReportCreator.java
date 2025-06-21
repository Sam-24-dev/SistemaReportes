package factorymethod;
/**
 * Clase concreta que implementa el creador de reportes PDF
 */
public class PdfReportCreator {
    
    /**
     * Método factory para crear reportes de Word
     * @return Report instancia de un reporte de Word
     */
    public Report WordReportCreator() {
        return new WordReport();
    }
    
    /**
     * Clase interna que representa un reporte de Word
     */
    private static class WordReport implements Report {
        @Override
        public String crearReport() {
            return "Reporte generado en formato Word (.docx)";
        }
    }
}