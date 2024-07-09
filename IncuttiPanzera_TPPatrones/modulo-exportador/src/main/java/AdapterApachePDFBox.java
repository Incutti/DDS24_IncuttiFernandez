import config.Config;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AdapterApachePDFBox implements AdapterExportadorPDF {

    public AdapterApachePDFBox() {
    }

    public String exportar(Exportable exportable) {
        PDDocument doc = new PDDocument();
        PDPage myPage = new PDPage();
        doc.addPage(myPage);
        try {
            PDPageContentStream cont = new PDPageContentStream(doc, myPage);
            cont.beginText();
            cont.setFont(PDType1Font.TIMES_ROMAN, 12);
            cont.setLeading(14.5f);
            cont.newLineAtOffset(25, 700);
            agregarDatos(cont, exportable.datos());

            cont.endText();
            cont.close();
            doc.save(rutaCompletaDelArchivo(exportable.getDocumento()));
            doc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rutaCompletaDelArchivo(exportable.getDocumento());
    }

    private String rutaCompletaDelArchivo(Documento documento){
        return Config.RUTA_EXPORTACION + documento.getNombre();
    }

    private void agregarDatos(PDPageContentStream pagina, Map<String, List<String>> datos) throws IOException {
        for (Map.Entry<String, List<String>> entry : datos.entrySet()) {
            pagina.newLine();
            String datosDeLaFila = String.join(", ", entry.getValue());
            pagina.showText(datosDeLaFila);
        }
    }
}
