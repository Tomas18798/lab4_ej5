package modelo;

public class Transaccion {

    private int id, tipoOperacion, tipoInmueble;
    private String fecha;
    private float monto;
    private int id_Vendedor;

    

    
    @Override
    public String toString() {
        return id +" - Tipo operacion: "+ tipoOperacion  +" - Tipo inmueble: "+ tipoInmueble + " - Fecha " + fecha + " - Monto " + monto + " - Vendedor" + id_Vendedor;
    }

    public Transaccion() {
    }

    public Transaccion(int id, String fecha, int vendedor, int tipoOperacion, int tipoInmueble, float monto) {
        this.id = id;
        this.tipoOperacion = tipoOperacion;
        this.tipoInmueble = tipoInmueble;
        this.fecha = fecha;
        this.monto = monto;
        this.id_Vendedor = vendedor;
    }

    public Transaccion(String fecha, int vendedor, int tipoOperacion, int tipoInmueble, float monto) {

        this.tipoOperacion = tipoOperacion;
        this.tipoInmueble = tipoInmueble;
        this.fecha = fecha;
        this.monto = monto;
        this.id_Vendedor = vendedor;
    }

    public int getId_Vendedor() {
        return id_Vendedor;
    }

    public void setId_Vendedor(int id) {
        this.id_Vendedor = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(int tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public int getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(int tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Object[] toArray() {
        //Convertir el objeto en un arreglo:
        return new Object[]{this.id + this.fecha, this.monto, this.tipoOperacion, this.tipoInmueble};
    }

}
