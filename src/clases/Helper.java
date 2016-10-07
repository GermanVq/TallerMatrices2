/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class Helper {
     public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
            }
        }
        public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);
         
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    
    }
    public static void letraB(JTable tabla1, JTable tabla2) { 
        int fl, cl, aux;

        fl = tabla1.getRowCount();
        cl = tabla1.getColumnCount();

        for (int i = 0; i < fl; i++) {
            for (int j = 0; j < cl; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (j==cl-1 && i!=0 && i!=fl-1 && i!=fl/2 || j==0 || i==0 && j!=cl-1 || i==fl-1 && j!=cl-1 || i==fl/2 && j!=fl-1){
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    } 
    
   public static void letraK(JTable tabla1, JTable tabla2) {
        int fl, cl, aux;

        fl = tabla1.getRowCount();
        cl = tabla1.getColumnCount();

        for (int i = 0; i < fl; i++) {
            for (int j = 0; j < cl; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if ((i+(j-1)==(fl-1)/2)||(i-(j-1)==(fl-1)/2)||(j==0) ) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }  
    
  public static void letraM(JTable tabla1, JTable tabla2) { 
        int fl, cl, aux;

        fl = tabla1.getRowCount();
        cl= tabla1.getColumnCount();

        for (int i = 0; i < fl; i++) {
            for (int j = 0; j < cl; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (i + j == fl - 1 && i <= j || i == j && i + j <= fl || j==0 || j==cl-1) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }  
  
  public static void letraW(JTable tabla1, JTable tabla2) { 
        int fl, cl, aux;

        fl = tabla1.getRowCount();
        cl = tabla1.getColumnCount();

        for (int i = 0; i < fl; i++) {
            for (int j = 0; j < cl; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if ((j==0 || j==cl - 1 ) || (fl/2 > j && i==cl-1) || (fl/2<j && i==cl-1) || (j==cl/2 && i>=cl/2  && i!=cl-1 )) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }  
  
  public static void letraQ(JTable tabla1, JTable tabla2) { 
        int fl, cl, aux;

        fl = tabla1.getRowCount();
        cl = tabla1.getColumnCount();

        for (int i = 0; i < fl; i++) {
            for (int j = 0; j < cl; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (i==0 && j!=0 && j!=cl-1 || j==0 && i!=0 && i!=cl-1 && i!=cl-2 || i==fl-2 && j!=0 && j!=cl-1 || j==cl-1 && i!=0 && i!=cl-2) {
                    
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }  
    
    public static void letraJ(JTable tabla1, JTable tabla2) { 
        int fl, cl, aux;

        fl = tabla1.getRowCount();
        cl = tabla1.getColumnCount();

        for (int i = 0; i < fl; i++) {
            for (int j = 0; j < cl; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (i==0 || j==cl/2 || i==cl-1 && j<=fl/2 || j==0 && i>=cl/2) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }  
    
    public static void letraG(JTable tabla1, JTable tabla2) { 
        int fl, cl, aux;

        fl = tabla1.getRowCount();
        cl = tabla1.getColumnCount();

        for (int i = 0; i < fl; i++) {
            for (int j = 0; j < cl; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if ((i==0 || j==0 || i==(fl/2) || i==fl-1) || (j==cl-1 && i>=fl/2) || ( j==cl-1 && i==1)) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    } 
    
    public static void letraR(JTable tabla1, JTable tabla2) {
        int fl, cl, aux;

        fl= tabla1.getRowCount();
        cl = tabla1.getColumnCount();

        for (int i = 0; i < fl; i++) {
            for (int j = 0; j < cl; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (j == 0 || i == 0 || i == fl / 2 || j == cl-1 && i<=fl/2 || j == i && i + j >= cl) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    } 
    
    public static void RelojDeArena(JTable tabla1, JTable tabla2) {  
        int fl, cl, aux;

        fl = tabla1.getRowCount();
        cl = tabla1.getColumnCount();

        for (int i = 0; i < fl; i++) {
            for (int j = 0; j < cl; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if(i >= j && j>=fl - 1-i || i <= j && j<=fl - 1-i) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    } 
    
    public static void RelojInvertido(JTable tabla1, JTable tabla2) {  
        int fl, cl, aux;

        fl = tabla1.getRowCount();
        cl = tabla1.getColumnCount();

        for (int i = 0; i < fl; i++) {
            for (int j = 0; j < cl; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (j >= i  && i>=fl - 1 - j  || j <= i && i<=fl - 1 - j  ) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    } 
    
   public static void Cruz(JTable tabla1, JTable tabla2) {  
        int fl, cl, aux;

        fl = tabla1.getRowCount();
        cl = tabla1.getColumnCount();

        for (int i = 0; i < fl; i++) {
            for (int j = 0; j < cl; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if ( j==cl/2 || j==(cl/2)-1 || i==fl/2 || i==(fl/2)-1) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }   
    
    public static void Rombo(JTable tabla1, JTable tabla2) {  
        int fl, cl, aux;

        fl = tabla1.getRowCount();
        cl = tabla1.getColumnCount();

        for (int i = 0; i < fl; i++) {
            for (int j = 0; j < cl; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (i == j-fl/2 || j==fl/2 - i   || j==fl - i + fl/2-1   || i == j+fl/2) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }   
    
}
