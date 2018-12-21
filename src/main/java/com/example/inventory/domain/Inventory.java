package com.example.inventory.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by ram on 12/20/18
 */
@Data
@AllArgsConstructor
public class Inventory implements Serializable {

	String productId;
	Integer inStock;

}
