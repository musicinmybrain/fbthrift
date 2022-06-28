/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package com.facebook.thrift.test.terse_write;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import com.google.common.collect.*;
import java.util.*;
import javax.annotation.Nullable;
import org.apache.thrift.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;
import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.MoreObjects.ToStringHelper;

@SwiftGenerated
@com.facebook.swift.codec.ThriftStruct(value="StructLevelTerseStruct", builder=StructLevelTerseStruct.Builder.class)
public final class StructLevelTerseStruct implements com.facebook.thrift.payload.ThriftSerializable {

    @ThriftConstructor
    public StructLevelTerseStruct(
        @com.facebook.swift.codec.ThriftField(value=1, name="bool_field", requiredness=Requiredness.NONE) final boolean boolField,
        @com.facebook.swift.codec.ThriftField(value=2, name="byte_field", requiredness=Requiredness.NONE) final byte byteField,
        @com.facebook.swift.codec.ThriftField(value=3, name="short_field", requiredness=Requiredness.NONE) final short shortField,
        @com.facebook.swift.codec.ThriftField(value=4, name="int_field", requiredness=Requiredness.NONE) final int intField,
        @com.facebook.swift.codec.ThriftField(value=5, name="long_field", requiredness=Requiredness.NONE) final long longField,
        @com.facebook.swift.codec.ThriftField(value=6, name="float_field", requiredness=Requiredness.NONE) final float floatField,
        @com.facebook.swift.codec.ThriftField(value=7, name="double_field", requiredness=Requiredness.NONE) final double doubleField,
        @com.facebook.swift.codec.ThriftField(value=8, name="string_field", requiredness=Requiredness.NONE) final String stringField,
        @com.facebook.swift.codec.ThriftField(value=9, name="binary_field", requiredness=Requiredness.NONE) final byte[] binaryField,
        @com.facebook.swift.codec.ThriftField(value=10, name="enum_field", requiredness=Requiredness.NONE) final com.facebook.thrift.test.terse_write.MyEnum enumField,
        @com.facebook.swift.codec.ThriftField(value=11, name="list_field", requiredness=Requiredness.NONE) final List<Short> listField,
        @com.facebook.swift.codec.ThriftField(value=12, name="set_field", requiredness=Requiredness.NONE) final Set<Short> setField,
        @com.facebook.swift.codec.ThriftField(value=13, name="map_field", requiredness=Requiredness.NONE) final Map<Short, Short> mapField,
        @com.facebook.swift.codec.ThriftField(value=14, name="struct_field", requiredness=Requiredness.NONE) final com.facebook.thrift.test.terse_write.MyStruct structField
    ) {
        this.boolField = boolField;
        this.byteField = byteField;
        this.shortField = shortField;
        this.intField = intField;
        this.longField = longField;
        this.floatField = floatField;
        this.doubleField = doubleField;
        this.stringField = stringField;
        this.binaryField = binaryField;
        this.enumField = enumField;
        this.listField = listField;
        this.setField = setField;
        this.mapField = mapField;
        this.structField = structField;
    }
    
    @ThriftConstructor
    protected StructLevelTerseStruct() {
      this.boolField = false;
      this.byteField = 0;
      this.shortField = 0;
      this.intField = 0;
      this.longField = 0L;
      this.floatField = 0.f;
      this.doubleField = 0.;
      this.stringField = null;
      this.binaryField = null;
      this.enumField = com.facebook.thrift.test.terse_write.MyEnum.fromInteger(0);
      this.listField = null;
      this.setField = null;
      this.mapField = null;
      this.structField = null;
    }
    
    public static class Builder {
    
        private boolean boolField = false;
        private byte byteField = (byte)0;
        private short shortField = (short)0;
        private int intField = 0;
        private long longField = 0L;
        private float floatField = 0.f;
        private double doubleField = 0.;
        private String stringField = com.facebook.thrift.util.IntrinsicDefaults.defaultString();
        private byte[] binaryField = com.facebook.thrift.util.IntrinsicDefaults.defaultByteArray();
        private com.facebook.thrift.test.terse_write.MyEnum enumField = com.facebook.thrift.test.terse_write.MyEnum.fromInteger(0);
        private List<Short> listField = com.facebook.thrift.util.IntrinsicDefaults.defaultList();
        private Set<Short> setField = com.facebook.thrift.util.IntrinsicDefaults.defaultSet();
        private Map<Short, Short> mapField = com.facebook.thrift.util.IntrinsicDefaults.defaultMap();
        
