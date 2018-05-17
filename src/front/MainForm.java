/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front;


import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matias
 */
public class MainForm extends javax.swing.JFrame {

    private ArrayList<Experimento> list=new ArrayList<Experimento>();
    
    public MainForm() {
        initComponents();
        this.show();
        this.rbtnPoliticaA.setSelected(true);
        this.txtResultA.setEditable(false);
        this.txtResultB.setEditable(false);
        this.btnConclusion.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblExperimentos = new javax.swing.JTable();
        lblCantExp = new javax.swing.JLabel();
        txtCantExp = new javax.swing.JTextField();
        lblPolitica = new javax.swing.JLabel();
        rbtnPoliticaA = new javax.swing.JRadioButton();
        rbtnPoliticaB = new javax.swing.JRadioButton();
        btnSimular = new javax.swing.JButton();
        btnConclusion = new javax.swing.JButton();
        lblCostos = new javax.swing.JLabel();
        lblPolA = new javax.swing.JLabel();
        lblPolB = new javax.swing.JLabel();
        txtResultA = new javax.swing.JTextField();
        txtResultB = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblExperimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "n°Exp", "Cantidad de Pedidos", "RND demanda", "Demanda", "Venta", "Sobrante", "Faltante", "Costo Periodico", "Devolucion Sob.", "Costo Faltante.", "Costo Acumulado"
            }
        ));
        jScrollPane1.setViewportView(tblExperimentos);

        lblCantExp.setText("Cantidad de Experimentos");

        txtCantExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantExpActionPerformed(evt);
            }
        });

        lblPolitica.setText("Politica");

        rbtnPoliticaA.setText("Politica A");
        rbtnPoliticaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPoliticaAActionPerformed(evt);
            }
        });

        rbtnPoliticaB.setText("Politica B");
        rbtnPoliticaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPoliticaBActionPerformed(evt);
            }
        });

        btnSimular.setText("Simular");
        btnSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularActionPerformed(evt);
            }
        });

        btnConclusion.setText("Conclusión");
        btnConclusion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConclusionActionPerformed(evt);
            }
        });

        lblCostos.setText("Costo promedio de comercialización diaria:");

        lblPolA.setText("Politica A");

        lblPolB.setText("Politica B");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPolitica)
                            .addComponent(lblCantExp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnPoliticaA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnPoliticaB))
                            .addComponent(txtCantExp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSimular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConclusion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCostos)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPolA, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPolB))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtResultA, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtResultB)))
                        .addGap(15, 15, 15)))
                .addGap(276, 276, 276))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantExp)
                    .addComponent(txtCantExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPolitica)
                    .addComponent(rbtnPoliticaA)
                    .addComponent(rbtnPoliticaB))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimular)
                            .addComponent(btnConclusion)
                            .addComponent(lblPolA)
                            .addComponent(lblPolB))
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCostos)
                            .addComponent(txtResultA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResultB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantExpActionPerformed

    private void rbtnPoliticaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPoliticaBActionPerformed
    this.rbtnPoliticaA.setSelected(false);
    }//GEN-LAST:event_rbtnPoliticaBActionPerformed

    private void rbtnPoliticaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPoliticaAActionPerformed
    this.rbtnPoliticaB.setSelected(false);      
    }//GEN-LAST:event_rbtnPoliticaAActionPerformed
    
    public void addRowToJTable(ArrayList<Experimento> lista)
    {
        DefaultTableModel model = (DefaultTableModel) tblExperimentos.getModel();
        ArrayList<Experimento> list =lista;
        Object rowData[] = new Object[11];
        for(int i = 0; i < list.size(); i++)
        {
            rowData[0] = list.get(i).numero;
            rowData[1] = list.get(i).cantidadPedidos;
            rowData[2] = list.get(i).rndDemanda;
            rowData[3] = list.get(i).demanda;
            rowData[4] = list.get(i).ventas;
            rowData[5] = list.get(i).sobrante;
            rowData[6] = list.get(i).faltante;
            rowData[7] = list.get(i).calcularCostoPeriodicos();
            rowData[8] = list.get(i).calcularDevolucionPorSobrante();
            rowData[9] = list.get(i).calcularCostoPorFaltante();
            if (i>0) {
                rowData[10] = (list.get(i-1).CostoTotal + list.get(i).CostoTotal);
                list.get(i).setCostoTotal((list.get(i-1).CostoTotal + list.get(i).CostoTotal));
            }
            else{
               rowData[10] = list.get(i).CostoTotal; 
            }
            

            model.addRow(rowData);
        }
                
    }
    
    
    private void btnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularActionPerformed
       DefaultTableModel model = (DefaultTableModel) this.tblExperimentos.getModel();
       model.setRowCount(0); //borro tabla
       this.list.clear(); //vacio lista
       double Acumulador=0.00;

        if (this.rbtnPoliticaA.isSelected()) {
            for (int i = 0; i < Integer.parseInt(this.txtCantExp.getText()); i++) {
                Experimento ex=new Experimento((i+1),23);
                list.add(ex);           
            }     
            
        }
        else {
                
                Experimento ex=new Experimento((1),23);
                int auxPedidos=(ex.getVentas()+ex.getFaltante());
                list.add(ex);
                
                for (int i = 1; i < Integer.parseInt(this.txtCantExp.getText()); i++) {
                Experimento exp=new Experimento((i+1),auxPedidos);
                auxPedidos=exp.getVentas()+exp.getFaltante();
                list.add(exp);
                
            }
        }
        
        
           addRowToJTable(this.list);     
        Acumulador=list.get(list.size()-1).CostoTotal;
       if (this.rbtnPoliticaA.isSelected()){
           this.txtResultA.setEditable(true);
           this.txtResultA.setText(Double.toString(truncateDecimal(Acumulador/Double.parseDouble(this.txtCantExp.getText()))));
           this.txtResultA.setEditable(false);
           if (!this.txtResultB.getText().isEmpty()) {
               this.btnConclusion.setEnabled(true);       
           }
       }
       else{
            this.txtResultB.setEditable(true);
           this.txtResultB.setText(Double.toString(truncateDecimal(Acumulador/Double.parseDouble(this.txtCantExp.getText()))));
           this.txtResultB.setEditable(false);
           if (!this.txtResultA.getText().isEmpty()) {
               this.btnConclusion.setEnabled(true);       
           }
       }

        
    }//GEN-LAST:event_btnSimularActionPerformed

    private void btnConclusionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConclusionActionPerformed
        if (Double.parseDouble(this.txtResultA.getText())>Double.parseDouble(this.txtResultB.getText())) {
                JFrame parent = new JFrame();
                JOptionPane.showMessageDialog(parent, "La política B es mejor ya que el costo de comercialización diario promedio es menor");
        }
        else{
            JFrame parent = new JFrame();
            JOptionPane.showMessageDialog(parent, "La política A es mejor ya que el costo de comercialización diario promedio es menor");
        }
    }//GEN-LAST:event_btnConclusionActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
    
    private static double truncateDecimal(double x)
{
    if ( x > 0) {
        return new BigDecimal(String.valueOf(x)).setScale(4, BigDecimal.ROUND_FLOOR).doubleValue();
    } else {
        return new BigDecimal(String.valueOf(x)).setScale(4, BigDecimal.ROUND_CEILING).doubleValue();
    }
}
    
