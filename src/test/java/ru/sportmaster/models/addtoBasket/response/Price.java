package ru.sportmaster.models.addtoBasket.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Price{
	private int catalog;
	private int retail;
	private List<Object> discounts;
}