        private com.facebook.thrift.test.terse_write.MyStruct structField = com.facebook.thrift.test.terse_write.MyStruct.defaultInstance();
    
        @com.facebook.swift.codec.ThriftField(value=1, name="bool_field", requiredness=Requiredness.NONE)
        public Builder setBoolField(boolean boolField) {
            this.boolField = boolField;
            return this;
        }
    
        public boolean isBoolField() { return boolField; }
    
            @com.facebook.swift.codec.ThriftField(value=2, name="byte_field", requiredness=Requiredness.NONE)
        public Builder setByteField(byte byteField) {
            this.byteField = byteField;
            return this;
        }
    
        public byte getByteField() { return byteField; }
    
            @com.facebook.swift.codec.ThriftField(value=3, name="short_field", requiredness=Requiredness.NONE)
        public Builder setShortField(short shortField) {
            this.shortField = shortField;
            return this;
        }
    
        public short getShortField() { return shortField; }
    
            @com.facebook.swift.codec.ThriftField(value=4, name="int_field", requiredness=Requiredness.NONE)
        public Builder setIntField(int intField) {
            this.intField = intField;
            return this;
        }
    
        public int getIntField() { return intField; }
    
            @com.facebook.swift.codec.ThriftField(value=5, name="long_field", requiredness=Requiredness.NONE)
        public Builder setLongField(long longField) {
            this.longField = longField;
            return this;
        }
    
        public long getLongField() { return longField; }
    
            @com.facebook.swift.codec.ThriftField(value=6, name="float_field", requiredness=Requiredness.NONE)
        public Builder setFloatField(float floatField) {
            this.floatField = floatField;
            return this;
        }
    
        public float getFloatField() { return floatField; }
    
            @com.facebook.swift.codec.ThriftField(value=7, name="double_field", requiredness=Requiredness.NONE)
        public Builder setDoubleField(double doubleField) {
            this.doubleField = doubleField;
            return this;
        }
    
        public double getDoubleField() { return doubleField; }
    
            @com.facebook.swift.codec.ThriftField(value=8, name="string_field", requiredness=Requiredness.NONE)
        public Builder setStringField(String stringField) {
            this.stringField = stringField;
            return this;
        }
    
        public String getStringField() { return stringField; }
    
            @com.facebook.swift.codec.ThriftField(value=9, name="binary_field", requiredness=Requiredness.NONE)
        public Builder setBinaryField(byte[] binaryField) {
            this.binaryField = binaryField;
            return this;
        }
    
        public byte[] getBinaryField() { return binaryField; }
    
            @com.facebook.swift.codec.ThriftField(value=10, name="enum_field", requiredness=Requiredness.NONE)
        public Builder setEnumField(com.facebook.thrift.test.terse_write.MyEnum enumField) {
            this.enumField = enumField;
            return this;
        }
    
        public com.facebook.thrift.test.terse_write.MyEnum getEnumField() { return enumField; }
    
            @com.facebook.swift.codec.ThriftField(value=11, name="list_field", requiredness=Requiredness.NONE)
        public Builder setListField(List<Short> listField) {
            this.listField = listField;
            return this;
        }
    
        public List<Short> getListField() { return listField; }
    
            @com.facebook.swift.codec.ThriftField(value=12, name="set_field", requiredness=Requiredness.NONE)
        public Builder setSetField(Set<Short> setField) {
            this.setField = setField;
            return this;
        }
    
        public Set<Short> getSetField() { return setField; }
    
            @com.facebook.swift.codec.ThriftField(value=13, name="map_field", requiredness=Requiredness.NONE)
        public Builder setMapField(Map<Short, Short> mapField) {
            this.mapField = mapField;
            return this;
        }
    
