
package Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class Selectkefang extends javax.swing.JFrame {

    public Selectkefang() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        xuanJCB = new javax.swing.JComboBox();
        tiaojianJB = new javax.swing.JButton();
        tiaojianJTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        xjpJTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sjpJTF = new javax.swing.JTextField();
        priceJB = new javax.swing.JButton();
        backJB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setTitle("客房信息查询");
        jInternalFrame1.setVisible(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "查询客房信息条件设置", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("宋体", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        xuanJCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "房号", "客房状态", "客房类型", "归属管理员编号" }));

        tiaojianJB.setText("查询");
        tiaojianJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiaojianJBActionPerformed(evt);
            }
        });

        jLabel4.setText("价格范围");

        jLabel5.setText("到");

        priceJB.setText("查询");
        priceJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceJBActionPerformed(evt);
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
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xjpJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sjpJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(priceJB)
                        .addGap(64, 64, 64)
                        .addComponent(backJB))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(xuanJCB, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tiaojianJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(tiaojianJB)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xuanJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiaojianJB)
                    .addComponent(tiaojianJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(sjpJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xjpJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceJB)
                    .addComponent(backJB))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "客房编号", "客房状态", "客房类型", "客房价格", "归属管理员姓名"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(567, Short.MAX_VALUE))
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
            if(xuan=="房号")
            {
                sql="select kefangtable.roomid,kefangtable.roomtai,kefangtypetable.type,kefangtypetable.price,admintable.name  from kefangtable,kefangtypetypetable,admintable where kefangtable.typeid=kefangtypetypetable.typeid and kefangtable.adminid=admintable.adminid and kefangtable.roomid='"+this.tiaojianJTF.getText()+"'";
            }
            if(xuan=="客房状态")
            {
                sql="select kefangtable.roomid,kefangtable.roomtai,kefangtypetable.type,kefangtypetable.price,admintable.name  from kefangtable,kefangtypetypetable,admintable where kefangtable.typeid=kefangtypetypetable.typeid and kefangtable.adminid=admintable.adminid and kefangtable.roomtai='"+this.tiaojianJTF.getText()+"'";
            }
            if(xuan=="客房类型")
            {
                sql="select kefangtable.roomid,kefangtable.roomtai,kefangtypetable.type,kefangtypetable.price,admintable.name  from kefangtable,kefangtypetypetable,admintable where kefangtable.typeid=kefangtypetypetable.typeid and kefangtable.adminid=admintable.adminid and kefangtable.typeid='"+this.tiaojianJTF.getText()+"'";
            }
            if(xuan=="归属管理员编号")
            {
                sql="select kefangtable.roomid,kefangtable.roomtai,kefangtypetable.type,kefangtypetable.price,admintable.name  from kefangtable,kefangtypetypetable,admintable where kefangtable.typeid=kefangtypetypetable.typeid and kefangtable.adminid=admintable.adminid and kefangtable.adminid='"+this.tiaojianJTF.getText()+"'";
            }

            ResultSet rs=statement.executeQuery(sql); //创建结果集，运行select语句，返回结果集
            DefaultTableModel dtm=(DefaultTableModel)this.jTable1.getModel();
            int c=dtm.getRowCount();
            for(int i=0;i<c;i++) dtm.removeRow(0);
            while(rs.next())  //rs是结果集，rs.next()让指针往下一个个走
            {
                String data[]=new String[5];
                data[0]=rs.getString("roomid");
                data[1]=rs.getString("roomtai");
                data[2]=rs.getString("type");
                data[3]=rs.getString("price");
                data[4]=rs.getString("name");           
                dtm.addRow(data);
            }
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tiaojianJBActionPerformed

    private void priceJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceJBActionPerformed
        String url="jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=g:\\dingcai.mdb";
        Connection conn = null;
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection(url , "" , "");    //字段和表名应为英文  //建立数据库连接
            Statement statement=conn.createStatement();//创建声明体
            ResultSet rs=statement.executeQuery("select kefangtable.roomid,kefangtable.roomtai,kefangtypetable.type,kefangtypetable.price,admintable.name  from kefangtable,kefangtypetypetable,admintable where kefangtable.typeid=kefangtypetypetable.typeid and kefangtable.adminid=admintable.adminid and kefangtypetable.price between "+Integer.parseInt(this.xjpJTF.getText())+" and "+Integer.parseInt(this.sjpJTF.getText())); //创建结果集，运行select语句，返回结果集
            DefaultTableModel dtm=(DefaultTableModel)this.jTable1.getModel();
            int c=dtm.getRowCount();
            for(int i=0;i<c;i++) dtm.removeRow(0);
            while(rs.next())  //rs是结果集，rs.next()让指针往下一个个走
            {
                String data[]=new String[5];
                data[0]=rs.getString("roomid");
                data[1]=rs.getString("roomtai");
                data[2]=rs.getString("type");
                data[3]=rs.getString("price");
                data[4]=rs.getString("name"); 
                dtm.addRow(data);
            }
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_priceJBActionPerformed

    private void backJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBActionPerformed
        CaiDanJieMian c=new  CaiDanJieMian();
        c.show();
    }//GEN-LAST:event_backJBActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selectkefang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJB;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton priceJB;
    private javax.swing.JTextField sjpJTF;
    private javax.swing.JButton tiaojianJB;
    private javax.swing.JTextField tiaojianJTF;
    private javax.swing.JTextField xjpJTF;
    private javax.swing.JComboBox xuanJCB;
    // End of variables declaration//GEN-END:variables
}
