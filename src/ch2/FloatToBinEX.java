package ch2;

public class FloatToBinEX {
    public static void main(String[] args) {
        float f = -9.1234567f;
		int i = Float.floatToIntBits(f);
        //float타입의 값을 int타입의 값으로 해석해서 반환한다
        
		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i); // 16Áø¼ö·Î Ãâ·Â
	} // mainÀÇ ³¡
}

/*
float 타입의 값이 실제로 어떻게 저장되는지
*/