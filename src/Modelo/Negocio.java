/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author felipe.hernandez
 */
import DATOS.Datos;
import Vista.Ingreso;
import javax.swing.JOptionPane;
import java.lang.Math;

public class Negocio {
    
    public void validar (String valorx,String valory,String rssi1,String rssi2,String rssi3){
        Datos dt = new Datos();
        if( !valorx.isEmpty() && !valory.isEmpty() && !rssi1.isEmpty() && !rssi2.isEmpty() && !rssi3.isEmpty()){
                double x =  Double.parseDouble(valorx);
                double y =  Double.parseDouble(valory);
                int i = 0;
                int j = 0;
                int d = 0;
                double R1 =  Double.parseDouble(rssi1);
                double R2 =  Double.parseDouble(rssi2);
                double R3 =  Double.parseDouble(rssi3);
                double divx=0;
                double divy=0;
                double vx=0;
                //float resux = 10;
                //float resuy = 10;
                i =2;
                d=9;
                j=14;
                divx=(2*d);
                divy=(-2*j);
                double resux = (((R1-R2))+(Math.pow(d,2)))/divx;
                double resuy = (((R3-R1))+(Math.pow(resux,2))-(Math.pow((resux-i),2))-(Math.pow(j,2)))/divy;
                //float resux = (((Math.pow(rssi1,2)) - (Math.pow(rssi2,2)) + (Math.pow(valorx,2)))/float((2*valorx)));
                //float resuy = ((Math.pow(R1,2))-(Math.pow(R3,2))-(Math.pow(x,2)+(Math.pow((x-i),2))+Math.pow(y,2))/float(2*y));             
                
                String resx =  Double.toString(resux);
                String resy =  Double.toString(resuy);
    
            dt.guardarEnBd(valorx, valory, rssi1, rssi2, rssi3, resx, resy);
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese todos los campos correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        // && !dt.Valida(cod)
        
    }
 

}
