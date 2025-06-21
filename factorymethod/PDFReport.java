package factorymethod;

/**
 * Clase concreta que implementa un reporte PDF
 */
public class PDFReport implements Report {
    
    
    /**
     * Método específico para reportes Excel
     * @return String con contenido del reporte Excel
     */
    public String ExcelReport() {
        return "Reporte generado en formato Excel (.xlsx)";
    }
       @Override
public String crearReport() {
    return "Reporte generado en formato PDF";
} 
    
}