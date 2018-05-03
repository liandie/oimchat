package com.onlyxiahui.im.bean;

import java.util.Date;

/**
 * @author: XiaHui
 * @date: 2017年5月31日 下午3:40:50
 */
public class UserHead {

	private String userId;
	private String headId;
	private String fileName;
	private String type;
	private String url;
	private Date createTime;// 建立时间
	//private String absolutePath;
	
	public static final String type_system = "1";
	public static final String type_custom = "2";

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getHeadId() {
		return headId;
	}

	public void setHeadId(String headId) {
		this.headId = headId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

//	public String getAbsolutePath() {
//		return absolutePath;
//	}
//
//	public void setAbsolutePath(String absolutePath) {
//		this.absolutePath = absolutePath;
//	}

}
