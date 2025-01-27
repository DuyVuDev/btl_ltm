/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tcpClient.view;

import tcpClient.run.ClientRun;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author admin
 */
public class LeaderboardView extends javax.swing.JFrame {
    DefaultTableModel dtm;
    TableRowSorter tsr;
    /**
     * Creates new form LeaderboardView
     */
    public LeaderboardView() {
        initComponents();
        dtm = (DefaultTableModel) tbLeaderboard.getModel();
        tsr = new TableRowSorter(dtm);
        tbLeaderboard.setRowSorter(tsr);
    }

    public void addUserData(String[] userData) {
        String userName = userData[0];
        String userScore = userData[1];
        String userWin = userData[2];
        String userDraw = userData[3];
        String userLose = userData[4];
        String userAvgCompetitor = userData[5];
        String userAvgTime = userData[6];
        dtm.addRow(new String[]{
                userName,
                userScore,
                userWin,
                userDraw,
                userLose,
                userAvgCompetitor,
                userAvgTime
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbLeaderboard = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnSortByScore = new javax.swing.JButton();
        btnSortByAvgCompetitor = new javax.swing.JButton();
        btnSortByAvgTime = new javax.swing.JButton();
        tfUsernameSearch = new javax.swing.JTextField();
        btnUsernameSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnRefreshLeaderboard = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LEADERBOARD");
        setMinimumSize(new java.awt.Dimension(800, 600));

        tbLeaderboard.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Username", "Score", "Win", "Draw", "Lose", "Average Competitor", "Average Time"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLeaderboard.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbLeaderboard);
        if (tbLeaderboard.getColumnModel().getColumnCount() > 0) {
            tbLeaderboard.getColumnModel().getColumn(0).setResizable(false);
            tbLeaderboard.getColumnModel().getColumn(1).setResizable(false);
            tbLeaderboard.getColumnModel().getColumn(2).setResizable(false);
            tbLeaderboard.getColumnModel().getColumn(2).setPreferredWidth(50);
            tbLeaderboard.getColumnModel().getColumn(3).setResizable(false);
            tbLeaderboard.getColumnModel().getColumn(3).setPreferredWidth(50);
            tbLeaderboard.getColumnModel().getColumn(4).setResizable(false);
            tbLeaderboard.getColumnModel().getColumn(4).setPreferredWidth(50);
            tbLeaderboard.getColumnModel().getColumn(5).setResizable(false);
            tbLeaderboard.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel1.setText("SORT BY:");

        btnSortByScore.setText("Score");
        btnSortByScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortByScoreActionPerformed(evt);
            }
        });

        btnSortByAvgCompetitor.setText("Average Competitor");
        btnSortByAvgCompetitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortByAvgCompetitorActionPerformed(evt);
            }
        });

        btnSortByAvgTime.setText("Average Time");
        btnSortByAvgTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortByAvgTimeActionPerformed(evt);
            }
        });

        btnUsernameSearch.setText("Search");
        btnUsernameSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsernameSearchActionPerformed(evt);
            }
        });

        jLabel2.setText("USERNAME:");

        btnRefreshLeaderboard.setText("Reload Leaderboard");
        btnRefreshLeaderboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshLeaderboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(tfUsernameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnUsernameSearch))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnSortByScore)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnSortByAvgCompetitor)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnSortByAvgTime)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                                .addComponent(btnRefreshLeaderboard, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnSortByScore)
                                                        .addComponent(btnSortByAvgCompetitor)
                                                        .addComponent(btnSortByAvgTime))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tfUsernameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnUsernameSearch)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(btnRefreshLeaderboard, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void btnSortByScoreActionPerformed(java.awt.event.ActionEvent evt) {
        tsr.setSortKeys(java.util.Collections.singletonList(
                new RowSorter.SortKey(1, SortOrder.DESCENDING)
        ));
        tsr.sort();
    }

    private void btnSortByAvgCompetitorActionPerformed(java.awt.event.ActionEvent evt) {
        tsr.setSortKeys(java.util.Collections.singletonList(
                new RowSorter.SortKey(5, SortOrder.DESCENDING)
        ));
        tsr.sort();
    }

    private void btnSortByAvgTimeActionPerformed(java.awt.event.ActionEvent evt) {
        tsr.setSortKeys(java.util.Collections.singletonList(
                new RowSorter.SortKey(6, SortOrder.ASCENDING)
        ));
        tsr.sort();
    }

    private void btnUsernameSearchActionPerformed(java.awt.event.ActionEvent evt) {
        String searchText = tfUsernameSearch.getText();
        if (searchText.trim().length() == 0) {
            // Nếu trường tìm kiếm trống, hiển thị tất cả các hàng
            tsr.setRowFilter(null);
        } else {
            // Lọc các hàng chứa từ khóa trong cột "Tên" (cột index 0)
            tsr.setRowFilter(RowFilter.regexFilter("(?i)" + searchText, 0));
        }
    }

    private void btnRefreshLeaderboardActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        ClientRun.socketHandler.openLeaderboard();
    }

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
            java.util.logging.Logger.getLogger(LeaderboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeaderboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeaderboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeaderboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeaderboardView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnRefreshLeaderboard;
    private javax.swing.JButton btnSortByAvgCompetitor;
    private javax.swing.JButton btnSortByAvgTime;
    private javax.swing.JButton btnSortByScore;
    private javax.swing.JButton btnUsernameSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLeaderboard;
    private javax.swing.JTextField tfUsernameSearch;
    // End of variables declaration
}
