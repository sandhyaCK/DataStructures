package com.bridgelabz.creational.Prototype;

public class SocketObjectAdapterImpl  implements SocketAdapter {
private Socket sock = new Socket();
	
	@Override
	public volt get120Volt() {
		return sock.getVolt();
	}

	@Override
	public volt get12Volt() {
		volt v= sock.getVolt();
		return convertVolt(v,10);
	}

	@Override
	public volt get3Volt() {
		volt v= sock.getVolt();
		return convertVolt(v,40);
	}
	
	private volt convertVolt(volt v, int i) {
		return new volt(v.getVolts()/i);
}
}
