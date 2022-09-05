package controlador;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Set;
import modelo.Transaccion;
import modelo.Vendedor;

public class ControladorTransaccion {

    private String conexion;

    public ControladorTransaccion() {
        conexion = "jdbc:mysql://localhost/ej5_lab4?user=root&password=tomas18798";
        //TODO: cambiar credenciales de la conexión según sus propias bases.
    }

    public Transaccion transaccionDeMayorValor() {

        String query = "select t.id,t.fecha,t.`tipoOperacion`,`tipoInmueble`,max(t.monto)as \"monto\",v.id as \"IdVendedor\",v.nombre_completo \n"
                + "from transacciones t, vendedores v\n"
                + "where t.`idVendedor` = v.id";
        Transaccion t = new Transaccion();

        try (Connection cnn = DriverManager.getConnection(conexion);
                Statement stmt = cnn.createStatement();
                ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                t.setFecha(rs.getNString("fecha"));
                t.setMonto(rs.getFloat("monto"));
                t.setTipoInmueble(rs.getInt("tipoInmueble"));
                t.setTipoOperacion(rs.getInt("tipoOperacion"));
                Vendedor v = new Vendedor(rs.getInt("idVendedor"), rs.getString(("nombre_completo")));
                t.setVendedor(v);
            }

        } catch (Exception e) {

        }

        return t;
    }

    public boolean insertarTransaccion(Transaccion transaccion) {
        boolean ok;

        try (Connection cnn = DriverManager.getConnection(conexion);
                PreparedStatement ps = cnn.prepareStatement("INSERT INTO transacciones (fecha,idVendedor,tipoOperacion,tipoInmueble,monto) VALUES( ?, ?, ?,?,?)");) {
            ps.setString(1, transaccion.getFecha());
            ps.setInt(2, transaccion.getVendedor().getIdVendedor());
            ps.setFloat(3, transaccion.getTipoOperacion());
            ps.setFloat(4, transaccion.getTipoInmueble());
            ps.setFloat(5, transaccion.getMonto());

            ps.execute();

            ok = true;

        } catch (Exception e) {
            ok = false;
        }

        return ok;

    }

    public List<Transaccion> obtenerTransacciones() {

        List<Transaccion> lista = new ArrayList();

        String query = "select t.id,t.fecha,t.`tipoOperacion`,t.`tipoInmueble`,t.monto,v.id as 'idV',v.nombre_completo from transacciones t,vendedores v where t.`idVendedor`=v.id;";

        try (Connection cnn = DriverManager.getConnection(conexion); Statement stmt = cnn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String fecha = rs.getString("fecha");
                int tipoO = rs.getInt("tipoOperacion");
                int tipoI = rs.getInt("tipoInmueble");
                float monto = rs.getFloat("monto");
                int idV = rs.getInt("idV");
                String nombreV = rs.getString("nombre_completo");
                Vendedor v = new Vendedor(idV,nombreV);

                lista.add(new Transaccion(id, fecha, v, tipoO, tipoI, monto));
            }
        } catch (Exception e) {
        }

        return lista;
    }

    public List<Vendedor> obtenerVendedores() {
        List<Vendedor> lista = new ArrayList();

        String query = "Select * from vendedores";

        try (Connection cnn = DriverManager.getConnection(conexion); Statement stmt = cnn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre_completo");

                lista.add(new Vendedor(id, nombre));
            }
        } catch (Exception e) {
        }

        return lista;
    }

}

//
//    
//    
//    public float obtenerReporte1() {
//        String query = "SELECT SUM(t.importe) as total FROM Servicios t";
//        float total = 0;
//         try ( Connection cnn = DriverManager.getConnection(conexion);  Statement stmt = cnn.createStatement();  ResultSet rs = stmt.executeQuery(query)) {
//            if(rs.next()) {
//                total = rs.getFloat("total");
//            }
//        } catch (Exception e) {
//        }
//        return total;
//    }
//
//    public List<Servicio> obtenerReporte3(int idHabitacion) {
//        List<Servicio> lst = new ArrayList<>();
//        String query = "SELECT * FROM Servicios t WHERE idHabitacion = " + idHabitacion;
//         try ( Connection cnn = DriverManager.getConnection(conexion);  Statement stmt = cnn.createStatement();  ResultSet rs = stmt.executeQuery(query)) {
//            while(rs.next()) {
//                int id = rs.getInt("idServicio");
//                String concepto = rs.getString("concepto");
//                float importe = rs.getFloat("importe");
//                lst.add(new Servicio(id, concepto,importe, null)); //No necesitamos recuperar los datos de la habitación
//            }
//        } catch (Exception e) {
//        }
//        return lst;
//    }
//    

