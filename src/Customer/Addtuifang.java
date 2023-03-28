
package Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Addtuifang extends javax.swing.JFrame {

    public Addtuifang() {
        initComponents();
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        tuifangidJTF = new javax.swing.JTextField();
        kehuidJTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        roomidJTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ruzhudateJTF = new javax.swing.JTextField();
        tuifangdateJTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addJB = new javax.swing.JButton();
        cancelJB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        payallJTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setTitle("退房结算信息登记");
        jInternalFrame1.setVisible(true);

        jLabel1.setText("订单编号");

        jLabel3.setText("入住日期");

        jLabel4.setText("退房日期");

        jLabel5.setText("证件号码");

        jLabel6.setText("房号");

        jLabel7.setText("（6+4位顺序号）");

        jLabel8.setText("（用户编号：3+身份证号）");

        jLabel9.setText("（5+4位顺序号）");

        addJB.setText("添加");
        addJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJBActionPerformed(evt);
            }
        });

        cancelJB.setText("取消");
        cancelJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJBActionPerformed(evt);
            }
        });

        jLabel2.setText("费用");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(payallJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(50, 50, 50)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roomidJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(kehuidJTF)
                            .addComponent(tuifangidJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ruzhudateJTF)
                            .addComponent(tuifangdateJTF))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cancelJB, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(89, 89, 89))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(addJB, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tuifangidJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kehuidJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(roomidJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(ruzhudateJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tuifangdateJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(payallJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJB)
                    .addComponent(cancelJB))
                .addContainerGap(89, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJBActionPerformed
        //往数据库中添加数据
String url="jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=d:\\room.mdb";
Connection conn = null;
try{
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    conn = DriverManager.getConnection(url , "" , "");    //字段和表名应为英文
    Statement statement=conn.createStatement();
    String tuifangid=this.tuifangidJTF.getText();
    String kehuid=this.kehuidJTF.getText();
    String roomid=this.roomidJTF.getText();
    String ruzhudate=this.ruzhudateJTF.getText();
    String tuifangdate=this.tuifangdateJTF.getText();
    int payall=Integer.parseInt(this.payallJTF.getText());
    ResultSet rs=statement.executeQuery("select * from tuifangtable");
    boolean f=true;
    while(rs.next())
    {
        String s=rs.getString("tuifangid");
        if(s.equals(tuifangid)){
        f=false;
        JOptionPane.showMessageDialog(this,"您输入的退房订单编号已经有了，添加失败");
        break;
        }
    }
    if(f)
    {
        rs=statement.executeQuery("select * from kehutable where kehuid='"+kehuid+"'");
        String data[]=new String[5];
        data[0]=rs.getString("huiyuanma");
        data[1]=rs.getString("jifen");
        if(data[0]=="是")
        {
            String sqlStr1="insert into tuifangtable (tuifangid,ruzhudate,tuifangdate,payall,kehuid,roomid) values('"+tuifangid+"','"+ruzhudate+"','"+tuifangdate+"',"+payall+",'"+kehuid+"','"+roomid+"')";
            statement.executeUpdate(sqlStr1);
            if(payall<2000)
            {
                sqlStr1="update kehutable set jifen=jifen+100 where kehuid='"+kehuid+"'";
                statement.executeUpdate(sqlStr1);
            }    
            else
            {
                sqlStr1="update kehutable set jifen=jifen+100+3*(payall-2000)/100 where kehuid='"+kehuid+"'";
                statement.executeUpdate(sqlStr1);
            }
        }
        else{
            String sqlStr1="insert into tuifangtable (tuifangid,ruzhudate,tuifangdate,payall,kehuid,roomid) values('"+tuifangid+"','"+ruzhudate+"','"+tuifangdate+"',"+payall+",'"+kehuid+"','"+roomid+"')";
            statement.executeUpdate(sqlStr1);
        }
        JOptionPane.showMessageDialog(this,"添加成功");
    }
conn.close();
}
catch(Exception e)
{
    e.printStackTrace();
 }
    }//GEN-LAST:event_addJBActionPerformed

    private void cancelJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJBActionPerformed
        CaiDanJieMian c=new  CaiDanJieMian();
        c.show();
    }//GEN-LAST:event_cancelJBActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addtuifang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJB;
    private javax.swing.JButton cancelJB;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kehuidJTF;
    private javax.swing.JTextField payallJTF;
    private javax.swing.JTextField roomidJTF;
    private javax.swing.JTextField ruzhudateJTF;
    private javax.swing.JTextField tuifangdateJTF;
    private javax.swing.JTextField tuifangidJTF;
    // End of variables declaration//GEN-END:variables
}
