package com.coreybeaver.hashtable;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Corey Beaver
 * 
 * This class is a Hashtable implementation for java. 
 * Essentially just two lists holding the keys and values
 *
 * @param <T> Key
 * @param <K> Value
 */
public class Hashtable<T, K> {
	
	/**
	 * List of keys
	 */
	private List<T> keys;
	/**
	 * List of values
	 */
	private List<K> values;
		
	public Hashtable() {
		this.keys = new ArrayList<T>();
		this.values = new ArrayList<K>();
	}
	
	/**
	 * Puts a value at a given key
	 * @param key Key
	 * @param value Value
	 */
	public void put(T key, K value) {
		keys.add(key);
		values.add(value);
	}
	
	/**
	 * Gets the Object at the current key
	 * @param key Key
	 * @return Value at given key
	 */
	public K get(T key) {
		int loc = 0;
		for(T k : keys) {
			if (k.equals(key)) {
				break;
			}
			loc++;
		}
		if(keys.contains(key)) return values.get(loc);
		return null;
	}
	
	/**
	 * Clears the map
	 */
	public void clear() {
		this.keys = new ArrayList<T>();
		this.values = new ArrayList<K>();
	}

	/**
	 * Converts the map to a string
	 */
	@Override
	public String toString() {
		String content = "";
		
		int i = 0;
		for(T key : keys) {
			content += key.toString() + " | " + values.get(i) + "\n";
			i++;
		}
		
		return content;
	}
	
	/**
	 * Gets if the given key is in the hashmap
	 * @param key Key
	 * @return if the key is in the map
	 */
	public boolean containsKey(T key) {
		return keys.contains(key);
	}
}
