/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdrapp;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import hdrapp.LoadDialog;

/**
 *
 * @author escal
 */
public class HDRGUI extends javax.swing.JFrame {

    /**
     * Creates new form HDRGUI
     */
    public HDRGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HDRSelectionGroup = new javax.swing.ButtonGroup();
        BarraEstadoPanel = new javax.swing.JPanel();
        BarraEstado = new javax.swing.JPanel();
        Estado = new javax.swing.JLabel();
        AppPanel = new javax.swing.JPanel();
        BotonCargar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        NumeroSecuencia = new javax.swing.JSpinner();
        CargaEtiqueta = new javax.swing.JLabel();
        GenerarPanel = new javax.swing.JPanel();
        HDRTradButton = new javax.swing.JRadioButton();
        ExpFusionButton = new javax.swing.JRadioButton();
        GenerarButton = new javax.swing.JButton();
        ModoEtiqueta = new javax.swing.JLabel();
        ImgFPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador de HDR | Por Rafael Vasquez y Raquel Escalante");

        BarraEstado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Estado.setText("Bienvenido");

        javax.swing.GroupLayout BarraEstadoLayout = new javax.swing.GroupLayout(BarraEstado);
        BarraEstado.setLayout(BarraEstadoLayout);
        BarraEstadoLayout.setHorizontalGroup(
            BarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Estado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BarraEstadoLayout.setVerticalGroup(
            BarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Estado)
                .addContainerGap())
        );

        javax.swing.GroupLayout BarraEstadoPanelLayout = new javax.swing.GroupLayout(BarraEstadoPanel);
        BarraEstadoPanel.setLayout(BarraEstadoPanelLayout);
        BarraEstadoPanelLayout.setHorizontalGroup(
            BarraEstadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraEstadoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BarraEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BarraEstadoPanelLayout.setVerticalGroup(
            BarraEstadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraEstadoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BarraEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BotonCargar.setText("Cargar imágenes de secuencia");
        BotonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCargarActionPerformed(evt);
            }
        });

        jLabel2.setText("Número de imágenes:");

        CargaEtiqueta.setText("Carga de imágenes para procesar:");

        HDRSelectionGroup.add(HDRTradButton);
        HDRTradButton.setSelected(true);
        HDRTradButton.setText("HDR Tradicional");
        HDRTradButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HDRTradButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HDRTradButtonActionPerformed(evt);
            }
        });

        HDRSelectionGroup.add(ExpFusionButton);
        ExpFusionButton.setText("Fusión de Exposición");
        ExpFusionButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExpFusionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpFusionButtonActionPerformed(evt);
            }
        });

        GenerarButton.setText("Generar imagen HDR");
        GenerarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarButtonActionPerformed(evt);
            }
        });

        ModoEtiqueta.setText("Modo:");
        ModoEtiqueta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ImgFPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout ImgFPanelLayout = new javax.swing.GroupLayout(ImgFPanel);
        ImgFPanel.setLayout(ImgFPanelLayout);
        ImgFPanelLayout.setHorizontalGroup(
            ImgFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );
        ImgFPanelLayout.setVerticalGroup(
            ImgFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout GenerarPanelLayout = new javax.swing.GroupLayout(GenerarPanel);
        GenerarPanel.setLayout(GenerarPanelLayout);
        GenerarPanelLayout.setHorizontalGroup(
            GenerarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenerarPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(GenerarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GenerarPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(ModoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HDRTradButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ExpFusionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(GenerarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(GenerarPanelLayout.createSequentialGroup()
                        .addComponent(ImgFPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39))))
        );
        GenerarPanelLayout.setVerticalGroup(
            GenerarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GenerarPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(GenerarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExpFusionButton)
                    .addComponent(GenerarButton)
                    .addComponent(ModoEtiqueta)
                    .addComponent(HDRTradButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImgFPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout AppPanelLayout = new javax.swing.GroupLayout(AppPanel);
        AppPanel.setLayout(AppPanelLayout);
        AppPanelLayout.setHorizontalGroup(
            AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AppPanelLayout.createSequentialGroup()
                        .addGroup(AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonCargar)
                            .addGroup(AppPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NumeroSecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(GenerarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CargaEtiqueta))
                .addContainerGap())
        );
        AppPanelLayout.setVerticalGroup(
            AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CargaEtiqueta)
                .addGroup(AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AppPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NumeroSecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addComponent(GenerarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraEstadoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AppPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AppPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BarraEstadoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }
    
    
    private void BotonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCargarActionPerformed
        // TODO add your handling code here:
        LoadDialog ld = new LoadDialog(this, true);
        ld.setVisible(true);
    }//GEN-LAST:event_BotonCargarActionPerformed

    private void ExpFusionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpFusionButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExpFusionButtonActionPerformed

    private void GenerarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenerarButtonActionPerformed

    private void HDRTradButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HDRTradButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HDRTradButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HDRGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HDRGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HDRGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HDRGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HDRGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AppPanel;
    private javax.swing.JPanel BarraEstado;
    private javax.swing.JPanel BarraEstadoPanel;
    private javax.swing.JButton BotonCargar;
    private javax.swing.JLabel CargaEtiqueta;
    private javax.swing.JLabel Estado;
    private javax.swing.JRadioButton ExpFusionButton;
    private javax.swing.JButton GenerarButton;
    private javax.swing.JPanel GenerarPanel;
    private javax.swing.ButtonGroup HDRSelectionGroup;
    private javax.swing.JRadioButton HDRTradButton;
    private javax.swing.JPanel ImgFPanel;
    private javax.swing.JLabel ModoEtiqueta;
    private javax.swing.JSpinner NumeroSecuencia;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
