
package Customer;

public class CaiDanJieMian extends javax.swing.JFrame {

  
    public CaiDanJieMian() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        kefangJM = new javax.swing.JMenuItem();
        kefangleixingJM = new javax.swing.JMenuItem();
        kehuJM = new javax.swing.JMenuItem();
        yuangongJM = new javax.swing.JMenuItem();
        adminJM = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        addpreorderJM = new javax.swing.JMenuItem();
        updatepreorderJM = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        addruzhuJM = new javax.swing.JMenuItem();
        updateruzhuJM = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        addtuifangJM = new javax.swing.JMenuItem();
        updatetuifangJM = new javax.swing.JMenuItem();
        JMean6 = new javax.swing.JMenu();
        selectkefangJM = new javax.swing.JMenuItem();
        selectyudingJM = new javax.swing.JMenuItem();
        selectzhusuJM = new javax.swing.JMenuItem();
        selecttuifangJM = new javax.swing.JMenuItem();
        selectkehuJM = new javax.swing.JMenuItem();
        selectyuangongJM = new javax.swing.JMenuItem();
        selectadminJM = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        newbeginJM = new javax.swing.JMenuItem();
        caozuoyuanJM = new javax.swing.JMenuItem();
        exitJM = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setTitle("佳酒店客房管理系统");
        jInternalFrame1.setVisible(true);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Pictures\\t01837c402cf0d0b9b1.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        jMenu1.setText("基础信息设置");

