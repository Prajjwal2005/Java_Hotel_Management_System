/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_hotel_system;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prajj
 */
public class RESERVATION {

    MY_CONNECTION my_connection = new MY_CONNECTION();
    
    ROOMS room = new ROOMS();
    
    public boolean addReservation(int client_id, int room_number, String dateIn, String dateOut){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery = "INSERT INTO `reservations`(`client_id`, `room_number`, `date_in`, `date_out`) VALUES(?,?,?,?)";
        
        try {
            st = my_connection.createConnection().prepareStatement(addQuery);
            
            st.setInt(1, client_id);
            st.setInt(2, room_number);
            st.setString(3, dateIn);
            st.setString(4, dateOut);
            
            if(room.isRoomReserved(room_number).equals("No")){
            
                if (st.executeUpdate() > 0){
                    room.setRoomToReserved(room_number, "Yes");
                    return true;
                }else{
                
                    return false;
                }
            }else{
                JOptionPane.showMessageDialog(null, "This Room Is Already Reserved", "Room Reserved", JOptionPane.WARNING_MESSAGE);
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean editReservation(int reservation_id, int client_id, int room_number, String dateIn, String dateOut){
                
        PreparedStatement st;
        ResultSet rs;
        String editQuery = "UPDATE `reservations` SET `client_id`=?, `room_number`=?, `date_in`=?, `date_out`=? WHERE `id`=?";
        
        try {
            st = my_connection.createConnection().prepareStatement(editQuery);
            
            st.setInt(1, client_id);
            st.setInt(2, room_number);
            st.setString(3, dateIn);
            st.setString(4, dateOut);
            st.setInt(5, reservation_id);

            
            return (st.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean removeReservation(int reservation_id){
                        
        PreparedStatement st;
        ResultSet rs;
        String deleteQuery = "DELETE FROM `reservations` WHERE `id`=?";
        
        try {
             // Get the room number associated with this reservation
        int roomNumber = getRoomNumberFromReservation(reservation_id);
        if (roomNumber == 0) {
            // If no room is found for the reservation ID, exit early
            return false;
        }
        
        // Prepare the deletion query
        st = my_connection.createConnection().prepareStatement(deleteQuery);
        st.setInt(1, reservation_id);
        
        // Delete the reservation
        if (st.executeUpdate() > 0) {
            // Update the room status to "No" (not reserved)
            room.setRoomToReserved(roomNumber, "No");
            return true;
        } else {
            return false;
        }
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public void fillReservationsJTable(JTable table){
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `reservations`";
        
        try {
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[5];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getInt(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);

                
                tableModel.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getRoomNumberFromReservation(int reservationID){
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT `room_number` FROM `reservations` WHERE id=?";
        
        try {
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            
            ps.setInt(1, reservationID);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt("room_number");
            }else{
                return 0;
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
