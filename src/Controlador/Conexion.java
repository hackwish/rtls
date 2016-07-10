/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Jorge
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    private Connection conexion;
    private Statement sentenciaSQL;
    private ResultSet resultado;
    
    public Conexion() throws ClassNotFoundException,java.sql.SQLException,InstantiationException,IllegalAccessException
    {
        String controller= "com.mysql.jdbc.Driver";
        Class.forName(controller).newInstance(); // newInstance asegurarse que el driver esta en memoria
        conectar();
    }

    public void conectar() throws java.sql.SQLException
    {
        String URL_bd="jdbc:mysql://127.0.0.1:3306/rtls";
        String usuario="root";
        String contraseña="korpkorp";
        setConexion(java.sql.DriverManager.getConnection(URL_bd,usuario,contraseña));
        setSentenciaSQL(getConexion().createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE, java.sql.ResultSet.CONCUR_UPDATABLE));
        //JOptionPane.showMessageDialog(null, "Conectado a BD Capas..","Aviso conexion",JOptionPane.INFORMATION_MESSAGE);
               
    }
    
    public void cerrarConexion()throws java.sql.SQLException
    {
        if(getResultado() != null) getResultado().close();
        if(getSentenciaSQL() != null) getSentenciaSQL().close();
        if(getConexion() != null) getConexion().close();
        //JOptionPane.showMessageDialog(null, "Cierre BD, Hasta Pronto", "Good-Bye", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * @return the conexion
     */
    public Connection getConexion() {
        return conexion;
    }

    /**
     * @param conexion the conexion to set
     */
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    /**
     * @return the sentenciaSQL
     */
    public Statement getSentenciaSQL() {
        return sentenciaSQL;
    }

    /**
     * @param sentenciaSQL the sentenciaSQL to set
     */
    public void setSentenciaSQL(Statement sentenciaSQL) {
        this.sentenciaSQL = sentenciaSQL;
    }

    /**
     * @return the resultado
     */
    public ResultSet getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(ResultSet resultado) {
        this.resultado = resultado;
    }
}
