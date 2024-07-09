import config.Config;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExportadorTest {
    private Exportable exportable;
    private Documento documento;

    @Before
    public void init(){
        Documento d=new Documento();
        d.agregarDatos("1", "Nombre", "Apellido", "Edad");
        documento=d;
        this.exportable=new Exportable(new ExportarAExcel("Datos.xlsx"));
    }

    @Test
    public void exportarExcel(){
        this.documento.agregarDatos("2","Lucas","Gonzalez","33");
        this.exportable.setDocumento(this.documento);
        Assert.assertEquals(Config.RUTA_EXPORTACION + "Datos.xlsx", this.exportable.ejecutarExportador());
    }
    @Test
    public void exportarPDF(){
        this.exportable.setExportador(new ExportarPDF(new AdapterApachePDFBox()));
        this.documento.setNombre("Datos.pdf");
        this.documento.agregarDatos("2","Lucas","Gonzalez","33");
        this.exportable.setDocumento(this.documento);
        Assert.assertEquals(Config.RUTA_EXPORTACION + "Datos.pdf", this.exportable.ejecutarExportador());
    }

}