//The Swing Compnents were developed in Netbeans and copied to eclipse
//There are some autogenerated comments
//package rock;

import RockPaperScissors.GUICallback;
import RockPaperScissors.GUICallbackOperations;
import RockPaperScissors.GUICallback_Tie;
import RockPaperScissors.GameController;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.omg.CORBA.AnyHolder;

/**
 *
 * @author 
 */
//This class displays the frame containing the move buttons for the user
public class GameJFrame extends javax.swing.JFrame {

    static GameController gameController;
    static int GameId;
    static String userName;
    static String winner;
    static GUICallback callback;

    /**
     * Creates new form GameJFrame
     */
    public GameJFrame(GameController g, int id, String name) {
        initComponents();
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameController = g;
        GameId = id;
        userName = name;
        //CallBack c = new CallBack_Tie(new CallBackImpl());
        callback = new GUICallback_Tie(new ClientCallback());
        //AnyHolder a = new AnyHolder();
        //userName = gameController.NewGame(a);
        //GameId = a.value.extract_long();
    }

    //AUTOGENERATED BY NETBEANS
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(420, 300));

        jButton3.setText("Scissors");
        jButton3.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Paper");
        jButton4.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Rock");
        jButton5.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose your option, be quick!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //rock button
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //winner = gameController.Result(GameId, 1, userName);
    	gameController.Result(callback, GameId, 1, userName);
        dispose();
        //showWindow(winner);

    }//GEN-LAST:event_jButton5ActionPerformed

    //paper button
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //winner = gameController.Result(GameId, 2, userName);
    	gameController.Result(callback, GameId, 2, userName);
        dispose();
//        showWindow(winner);

    }//GEN-LAST:event_jButton4ActionPerformed

    //scissors button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //winner = gameController.Result(GameId, 3, userName);
        dispose();
    	gameController.Result(callback, GameId, 3, userName);
//        showWindow(winner);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(GameJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameJFrame(gameController, GameId, userName).setVisible(true);
            }
        });
    }

    // got rid of ResultJFrame.java, repositioned below
    // pop up 'result' window is created dynamically here
    public static void showWindow(String winner) {
    	System.out.println("From showWindow, winner is: " + winner);
        boolean result = false;
        if (userName.equals(winner)) {
            result = true;
        } else {
            result = false;
        }
        String responseString = "";
        if (result) {
            responseString = "You Won! Press Yes to play again, or No to exit.";
        } else if(winner.equals("tie")){
        	responseString = "It was a Tie! Press Yes to play again, or No to exit.";
        } else {
            responseString = "You Lost! Press Yes to play again, or No to exit.";
        }

        JDialog.setDefaultLookAndFeelDecorated(true);
        int response = JOptionPane.showConfirmDialog(null, responseString, "Play again?",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (response == JOptionPane.NO_OPTION) { //if user clicks no 
            //do nothing and close the program
        	return;
        } else if (response == JOptionPane.YES_OPTION) { //if user clicks yes
            MainJFrame frame = new MainJFrame();
            frame.setVisible(true);
        } else if (response == JOptionPane.CLOSED_OPTION) { //if user clicks red x
            MainJFrame frame = new MainJFrame();
            frame.setVisible(true);
        }
    }
    
    class ClientCallback implements GUICallbackOperations{

		@Override
		public void callBack(String winner) {
			showWindow(winner);
		}
    	
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}