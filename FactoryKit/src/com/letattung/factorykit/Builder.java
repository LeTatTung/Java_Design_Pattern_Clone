/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/factory-kit
 */
package com.letattung.factorykit;

import java.util.function.Supplier;

public interface Builder {

	void add(WeaponType name, Supplier<Weapon> supplier);
}
