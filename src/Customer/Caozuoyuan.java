
package Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Caozuoyuan extends javax.swing.JFrame {

    public Caozuoyuan() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        useridJTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        passwordJTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        levelJTF = new javax.swing.JTextField();
        updateJB1 = new javax.swing.JButton();
        deleteJB1 = new javax.swing.JButton();
        backJB1 = new javax.swing.JButton();
        addJB1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        adminidJTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setTitle("操作员管理");
        jInternalFrame1.setVisible(true);

        jLabel1.setText("用户编号");

        jLabel10.setText("密码");

        jLabel11.setText("级别");

        updateJB1.setText("修改");
        updateJB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJB1ActionPerformed(evt);
            }
        });

        deleteJB1.setText("删除");
        deleteJB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJB1ActionPerformed(evt);
            }
        });

        backJB1.setText("退出");
        backJB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJB1ActionPerformed(evt);
            }
        });

        addJB1.setText("添加");
        addJB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJB1ActionPerformed(evt);
            }
        });

        jLabel12.setText("（证件号/员工编号/管理员编号）");

        jLabel9.setText("归属管理员编号");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(80, 80, 80)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(levelJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(useridJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(3, 3, 3))))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminidJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(0, 94, Short.MAX_VALUE)
                .addComponent(addJB1)
                .addGap(38, 38, 38)
                .addComponent(updateJB1)
                .addGap(32, 32, 32)
                .addComponent(deleteJB1)
                .addGap(42, 42, 42)
                .addComponent(backJB1)
                .addGap(61, 61, 61))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(useridJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(levelJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(adminidJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJB1)
                    .addComponent(updateJB1)
                    .addComponent(deleteJB1)
                    .addComponent(backJB1))
                .addContainerGap(110, Short.MAX_VALUE))
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
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJB1ActionPerformed
        // 修改操作
        String url="jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=d:\\room.mdb";
        Connection conn = null;
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection(url , "" , "");    //字段和表名应为英文
            Statement statement=conn.createStatement();
            String userid=this.useridJTF.getText();
            String password=this.passwordJTF.getText();
            int level=Integer.parseInt(this.levelJTF.getText());
            String adminid=this.adminidJTF.getText();
            ResultSet rs=statement.executeQuery("select * from usertable");
            boolean f=true;
            while(rs.next())
            {
                String s=rs.getString("userid");
                if(s.equals(userid)){
                    f=false;
                    String sqlStr1="update usertable set password='"+password+"' where userid='"+userid+"'";
                    statement.executeUpdate(sqlStr1);
                    JOptionPane.showMessageDialog(this,"修改成功");
                    break;
                }

            }
            if(f)
            {
                JOptionPane.showMessageDialog(this,"您输入的用户编号不对，修改失败");
            }
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_updateJB1ActionPerformed

    private void deleteJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJB1ActionPerformed
        // 删除操作
        String url="jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=d:\\room.mdb";
        Connection conn = null;
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection(url , "" , "");    //字段和表名应为英文
            Statement statement=conn.createStatement();
            String userid=this.useridJTF.getText();
            ResultSet rs=statement.executeQuery("select * from usertable");
            boolean f=true;
            while(rs.next())
            {
                String s=rs.getString("userid");
                if(s.equals(userid)){
                    f=false;
                    String sqlStr1="delete from usertable where userid='"+userid+"'";
                    statement.executeUpdate(sqlStr1);
                    JOptionPane.showMessageDialog(this,"删除成功");
                    break;
                }

            }
            if(f)
            {
                JOptionPane.showMessageDialog(this,"您输入的用户编号不对，删除失败");
            }
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteJB1ActionPerformed

    private void backJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJB1ActionPerformed
        CaiDanJieMian c=new  CaiDanJieMian();
        c.show();
    }//GEN-LAST:event_backJB1ActionPerformed

    private void addJB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJB1ActionPerformed
        //往数据库中添加数据
        String url="jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=d:\\room.mdb";
        Connection conn = null;
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection(url , "" , "");    //字段和表名应为英文
            Statement statement=conn.createStatement();
            String userid=this.useridJTF.getText();
            String password=this.passwordJTF.getText();
            int level=Integer.parseInt(this.levelJTF.getText());
            String adminid=this.adminidJTF.getText();
            ResultSet rs=statement.executeQuery("select * from usertable");
            boolean f=true;
            while(rs.next())
            {
                String s=rs.getString("userid");
                if(s.equals(userid)){
                    f=false;
                    JOptionPane.showMessageDialog(this,"您输入的用户编号已经有了，添加失败");
                    break;
                }
            }
            if(f)
            {
                String sqlStr1="insert into usertable (userid,password,adminid,level) values('"+userid+"','"+password+"','"+adminid+"',"+level+")"; //将sql语句转换成字符串
                statement.executeUpdate(sqlStr1);
                JOptionPane.showMessageDialog(this,"添加成功");

            }
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_addJB1ActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caozuoyuan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJB1;
    private javax.swing.JTextField adminidJTF;
    private javax.swing.JButton backJB1;
    private javax.swing.JButton deleteJB1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField levelJTF;
    private javax.swing.JTextField passwordJTF;
    private javax.swing.JButton updateJB1;
    private javax.swing.JTextField useridJTF;
    // End of variables declaration//GEN-END:variables
}
