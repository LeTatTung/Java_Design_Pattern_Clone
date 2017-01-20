/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/layers
 */
package com.letattung.layers;

import java.util.List;

public interface CakeBakingService {

	void bakeNewCake(CakeInfo cakeInfo)throws CakeBakingException;
	
	List<CakeInfo> getAllCakes();
	
	void saveNewTopping(CakeToppingInfo toppingInfo);
	
	List<CakeToppingInfo> getAvailableToppings();
	
	void saveNewLayer(CakeLayerInfo layerInfo);
	
	List<CakeLayerInfo> getAvailableLayers();
}
