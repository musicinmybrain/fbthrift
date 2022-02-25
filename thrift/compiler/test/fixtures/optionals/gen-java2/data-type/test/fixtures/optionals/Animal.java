/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.optionals;

import com.facebook.swift.codec.*;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

@SwiftGenerated
public enum Animal implements com.facebook.thrift.payload.ThriftSerializable {
    DOG(1),
    CAT(2),
    TARANTULA(3);

    private final int value;

    Animal(int value) {
        this.value = value;
    }

    @ThriftEnumValue
    public int getValue() {
        return value;
    }

    public static Animal fromInteger(int n) {
        switch (n) {
        case 1:
            return DOG;
        case 2:
            return CAT;
        case 3:
            return TARANTULA;
        default:
            return null;
        }
    }

    public static com.facebook.thrift.payload.Reader<Animal> asReader() {
        return Animal::read0;
    }

    public static Animal read0(TProtocol iprot) throws TException {
        return Animal.fromInteger(iprot.readI32());
    }

    public void write0(TProtocol oprot) throws TException {
        oprot.writeI32(getValue());
    }


}
