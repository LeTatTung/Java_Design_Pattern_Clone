/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/layers
 */
package com.letattung.layers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CakeViewImpl implements View{

	private static final Logger LOGGER = LoggerFactory.getLogger(View.class);
	private CakeBakingService cakeBakingService;
	
	public CakeViewImpl(CakeBakingService cakeBakingService) {
		this.cakeBakingService = cakeBakingService;
	}
	
	@Override
	public void render() {
		cakeBakingService.getAllCakes().stream().forEach(cake -> LOGGER.info(cake.toString()));
	}

}
