package ameritrade.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DenemeTableEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer alertId;
	private int scriptId;
	private String scriptName;
	private String movement;
	private String price;
	
	public Integer getAlertId() {
		return alertId;
	}
	public void setAlertId(Integer alertId) {
		this.alertId = alertId;
	}
	public int getScriptId() {
		return scriptId;
	}
	public void setScriptId(int scriptId) {
		this.scriptId = scriptId;
	}
	public String getScriptName() {
		return scriptName;
	}
	public void setScriptName(String scriptName) {
		this.scriptName = scriptName;
	}
	public String getMovement() {
		return movement;
	}
	public void setMovement(String movement) {
		this.movement = movement;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
