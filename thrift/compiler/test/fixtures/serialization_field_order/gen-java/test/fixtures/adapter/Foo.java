/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.adapter;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import com.google.common.collect.*;
import java.util.*;
import javax.annotation.Nullable;
import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.server.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;
import org.apache.thrift.meta_data.FieldValueMetaData;
import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.MoreObjects.ToStringHelper;

@SwiftGenerated
@com.facebook.swift.codec.ThriftStruct(value="Foo", builder=Foo.Builder.class)
public final class Foo implements com.facebook.thrift.payload.ThriftSerializable {

    @ThriftConstructor
    public Foo(
        @com.facebook.swift.codec.ThriftField(value=3, name="field1", requiredness=Requiredness.NONE) final int field1,
        @com.facebook.swift.codec.ThriftField(value=1, name="field2", requiredness=Requiredness.NONE) final int field2,
        @com.facebook.swift.codec.ThriftField(value=2, name="field3", requiredness=Requiredness.NONE) final int field3
    ) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }
    
    @ThriftConstructor
    protected Foo() {
      this.field1 = 0;
      this.field2 = 0;
      this.field3 = 0;
    }
    
    public static class Builder {
    
        private int field1 = 0;
        private int field2 = 0;
        private int field3 = 0;
    
        @com.facebook.swift.codec.ThriftField(value=3, name="field1", requiredness=Requiredness.NONE)
        public Builder setField1(int field1) {
            this.field1 = field1;
            return this;
        }
    
        public int getField1() { return field1; }
    
            @com.facebook.swift.codec.ThriftField(value=1, name="field2", requiredness=Requiredness.NONE)
        public Builder setField2(int field2) {
            this.field2 = field2;
            return this;
        }
    
        public int getField2() { return field2; }
    
            @com.facebook.swift.codec.ThriftField(value=2, name="field3", requiredness=Requiredness.NONE)
        public Builder setField3(int field3) {
            this.field3 = field3;
            return this;
        }
    
        public int getField3() { return field3; }
    
        public Builder() { }
        public Builder(Foo other) {
            this.field1 = other.field1;
            this.field2 = other.field2;
            this.field3 = other.field3;
        }
    
        @ThriftConstructor
        public Foo build() {
            Foo result = new Foo (
                this.field1,
                this.field2,
                this.field3
            );
            return result;
        }
    }
    
    public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("Foo");
    private final int field1;
    public static final int _FIELD1 = 3;
    private static final TField FIELD1_FIELD_DESC = new TField("field1", TType.I32, (short)3);
        private final int field2;
    public static final int _FIELD2 = 1;
    private static final TField FIELD2_FIELD_DESC = new TField("field2", TType.I32, (short)1);
        private final int field3;
    public static final int _FIELD3 = 2;
    private static final TField FIELD3_FIELD_DESC = new TField("field3", TType.I32, (short)2);
    static {
      NAMES_TO_IDS.put("field1", 3);
      FIELD_METADATA.put(3, FIELD1_FIELD_DESC);
      NAMES_TO_IDS.put("field2", 1);
      FIELD_METADATA.put(1, FIELD2_FIELD_DESC);
      NAMES_TO_IDS.put("field3", 2);
      FIELD_METADATA.put(2, FIELD3_FIELD_DESC);
    }
    
    
    @com.facebook.swift.codec.ThriftField(value=3, name="field1", requiredness=Requiredness.NONE)
    public int getField1() { return field1; }
    
    
    
    @com.facebook.swift.codec.ThriftField(value=1, name="field2", requiredness=Requiredness.NONE)
    public int getField2() { return field2; }
    
    
    
    @com.facebook.swift.codec.ThriftField(value=2, name="field3", requiredness=Requiredness.NONE)
    public int getField3() { return field3; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("field1", field1);
        helper.add("field2", field2);
        helper.add("field3", field3);
        return helper.toString();
    }
    
    @java.lang.Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    
        Foo other = (Foo)o;
    
        return
            Objects.equals(field1, other.field1) &&
            Objects.equals(field2, other.field2) &&
            Objects.equals(field3, other.field3) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            field1,
            field2,
            field3
        });
    }
    
    
    public static com.facebook.thrift.payload.Reader<Foo> asReader() {
      return Foo::read0;
    }
    
    public static Foo read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(Foo.NAMES_TO_IDS, Foo.FIELD_METADATA);
      Foo.Builder builder = new Foo.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _FIELD1:
          if (__field.type == TType.I32) {
            int field1 = oprot.readI32();
            builder.setField1(field1);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _FIELD2:
          if (__field.type == TType.I32) {
            int field2 = oprot.readI32();
            builder.setField2(field2);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _FIELD3:
          if (__field.type == TType.I32) {
            int field3 = oprot.readI32();
            builder.setField3(field3);
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
      oprot.writeFieldBegin(FIELD1_FIELD_DESC);
      oprot.writeI32(this.field1);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FIELD2_FIELD_DESC);
      oprot.writeI32(this.field2);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FIELD3_FIELD_DESC);
      oprot.writeI32(this.field3);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _FooLazy {
        private static final Foo _DEFAULT = new Foo.Builder().build();
    }
    
    public static Foo defaultInstance() {
        return  _FooLazy._DEFAULT;
    }
}
