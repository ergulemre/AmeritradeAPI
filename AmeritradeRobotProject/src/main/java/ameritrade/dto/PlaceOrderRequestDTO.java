package ameritrade.dto;

import java.util.List;

public class PlaceOrderRequestDTO {
	
	private String complexOrderStrategyType;
	private String orderType;
	private String session;
	private String price;
	private String duration;
	private String orderStrategyType;
	private List<OrderLegCollectionDTO> orderLegCollection;
	
	public String getComplexOrderStrategyType() {
		return complexOrderStrategyType;
	}
	public void setComplexOrderStrategyType(String complexOrderStrategyType) {
		this.complexOrderStrategyType = complexOrderStrategyType;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getOrderStrategyType() {
		return orderStrategyType;
	}
	public void setOrderStrategyType(String orderStrategyType) {
		this.orderStrategyType = orderStrategyType;
	}
	public List<OrderLegCollectionDTO> getOrderLegCollection() {
		return orderLegCollection;
	}
	public void setOrderLegCollection(List<OrderLegCollectionDTO> orderLegCollection) {
		this.orderLegCollection = orderLegCollection;
	}
}
