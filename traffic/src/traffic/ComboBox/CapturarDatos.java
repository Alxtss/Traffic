package traffic.ComboBox;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import traffic.conexion;

/**
 *
 * @author Alexis
 */
public class CapturarDatos 
{
    /*******************Combobox************************************************/
    
    public DefaultComboBoxModel CapturarNumeroDeRuta()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try
        {
            conexion con = new conexion("localhost", "root", "123456", "db_traffic");
            ResultSet rs = con.ejecutarSelect("select * from view_NRuta");
            
            while(rs.next())
            {
                modelo.addElement(rs.getString(1));
            }
        }
        catch(Exception ex){System.out.print(ex);}
        return modelo;
    }
    
    /*-------------------------------------------------------------------------*/
    
    public DefaultComboBoxModel CapturarLetraDeRuta()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try
        {
            conexion con = new conexion("localhost", "root", "123456", "db_traffic");
            ResultSet rs = con.ejecutarSelect("select * from view_LetraRuta");
            
            while(rs.next())
            {
                modelo.addElement(rs.getString(1));
            }
        }
        catch(Exception ex){System.out.print(ex);}
        return modelo;
    }
    
    /*-------------------------------------------------------------------------*/

}
