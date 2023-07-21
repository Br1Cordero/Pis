package modelo;

import modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SqlCliente extends conexion {

    public boolean Cliente(cliente cl) {

        try {
            PreparedStatement ps = null;
            Connection con = getConexion();
            String sql = "INSERT INTO cliente "
                    + "( NOMBRE_CLIENTE ,APELLIDO_CLIENTE,CEDULA_CLIENTE ,ESTADO_CIVIL "
                    + ",DOMICILIO,GENERO ,CELULAR_CLIENTE,CELULAR2_CLIENTE,CORREO_CLIENTE ,CORREO2_CLIENTE ,TARJETA_CLIENTE ,TARJET2_CLIENTE ) "
                    + "values (?,?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);

            ps.setString(1, cl.getNOMBRE_CLIENTE());
            ps.setString(2, cl.getAPELLIDO_CLIENTE());
            ps.setString(3, cl.getCEDULA_CLIENTE());
            ps.setString(4, cl.getESTADO_CIVIL());
            ps.setString(5, cl.getDOMICILIO());
            ps.setString(6, cl.getCELUAR_CLINETE());
            ps.setString(7, cl.getCELULAR2_CLIENTE());
            ps.setString(8, cl.getCORREO_CLIENTE());
            ps.setString(9, cl.getCORREO2_CLIENTE());
            ps.setString(10, cl.getTARJETA_CLIENTE());
            ps.setString(11, cl.getTARJETA2_CLIENTE());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SqlCliente.class.getName()).log(Level.SEVERE, null, ex);
       return false;
        }

    }
}
