package net.iretailer.model;
// Generated 2016-2-1 23:19:37 by Hibernate Tools 4.3.1.Final

/**
 * TPackWifiDuration generated by hbm2java
 */
public class TPackWifiDuration implements java.io.Serializable {

	private Integer id;
	private String storeId;
	private String date;
	private Integer macDetected;
	private Integer duration;
	private Integer macEntered;
	private Integer macRepeated;
	private String updateTime;
	private String packTime;

	public TPackWifiDuration() {
	}

	public TPackWifiDuration(String storeId) {
		this.storeId = storeId;
	}

	public TPackWifiDuration(String storeId, String date, Integer macDetected, Integer duration, Integer macEntered,
			Integer macRepeated, String updateTime, String packTime) {
		this.storeId = storeId;
		this.date = date;
		this.macDetected = macDetected;
		this.duration = duration;
		this.macEntered = macEntered;
		this.macRepeated = macRepeated;
		this.updateTime = updateTime;
		this.packTime = packTime;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getMacDetected() {
		return this.macDetected;
	}

	public void setMacDetected(Integer macDetected) {
		this.macDetected = macDetected;
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getMacEntered() {
		return this.macEntered;
	}

	public void setMacEntered(Integer macEntered) {
		this.macEntered = macEntered;
	}

	public Integer getMacRepeated() {
		return this.macRepeated;
	}

	public void setMacRepeated(Integer macRepeated) {
		this.macRepeated = macRepeated;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getPackTime() {
		return this.packTime;
	}

	public void setPackTime(String packTime) {
		this.packTime = packTime;
	}

}