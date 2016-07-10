/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DATOS;

/**
 *
 * @author Eduardo Klagges Sazo
 */

import Controlador.Conexion;
import Modelo.Negocio;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.lang.Math;

public class Datos {
    
    private static Conexion bd ;

   
    
    public boolean Valida(String us) {
        try {
            bd = new Conexion();
            bd.setResultado(bd.getSentenciaSQL().executeQuery("SELECT * from capadato where codigo='"+us+"'"));
            if(bd.getResultado().next()){
                return true;
            }
            else{
                return false;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
        
    }
    
    public String mostarTodo(){
        String txt="BD VACIA";
        try {
            bd = new Conexion();
            bd.setResultado(bd.getSentenciaSQL().executeQuery("SELECT * FROM rssi order by idrssi desc limit 1"));
            txt="\n\n";
            while(bd.getResultado().next()){
                txt=txt+"Tamaño Eje X: "+bd.getResultado().getString("valor_x")+" cm"+"\n"+"Tamaño Eje Y: "+bd.getResultado().getString("valor_y")+" cm"+"\n"+"RSSI R1: "+bd.getResultado().getString("rssi_valor1")+"\n"+"RSSI R2: "+bd.getResultado().getString("rssi_valor2")+"\n"+"RSSI R3: "+bd.getResultado().getString("rssi_valor3")+"\n"+"Coordenada X: "+bd.getResultado().getString("res_x")+"\n"+"Coordenada Y: "+bd.getResultado().getString("res_y");
                txt=txt+"\n";
            }
            System.out.println(txt);
            return txt;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return txt;
    }
    public void guardarEnBd(String valorx,String valory,String rssi1,String rssi2,String rssi3,String resx,String resy){
        try {
            bd = new Conexion();
            //int resx = 0;
            //int resy = 0;
            //int resx = (((math.pow(rssi1,2)) - (math.pow(rssi2,2)) + (math.pow(valorx,2)))/float((2*valorx)));
           // float resy = ((math.pow(R1,2))-(math.pow(R3,2))-(math.pow(x,2)+(math.pow((x-i),2))+math.pow(j,2))/(2*j)); 
            bd.getSentenciaSQL().executeUpdate("INSERT INTO rssi (valor_x,valor_y,rssi_valor1,rssi_valor2,rssi_valor3,res_x,res_y) VALUES ('"+valorx+"','"+valory+"','"+rssi1+"','"+rssi2+"','"+rssi3+"','"+resx+"','"+resy+"')");
            
            JOptionPane.showMessageDialog(null, "Registro Grabado");
            JOptionPane.showMessageDialog(null, "El dispositivo esta ubicado en: \n Eje X: "+resx+ "\n Eje Y: "+resy+"");
            bd.cerrarConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
