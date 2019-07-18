package dbtest;
import net.*;
import com.*;
import com.alibaba.fastjson.JSONObject;
import java.*;


public class Json {
	private static String id="";
	private static String password="";
	private static JSONObject loginJson=new JSONObject();
	public static void Jsonparse(String jsting)
	{
		JSONObject jo=JSONObject.parseObject(jsting);
		id=jo.getString("id");
		password=jo.getString("password");
	}
	public static void Jsonparse(JSONObject jo)
	{
		id=jo.getString("id");
		password=jo.getString("password");
	}
	public static void permitJsonMake()
	{
		loginJson.put("permission", true);
	}
	public static void rejectJsonMake()
	{
		loginJson.put("permission", false);
	}
	public static String getid()
	{
		return id;
	}
	public static String getpassword()
	{
		return password;
	}
	public static JSONObject getJson()
	{
		return loginJson;
	}
	public static boolean test()
	{
		return loginJson.getBoolean("permission");
	}

}
