// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import java.util.logging.*;
public class XkbNamesNotifyEvent extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 96; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XkbNamesNotifyEvent(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XkbNamesNotifyEvent() {
		log.finest("Creating");
		pData = unsafe.allocateMemory(getSize());
		should_free_memory = true;
	}


	public void dispose() {
		log.finest("Disposing");
		if (should_free_memory) {
			log.finest("freeing memory");
			unsafe.freeMemory(pData); 
	}
		}
	public int get_type() { log.finest("");return (Native.getInt(pData+0)); }
	public void set_type(int v) { log.finest(""); Native.putInt(pData+0, v); }
	public long get_serial() { log.finest("");return (Native.getULong(pData+8)); }
	public void set_serial(long v) { log.finest(""); Native.putULong(pData+8, v); }
	public boolean get_send_event() { log.finest("");return (Native.getBool(pData+16)); }
	public void set_send_event(boolean v) { log.finest(""); Native.putBool(pData+16, v); }
	public long get_display() { log.finest("");return (Native.getLong(pData+24)); }
	public void set_display(long v) { log.finest(""); Native.putLong(pData+24, v); }
	public long get_time() { log.finest("");return (Native.getULong(pData+32)); }
	public void set_time(long v) { log.finest(""); Native.putULong(pData+32, v); }
	public int get_xkb_type() { log.finest("");return (Native.getInt(pData+40)); }
	public void set_xkb_type(int v) { log.finest(""); Native.putInt(pData+40, v); }
	public int get_device() { log.finest("");return (Native.getInt(pData+44)); }
	public void set_device(int v) { log.finest(""); Native.putInt(pData+44, v); }
	public int get_changed() { log.finest("");return (Native.getInt(pData+48)); }
	public void set_changed(int v) { log.finest(""); Native.putInt(pData+48, v); }
	public int get_first_type() { log.finest("");return (Native.getInt(pData+52)); }
	public void set_first_type(int v) { log.finest(""); Native.putInt(pData+52, v); }
	public int get_num_types() { log.finest("");return (Native.getInt(pData+56)); }
	public void set_num_types(int v) { log.finest(""); Native.putInt(pData+56, v); }
	public int get_first_lvl() { log.finest("");return (Native.getInt(pData+60)); }
	public void set_first_lvl(int v) { log.finest(""); Native.putInt(pData+60, v); }
	public int get_num_lvls() { log.finest("");return (Native.getInt(pData+64)); }
	public void set_num_lvls(int v) { log.finest(""); Native.putInt(pData+64, v); }
	public int get_num_aliases() { log.finest("");return (Native.getInt(pData+68)); }
	public void set_num_aliases(int v) { log.finest(""); Native.putInt(pData+68, v); }
	public int get_num_radio_groups() { log.finest("");return (Native.getInt(pData+72)); }
	public void set_num_radio_groups(int v) { log.finest(""); Native.putInt(pData+72, v); }
	public int get_changed_vmods() { log.finest("");return (Native.getInt(pData+76)); }
	public void set_changed_vmods(int v) { log.finest(""); Native.putInt(pData+76, v); }
	public int get_changed_groups() { log.finest("");return (Native.getInt(pData+80)); }
	public void set_changed_groups(int v) { log.finest(""); Native.putInt(pData+80, v); }
	public int get_changed_indicators() { log.finest("");return (Native.getInt(pData+84)); }
	public void set_changed_indicators(int v) { log.finest(""); Native.putInt(pData+84, v); }
	public int get_first_key() { log.finest("");return (Native.getInt(pData+88)); }
	public void set_first_key(int v) { log.finest(""); Native.putInt(pData+88, v); }
	public int get_num_keys() { log.finest("");return (Native.getInt(pData+92)); }
	public void set_num_keys(int v) { log.finest(""); Native.putInt(pData+92, v); }


	String getName() {
		return "XkbNamesNotifyEvent"; 
	}


	String getFieldsAsString() {
		String ret="";

		ret += ""+"type = " + XlibWrapper.eventToString[get_type()] +", ";
		ret += ""+"serial = " + get_serial() +", ";
		ret += ""+"send_event = " + get_send_event() +", ";
		ret += ""+"display = " + get_display() +", ";
		ret += ""+"time = " + get_time() +", ";
		ret += ""+"xkb_type = " + get_xkb_type() +", ";
		ret += ""+"device = " + get_device() +", ";
		ret += ""+"changed = " + get_changed() +", ";
		ret += ""+"first_type = " + get_first_type() +", ";
		ret += ""+"num_types = " + get_num_types() +", ";
		ret += ""+"first_lvl = " + get_first_lvl() +", ";
		ret += ""+"num_lvls = " + get_num_lvls() +", ";
		ret += ""+"num_aliases = " + get_num_aliases() +", ";
		ret += ""+"num_radio_groups = " + get_num_radio_groups() +", ";
		ret += ""+"changed_vmods = " + get_changed_vmods() +", ";
		ret += ""+"changed_groups = " + get_changed_groups() +", ";
		ret += ""+"changed_indicators = " + get_changed_indicators() +", ";
		ret += ""+"first_key = " + get_first_key() +", ";
		ret += ""+"num_keys = " + get_num_keys() +", ";
		return ret;
	}


}



