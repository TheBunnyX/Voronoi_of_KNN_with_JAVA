/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package knnjava;

import java.util.Arrays;
import java.awt.*;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;

import java.util.Random;

import javax.swing.table.DefaultTableModel;
import java.lang.Math;
import javax.swing.JFrame;
import javax.swing.JPanel;



//sort table
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;


/**
 *
 * @author Mongkol
 */
public class KMainClass extends javax.swing.JFrame {
    int table = 500;
    int worked = 0;
    int deleterow = 0;
    int clicked1 = 0;
    static int countofArray = 20;
    static KMainClass M = new KMainClass();
    static KNNData KD;
    static KNNData[] KD_array = new KNNData[countofArray];
    static int index = 0;
    boolean clicked = false;
    double[][] doubleArray = new double[table][table];
    Graphics g;
    Graphics h;
    public KMainClass(){
        initComponents();
        g = drawingBoard.getGraphics();
        drawingBoard.paintComponents(g);
        //drawingBoard.repaint();
        drawingBoard.setVisible(true);
    }
    public KNNData[] getData(){
        return KD_array;
    }
    public int getIndex(){
        return index;
    }
    public void input(KNNData D){
           KD_array[index++] = D; 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel2 = new javax.swing.JPanel();
        BT1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TB1 = new javax.swing.JTable();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        drawingBoard = new javax.swing.JPanel();
        jButton5246 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));

        BT1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BT1.setText("Genarate");
        BT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("K-Nearest Neighbors (KNN)");

        TB1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "X", "Y", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TB1);
        if (TB1.getColumnModel().getColumnCount() > 0) {
            TB1.getColumnModel().getColumn(0).setResizable(false);
            TB1.getColumnModel().getColumn(1).setResizable(false);
            TB1.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Generate Range for random X and Y.");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("and X And Y still 0 - 500");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("from X And Y still 0 - 500");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Input X And Y for find distance");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("K :");

        jPanel5.setLayout(new javax.swing.OverlayLayout(jPanel5));

        jPanel6.setLayout(new javax.swing.OverlayLayout(jPanel6));

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        drawingBoard.setBackground(new java.awt.Color(255, 255, 255));
        drawingBoard.setMaximumSize(new java.awt.Dimension(500, 500));
        drawingBoard.setMinimumSize(new java.awt.Dimension(500, 500));
        drawingBoard.setPreferredSize(new java.awt.Dimension(500, 500));
        drawingBoard.setLayout(new javax.swing.OverlayLayout(drawingBoard));

        jButton5246.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5246.setText("Repaint Graph");
        jButton5246.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5246ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(283, 283, 283)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2859, 2859, 2859))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(BT1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(40, 40, 40)
                                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton1)
                                        .addGap(46, 46, 46)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drawingBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jButton5246)))
                        .addGap(2843, 2843, 2843))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(611, 611, 611)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(drawingBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jButton5246, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(146, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(BT1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1246, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        double[] box = new double[countofArray];
        int z = Integer.parseInt(t1.getText());
        try{
        if(KD_array[0] == null){
            JOptionPane.showMessageDialog(null,"You should to click generate number.");
        }
        if(z % 2 != 0){
        int count = 0;
        int thecount_1 = 0; //for -1
        int thecount1 = 0;  // for 1
            for(int i = 0; i < 500 ; i++){
                for(int j = 0; j < 500 ; j++){
                    for(int k = 0; k < countofArray ; k++){
                        double distance = (Math.sqrt((Math.pow((i-KD_array[k].getx()),2))+(Math.pow((j-KD_array[k].gety()),2))));  
                        box[k] = distance;
                        //System.out.println("i= "+i+" j= "+j+" x = "+KD_array[k].getx()+" y = "+KD_array[k].gety()+" distance ="+distance);
                        }
                        for(int m = 0; m <countofArray; m++){
                            //System.out.println(" distance = "+box[m]);
                        }
                        Arrays.sort(box);
                        //delay
                         /*try {
                         Thread.sleep(1);
                         }catch (InterruptedException e){
                         Thread.currentThread().interrupt();
                         }
                        for(int m = 0; m <countofArray; m++){
                            //System.out.println(" distance = "+box[m]);
                        }*/
                        System.out.println("test =");
                        //checkSystem.out.println("test ="+"i= "+i+" j= "+j+" x = "+KD_array[a].getx()+" y = "+KD_array[a].gety());
                        for(int a = 0; a < z; a++){
                           for(int b = 0; b < countofArray ; b++){
                             if(box[a] == Math.sqrt((Math.pow((i-KD_array[b].getx()),2))+(Math.pow((j-KD_array[b].gety()),2)))){
                                //System.out.println("test ="+"i= "+i+" j= "+j+" x = "+KD_array[b].getx()+" y = "+KD_array[b].gety());
                                int count_1 = 0;
                                int count1 = 0;
                                if(KD_array[b].getvalue()==-1){
                                    count_1++;
                                }else{
                                    count1++;
                                }
                                thecount_1 += count_1;
                                thecount1 += count1;
                             }
                           }
                        }
                        if(thecount_1>thecount1){
                            g.setColor(Color.RED);
                            //g.drawString("X:"+i+" Y:"+j,i,500-j);
                            g.fillRect(i,500-j, 1, 1);
                        }else{
                            g.setColor(Color.GREEN);
                            //g.drawString("X:"+i+" Y:"+j,i,500-j);
                            g.fillRect(i,500-j, 1, 1);
                        }
                        thecount_1 = 0; //for -1
                        thecount1 = 0;  // for 1
                }
                
                
                // delay
                try {
                         Thread.sleep(1);
                         }catch (InterruptedException e){
                         Thread.currentThread().interrupt();
                    }
                
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please input even number."); 
        }
            //System.out.println(" distance = "+thecount_1);
            //System.out.println(" distance = "+thecount1);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
                //JOptionPane.showMessageDialog(null,".");
                //JOptionPane.showMessageDialog(null,"Please input even number.");    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT1ActionPerformed

        index = 0;
        int count1 = 0;
        int count_1 = 0;  //-1
        boolean check20  = false;   //
        boolean check1 = false;     // 1
        boolean check_1  = false;   //-1

        Random randomGenerator = new Random();

        int max = 500;         // Integer.parseInt(IP1.getText());
        int max1 = 500;        //Integer.parseInt(IP2.getText());

            for(int i = 0; i < countofArray; i++){
                if(check1 == false){
                    int A = (randomGenerator.nextInt(max) + 1);
                    int B = (randomGenerator.nextInt(max1) + 1);
                    int C = 1;
                    count1++;
                    if(count1 == countofArray/2){
                        check1 = true;
                    }
                    //input array
                    KD = new KNNData(A,B,C);
                    M.input(KD);
                }
                else{
                    int A = (randomGenerator.nextInt(max) + 1);     //-1
                    int B = (randomGenerator.nextInt(max1) + 1);
                    int C = -1;
                    KD = new KNNData(A,B,C);
                    M.input(KD);
                    count_1++;
                }
            }
            M.initComponents();
            //System.out.println("count1 = "+count1+"count1 = "+count_1);
            DefaultTableModel model = (DefaultTableModel) TB1.getModel();
            if(worked == 0){
                for(int i = 0; i <4; i++){
                    model.removeRow(0);
                }
                for(int i = 0; i <index; i++){
                    model.addRow(new Object[0]);
                    model.setValueAt(KD_array[i].getx(),i,0);
                    model.setValueAt(KD_array[i].gety(),i,1);
                    model.setValueAt(KD_array[i].getvalue(),i,2);
                    worked = 1;
                    deleterow = 16;
                }
            }
            else{
                int b = deleterow;
                for(int i = 0; i <index; i++){
                    model.setValueAt(KD_array[i].getx(),i,0);
                    model.setValueAt(KD_array[i].gety(),i,1);
                    model.setValueAt(KD_array[i].getvalue(),i,2);
                }
            }
            clicked=true;
        for(int i = 0; i < countofArray; i++){
            if(KD_array[i].getvalue()==-1){
                int X = KD_array[i].getx();
                int Y = KD_array[i].gety();
                g.setColor(Color.RED);
                    // set to tell position X Y
                g.drawString("X:"+X+" Y:"+Y,X,500-Y);
                g.fillOval(X,500-Y, 4, 4);
            }else{
                int X = KD_array[i].getx();
                int Y = KD_array[i].gety();
                g.setColor(Color.GREEN);
                    // set to tell position X Y
                g.drawString("X:"+X+" Y:"+Y,X,500-Y);
                g.fillOval(X,500-Y, 4, 4);
            }
        }
    }//GEN-LAST:event_BT1ActionPerformed

    private void jButton5246ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5246ActionPerformed
        // TODO add your handling code here:
        drawingBoard.repaint();
    }//GEN-LAST:event_jButton5246ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed
    /*public static double getMinValue(){
        double minValue = KD_array[0].getdistance();
        for(int j = 0; j < countofArray; j++) {
                if (KD_array[j].getdistance() < minValue) {
                    minValue = KD_array[j].getdistance();
                }
        }
        return minValue;
    }*/    
    /*public void calculatedistance(){
        for(int i = 0; i < 1 ; i++){
             for(int j = 0; j < 1 ; j++){
                 for(int k = 0; k < countofArray ; k++){
                         double distance = (Math.sqrt((Math.pow((i-KD_array[k].getx()),2))+(Math.pow((j-KD_array[k].gety()),2))));  
                         box[k] = distance;
                         System.out.println("distance ="+distance);
                 }
             }
        }
    }*/
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KMainClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT1;
    private javax.swing.JTable TB1;
    private javax.swing.JPanel drawingBoard;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5246;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
