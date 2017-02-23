/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/tolerant-reader
 */
package com.letattung.tolerantreader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public final class RainbowFishSerializer {

	private RainbowFishSerializer() {}
	
	public static void writeV1(RainbowFish rainbowFish, String fileName) throws IOException{
		Map<String, String> map = new HashMap<>();
		map.put("name", rainbowFish.getName());
	    map.put("age", String.format("%d", rainbowFish.getAge()));
	    map.put("lengthMeters", String.format("%d", rainbowFish.getLengthMeters()));
	    map.put("weightTons", String.format("%d", rainbowFish.getWeightTons()));
	    FileOutputStream fileOut = new FileOutputStream(fileName);
	    ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
	    objOut.writeObject(map);
	    objOut.close();
	    fileOut.close();
	}
	
	public static void writeV2(RainbowFishV2 rainbowFish, String fileName) throws IOException{
		Map<String, String> map = new HashMap<>();
		map.put("name", rainbowFish.getName());
	    map.put("age", String.format("%d", rainbowFish.getAge()));
	    map.put("lengthMeters", String.format("%d", rainbowFish.getLengthMeters()));
	    map.put("weightTons", String.format("%d", rainbowFish.getWeightTons()));
	    map.put("angry", Boolean.toString(rainbowFish.getAngry()));
	    map.put("hungry", Boolean.toString(rainbowFish.getHungry()));
	    map.put("sleeping", Boolean.toString(rainbowFish.getSleeping()));
	    FileOutputStream fileOut = new FileOutputStream(fileName);
	    ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
	    objOut.writeObject(map);
	    objOut.close();
	    fileOut.close();
	}
	
	public static RainbowFish readV1(String fileName) throws IOException, ClassNotFoundException{
		FileInputStream fileIn = new FileInputStream(fileName);
		ObjectInputStream objIn = new ObjectInputStream(fileIn);
	    Map<String, String> readObject = new HashMap<>();
		Map<String, String> map = readObject;
	    objIn.close();
	    fileIn.close();
	    return new RainbowFish(map.get("name"), Integer.parseInt(map.get("age")), Integer.parseInt(map
	        .get("lengthMeters")), Integer.parseInt(map.get("weightTons")));
	}
}
