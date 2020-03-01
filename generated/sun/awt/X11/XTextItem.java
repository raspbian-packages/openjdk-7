// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import sun.util.logging.PlatformLogger;
public class XTextItem extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 24; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XTextItem(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XTextItem() {
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
	public long get_chars(int index) { log.finest(""); return Native.getLong(pData+0)+index*Native.getLongSize(); }
	public long get_chars() { log.finest("");return Native.getLong(pData+0); }
	public void set_chars(long v) { log.finest(""); Native.putLong(pData + 0, v); }
	public int get_nchars() { log.finest("");return (Native.getInt(pData+8)); }
	public void set_nchars(int v) { log.finest(""); Native.putInt(pData+8, v); }
	public int get_delta() { log.finest("");return (Native.getInt(pData+12)); }
	public void set_delta(int v) { log.finest(""); Native.putInt(pData+12, v); }
	public long get_font() { log.finest("");return (Native.getLong(pData+16)); }
	public void set_font(long v) { log.finest(""); Native.putLong(pData+16, v); }


	String getName() {
		return "XTextItem"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(160);

		ret.append("chars = ").append( get_chars() ).append(", ");
		ret.append("nchars = ").append( get_nchars() ).append(", ");
		ret.append("delta = ").append( get_delta() ).append(", ");
		ret.append("font = ").append( get_font() ).append(", ");
		return ret.toString();
	}


}



