package app;

import java.rmi.Naming;

import beans.Livre;
import beans.User;


public class Client {
	public static void main(String[] args) {
		 try {
	            IBiblio stub= (IBiblio) Naming.lookup("rmi://localhost:1099/BK");
	            User u= (User)stub.findUserById("P1234");

	            System.out.println(u.getAdress());
	            Livre l=(Livre)stub.findBookById(1233);
	            stub.Emprunter(l, u, "2021-12-31");
	           
	            
	           
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
