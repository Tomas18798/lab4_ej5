
package modelo;


public class Vendedor {
    private int idVendedor;
    private String nombreVendedor;

    @Override
    public String toString() {
        return "Vendedor{" + "idVendedor=" + idVendedor + ", nombreVendedor=" + nombreVendedor + '}';
    }

    public Vendedor() {
    }

    public Vendedor(int idVendedor, String nombreVendedor) {
        this.idVendedor = idVendedor;
        this.nombreVendedor = nombreVendedor;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }
}
