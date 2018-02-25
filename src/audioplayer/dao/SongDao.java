package audioplayer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import audioplayer.models.*;

public class SongDao {
	private List<Song> songs = new ArrayList<Song>();
	
    public SongDao() {
    	for(int i = 0; i < 10; i++) {
    		Song iSong = new Song();
    		iSong.setName("Song" + i);
    		iSong.setSongId(i);
    		songs.add(iSong);
    	}
    }

//    public void addSong(Song user) {
//        try {
//            PreparedStatement preparedStatement = connection
//                    .prepareStatement("insert into users(firstname,lastname,dob,email) values (?, ?, ?, ? )");
//            // Parameters start with 1
//            preparedStatement.setString(1, user.getFirstName());
//            preparedStatement.setString(2, user.getLastName());
//            preparedStatement.setDate(3, new java.sql.Date(user.getDob().getTime()));
//            preparedStatement.setString(4, user.getEmail());
//            preparedStatement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

//    public void deleteUser(int userId) {
//        try {
//            PreparedStatement preparedStatement = connection
//                    .prepareStatement("delete from users where userid=?");
//            // Parameters start with 1
//            preparedStatement.setInt(1, userId);
//            preparedStatement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

//    public void updateUser(User user) {
//        try {
//            PreparedStatement preparedStatement = connection
//                    .prepareStatement("update users set firstname=?, lastname=?, dob=?, email=?" +
//                            "where userid=?");
//            // Parameters start with 1
//            preparedStatement.setString(1, user.getFirstName());
//            preparedStatement.setString(2, user.getLastName());
//            preparedStatement.setDate(3, new java.sql.Date(user.getDob().getTime()));
//            preparedStatement.setString(4, user.getEmail());
//            preparedStatement.setInt(5, user.getUserid());
//            preparedStatement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    public List<Song> getAllSongs() {
        return songs;
    }

    public Song getSongById(int songId) {
        Song song = songs.get(songId);
        return song;
    }
}
