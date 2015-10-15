/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prc2;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Sergio
 */
public class Dash extends javax.swing.JFrame {
    
    Dataset dataset = new Dataset("oxford");
    Graficos graph = new Graficos();
    /**
     * Creates new form Dash
     */
    public Dash() {
        initComponents();
        Year.setVisible(false);
        jLabel2.setVisible(false);
    }

      public int get_pos(int n)
    {
        int retorno = -1;
        for (int i = 0; i < dataset.year.size();i++)
        {
            if(n == dataset.year.get(i))
            {
                retorno = i;
                break;
            }
        }
        return retorno;
    }
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        Place = new javax.swing.JComboBox();
        Year = new javax.swing.JComboBox();
        But_tmax = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CrearData = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        But_tmin = new javax.swing.JButton();
        But_af = new javax.swing.JButton();
        But_rain = new javax.swing.JButton();
        But_sun = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Place.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "aberporth", "armagh", "ballypatrick", "bradford", "braemar", "camborne", "cambridge", "cardiff", "chivenor", "cwmystwyth", "dunstaffnage", "durham", "eastbourne", "eskdalemuir", "heathrow", "hurn", "lerwick", "leuchars", "lowestoft", "manston", "nairn", "newton", "oxford", "paisley", "rossonwye", "ringway", "shawbury", "sheffield", "southampton", "stornoway", "suttonbonington", "tiree", "valley", "waddington", "whitby", "wickairport", "yeovilton" }));
        Place.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceActionPerformed(evt);
            }
        });

        But_tmax.setText("Temperatura Maxima");
        But_tmax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But_tmaxActionPerformed(evt);
            }
        });

        jLabel1.setText("Lugar");

        jLabel2.setText("Año");

        CrearData.setText("Cargar Lugar");
        CrearData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearDataActionPerformed(evt);
            }
        });

        jLabel3.setText("Graficos");

        But_tmin.setText("Temperatura Minima");
        But_tmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But_tminActionPerformed(evt);
            }
        });

        But_af.setText("Dias de Heladas");
        But_af.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But_afActionPerformed(evt);
            }
        });

        But_rain.setText("Lluvia Recogida");
        But_rain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But_rainActionPerformed(evt);
            }
        });

        But_sun.setText("Horas de Sol");
        But_sun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But_sunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(Place, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addComponent(Year, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(But_tmax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CrearData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(But_tmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(But_af, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(But_rain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(But_sun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Place, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CrearData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(But_tmax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(But_tmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(But_af)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(But_rain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(But_sun)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void But_tmaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But_tmaxActionPerformed
        // TODO add your handling code here:
        //jLabel1.setText(jComboBox1.getSelectedItem().toString());
        //jLabel2.setText(jComboBox2.getSelectedItem().toString());
        int n = Integer.parseInt(Year.getSelectedItem().toString());
        int ini = get_pos(n);
        //Year.removeAllItems();
        
        //jLabel2.setText(""+ini);
        
        //jPanel1.setVisible(true);
        
        
        graph.PieGraphF(dataset.tmax, ini, But_tmax.getText(), ""+n);
        
    }//GEN-LAST:event_But_tmaxActionPerformed

    private void PlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceActionPerformed
        // TODO add your handling code here:
        //dataset.crear_dataset(jComboBox1.getSelectedItem().toString());
        //jLabel1.setText(jComboBox1.getSelectedItem().toString());
        
    }//GEN-LAST:event_PlaceActionPerformed

    private void CrearDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearDataActionPerformed
        // TODO add your handling code here:
        dataset.crear_dataset(Place.getSelectedItem().toString());
        Year.setVisible(true);
        jLabel2.setVisible(true);
               
        for (int i = 0; i < dataset.year.size();i+=12)
        {
            Year.addItem(dataset.year.get(i));
        }
    }//GEN-LAST:event_CrearDataActionPerformed

    private void But_tminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But_tminActionPerformed
        // TODO add your handling code here:
        
        int n = Integer.parseInt(Year.getSelectedItem().toString());
        int ini = get_pos(n);
                
        graph.PieGraphF(dataset.tmin, ini, But_tmin.getText(), ""+n);
    }//GEN-LAST:event_But_tminActionPerformed

    private void But_afActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But_afActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(Year.getSelectedItem().toString());
        int ini = get_pos(n);
                
        graph.PieGraphI(dataset.afdays, ini, But_af.getText(), ""+n);
    }//GEN-LAST:event_But_afActionPerformed

    private void But_rainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But_rainActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(Year.getSelectedItem().toString());
        int ini = get_pos(n);
                
        graph.PieGraphF(dataset.rain, ini, But_rain.getText(), ""+n);
    }//GEN-LAST:event_But_rainActionPerformed

    private void But_sunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But_sunActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(Year.getSelectedItem().toString());
        int ini = get_pos(n);
                
        graph.PieGraphF(dataset.sun, ini, But_sun.getText(), ""+n);
    }//GEN-LAST:event_But_sunActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton But_af;
    private javax.swing.JButton But_rain;
    private javax.swing.JButton But_sun;
    private javax.swing.JButton But_tmax;
    private javax.swing.JButton But_tmin;
    private javax.swing.JButton CrearData;
    private javax.swing.JComboBox Place;
    private javax.swing.JComboBox Year;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
