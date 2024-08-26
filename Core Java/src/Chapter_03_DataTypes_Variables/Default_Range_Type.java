package Chapter_03_DataTypes_Variables;

public class Default_Range_Type {
    public static void main(String[] args) {
        // cmd --> javap java.lang.integer
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);

        // cmd --> javap java.lang.Float
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.BYTES);

        // cmd --> javap java.lang.Boolean
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);
        System.out.println(Boolean.TYPE);

        // cmd --> javap java.lang.BYTE
        System.out.println(Byte.BYTES);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        // cmd --> javap java.lang.Character
        System.out.println(Character.TYPE);

    }
}
