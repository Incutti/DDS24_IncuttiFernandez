import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Exportable {
    private Documento documento;
    private EstrategiaDeExportacion exportador;

    public Exportable(EstrategiaDeExportacion exportador) {
        this.exportador = exportador;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public EstrategiaDeExportacion getExportador() {
        return exportador;
    }

    public void setExportador(EstrategiaDeExportacion exportador) {
        this.exportador = exportador;
    }

    public String ejecutarExportador(){
        return exportador.exportar(this);
    }

    public Map<String, List<String>> datos(){
        return documento.getDatos();
    }
}
