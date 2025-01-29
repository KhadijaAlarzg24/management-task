/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.cell;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.border.DefaultTableCeellRenderer;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author pc
 */
public class TableActionCellRenderer extends DefaultTableCellRenderer {
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSeleted, boolean hasFocus, int row, int column) {
        Component com = super.getTableCellRendererComponent(table, value, isSeleted, hasFocus, row, column);
        
        
        TABLPANEL action = new TABLPANEL();
        
        
        
        
        if(isSeleted==false&&row %2==0){ 
            action.setBackground(Color.white);
             
    }else{
             action.setBackground(com.getBackground());
        }
             return action;
     
  }
 
}
