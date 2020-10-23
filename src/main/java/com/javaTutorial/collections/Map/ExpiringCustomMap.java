package com.javaTutorial.collections.Map;

import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.map.PassiveExpiringMap;

public class ExpiringCustomMap<K, V> extends PassiveExpiringMap<K, V> {
	
	public ExpiringCustomMap() {
		System.out.println("In ExpiringCustomMap constructor");
	}
	
	public ExpiringCustomMap(final long timeToLive, final TimeUnit timeUnit) {
		super(timeToLive, timeUnit);
		System.out.println("In ExpiringCustomMap Override constructor()");

	}
	
    /**
     * All expired entries are removed from the map prior to returning the entry value.
     * {@inheritDoc}
     */
    @Override
    public V get(final Object key) {
    	V v= super.get(key);
        return v;
    }
    
    /**
     * Normal {@link Map#remove(Object)} behavior with the addition of removing
     * any expiration entry as well.
     * {@inheritDoc}
     */
    @Override
    public V remove(final Object key) {
    	System.out.println("In ExpiringCustomMap -> remove()");
        V v = super.remove(key);
        String value = v.toString();
        System.out.println(" Value of expired String - " + value);
        return v;
    }
    
}
