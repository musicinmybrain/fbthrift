/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.constants;

import com.facebook.swift.codec.*;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

@SwiftGenerated
public enum EmptyEnum implements com.facebook.thrift.payload.ThriftSerializable {
    ;

    private final int value;

    EmptyEnum(int value) {
        this.value = value;
    }

    @ThriftEnumValue
    public int getValue() {
        return value;
    }

    public static EmptyEnum fromInteger(int n) {
        switch (n) {
        default:
            return null;
        }
    }

    public static com.facebook.thrift.payload.Reader<EmptyEnum> asReader() {
        return EmptyEnum::read0;
    }

    public static EmptyEnum read0(TProtocol iprot) throws TException {
        return EmptyEnum.fromInteger(iprot.readI32());
    }

    public void write0(TProtocol oprot) throws TException {
        oprot.writeI32(getValue());
    }


}
