package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sqlUsuario extends conexion {

    public boolean registrar(usuario usr) {
        Connection con = getConexion();
        PreparedStatement ps = null;
        String sql = "INSERT INTO usuarios (NOMBRE, APELLIDO, CELULAR, CORREO, USUARIO, PASWORD, PASWORD_VERIFICACION) VALUES (?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getNOMBRE());
            ps.setString(2, usr.getAPELLIDO());
            ps.setString(3, usr.getCELULAR());
            ps.setString(4, usr.getCORREO());
            ps.setString(5, usr.getUSUARIO());
            ps.setString(6, usr.getPASWORD());
            ps.setString(7, usr.getPASWORD_VEREFICACION());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(sqlUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean login(usuario usr) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT ID_USUARIO, USUARIO, PASWORD , NOMBRE FROM usuarios WHERE usuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUSUARIO());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (usr.getPASWORD().equals(rs.getString(3))) {

                    usr.setIDUSUARIO(rs.getInt(1));
                    usr.setNOMBRE(rs.getString(4));
                    return true;
                }

            } else {
                return false;
            }
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(sqlUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int reistroUsuario(String usuario) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT count(ID_USUARIO) FROM usuarios WHERE usuario = ? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(sqlUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }

}
