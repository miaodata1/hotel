
package Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Kehu extends javax.swing.JFrame {

    public Kehu() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        kehuidJTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameJTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sexJTF = new javax.swing.JTextField();
        updateJB = new javax.swing.JButton();
        deleteJB = new javax.swing.JButton();
        backJB = new javax.swing.JButton();
        addJB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        numberJTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        huiyuanmaJTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jifenJTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setTitle("客户信息设置");
        jInternalFrame1.setVisible(true);

        jLabel1.setText("证件号");

        jLabel3.setText("电话");

        jLabel4.setText("姓名");

        jLabel5.setText("性别");

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

        jLabel6.setText("（3+身份证号）");

        jLabel2.setText("是否是会员");

        jLabel7.setText("积分");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(numberJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addComponent(sexJTF))))
                    .addComponent(jLabel3)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(huiyuanmaJTF))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kehuidJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jifenJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateJB)))
                .addGap(18, 18, 18)
                .addComponent(deleteJB)
                .addGap(27, 27, 27)
                .addComponent(backJB)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kehuidJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numberJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(huiyuanmaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jifenJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJB)
                    .addComponent(updateJB)
                    .addComponent(deleteJB)
                    .addComponent(backJB))
                .addContainerGap(141, Short.MAX_VALUE))
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
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJBActionPerformed
        // 修改操作
        String url="jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=d:\\room.mdb";
        Connection conn = null;
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection(url , "" , "");    //字段和表名应为英文
            Statement statement=conn.createStatement();
            String kehuid=this.kehuidJTF.getText();
            String name=this.nameJTF.getText();
            String sex=this.sexJTF.getText();
            String number=this.numberJTF.getText();
            String huiyuanma=this.huiyuanmaJTF.getText();
            int jifen=Integer.parseInt(this.jifenJTF.getText());
            ResultSet rs=statement.executeQuery("select * from kehutable"); 
            boolean f=true;
            while(rs.next())
            {
                String s=rs.getString("kehuid");
                if(s.equals(kehuid)){
                    f=false;
                    String sqlStr1="update kehutable set name='"+name+"', number='"+number+"', huiyaunma='"+huiyuanma+"',jifen="+jifen+" where kehuid='"+kehuid+"'";
                    statement.executeUpdate(sqlStr1);
                    JOptionPane.showMessageDialog(this,"修改成功"); 
                    break;
                }      
            
            }
            if(f)
            {
                   JOptionPane.showMessageDialog(this,"您输入的证件号不对，修改失败");
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
            String kehuid=this.kehuidJTF.getText();   
            ResultSet rs=statement.executeQuery("select * from kehutable"); 
            boolean f=true;
            while(rs.next())
            {
                String s=rs.getString("kehuid");
                if(s.equals(kehuid)){
                    f=false;
                    String sqlStr1="delete from kehutable where kehuid='"+kehuid+"'";
                    statement.executeUpdate(sqlStr1);
                    JOptionPane.showMessageDialog(this,"删除成功"); 
                    break;
                }      
            
            }
            if(f)
            {
                   JOptionPane.showMessageDialog(this,"您输入的证件号不对，删除失败");
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
            String kehuid=this.kehuidJTF.getText();
            String name=this.nameJTF.getText();
            String sex=this.sexJTF.getText();
            String number=this.numberJTF.getText();
            String huiyuanma=this.huiyuanmaJTF.getText();
            int jifen=Integer.parseInt(this.jifenJTF.getText());
            ResultSet rs=statement.executeQuery("select * from kehutable");
            boolean f=true;
            while(rs.next())
            {
                String s=rs.getString("kehuid");
                if(s.equals(kehuid)){
                    f=false;
                     JOptionPane.showMessageDialog(this,"您输入的证件号已经有了，添加失败");
                     break;
                }
            }
            if(f)
            {
                    String sqlStr1="insert into kehutable (kehuid,name,sex,number,huiyuanma,jifen) values('"+kehuid+"','"+name+"','"+sex+"','"+number+"','"+huiyuanma+"',"+jifen+")"; //将sql语句转换成字符串
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

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kehu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJB;
    private javax.swing.JButton backJB;
    private javax.swing.JButton deleteJB;
    private javax.swing.JTextField huiyuanmaJTF;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jifenJTF;
    private javax.swing.JTextField kehuidJTF;
    private javax.swing.JTextField nameJTF;
    private javax.swing.JTextField numberJTF;
    private javax.swing.JTextField sexJTF;
    private javax.swing.JButton updateJB;
    // End of variables declaration//GEN-END:variables
}
