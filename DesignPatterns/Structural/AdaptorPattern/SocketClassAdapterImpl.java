package com.bridgelabz.creational.Prototype;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public volt get120Volt() {
		return getVolt();
	}

	@Override
	public volt get12Volt() {
		volt v= getVolt();
		return convertVolt(v,10);
	}

	@Override
	public volt get3Volt() {
		volt v= getVolt();
		return convertVolt(v,40);
	}
	
	private volt convertVolt(volt v, int i) {
		return new volt(v.getVolts()/i);
	}
}
