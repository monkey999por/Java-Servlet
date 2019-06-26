package dao.sql;

public class ChatSQL {
	
//	SELECT
	public final static String get_all_user = "SELECT distinct user_name FROM my_chat.user";
	public final static String get_all = "SELECT user_name, message FROM my_chat.message";
	public final static String get_message_for_user ="select* from my_chat.message "+
			"inner join my_chat.user"+
			"on my_chat.message.user_name = my_chat.user.user_name"+
			"where  my_chat.user.user_name = '?'";
			
	
//	INSERT
	public final static String set_message = 
			"insert into my_chat.message (user_name, message)\r\n" + 
			"values (?, ?)";
	
	public final static String register_user = "insert into my_chat.user (user_name) values (?)";
//	UPDATE
//	DELETE
}
