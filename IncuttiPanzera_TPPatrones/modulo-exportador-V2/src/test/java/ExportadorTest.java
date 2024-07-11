import config.Config;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExportadorTest {
    private Documento documento;

    @Before
    public void init(){
        Documento d=new Documento();
        d.agregarDatos("1", "Nombre", "Apellido", "Edad");
        this.documento=d;
    }

    @Test
    public void exportarConFactory(){
        this.documento.agregarDatos("2","Joaquin","Gonzalez","33");
        this.documento.setNombre("Datos.xlsx");
        Assert.assertEquals(Config.RUTA_EXPORTACION + "Datos.xlsx", ExportableFactory.obtenerEstrategia("EXCEL", this.documento));
    }

    @Test
    public void exportarPDF(){
        this.documento.agregarDatos("2","Joaquin","Gonzalez","33");
        this.documento.setNombre("Datos.pdf");
        Assert.assertEquals(Config.RUTA_EXPORTACION + "Datos.pdf", ExportableFactory.obtenerEstrategia("PDF", this.documento));
    }
}

//EN EL COMMIT ANTERIOR SETEABA EL DOCUMENTO DENTRO DE EXPORTABLE PARA QUE QUEDE 1 SOLA CLASE INSTANCIADA
//Y EN VEZ D PASARLE EL DOCUMENTO LE PASABA VARIAS STRINGS
// PERO JUAN ME DIJO QUE TINCHO LE DIJO QUE DOCUMENTO SI SE PUEDE INSTANCIAR