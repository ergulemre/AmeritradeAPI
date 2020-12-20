package ameritrade.dto;

public class OrderLegCollectionDTO {
	
	private String instruction;
	private int quantity;
	private InstrumentDTO instrument;
	
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public InstrumentDTO getInstrument() {
		return instrument;
	}
	public void setInstrument(InstrumentDTO instrument) {
		this.instrument = instrument;
	}
}
