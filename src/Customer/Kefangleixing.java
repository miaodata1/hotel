
package Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Kefangleixing extends javax.swing.JPanel {

    public Kefangleixing() {
        initComponents();
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        roomtypeidJTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        roomtype = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        roompriceJTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        adminidJTF = new javax.swing.JTextField();
        updateJB = new javax.swing.JButton();
        deleteJB = new javax.swing.JButton();
        backJB = new javax.swing.JButton();
        addJB = new javax.swing.JButton();
        mianjiJTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jInternalFrame1.setTitle("客房类型信息设置");
        jInternalFrame1.setVisible(true);

        jLabel1.setText("类型编号");

        jLabel2.setText("客房类型");

        roomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "单人间", "双人间", "单套间", "双套间", "总统套间" }));

        jLabel3.setText("面积");

        jLabel4.setText("价格");

        jLabel5.setText("管理员编号");

        updateJB.setText("修改");
        updateJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJBActionPerformed(evt);
            }
        });

        deleteJB.setText("删除");
        deleteJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJBActionPerformed(evt);
            }
        });

        backJB.setText("退出");
        backJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBActionPerformed(evt);
            }
        });

        addJB.setText("添加");
        addJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJBActionPerformed(evt);
            }
        });

        jLabel7.setText("（2+顺序号）");

        jLabel6.setText("（4+顺序号）");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(82, 82, 82)
                        .addComponent(mianjiJTF))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addComponent(roomtype, 0, 1, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(46, 46, 46)
                            .addComponent(roomtypeidJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(82, 82, 82)
                            .addComponent(roompriceJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                            .addGap(118, 118, 118)
                            .addComponent(adminidJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(addJB)
                .addGap(33, 33, 33)
                .addComponent(updateJB)
                .addGap(31, 31, 31)
                .addComponent(deleteJB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(backJB)
                .addGap(29, 29, 29))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(roomtypeidJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(roompriceJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(adminidJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(25, 25, 25)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(roomtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mianjiJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJB)
                    .addComponent(updateJB)
                    .addComponent(deleteJB)
                    .addComponent(backJB))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 203, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 523, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJBActionPerformed
        // 修改操作
        String url="jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=d:\\room.mdb";
        Connection conn = null;
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection(url , "" , "");    //字段和表名应为英文
            Statement statement=conn.createStatement();
            String typeid=this.roomtypeidJTF.getText();   
            String adminid=this.adminidJTF.getText();
            int price=Integer.parseInt(this.roompriceJTF.getText());
            String type=this.roomtype.getSelectedItem().toString();
            int area=Integer.parseInt(this.mianjiJTF.getText());
            ResultSet rs=statement.executeQuery("select * from kefangtypetable"); 
            boolean f=true;
            while(rs.next())
            {
                String s=rs.getString("typeid");
                if(s.equals(typeid)){
                    f=false;
                    String sqlStr1="update kefangtypetable set price="+price+",  area="+area+" where typeid='"+typeid+"'";
                    statement.executeUpdate(sqlStr1);
                    JOptionPane.showMessageDialog(this,"修改成功"); 
                    break;
                }      
            
            }
            if(f)
            {
                   JOptionPane.showMessageDialog(this,"您输入的类型编号不对，修改失败");
             }
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_updateJBActionPerformed

    private void deleteJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJBActionPerformed
        // 删除操作
        String url="jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=d:\\room.mdb";
        Connection conn = null;
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection(url , "" , "");    //字段和表名应为英文
            Statement statement=conn.createStatement();
            String typeid=this.roomtypeidJTF.getText();  
            ResultSet rs=statement.executeQuery("select * from kefangtypetable"); 
            boolean f=true;
            while(rs.next())
            {
                String s=rs.getString("typeid");
                if(s.equals(typeid)){
                    f=false;
                    String sqlStr1="delete from kefangtypetable where typeid='"+typeid+"'";
                    statement.executeUpdate(sqlStr1);
                    JOptionPane.showMessageDialog(this,"删除成功"); 
                    break;
                }      
            
            }
            if(f)
            {
                   JOptionPane.showMessageDialog(this,"您输入的类型编号不对，删除失败");
             }
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteJBActionPerformed

    private void backJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBActionPerformed
        CaiDanJieMian c=new  CaiDanJieMian();
        c.show();
    }//GEN-LAST:event_backJBActionPerformed

    private void addJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJBActionPerformed
        //往数据库中添加数据
        String url="jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=d:\\room.mdb";
        Connection conn = null;
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection(url , "" , "");    //字段和表名应为英文
            Statement statement=conn.createStatement();
            String typeid=this.roomtypeidJTF.getText();   
            String adminid=this.adminidJTF.getText();
            int price=Integer.parseInt(this.roompriceJTF.getText());
            String type=this.roomtype.getSelectedItem().toString();
            int area=Integer.parseInt(this.mianjiJTF.getText());
            ResultSet rs=statement.executeQuery("select * from kefangtypetable");
            boolean f=true;
            while(rs.next())
            {
                String s=rs.getString("typeid");
                if(s.equals(typeid)){
                    f=false;
                     JOptionPane.showMessageDialog(this,"您输入的类型编号已经有了，添加失败");
                     break;
                }
            }
            if(f)
            {
                    String sqlStr1="insert into kefangtypetable (typeid,type,price,area,adminid) values('"+typeid+"','"+type+"',"+price+","+area+",'"+adminid+"')"; //将sql语句转换成字符串
                    statement.executeUpdate(sqlStr1);
                    JOptionPane.showMessageDialog(this,"添加成功");

             }
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_addJBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJB;
    private javax.swing.JTextField adminidJTF;
    private javax.swing.JButton backJB;
    private javax.swing.JButton deleteJB;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField mianjiJTF;
    private javax.swing.JTextField roompriceJTF;
    private javax.swing.JComboBox<String> roomtype;
    private javax.swing.JTextField roomtypeidJTF;
    private javax.swing.JButton updateJB;
    // End of variables declaration//GEN-END:variables
}
