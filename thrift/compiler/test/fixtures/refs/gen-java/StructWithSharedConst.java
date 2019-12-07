/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
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
public class StructWithSharedConst implements TBase, java.io.Serializable, Cloneable, Comparable<StructWithSharedConst> {
  private static final TStruct STRUCT_DESC = new TStruct("StructWithSharedConst");
  private static final TField OPT_SHARED_CONST_FIELD_DESC = new TField("opt_shared_const", TType.STRUCT, (short)1);
  private static final TField SHARED_CONST_FIELD_DESC = new TField("shared_const", TType.STRUCT, (short)2);
  private static final TField REQ_SHARED_CONST_FIELD_DESC = new TField("req_shared_const", TType.STRUCT, (short)3);

  public MyField opt_shared_const;
  public MyField shared_const;
  public MyField req_shared_const;
  public static final int OPT_SHARED_CONST = 1;
  public static final int SHARED_CONST = 2;
  public static final int REQ_SHARED_CONST = 3;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(OPT_SHARED_CONST, new FieldMetaData("opt_shared_const", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, MyField.class)));
    tmpMetaDataMap.put(SHARED_CONST, new FieldMetaData("shared_const", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, MyField.class)));
    tmpMetaDataMap.put(REQ_SHARED_CONST, new FieldMetaData("req_shared_const", TFieldRequirementType.REQUIRED, 
        new StructMetaData(TType.STRUCT, MyField.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(StructWithSharedConst.class, metaDataMap);
  }

  public StructWithSharedConst() {
  }

  public StructWithSharedConst(
    MyField req_shared_const)
  {
    this();
    this.req_shared_const = req_shared_const;
  }

  public StructWithSharedConst(
    MyField shared_const,
    MyField req_shared_const)
  {
    this();
    this.shared_const = shared_const;
    this.req_shared_const = req_shared_const;
  }

  public StructWithSharedConst(
    MyField opt_shared_const,
    MyField shared_const,
    MyField req_shared_const)
  {
    this();
    this.opt_shared_const = opt_shared_const;
    this.shared_const = shared_const;
    this.req_shared_const = req_shared_const;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StructWithSharedConst(StructWithSharedConst other) {
    if (other.isSetOpt_shared_const()) {
      this.opt_shared_const = TBaseHelper.deepCopy(other.opt_shared_const);
    }
    if (other.isSetShared_const()) {
      this.shared_const = TBaseHelper.deepCopy(other.shared_const);
    }
    if (other.isSetReq_shared_const()) {
      this.req_shared_const = TBaseHelper.deepCopy(other.req_shared_const);
    }
  }

  public StructWithSharedConst deepCopy() {
    return new StructWithSharedConst(this);
  }

  public MyField getOpt_shared_const() {
    return this.opt_shared_const;
  }

  public StructWithSharedConst setOpt_shared_const(MyField opt_shared_const) {
    this.opt_shared_const = opt_shared_const;
    return this;
  }

  public void unsetOpt_shared_const() {
    this.opt_shared_const = null;
  }

  // Returns true if field opt_shared_const is set (has been assigned a value) and false otherwise
  public boolean isSetOpt_shared_const() {
    return this.opt_shared_const != null;
  }

  public void setOpt_shared_constIsSet(boolean __value) {
    if (!__value) {
      this.opt_shared_const = null;
    }
  }

  public MyField getShared_const() {
    return this.shared_const;
  }

  public StructWithSharedConst setShared_const(MyField shared_const) {
    this.shared_const = shared_const;
    return this;
  }

  public void unsetShared_const() {
    this.shared_const = null;
  }

  // Returns true if field shared_const is set (has been assigned a value) and false otherwise
  public boolean isSetShared_const() {
    return this.shared_const != null;
  }

  public void setShared_constIsSet(boolean __value) {
    if (!__value) {
      this.shared_const = null;
    }
  }

  public MyField getReq_shared_const() {
    return this.req_shared_const;
  }

  public StructWithSharedConst setReq_shared_const(MyField req_shared_const) {
    this.req_shared_const = req_shared_const;
    return this;
  }

  public void unsetReq_shared_const() {
    this.req_shared_const = null;
  }

  // Returns true if field req_shared_const is set (has been assigned a value) and false otherwise
  public boolean isSetReq_shared_const() {
    return this.req_shared_const != null;
  }

  public void setReq_shared_constIsSet(boolean __value) {
    if (!__value) {
      this.req_shared_const = null;
    }
  }

  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case OPT_SHARED_CONST:
      if (__value == null) {
        unsetOpt_shared_const();
      } else {
        setOpt_shared_const((MyField)__value);
      }
      break;

    case SHARED_CONST:
      if (__value == null) {
        unsetShared_const();
      } else {
        setShared_const((MyField)__value);
      }
      break;

    case REQ_SHARED_CONST:
      if (__value == null) {
        unsetReq_shared_const();
      } else {
        setReq_shared_const((MyField)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case OPT_SHARED_CONST:
      return getOpt_shared_const();

    case SHARED_CONST:
      return getShared_const();

    case REQ_SHARED_CONST:
      return getReq_shared_const();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StructWithSharedConst)
      return this.equals((StructWithSharedConst)that);
    return false;
  }

  public boolean equals(StructWithSharedConst that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_opt_shared_const = true && this.isSetOpt_shared_const();
    boolean that_present_opt_shared_const = true && that.isSetOpt_shared_const();
    if (this_present_opt_shared_const || that_present_opt_shared_const) {
      if (!(this_present_opt_shared_const && that_present_opt_shared_const))
        return false;
      if (!TBaseHelper.equalsNobinary(this.opt_shared_const, that.opt_shared_const))
        return false;
    }

    boolean this_present_shared_const = true && this.isSetShared_const();
    boolean that_present_shared_const = true && that.isSetShared_const();
    if (this_present_shared_const || that_present_shared_const) {
      if (!(this_present_shared_const && that_present_shared_const))
        return false;
      if (!TBaseHelper.equalsNobinary(this.shared_const, that.shared_const))
        return false;
    }

    boolean this_present_req_shared_const = true && this.isSetReq_shared_const();
    boolean that_present_req_shared_const = true && that.isSetReq_shared_const();
    if (this_present_req_shared_const || that_present_req_shared_const) {
      if (!(this_present_req_shared_const && that_present_req_shared_const))
        return false;
      if (!TBaseHelper.equalsNobinary(this.req_shared_const, that.req_shared_const))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {opt_shared_const, shared_const, req_shared_const});
  }

  @Override
  public int compareTo(StructWithSharedConst other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOpt_shared_const()).compareTo(other.isSetOpt_shared_const());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(opt_shared_const, other.opt_shared_const);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetShared_const()).compareTo(other.isSetShared_const());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(shared_const, other.shared_const);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetReq_shared_const()).compareTo(other.isSetReq_shared_const());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(req_shared_const, other.req_shared_const);
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
        case OPT_SHARED_CONST:
          if (__field.type == TType.STRUCT) {
            this.opt_shared_const = new MyField();
            this.opt_shared_const.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case SHARED_CONST:
          if (__field.type == TType.STRUCT) {
            this.shared_const = new MyField();
            this.shared_const.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case REQ_SHARED_CONST:
          if (__field.type == TType.STRUCT) {
            this.req_shared_const = new MyField();
            this.req_shared_const.read(iprot);
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
    if (this.opt_shared_const != null) {
      if (isSetOpt_shared_const()) {
        oprot.writeFieldBegin(OPT_SHARED_CONST_FIELD_DESC);
        this.opt_shared_const.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    if (this.shared_const != null) {
      oprot.writeFieldBegin(SHARED_CONST_FIELD_DESC);
      this.shared_const.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.req_shared_const != null) {
      oprot.writeFieldBegin(REQ_SHARED_CONST_FIELD_DESC);
      this.req_shared_const.write(oprot);
      oprot.writeFieldEnd();
    }
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
    StringBuilder sb = new StringBuilder("StructWithSharedConst");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    if (isSetOpt_shared_const())
    {
      sb.append(indentStr);
      sb.append("opt_shared_const");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getOpt_shared_const() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getOpt_shared_const(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("shared_const");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getShared_const() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getShared_const(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("req_shared_const");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getReq_shared_const() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getReq_shared_const(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (req_shared_const == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'req_shared_const' was not present! Struct: " + toString());
    }
  }

}

