package weibo.sdk.android.bean;

import android.graphics.drawable.Drawable;
/**
 * 
 * @author wenming
 *
 */
public class UserInfo {
	
	private Long id;
	private String userId;
	private String userName;
	private String token; 
	private String expires_in;
	private String isDefault;
	private Drawable  userIcon;
	
	
    public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	public static final String TB_NAME="UserInfo";
	public static final String ID="_id";
	public static final String USER_ID="userId";
	public static final String USER_NAME="userName";
	public static final String TOKEN="token";
	public static final String EXPIRES_IN ="expires_in";
	public static final String IS_DEFAULT="isDefault";
	public static final String USER_ICON="userIcon";
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}
	public Drawable getUserIcon() {
		return userIcon;
	}
	public void setUserIcon(Drawable userIcon) {
		this.userIcon = userIcon;
	}

}
