package com.adapter;

import com.devops.DevopsComponent;
import com.factory.AbstractDevopsFactory;
import com.subsystem.Activity;

public class DevopsAdapter implements Activity{
	
	private DevopsComponent component;

	
	public DevopsAdapter(String tool)
	{
		component = AbstractDevopsFactory.getInstance(tool);
		
	}
	
	@Override
	public void activity(String name) {
		// TODO Auto-generated method stub
		component.start(name);
	}

}
