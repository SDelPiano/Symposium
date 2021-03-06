package it.blackhat.symposium.queries;

public final class UserQuery {
	 /**
	  * Create an user query object. The constructor is private 
	  * to not allow the object to be instantiated.
      * @author: SDelPiano

      */

    private UserQuery() {
    	
    }
    	
    public static final String SIGN_UP = "INSERT INTO user VALUES( ? , ? , ? , ? , ? ,NULL, ?)";
    public static final String SIGN_IN = "SELECT * FROM user WHERE email= ? AND passoword= ?";
    public static final String EDIT_PROFILE = "UPDATE user SET username= ?, firstname= ?,"
    		+ " lastname= ?, password= ?, typegrad= ? WHERE email= ?";
    public static final String DELETE_ACCOUNT = "DELETE * FROM user WHERE email = ?";
   
    
    	
    	
    	
}



