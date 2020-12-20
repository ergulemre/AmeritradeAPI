package ameritrade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ameritrade.dto.GetOrdersResponseDTO;
import ameritrade.entity.DenemeTableEntity;
import ameritrade.repository.DenemeTableRepository;
import ameritrade.services.OrderService;

@RestController
public class AmeritradeController {

	@Autowired
	private DenemeTableRepository denemeRepository;
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@PostMapping(path="/add") // Map ONLY POST Requests
	public @ResponseBody String addNewUser (@RequestParam int scriptId, @RequestParam String scriptName,
											@RequestParam String movement, @RequestParam String price) {


	    DenemeTableEntity denemeTable = new DenemeTableEntity();
	    denemeTable.setMovement(movement);
	    denemeTable.setPrice(price);
	    denemeTable.setScriptId(scriptId);
	    denemeTable.setScriptName(scriptName);
	    denemeRepository.save(denemeTable);
	    return "Saved";
	  }
	
	@GetMapping(path="/getorders")
	public List<GetOrdersResponseDTO> getOrders() {
		List<GetOrdersResponseDTO> orders = orderService.getOrders();
		return orders;
	}
	
	@PostMapping(path="/placeorder") // Map ONLY POST Requests
	public String placeOrder(@RequestBody String message) {
		
		String[] fields = message.split(",");
		String symbol = fields[0];
		String price = fields[1];
		String quantity = fields[2];
		String instruction = fields[3];
		
		String responseMessage = orderService.placeOrder(price, instruction, quantity, symbol);
		
		return responseMessage;
	}
	
}