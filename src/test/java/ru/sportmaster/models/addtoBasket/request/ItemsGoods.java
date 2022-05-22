package ru.sportmaster.models.addtoBasket.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemsGoods {
	private int quantity;
	private String productId;
	private String wareId;
}