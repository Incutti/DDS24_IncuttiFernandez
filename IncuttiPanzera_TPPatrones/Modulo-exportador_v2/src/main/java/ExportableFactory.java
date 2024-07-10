public class ExportableFactory {
    public static String obtenerEstrategia(String tipo, String nombreDeArchivo, Documento documento) {
        switch (tipo) {
            case "EXCEL":
                Exportable exportador = new Exportable(new ExportarAExcel(nombreDeArchivo));
                exportador.setDocumento(documento);
                return exportador.ejecutarExportador();
            case "PDF":
                Exportable exportador1 = new Exportable(new ExportarPDF(new AdapterApachePDFBox(nombreDeArchivo)));
                exportador1.setDocumento(documento);
                return exportador1.ejecutarExportador();
            default:
                throw new IllegalArgumentException("Tipo de exportación invalida");
        }
    }
}