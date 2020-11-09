package com.blog.entity;

/**
  *   博主
 * @author Administrator
 *
 */
public class Blogger {

	/**主键*/
	private int id;
	/**登录名*/
	private String userName;
	/**密码*/
	private String password;
	/**个人信息*/
	private String profile;
	/**昵称*/
	private String nickName;
	/**个性签名*/
	private String sign;
	/**头像地址*/
	private String imageName;
	
	public Blogger() {
		
	}

	public Blogger(int id, String userName, String password, String profile, String nickName, String sign,
			String imageName) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.profile = profile;
		this.nickName = nickName;
		this.sign = sign;
		this.imageName = imageName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	@Override
	public String toString() {
		return "Blogger [id=" + id + ", userName=" + userName + ", password=" + password + ", profile=" + profile
				+ ", nickName=" + nickName + ", sign=" + sign + ", imageName=" + imageName + "]";
	}
	
	
	
	
	
}
