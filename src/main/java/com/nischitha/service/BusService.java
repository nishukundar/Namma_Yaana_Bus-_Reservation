package com.nischitha.service;

package com.nischitha.service;

import java.util.List;

import com.nischitha.exceptions.BusException;
import com.nischitha.exceptions.LoginException;
import com.nischitha.model.Bus;

public interface BusService {

	public Bus addBus(Bus bus,String key)throws BusException,LoginException;
	public Bus updateBus(Bus bus,String key)throws BusException,LoginException;
	public Bus deleteBus(int busId,String key)throws BusException,LoginException;
	public Bus viewBus(int busId)throws BusException;
	public List<Bus> viewBusByType(String BusType) throws BusException;
	public List<Bus> viewAllBuses() throws BusException;
}
