package com.example.inventory.conroller;

import com.example.inventory.domain.Inventory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ram on 12/20/18
 */
@RestController
public class InventoryController {

	@GetMapping("inventory")
	public Inventory getInventory(){

		return new Inventory("1", 10);

	}
}