        public Map<Short, Short> getMapField() { return mapField; }
    
            @com.facebook.swift.codec.ThriftField(value=14, name="struct_field", requiredness=Requiredness.NONE)
        public Builder setStructField(com.facebook.thrift.test.terse_write.MyStruct structField) {
            this.structField = structField;
            return this;
        }
    
        public com.facebook.thrift.test.terse_write.MyStruct getStructField() { return structField; }
    
        public Builder() { }
        public Builder(StructLevelTerseStruct other) {
            this.boolField = other.boolField;
            this.byteField = other.byteField;
            this.shortField = other.shortField;
            this.intField = other.intField;
            this.longField = other.longField;
            this.floatField = other.floatField;
            this.doubleField = other.doubleField;
            this.stringField = other.stringField;
            this.binaryField = other.binaryField;
            this.enumField = other.enumField;
            this.listField = other.listField;
            this.setField = other.setField;
            this.mapField = other.mapField;
            this.structField = other.structField;
        }
    
        @ThriftConstructor
        public StructLevelTerseStruct build() {
            StructLevelTerseStruct result = new StructLevelTerseStruct (
                this.boolField,
                this.byteField,
                this.shortField,
                this.intField,
                this.longField,
                this.floatField,
                this.doubleField,
                this.stringField,
                this.binaryField,
                this.enumField,
                this.listField,
                this.setField,
                this.mapField,
                this.structField
            );
            return result;
        }
    }
                                                            public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("StructLevelTerseStruct");
    private final boolean boolField;
    public static final int _BOOL_FIELD = 1;
    private static final TField BOOL_FIELD_FIELD_DESC = new TField("bool_field", TType.BOOL, (short)1);
        private final byte byteField;
    public static final int _BYTE_FIELD = 2;
    private static final TField BYTE_FIELD_FIELD_DESC = new TField("byte_field", TType.BYTE, (short)2);
        private final short shortField;
    public static final int _SHORT_FIELD = 3;
    private static final TField SHORT_FIELD_FIELD_DESC = new TField("short_field", TType.I16, (short)3);
        private final int intField;
    public static final int _INT_FIELD = 4;
    private static final TField INT_FIELD_FIELD_DESC = new TField("int_field", TType.I32, (short)4);
        private final long longField;
    public static final int _LONG_FIELD = 5;
    private static final TField LONG_FIELD_FIELD_DESC = new TField("long_field", TType.I64, (short)5);
        private final float floatField;
    public static final int _FLOAT_FIELD = 6;
    private static final TField FLOAT_FIELD_FIELD_DESC = new TField("float_field", TType.FLOAT, (short)6);
        private final double doubleField;
    public static final int _DOUBLE_FIELD = 7;
    private static final TField DOUBLE_FIELD_FIELD_DESC = new TField("double_field", TType.DOUBLE, (short)7);
        private final String stringField;
    public static final int _STRING_FIELD = 8;
    private static final TField STRING_FIELD_FIELD_DESC = new TField("string_field", TType.STRING, (short)8);
        private final byte[] binaryField;
    public static final int _BINARY_FIELD = 9;
    private static final TField BINARY_FIELD_FIELD_DESC = new TField("binary_field", TType.STRING, (short)9);
        private final com.facebook.thrift.test.terse_write.MyEnum enumField;
    public static final int _ENUM_FIELD = 10;
    private static final TField ENUM_FIELD_FIELD_DESC = new TField("enum_field", TType.I32, (short)10);
        private final List<Short> listField;
    public static final int _LIST_FIELD = 11;
    private static final TField LIST_FIELD_FIELD_DESC = new TField("list_field", TType.LIST, (short)11);
        private final Set<Short> setField;
    public static final int _SET_FIELD = 12;
    private static final TField SET_FIELD_FIELD_DESC = new TField("set_field", TType.SET, (short)12);
        private final Map<Short, Short> mapField;
    public static final int _MAP_FIELD = 13;
    private static final TField MAP_FIELD_FIELD_DESC = new TField("map_field", TType.MAP, (short)13);
        private final com.facebook.thrift.test.terse_write.MyStruct structField;
    public static final int _STRUCT_FIELD = 14;
    private static final TField STRUCT_FIELD_FIELD_DESC = new TField("struct_field", TType.STRUCT, (short)14);
    static {
      NAMES_TO_IDS.put("boolField", 1);
      THRIFT_NAMES_TO_IDS.put("bool_field", 1);
      FIELD_METADATA.put(1, BOOL_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("byteField", 2);
      THRIFT_NAMES_TO_IDS.put("byte_field", 2);
      FIELD_METADATA.put(2, BYTE_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("shortField", 3);
      THRIFT_NAMES_TO_IDS.put("short_field", 3);
      FIELD_METADATA.put(3, SHORT_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("intField", 4);
      THRIFT_NAMES_TO_IDS.put("int_field", 4);
      FIELD_METADATA.put(4, INT_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("longField", 5);
      THRIFT_NAMES_TO_IDS.put("long_field", 5);
      FIELD_METADATA.put(5, LONG_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("floatField", 6);
      THRIFT_NAMES_TO_IDS.put("float_field", 6);
      FIELD_METADATA.put(6, FLOAT_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("doubleField", 7);
      THRIFT_NAMES_TO_IDS.put("double_field", 7);
      FIELD_METADATA.put(7, DOUBLE_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("stringField", 8);
      THRIFT_NAMES_TO_IDS.put("string_field", 8);
      FIELD_METADATA.put(8, STRING_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("binaryField", 9);
      THRIFT_NAMES_TO_IDS.put("binary_field", 9);
      FIELD_METADATA.put(9, BINARY_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("enumField", 10);
      THRIFT_NAMES_TO_IDS.put("enum_field", 10);
      FIELD_METADATA.put(10, ENUM_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("listField", 11);
      THRIFT_NAMES_TO_IDS.put("list_field", 11);
      FIELD_METADATA.put(11, LIST_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("setField", 12);
      THRIFT_NAMES_TO_IDS.put("set_field", 12);
      FIELD_METADATA.put(12, SET_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("mapField", 13);
      THRIFT_NAMES_TO_IDS.put("map_field", 13);
      FIELD_METADATA.put(13, MAP_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("structField", 14);
      THRIFT_NAMES_TO_IDS.put("struct_field", 14);
      FIELD_METADATA.put(14, STRUCT_FIELD_FIELD_DESC);
      com.facebook.thrift.type.TypeRegistry.add(new com.facebook.thrift.type.Type(
        new com.facebook.thrift.type.UniversalName("facebook.com/thrift/test/terse_write/StructLevelTerseStruct"), 
        StructLevelTerseStruct.class, StructLevelTerseStruct::read0));
    }
    
    
    @com.facebook.swift.codec.ThriftField(value=1, name="bool_field", requiredness=Requiredness.NONE)
    public boolean isBoolField() { return boolField; }
    
    
    
    @com.facebook.swift.codec.ThriftField(value=2, name="byte_field", requiredness=Requiredness.NONE)
    public byte getByteField() { return byteField; }
    
    
    
    @com.facebook.swift.codec.ThriftField(value=3, name="short_field", requiredness=Requiredness.NONE)
    public short getShortField() { return shortField; }
    
    
    
    @com.facebook.swift.codec.ThriftField(value=4, name="int_field", requiredness=Requiredness.NONE)
    public int getIntField() { return intField; }
    
    
    
    @com.facebook.swift.codec.ThriftField(value=5, name="long_field", requiredness=Requiredness.NONE)
    public long getLongField() { return longField; }
    
    
    
    @com.facebook.swift.codec.ThriftField(value=6, name="float_field", requiredness=Requiredness.NONE)
    public float getFloatField() { return floatField; }
    
    
    
    @com.facebook.swift.codec.ThriftField(value=7, name="double_field", requiredness=Requiredness.NONE)
    public double getDoubleField() { return doubleField; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=8, name="string_field", requiredness=Requiredness.NONE)
    public String getStringField() { return stringField; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=9, name="binary_field", requiredness=Requiredness.NONE)
    public byte[] getBinaryField() { return binaryField; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=10, name="enum_field", requiredness=Requiredness.NONE)
    public com.facebook.thrift.test.terse_write.MyEnum getEnumField() { return enumField; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=11, name="list_field", requiredness=Requiredness.NONE)
    public List<Short> getListField() { return listField; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=12, name="set_field", requiredness=Requiredness.NONE)
    public Set<Short> getSetField() { return setField; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=13, name="map_field", requiredness=Requiredness.NONE)
    public Map<Short, Short> getMapField() { return mapField; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=14, name="struct_field", requiredness=Requiredness.NONE)
    public com.facebook.thrift.test.terse_write.MyStruct getStructField() { return structField; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("boolField", boolField);
        helper.add("byteField", byteField);
        helper.add("shortField", shortField);
        helper.add("intField", intField);
        helper.add("longField", longField);
        helper.add("floatField", floatField);
        helper.add("doubleField", doubleField);
        helper.add("stringField", stringField);
        helper.add("binaryField", binaryField);
        helper.add("enumField", enumField);
        helper.add("listField", listField);
        helper.add("setField", setField);
        helper.add("mapField", mapField);
        helper.add("structField", structField);
        return helper.toString();
    }
    
    @java.lang.Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    
        StructLevelTerseStruct other = (StructLevelTerseStruct)o;
    
        return
            Objects.equals(boolField, other.boolField) &&
    Objects.equals(byteField, other.byteField) &&
    Objects.equals(shortField, other.shortField) &&
    Objects.equals(intField, other.intField) &&
    Objects.equals(longField, other.longField) &&
    Objects.equals(floatField, other.floatField) &&
    Objects.equals(doubleField, other.doubleField) &&
    Objects.equals(stringField, other.stringField) &&
    Arrays.equals(binaryField, other.binaryField) &&
    Objects.equals(enumField, other.enumField) &&
    Objects.equals(listField, other.listField) &&
    Objects.equals(setField, other.setField) &&
    Objects.equals(mapField, other.mapField) &&
    Objects.equals(structField, other.structField) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new java.lang.Object[] {
            boolField,
            byteField,
            shortField,
            intField,
            longField,
            floatField,
            doubleField,
            stringField,
            binaryField,
            enumField,
            listField,
            setField,
            mapField,
            structField
        });
    }
    
    
    public static com.facebook.thrift.payload.Reader<StructLevelTerseStruct> asReader() {
      return StructLevelTerseStruct::read0;
    }
    
    public static StructLevelTerseStruct read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(StructLevelTerseStruct.NAMES_TO_IDS, StructLevelTerseStruct.THRIFT_NAMES_TO_IDS, StructLevelTerseStruct.FIELD_METADATA);
      StructLevelTerseStruct.Builder builder = new StructLevelTerseStruct.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _BOOL_FIELD:
          if (__field.type == TType.BOOL) {
            boolean boolField = oprot.readBool();
            builder.setBoolField(boolField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _BYTE_FIELD:
          if (__field.type == TType.BYTE) {
            byte byteField = oprot.readByte();
            builder.setByteField(byteField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _SHORT_FIELD:
          if (__field.type == TType.I16) {
            short shortField = oprot.readI16();
            builder.setShortField(shortField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _INT_FIELD:
          if (__field.type == TType.I32) {
            int intField = oprot.readI32();
            builder.setIntField(intField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _LONG_FIELD:
          if (__field.type == TType.I64) {
            long longField = oprot.readI64();
            builder.setLongField(longField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _FLOAT_FIELD:
          if (__field.type == TType.FLOAT) {
            float floatField = oprot.readFloat();
            builder.setFloatField(floatField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _DOUBLE_FIELD:
          if (__field.type == TType.DOUBLE) {
            double doubleField = oprot.readDouble();
            builder.setDoubleField(doubleField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _STRING_FIELD:
          if (__field.type == TType.STRING) {
            String stringField = oprot.readString();
            builder.setStringField(stringField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _BINARY_FIELD:
          if (__field.type == TType.STRING) {
            byte[] binaryField = oprot.readBinary().array();
            builder.setBinaryField(binaryField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _ENUM_FIELD:
          if (__field.type == TType.I32) {
            com.facebook.thrift.test.terse_write.MyEnum enumField = com.facebook.thrift.test.terse_write.MyEnum.fromInteger(oprot.readI32());
            builder.setEnumField(enumField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _LIST_FIELD:
          if (__field.type == TType.LIST) {
            List<Short> listField;
            {
            TList _list = oprot.readListBegin();
            listField = new ArrayList<Short>(Math.max(0, _list.size));
            for (int _i = 0; (_list.size < 0) ? oprot.peekList() : (_i < _list.size); _i++) {
                
                short _value1 = oprot.readI16();
                listField.add(_value1);
            }
            oprot.readListEnd();
            }
            builder.setListField(listField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _SET_FIELD:
          if (__field.type == TType.SET) {
            Set<Short> setField;
            {
            TSet _set = oprot.readSetBegin();
            setField = new HashSet<Short>(Math.max(0, _set.size));
            for (int _i = 0; (_set.size < 0) ? oprot.peekSet() : (_i < _set.size); _i++) {
                
                short _value1 = oprot.readI16();
                setField.add(_value1);
            }
            oprot.readSetEnd();
            }
            builder.setSetField(setField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _MAP_FIELD:
          if (__field.type == TType.MAP) {
            Map<Short, Short> mapField;
            {
            TMap _map = oprot.readMapBegin();
            mapField = new HashMap<Short, Short>(Math.max(0, _map.size));
            for (int _i = 0; (_map.size < 0) ? oprot.peekMap() : (_i < _map.size); _i++) {
                
                short _key1 = oprot.readI16();
                short _value1 = oprot.readI16();
                mapField.put(_key1, _value1);
            }
            }
            oprot.readMapEnd();
            builder.setMapField(mapField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _STRUCT_FIELD:
          if (__field.type == TType.STRUCT) {
            com.facebook.thrift.test.terse_write.MyStruct structField = com.facebook.thrift.test.terse_write.MyStruct.read0(oprot);
            builder.setStructField(structField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(oprot, __field.type);
          break;
        }
        oprot.readFieldEnd();
      }
      oprot.readStructEnd();
      return builder.build();
    }
    
    public void write0(TProtocol oprot) throws TException {
      oprot.writeStructBegin(STRUCT_DESC);
      int structStart = 0;
      int pos = 0;
      com.facebook.thrift.protocol.ByteBufTProtocol p = (com.facebook.thrift.protocol.ByteBufTProtocol) oprot;
      if (!com.facebook.thrift.util.IntrinsicDefaults.isDefault(this.boolField)) {
        oprot.writeFieldBegin(BOOL_FIELD_FIELD_DESC);
        oprot.writeBool(this.boolField);
        oprot.writeFieldEnd();
      };
      if (!com.facebook.thrift.util.IntrinsicDefaults.isDefault(this.byteField)) {
        oprot.writeFieldBegin(BYTE_FIELD_FIELD_DESC);
        oprot.writeByte(this.byteField);
        oprot.writeFieldEnd();
      };
      if (!com.facebook.thrift.util.IntrinsicDefaults.isDefault(this.shortField)) {
        oprot.writeFieldBegin(SHORT_FIELD_FIELD_DESC);
        oprot.writeI16(this.shortField);
        oprot.writeFieldEnd();
      };
      if (!com.facebook.thrift.util.IntrinsicDefaults.isDefault(this.intField)) {
        oprot.writeFieldBegin(INT_FIELD_FIELD_DESC);
        oprot.writeI32(this.intField);
        oprot.writeFieldEnd();
      };
      if (!com.facebook.thrift.util.IntrinsicDefaults.isDefault(this.longField)) {
        oprot.writeFieldBegin(LONG_FIELD_FIELD_DESC);
        oprot.writeI64(this.longField);
        oprot.writeFieldEnd();
      };
      if (!com.facebook.thrift.util.IntrinsicDefaults.isDefault(this.floatField)) {
        oprot.writeFieldBegin(FLOAT_FIELD_FIELD_DESC);
        oprot.writeFloat(this.floatField);
        oprot.writeFieldEnd();
      };
      if (!com.facebook.thrift.util.IntrinsicDefaults.isDefault(this.doubleField)) {
        oprot.writeFieldBegin(DOUBLE_FIELD_FIELD_DESC);
        oprot.writeDouble(this.doubleField);
        oprot.writeFieldEnd();
      };
      java.util.Objects.requireNonNull(this.stringField, "stringField must not be null");
      
      if (!com.facebook.thrift.util.IntrinsicDefaults.isDefault(this.stringField)) {
        oprot.writeFieldBegin(STRING_FIELD_FIELD_DESC);
        oprot.writeString(this.stringField);
        oprot.writeFieldEnd();
      }
      java.util.Objects.requireNonNull(this.binaryField, "binaryField must not be null");
      
      if (!com.facebook.thrift.util.IntrinsicDefaults.isDefault(this.binaryField)) {
        oprot.writeFieldBegin(BINARY_FIELD_FIELD_DESC);
        oprot.writeBinary(java.nio.ByteBuffer.wrap(this.binaryField));
        oprot.writeFieldEnd();
      }
      java.util.Objects.requireNonNull(this.enumField, "enumField must not be null");
      if (!com.facebook.thrift.util.IntrinsicDefaults.isDefault(this.enumField.getValue())) {
        oprot.writeFieldBegin(ENUM_FIELD_FIELD_DESC);
        oprot.writeI32(this.enumField == null ? 0 : this.enumField.getValue());
        oprot.writeFieldEnd();
      };
      java.util.Objects.requireNonNull(this.listField, "listField must not be null");
      
      if (!com.facebook.thrift.util.IntrinsicDefaults.isDefault(this.listField)) {
        oprot.writeFieldBegin(LIST_FIELD_FIELD_DESC);
        List<Short> _iter0 = this.listField;
        oprot.writeListBegin(new TList(TType.I16, _iter0.size()));
        for (short _iter1 : _iter0) {
          oprot.writeI16(_iter1);
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();
      }
      java.util.Objects.requireNonNull(this.setField, "setField must not be null");
      
      if (!com.facebook.thrift.util.IntrinsicDefaults.isDefault(this.setField)) {
        oprot.writeFieldBegin(SET_FIELD_FIELD_DESC);
        Set<Short> _iter0 = this.setField;
        oprot.writeSetBegin(new TSet(TType.I16, _iter0.size()));
        for (short _iter1 : _iter0) {
          oprot.writeI16(_iter1);
        }
        oprot.writeSetEnd();
        oprot.writeFieldEnd();
      }
      java.util.Objects.requireNonNull(this.mapField, "mapField must not be null");
      
      if (!com.facebook.thrift.util.IntrinsicDefaults.isDefault(this.mapField)) {
        oprot.writeFieldBegin(MAP_FIELD_FIELD_DESC);
        Map<Short, Short> _iter0 = this.mapField;
        oprot.writeMapBegin(new TMap(TType.I16, TType.I16, _iter0.size()));
        for (Map.Entry<Short, Short> _iter1 : _iter0.entrySet()) {
          oprot.writeI16(_iter1.getKey());
          oprot.writeI16(_iter1.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();
      }
      java.util.Objects.requireNonNull(this.structField, "structField must not be null");
      structStart = p.mark();
        oprot.writeFieldBegin(STRUCT_FIELD_FIELD_DESC);
        pos = p.mark();
        this.structField.write0(oprot);
        if (p.mark() - pos > p.getEmptyStructSize()) {
          p.writeFieldEnd();    
        } else {
          p.rollback(structStart);
        }    
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _StructLevelTerseStructLazy {
        private static final StructLevelTerseStruct _DEFAULT = new StructLevelTerseStruct.Builder().build();
    }
    
    public static StructLevelTerseStruct defaultInstance() {
        return  _StructLevelTerseStructLazy._DEFAULT;
    }
}
