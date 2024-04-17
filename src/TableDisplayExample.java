import Dao.ConnectionProvider;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class TableDisplayExample extends javax.swing.JFrame {

   
    public TableDisplayExample() {
        initComponents();
        setTitle("Table Display Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(1000, 500);

        // Create a DefaultTableModel
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);

        // Add columns to the model
        model.addColumn("Name");
        model.addColumn("Phone");
        model.addColumn("Email");
        model.addColumn("Address");
        // Add more columns if needed...

        // Populate the table with data
        try {
            // Connect to your database
            Connection con = ConnectionProvider.getCon();

            // Execute a query to retrieve data
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Customer");
             ResultSet rs = ps.executeQuery(); 

            // Iterate through the result set and add rows to the model
            while (rs.next()) {
                Object[] rowData = {
                        rs.getString("Name"),
                        rs.getString("Phone"),
                        rs.getString("Email"),
                        rs.getString("Address")
                        // Add more columns if needed...
                };
                model.addRow(rowData);
            }

            // Close resources
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Create the JTable with the populated model
        //JTable table = new JTable(model);

        // Add the table to the JFrame
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane);
         
        pack();
        // Display the JFrame
        setVisible(true);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1037, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        
     SwingUtilities.invokeLater(TableDisplayExample::new);
}
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