public class Experimento {
    private int numero;
    private int cantidadPedidos;
    private double rndDemanda;
    private int demanda;
    private int ventas;
    private int faltante;
    private int sobrante;
    private double CostoTotal;

    public Experimento(int numero, int cantidadPedidos) {
        this.numero = numero;
        this.cantidadPedidos = cantidadPedidos;
        this.rndDemanda=Math.random();
        this.demanda=calcularDemanda(rndDemanda);
        if (cantidadPedidos>demanda) 
        {
            ventas=demanda;
            sobrante=cantidadPedidos-demanda;
            faltante=0;
            
        }
        else if (cantidadPedidos<demanda) 
        {
            ventas=cantidadPedidos;
            sobrante=0;
            faltante=demanda-cantidadPedidos;
            
        }
        else 
        {
            ventas=demanda;
            sobrante=0;
            faltante=0;
        }
        calcularCostoTotal();
    
    }
    public double calcularCostoPeriodicos(){
        return 0.8*this.cantidadPedidos;
    }
    public double calcularDevolucionPorSobrante(){
        return 0.2*this.sobrante;
    }
    public double calcularCostoPorFaltante(){
        return 0.4*this.faltante;
    }
    public void calcularCostoTotal(){
        this.CostoTotal= calcularCostoPeriodicos()-calcularDevolucionPorSobrante()+calcularCostoPorFaltante();
    }
    public int calcularDemanda(double random)
    {
        int retorno=0;
        if (random<0.30) 
        {
            retorno= 20;
        }
        if (random>=0.30 && random<0.55) 
        {
            retorno=  21;
        }
        if (random>=0.55 && random<0.75) 
        {
            retorno=  22;
        }
        if (random>=0.75 && random<0.90) 
        {
            retorno=  23;
        }
        if (random>=0.90 && random<0.95) 
        {
            retorno=  24;
        }
        if (random>=0.95 && random<1.00) 
        {
            retorno=  25;
        }
        return retorno;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCantidadPedidos() {
        return cantidadPedidos;
    }

    public void setCantidadPedidos(int cantidadPedidos) {
        this.cantidadPedidos = cantidadPedidos;
    }

    public double getRndDemanda() {
        return rndDemanda;
    }

    public void setRndDemanda(double rndDemanda) {
        this.rndDemanda = rndDemanda;
    }

    public int getDemanda() {
        return demanda;
    }
    public void setCostoTotal(double costoTotal){
        this.CostoTotal=costoTotal;
    }
            

    public void setDemanda(int demanda) {
        this.demanda = demanda;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public int getFaltante() {
        return faltante;
    }

    public void setFaltante(int faltante) {
        this.faltante = faltante;
    }

    public int getSobrante() {
        return sobrante;
    }

    public void setSobrante(int sobrante) {
        this.sobrante = sobrante;
    }
    
    


    
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConclusion;
    private javax.swing.JButton btnSimular;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantExp;
    private javax.swing.JLabel lblCostos;
    private javax.swing.JLabel lblPolA;
    private javax.swing.JLabel lblPolB;
    private javax.swing.JLabel lblPolitica;
    private javax.swing.JRadioButton rbtnPoliticaA;
    private javax.swing.JRadioButton rbtnPoliticaB;
    private javax.swing.JTable tblExperimentos;
    private javax.swing.JTextField txtCantExp;
    private javax.swing.JTextField txtResultA;
    private javax.swing.JTextField txtResultB;
    // End of variables declaration//GEN-END:variables
}
