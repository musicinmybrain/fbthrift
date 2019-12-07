/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package test.fixtures.basic;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class MyStruct implements TBase, java.io.Serializable, Cloneable, Comparable<MyStruct> {
  private static final TStruct STRUCT_DESC = new TStruct("MyStruct");
  private static final TField MY_INT_FIELD_FIELD_DESC = new TField("MyIntField", TType.I64, (short)1);
  private static final TField MY_STRING_FIELD_FIELD_DESC = new TField("MyStringField", TType.STRING, (short)2);
  private static final TField MY_DATA_FIELD_FIELD_DESC = new TField("MyDataField", TType.STRUCT, (short)3);
  private static final TField MY_ENUM_FIELD_DESC = new TField("myEnum", TType.I32, (short)4);

  public long MyIntField;
  public String MyStringField;
  public MyDataItem MyDataField;
  /**
   * 
   * @see MyEnum
   */
  public MyEnum myEnum;
  public static final int MYINTFIELD = 1;
  public static final int MYSTRINGFIELD = 2;
  public static final int MYDATAFIELD = 3;
  public static final int MYENUM = 4;

  // isset id assignments
  private static final int __MYINTFIELD_ISSET_ID = 0;
  private static final int __MYENUM_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(MYINTFIELD, new FieldMetaData("MyIntField", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(MYSTRINGFIELD, new FieldMetaData("MyStringField", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(MYDATAFIELD, new FieldMetaData("MyDataField", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, MyDataItem.class)));
    tmpMetaDataMap.put(MYENUM, new FieldMetaData("myEnum", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(MyStruct.class, metaDataMap);
  }

  public MyStruct() {
  }

  public MyStruct(
    long MyIntField,
    String MyStringField,
    MyDataItem MyDataField,
    MyEnum myEnum)
  {
    this();
    this.MyIntField = MyIntField;
    setMyIntFieldIsSet(true);
    this.MyStringField = MyStringField;
    this.MyDataField = MyDataField;
    this.myEnum = myEnum;
    setMyEnumIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MyStruct(MyStruct other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.MyIntField = TBaseHelper.deepCopy(other.MyIntField);
    if (other.isSetMyStringField()) {
      this.MyStringField = TBaseHelper.deepCopy(other.MyStringField);
    }
    if (other.isSetMyDataField()) {
      this.MyDataField = TBaseHelper.deepCopy(other.MyDataField);
    }
    this.myEnum = TBaseHelper.deepCopy(other.myEnum);
  }

  public MyStruct deepCopy() {
    return new MyStruct(this);
  }

  public long getMyIntField() {
    return this.MyIntField;
  }

  public MyStruct setMyIntField(long MyIntField) {
    this.MyIntField = MyIntField;
    setMyIntFieldIsSet(true);
    return this;
  }

  public void unsetMyIntField() {
    __isset_bit_vector.clear(__MYINTFIELD_ISSET_ID);
  }

  // Returns true if field MyIntField is set (has been assigned a value) and false otherwise
  public boolean isSetMyIntField() {
    return __isset_bit_vector.get(__MYINTFIELD_ISSET_ID);
  }

  public void setMyIntFieldIsSet(boolean __value) {
    __isset_bit_vector.set(__MYINTFIELD_ISSET_ID, __value);
  }

  public String getMyStringField() {
    return this.MyStringField;
  }

  public MyStruct setMyStringField(String MyStringField) {
    this.MyStringField = MyStringField;
    return this;
  }

  public void unsetMyStringField() {
    this.MyStringField = null;
  }

  // Returns true if field MyStringField is set (has been assigned a value) and false otherwise
  public boolean isSetMyStringField() {
    return this.MyStringField != null;
  }

  public void setMyStringFieldIsSet(boolean __value) {
    if (!__value) {
      this.MyStringField = null;
    }
  }

  public MyDataItem getMyDataField() {
    return this.MyDataField;
  }

  public MyStruct setMyDataField(MyDataItem MyDataField) {
    this.MyDataField = MyDataField;
    return this;
  }

  public void unsetMyDataField() {
    this.MyDataField = null;
  }

  // Returns true if field MyDataField is set (has been assigned a value) and false otherwise
  public boolean isSetMyDataField() {
    return this.MyDataField != null;
  }

  public void setMyDataFieldIsSet(boolean __value) {
    if (!__value) {
      this.MyDataField = null;
    }
  }

  /**
   * 
   * @see MyEnum
   */
  public MyEnum getMyEnum() {
    return this.myEnum;
  }

  /**
   * 
   * @see MyEnum
   */
  public MyStruct setMyEnum(MyEnum myEnum) {
    this.myEnum = myEnum;
    setMyEnumIsSet(true);
    return this;
  }

  public void unsetMyEnum() {
    __isset_bit_vector.clear(__MYENUM_ISSET_ID);
  }

  // Returns true if field myEnum is set (has been assigned a value) and false otherwise
  public boolean isSetMyEnum() {
    return __isset_bit_vector.get(__MYENUM_ISSET_ID);
  }

  public void setMyEnumIsSet(boolean __value) {
    __isset_bit_vector.set(__MYENUM_ISSET_ID, __value);
  }

  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case MYINTFIELD:
      if (__value == null) {
        unsetMyIntField();
      } else {
        setMyIntField((Long)__value);
      }
      break;

    case MYSTRINGFIELD:
      if (__value == null) {
        unsetMyStringField();
      } else {
        setMyStringField((String)__value);
      }
      break;

    case MYDATAFIELD:
      if (__value == null) {
        unsetMyDataField();
      } else {
        setMyDataField((MyDataItem)__value);
      }
      break;

    case MYENUM:
      if (__value == null) {
        unsetMyEnum();
      } else {
        setMyEnum((MyEnum)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case MYINTFIELD:
      return new Long(getMyIntField());

    case MYSTRINGFIELD:
      return getMyStringField();

    case MYDATAFIELD:
      return getMyDataField();

    case MYENUM:
      return getMyEnum();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MyStruct)
      return this.equals((MyStruct)that);
    return false;
  }

  public boolean equals(MyStruct that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_MyIntField = true;
    boolean that_present_MyIntField = true;
    if (this_present_MyIntField || that_present_MyIntField) {
      if (!(this_present_MyIntField && that_present_MyIntField))
        return false;
      if (!TBaseHelper.equalsNobinary(this.MyIntField, that.MyIntField))
        return false;
    }

    boolean this_present_MyStringField = true && this.isSetMyStringField();
    boolean that_present_MyStringField = true && that.isSetMyStringField();
    if (this_present_MyStringField || that_present_MyStringField) {
      if (!(this_present_MyStringField && that_present_MyStringField))
        return false;
      if (!TBaseHelper.equalsNobinary(this.MyStringField, that.MyStringField))
        return false;
    }

    boolean this_present_MyDataField = true && this.isSetMyDataField();
    boolean that_present_MyDataField = true && that.isSetMyDataField();
    if (this_present_MyDataField || that_present_MyDataField) {
      if (!(this_present_MyDataField && that_present_MyDataField))
        return false;
      if (!TBaseHelper.equalsNobinary(this.MyDataField, that.MyDataField))
        return false;
    }

    boolean this_present_myEnum = true;
    boolean that_present_myEnum = true;
    if (this_present_myEnum || that_present_myEnum) {
      if (!(this_present_myEnum && that_present_myEnum))
        return false;
      if (!TBaseHelper.equalsNobinary(this.myEnum, that.myEnum))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {MyIntField, MyStringField, MyDataField, myEnum});
  }

  @Override
  public int compareTo(MyStruct other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMyIntField()).compareTo(other.isSetMyIntField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(MyIntField, other.MyIntField);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetMyStringField()).compareTo(other.isSetMyStringField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(MyStringField, other.MyStringField);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetMyDataField()).compareTo(other.isSetMyDataField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(MyDataField, other.MyDataField);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetMyEnum()).compareTo(other.isSetMyEnum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(myEnum, other.myEnum);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case MYINTFIELD:
          if (__field.type == TType.I64) {
            this.MyIntField = iprot.readI64();
            setMyIntFieldIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case MYSTRINGFIELD:
          if (__field.type == TType.STRING) {
            this.MyStringField = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case MYDATAFIELD:
          if (__field.type == TType.STRUCT) {
            this.MyDataField = new MyDataItem();
            this.MyDataField.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case MYENUM:
          if (__field.type == TType.I32) {
            this.myEnum = MyEnum.findByValue(iprot.readI32());
            setMyEnumIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(MY_INT_FIELD_FIELD_DESC);
    oprot.writeI64(this.MyIntField);
    oprot.writeFieldEnd();
    if (this.MyStringField != null) {
      oprot.writeFieldBegin(MY_STRING_FIELD_FIELD_DESC);
      oprot.writeString(this.MyStringField);
      oprot.writeFieldEnd();
    }
    if (this.MyDataField != null) {
      oprot.writeFieldBegin(MY_DATA_FIELD_FIELD_DESC);
      this.MyDataField.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(MY_ENUM_FIELD_DESC);
    oprot.writeI32(this.myEnum == null ? 0 : this.myEnum.getValue());
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("MyStruct");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("MyIntField");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getMyIntField(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("MyStringField");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getMyStringField() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getMyStringField(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("MyDataField");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getMyDataField() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getMyDataField(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("myEnum");
    sb.append(space);
    sb.append(":").append(space);
    String myEnum_name = this.getMyEnum() == null ? "null" : this.getMyEnum().name();
    if (myEnum_name != null) {
      sb.append(myEnum_name);
      sb.append(" (");
    }
    sb.append(this.getMyEnum());
    if (myEnum_name != null) {
      sb.append(")");
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

