public class ExportableFactory {
    public static String obtenerEstrategia(String tipo, String key, String nombre, String apellido, String edad) {
        Documento documento = new Documento();
        documento.agregarDatos("1", "nombre", "apellido", "edad");
        documento.agregarDatos(key, nombre, apellido, edad);
        Exportable exportable = null;
        switch (tipo) {
            case "EXCEL":
                exportable = new Exportable(new ExportarAExcel(documento.getNombre()));
                exportable.setDocumento(documento);
                break;
            case "PDF":
                exportable = new Exportable(new ExportarPDF(new AdapterApachePDFBox()));
                exportable.setDocumento(documento);
                break;
            default:
                throw new RuntimeException("No existe ese tipo de archivo.");
        }
        return exportable.ejecutarExportador();
    }
}