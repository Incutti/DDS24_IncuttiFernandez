public class ExportarPDF implements EstrategiaDeExportacion{

    private AdapterExportadorPDF adapter;

    public ExportarPDF(AdapterExportadorPDF adapter) {
        this.adapter = adapter;
    }

    public AdapterExportadorPDF getAdapter() {
        return adapter;
    }

    public void setAdapter(AdapterExportadorPDF adapter) {
        this.adapter = adapter;
    }

    public String exportar (Exportable exportable){
        return adapter.exportar(exportable);
    }

}
