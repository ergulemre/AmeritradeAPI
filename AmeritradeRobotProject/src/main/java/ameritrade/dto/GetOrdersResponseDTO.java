package ameritrade.dto;

public class GetOrdersResponseDTO {
	
	private String session;
	private String duration;
	private String orderType;
	private String complexOrderStrategyType;
	private Double quantity;
	private Double filledQuantity;
	private Double remainingQuantity;
	private String requestedDestination;
	private String destinationLinkName;
	private Double price;
	private Object[] orderLegCollection;
	private String orderStrategyType;
	private long orderId;
	private boolean cancelable;
	private boolean editable;
	private String status;
	private String enteredTime;
	private String closeTime;
	private long accountId;
	
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getComplexOrderStrategyType() {
		return complexOrderStrategyType;
	}
	public void setComplexOrderStrategyType(String complexOrderStrategyType) {
		this.complexOrderStrategyType = complexOrderStrategyType;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public Double getFilledQuantity() {
		return filledQuantity;
	}
	public void setFilledQuantity(Double filledQuantity) {
		this.filledQuantity = filledQuantity;
	}
	public Double getRemainingQuantity() {
		return remainingQuantity;
	}
	public void setRemainingQuantity(Double remainingQuantity) {
		this.remainingQuantity = remainingQuantity;
	}
	public String getRequestedDestination() {
		return requestedDestination;
	}
	public void setRequestedDestination(String requestedDestination) {
		this.requestedDestination = requestedDestination;
	}
	public String getDestinationLinkName() {
		return destinationLinkName;
	}
	public void setDestinationLinkName(String destinationLinkName) {
		this.destinationLinkName = destinationLinkName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Object[] getOrderLegCollection() {
		return orderLegCollection;
	}
	public void setOrderLegCollection(Object[] orderLegCollection) {
		this.orderLegCollection = orderLegCollection;
	}
	public String getOrderStrategyType() {
		return orderStrategyType;
	}
	public void setOrderStrategyType(String orderStrategyType) {
		this.orderStrategyType = orderStrategyType;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public boolean isCancelable() {
		return cancelable;
	}
	public void setCancelable(boolean cancelable) {
		this.cancelable = cancelable;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEnteredTime() {
		return enteredTime;
	}
	public void setEnteredTime(String enteredTime) {
		this.enteredTime = enteredTime;
	}
	public String getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
}
