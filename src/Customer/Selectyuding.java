
package Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class Selectyuding extends javax.swing.JFrame {


    public Selectyuding() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        xuanJCB = new javax.swing.JComboBox();
        tiaojianJB = new javax.swing.JButton();
        tiaojianJTF = new javax.swing.JTextField();
        backJB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setTitle("预订订单信息查询");
        jInternalFrame1.setVisible(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "查询预订信息条件设置", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("宋体", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        xuanJCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "预订编号", "预订日期", "预计入住日期", "预计退房日期", "证件号", "房号" }));

        tiaojianJB.setText("查询");
        tiaojianJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiaojianJBActionPerformed(evt);
            }
        });

        backJB.setText("返回上一层");
        backJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xuanJCB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(tiaojianJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tiaojianJB)
                .addGap(55, 55, 55)
                .addComponent(backJB)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xuanJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiaojianJB)
                    .addComponent(tiaojianJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "预订编号", "预订日期", "预计入住日期", "预计退房日期", "证件号", "房号"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tiaojianJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiaojianJBActionPerformed
        String url="jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=d:\\room.mdb";
        Connection conn = null;
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection(url , "" , "");    //字段和表名应为英文  //建立数据库连接
            Statement statement=conn.createStatement();//创建声明体
            Object xuan=this.xuanJCB.getSelectedItem();
            String sql="";
            if(xuan=="预订编号")
            {
                sql="select preorderid,preorderdate,yujiruzhudate,yujituifangdate,kehuid,roomid  from preordertable where  preorderid='"+this.tiaojianJTF.getText()+"'";
            }
            if(xuan=="预订日期")
            {
                sql="select preorderid,preorderdate,yujiruzhudate,yujituifangdate,kehuid,roomid  from preordertable where  preorderdate='"+this.tiaojianJTF.getText()+"'";
            }
            if(xuan=="预计入住日期")
            {
                sql="select preorderid,preorderdate,yujiruzhudate,yujituifangdate,kehuid,roomid  from preordertable where  yujiruzhudate='"+this.tiaojianJTF.getText()+"'";
            }
            if(xuan=="预计退房日期")
            {
                sql="select preorderid,preorderdate,yujiruzhudate,yujituifangdate,kehuid,roomid  from preordertable where  yujituifangdate='"+this.tiaojianJTF.getText()+"'";
            }
            if(xuan=="证件号")
            {
                sql="select preorderid,preorderdate,yujiruzhudate,yujituifangdate,kehuid,roomid  from preordertable where  kehuid='"+this.tiaojianJTF.getText()+"'";
            }
            if(xuan=="房号")
            {
                sql="select preorderid,preorderdate,yujiruzhudate,yujituifangdate,kehuid,roomid  from preordertable where  roomid='"+this.tiaojianJTF.getText()+"'";
            }
            ResultSet rs=statement.executeQuery(sql); //创建结果集，运行select语句，返回结果集
            DefaultTableModel dtm=(DefaultTableModel)this.jTable1.getModel();
            int c=dtm.getRowCount();
            for(int i=0;i<c;i++) dtm.removeRow(0);
            while(rs.next())  //rs是结果集，rs.next()让指针往下一个个走
            {
                String data[]=new String[6];
                data[0]=rs.getString("preorderid");
                data[1]=rs.getString("preorderdate");
                data[2]=rs.getString("yujiruzhudate");
                data[3]=rs.getString("yujituifangdate");
                data[4]=rs.getString("kehuid");
                data[5]=rs.getString("roomid");
                dtm.addRow(data);
            }
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tiaojianJBActionPerformed

    private void backJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBActionPerformed
        CaiDanJieMian c=new  CaiDanJieMian();
        c.show();
    }//GEN-LAST:event_backJBActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selectyuding().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJB;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton tiaojianJB;
    private javax.swing.JTextField tiaojianJTF;
    private javax.swing.JComboBox xuanJCB;
    // End of variables declaration//GEN-END:variables
}