        kefangJM.setText("客房信息设置");
        kefangJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kefangJMActionPerformed(evt);
            }
        });
        jMenu1.add(kefangJM);

        kefangleixingJM.setText("客房类型设置");
        kefangleixingJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kefangleixingJMActionPerformed(evt);
            }
        });
        jMenu1.add(kefangleixingJM);

        kehuJM.setText("客户信息设置");
        kehuJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kehuJMActionPerformed(evt);
            }
        });
        jMenu1.add(kehuJM);

        yuangongJM.setText("员工信息设置");
        yuangongJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yuangongJMActionPerformed(evt);
            }
        });
        jMenu1.add(yuangongJM);

        adminJM.setText("管理员信息设置");
        adminJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminJMActionPerformed(evt);
            }
        });
        jMenu1.add(adminJM);

        jMenuBar1.add(jMenu1);

        jMenu3.setBackground(new java.awt.Color(236, 233, 216));
        jMenu3.setText("预订管理");

        addpreorderJM.setText("客房预订登记");
        addpreorderJM.setToolTipText("");
        addpreorderJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addpreorderJMActionPerformed(evt);
            }
        });
        jMenu3.add(addpreorderJM);

        updatepreorderJM.setText("修改预订订单信息");
        updatepreorderJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatepreorderJMActionPerformed(evt);
            }
        });
        jMenu3.add(updatepreorderJM);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("入住管理");

        addruzhuJM.setText("住宿登记");
        addruzhuJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addruzhuJMActionPerformed(evt);
            }
        });
        jMenu2.add(addruzhuJM);

        updateruzhuJM.setText("修改住宿订单信息");
        updateruzhuJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateruzhuJMActionPerformed(evt);
            }
        });
        jMenu2.add(updateruzhuJM);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("退房结算管理");

        addtuifangJM.setText("退房结算登记");
        addtuifangJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtuifangJMActionPerformed(evt);
            }
        });
        jMenu4.add(addtuifangJM);

        updatetuifangJM.setText("修改退房结算订单信息");
        updatetuifangJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatetuifangJMActionPerformed(evt);
            }
        });
        jMenu4.add(updatetuifangJM);

        jMenuBar1.add(jMenu4);

        JMean6.setText("查询统计");

        selectkefangJM.setText("客房信息");
        selectkefangJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectkefangJMActionPerformed(evt);
            }
        });
        JMean6.add(selectkefangJM);

        selectyudingJM.setText("预订信息");
        selectyudingJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectyudingJMActionPerformed(evt);
            }
        });
        JMean6.add(selectyudingJM);

        selectzhusuJM.setText("住宿信息");
        selectzhusuJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectzhusuJMActionPerformed(evt);
            }
        });
        JMean6.add(selectzhusuJM);

        selecttuifangJM.setText("退房结算");
        selecttuifangJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecttuifangJMActionPerformed(evt);
            }
        });
        JMean6.add(selecttuifangJM);

        selectkehuJM.setText("客户信息");
        selectkehuJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectkehuJMActionPerformed(evt);
            }
        });
        JMean6.add(selectkehuJM);

        selectyuangongJM.setText("员工信息");
        selectyuangongJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectyuangongJMActionPerformed(evt);
            }
        });
        JMean6.add(selectyuangongJM);

        selectadminJM.setText("管理员信息");
        selectadminJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectadminJMActionPerformed(evt);
            }
        });
        JMean6.add(selectadminJM);

        jMenuBar1.add(JMean6);

        jMenu5.setText("系统维护");

        newbeginJM.setText("系统初始化");
        newbeginJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbeginJMActionPerformed(evt);
            }
        });
        jMenu5.add(newbeginJM);

        caozuoyuanJM.setText("操作员管理");
        caozuoyuanJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caozuoyuanJMActionPerformed(evt);
            }
        });
        jMenu5.add(caozuoyuanJM);

        jMenuBar1.add(jMenu5);

        exitJM.setText("退出");
        exitJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitJMActionPerformed(evt);
            }
        });
        jMenuBar1.add(exitJM);

        jInternalFrame1.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kefangJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kefangJMActionPerformed
        Kefang k=new Kefang();
        k.show();
}//GEN-LAST:event_kefangJMActionPerformed

    private void kefangleixingJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kefangleixingJMActionPerformed
        Kefangleixing k=new Kefangleixing();
        k.show();
    }//GEN-LAST:event_kefangleixingJMActionPerformed

    private void kehuJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kehuJMActionPerformed
        Kehu k=new Kehu();
        k.show();
    }//GEN-LAST:event_kehuJMActionPerformed

    private void yuangongJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yuangongJMActionPerformed
        Yuangong y=new Yuangong();
        y.show();
    }//GEN-LAST:event_yuangongJMActionPerformed

    private void addruzhuJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addruzhuJMActionPerformed
        Addruzhu a=new Addruzhu();
        a.show();
    }//GEN-LAST:event_addruzhuJMActionPerformed

    private void updateruzhuJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateruzhuJMActionPerformed
        Updateruzhu u=new Updateruzhu();
        u.show();
    }//GEN-LAST:event_updateruzhuJMActionPerformed

    private void addpreorderJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addpreorderJMActionPerformed
        Addpreorder a=new Addpreorder();
        a.show();
    }//GEN-LAST:event_addpreorderJMActionPerformed

    private void addtuifangJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtuifangJMActionPerformed
        Addtuifang a=new Addtuifang();
        a.show();
    }//GEN-LAST:event_addtuifangJMActionPerformed

    private void updatetuifangJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatetuifangJMActionPerformed
         Updatetuifang u=new Updatetuifang();
         u.show();
    }//GEN-LAST:event_updatetuifangJMActionPerformed

    private void updatepreorderJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatepreorderJMActionPerformed
         Updatepreorder u=new Updatepreorder();
         u.show();
    }//GEN-LAST:event_updatepreorderJMActionPerformed

    private void adminJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminJMActionPerformed
        Admin a=new Admin();
        a.show();
    }//GEN-LAST:event_adminJMActionPerformed

    private void caozuoyuanJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caozuoyuanJMActionPerformed
        Caozuoyuan c=new Caozuoyuan();
        c.show();
    }//GEN-LAST:event_caozuoyuanJMActionPerformed

    private void selectkefangJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectkefangJMActionPerformed
        Selectkefang s=new Selectkefang();
        s.show();
    }//GEN-LAST:event_selectkefangJMActionPerformed

    private void selectyudingJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectyudingJMActionPerformed
        Selectyuding s=new Selectyuding();
        s.show();
    }//GEN-LAST:event_selectyudingJMActionPerformed

    private void selectzhusuJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectzhusuJMActionPerformed
        Selectzhusu s=new Selectzhusu();
        s.show();        
    }//GEN-LAST:event_selectzhusuJMActionPerformed

    private void selecttuifangJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecttuifangJMActionPerformed
        Selecttuifang s=new Selecttuifang();
        s.show();
    }//GEN-LAST:event_selecttuifangJMActionPerformed

    private void selectkehuJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectkehuJMActionPerformed
        Selectkehu s=new Selectkehu();
        s.show();
    }//GEN-LAST:event_selectkehuJMActionPerformed

    private void selectyuangongJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectyuangongJMActionPerformed
        Selectyuangong s=new Selectyuangong();
        s.show();
    }//GEN-LAST:event_selectyuangongJMActionPerformed

    private void selectadminJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectadminJMActionPerformed
        Selectadmin s=new Selectadmin();
        s.show();
    }//GEN-LAST:event_selectadminJMActionPerformed

    private void exitJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJMActionPerformed
        Begin g=new Begin();
        g.show();
    }//GEN-LAST:event_exitJMActionPerformed

    private void newbeginJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbeginJMActionPerformed
        Newbegin n=new Newbegin();
        n.show();
    }//GEN-LAST:event_newbeginJMActionPerformed
    

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaiDanJieMian().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMean6;
    private javax.swing.JMenuItem addpreorderJM;
    private javax.swing.JMenuItem addruzhuJM;
    private javax.swing.JMenuItem addtuifangJM;
    private javax.swing.JMenuItem adminJM;
    private javax.swing.JMenuItem caozuoyuanJM;
    private javax.swing.JMenu exitJM;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem kefangJM;
    private javax.swing.JMenuItem kefangleixingJM;
    private javax.swing.JMenuItem kehuJM;
    private javax.swing.JMenuItem newbeginJM;
    private javax.swing.JMenuItem selectadminJM;
    private javax.swing.JMenuItem selectkefangJM;
    private javax.swing.JMenuItem selectkehuJM;
    private javax.swing.JMenuItem selecttuifangJM;
    private javax.swing.JMenuItem selectyuangongJM;
    private javax.swing.JMenuItem selectyudingJM;
    private javax.swing.JMenuItem selectzhusuJM;
    private javax.swing.JMenuItem updatepreorderJM;
    private javax.swing.JMenuItem updateruzhuJM;
    private javax.swing.JMenuItem updatetuifangJM;
    private javax.swing.JMenuItem yuangongJM;
    // End of variables declaration//GEN-END:variables
}
