package Prc_91_120;

public class prc_95 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 50.0F;
		double d = 60.0D;
		char c = 'a';
		boolean b2 = true;
		Byte byte_obj = new Byte(b);
		Short short_obj = new Short(s);
		Integer int_obj = new Integer(i);
		Long long_obj = new Long(l);
		Float float_obj = new Float(f);
		Double double_obj = new Double(d);
		Character char_obj = new Character(c);
		Boolean bool_obj = new Boolean(b2);

		System.out.println("--object values---");
		System.out.println("Byte object: " + byte_obj);
		System.out.println("Short object: " + short_obj);
		System.out.println("Integer object: " + int_obj);
		System.out.println("Long object: " + long_obj);
		System.out.println("Float object: " + float_obj);
		System.out.println("Double object: " + double_obj);
		System.out.println("Character object: " + char_obj);
		System.out.println("Boolean object: " + bool_obj);

		byte bytevalue = byte_obj.byteValue();
		short shortvalue = short_obj.shortValue();
		int intvalue = int_obj.intValue();
		long longvalue = long_obj.longValue();
		float floatvalue = float_obj.floatValue();
		double doublevalue = double_obj.doubleValue();
		char charvalue = char_obj.charValue();
		boolean boolvalue = bool_obj.booleanValue();

		System.out.println("--Primitive values---");
		System.out.println("byte value: " + bytevalue);
		System.out.println("short value: " + shortvalue);
		System.out.println("int value: " + intvalue);
		System.out.println("long value: " + longvalue);
		System.out.println("float value: " + floatvalue);
		System.out.println("double value: " + doublevalue);
		System.out.println("char value: " + charvalue);
		System.out.println("boolean value: " + boolvalue);
	}
}
