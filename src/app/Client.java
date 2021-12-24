package app;

import java.rmi.Naming;

import beans.Livre;
import beans.User;
import db.UserDb;

public class Client {
	public static void main(String[] args) {
		 try {
	            IBiblio stub= (IBiblio) Naming.lookup("rmi://localhost:1099/BK");
	            User u= stub.findUserById("P1234");
	            System.out.println(u.getAdress());
	            
	           
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
