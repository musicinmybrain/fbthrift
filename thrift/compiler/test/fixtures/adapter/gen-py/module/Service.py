#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

from __future__ import absolute_import
import sys
from thrift.util.Recursive import fix_spec
from thrift.Thrift import TType, TMessageType, TPriority, TRequestContext, TProcessorEventHandler, TServerInterface, TProcessor, TException, TApplicationException, UnimplementedTypedef
from thrift.protocol.TProtocol import TProtocolException

from json import loads
import sys
if sys.version_info[0] >= 3:
  long = int

from .ttypes import UTF8STRINGS, Foo, Baz, Bar, StructWithFieldAdapter, B, A, SetWithAdapter, StringWithAdapter, ListWithElemAdapter, ListWithElemAdapter_withAdapter, MyI64, DoubleTypedefI64, MyI32, FooWithAdapter, StructWithAdapter, UnionWithAdapter, AdaptedA
import thrift.annotation.cpp.ttypes
import thrift.annotation.python.ttypes
import thrift.annotation.thrift.ttypes
import thrift.annotation.hack.ttypes

import my

from thrift.Thrift import TProcessor
import pprint
import warnings
from thrift import Thrift
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol
from thrift.protocol import TCompactProtocol
from thrift.protocol import THeaderProtocol
fastproto = None
try:
  from thrift.protocol import fastproto
except ImportError:
  pass

all_structs = []
UTF8STRINGS = bool(0) or sys.version_info.major >= 3

from thrift.util.Decorators import (
  future_process_main,
  future_process_method,
  process_main as thrift_process_main,
  process_method as thrift_process_method,
  should_run_on_thread,
  write_results_after_future,
)

class Iface:
  def func(self, arg1=None, arg2=None, arg3=None):
    """
    Parameters:
     - arg1
     - arg2
     - arg3
    """
    pass


class ContextIface:
  def func(self, handler_ctx, arg1=None, arg2=None, arg3=None):
    """
    Parameters:
     - arg1
     - arg2
     - arg3
    """
    pass


# HELPER FUNCTIONS AND STRUCTURES

class func_args:
  """
  Attributes:
   - arg1
   - arg2
   - arg3
  """

  thrift_spec = None
  thrift_field_annotations = None
  thrift_struct_annotations = None
  __init__ = None
  @staticmethod
  def isUnion():
    return False

  def read(self, iprot):
    if (isinstance(iprot, TBinaryProtocol.TBinaryProtocolAccelerated) or (isinstance(iprot, THeaderProtocol.THeaderProtocolAccelerate) and iprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_BINARY_PROTOCOL)) and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastproto is not None:
      fastproto.decode(self, iprot.trans, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=0)
      return
    if (isinstance(iprot, TCompactProtocol.TCompactProtocolAccelerated) or (isinstance(iprot, THeaderProtocol.THeaderProtocolAccelerate) and iprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_COMPACT_PROTOCOL)) and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastproto is not None:
      fastproto.decode(self, iprot.trans, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=2)
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      if fid == 1:
        if ftype == TType.STRING:
          self.arg1 = iprot.readString().decode('utf-8') if UTF8STRINGS else iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.STRING:
          self.arg2 = iprot.readString().decode('utf-8') if UTF8STRINGS else iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 3:
        if ftype == TType.STRUCT:
          self.arg3 = Foo()
          self.arg3.read(iprot)
        else:
          iprot.skip(ftype)
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if (isinstance(oprot, TBinaryProtocol.TBinaryProtocolAccelerated) or (isinstance(oprot, THeaderProtocol.THeaderProtocolAccelerate) and oprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_BINARY_PROTOCOL)) and self.thrift_spec is not None and fastproto is not None:
      oprot.trans.write(fastproto.encode(self, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=0))
      return
    if (isinstance(oprot, TCompactProtocol.TCompactProtocolAccelerated) or (isinstance(oprot, THeaderProtocol.THeaderProtocolAccelerate) and oprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_COMPACT_PROTOCOL)) and self.thrift_spec is not None and fastproto is not None:
      oprot.trans.write(fastproto.encode(self, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=2))
      return
    oprot.writeStructBegin('func_args')
    if self.arg1 != None:
      oprot.writeFieldBegin('arg1', TType.STRING, 1)
      oprot.writeString(self.arg1.encode('utf-8')) if UTF8STRINGS and not isinstance(self.arg1, bytes) else oprot.writeString(self.arg1)
      oprot.writeFieldEnd()
    if self.arg2 != None:
      oprot.writeFieldBegin('arg2', TType.STRING, 2)
      oprot.writeString(self.arg2.encode('utf-8')) if UTF8STRINGS and not isinstance(self.arg2, bytes) else oprot.writeString(self.arg2)
      oprot.writeFieldEnd()
    if self.arg3 != None:
      oprot.writeFieldBegin('arg3', TType.STRUCT, 3)
      self.arg3.write(oprot)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def readFromJson(self, json, is_text=True, **kwargs):
    relax_enum_validation = bool(kwargs.pop('relax_enum_validation', False))
    set_cls = kwargs.pop('custom_set_cls', set)
    dict_cls = kwargs.pop('custom_dict_cls', dict)
    if kwargs:
        extra_kwargs = ', '.join(kwargs.keys())
        raise ValueError(
            'Unexpected keyword arguments: ' + extra_kwargs
        )
    json_obj = json
    if is_text:
      json_obj = loads(json)
    if 'arg1' in json_obj and json_obj['arg1'] is not None:
      self.arg1 = json_obj['arg1']
    if 'arg2' in json_obj and json_obj['arg2'] is not None:
      self.arg2 = json_obj['arg2']
    if 'arg3' in json_obj and json_obj['arg3'] is not None:
      self.arg3 = Foo()
      self.arg3.readFromJson(json_obj['arg3'], is_text=False, relax_enum_validation=relax_enum_validation, custom_set_cls=set_cls, custom_dict_cls=dict_cls)

  def __repr__(self):
    L = []
    padding = ' ' * 4
    if self.arg1 is not None:
      value = pprint.pformat(self.arg1, indent=0)
      value = padding.join(value.splitlines(True))
      L.append('    arg1=%s' % (value))
    if self.arg2 is not None:
      value = pprint.pformat(self.arg2, indent=0)
      value = padding.join(value.splitlines(True))
      L.append('    arg2=%s' % (value))
    if self.arg3 is not None:
      value = pprint.pformat(self.arg3, indent=0)
      value = padding.join(value.splitlines(True))
      L.append('    arg3=%s' % (value))
    return "%s(%s)" % (self.__class__.__name__, "\n" + ",\n".join(L) if L else '')

  def __eq__(self, other):
    if not isinstance(other, self.__class__):
      return False

    return self.__dict__ == other.__dict__ 

  def __ne__(self, other):
    return not (self == other)

  def __dir__(self):
    return (
      'arg1',
      'arg2',
      'arg3',
    )

  # Override the __hash__ function for Python3 - t10434117
  __hash__ = object.__hash__

all_structs.append(func_args)
func_args.thrift_spec = (
  None, # 0
  (1, TType.STRING, 'arg1', True, None, 2, ), # 1
  (2, TType.STRING, 'arg2', True, None, 2, ), # 2
  (3, TType.STRUCT, 'arg3', [Foo, Foo.thrift_spec, False], None, 2, ), # 3
)

func_args.thrift_struct_annotations = {
}
func_args.thrift_field_annotations = {
}

def func_args__init__(self, arg1=None, arg2=None, arg3=None,):
  self.arg1 = arg1
  self.arg2 = arg2
  self.arg3 = arg3

func_args.__init__ = func_args__init__

def func_args__setstate__(self, state):
  state.setdefault('arg1', None)
  state.setdefault('arg2', None)
  state.setdefault('arg3', None)
  self.__dict__ = state

func_args.__getstate__ = lambda self: self.__dict__.copy()
func_args.__setstate__ = func_args__setstate__

class func_result:
  """
  Attributes:
   - success
  """

  thrift_spec = None
  thrift_field_annotations = None
  thrift_struct_annotations = None
  __init__ = None
  @staticmethod
  def isUnion():
    return False

  def read(self, iprot):
    if (isinstance(iprot, TBinaryProtocol.TBinaryProtocolAccelerated) or (isinstance(iprot, THeaderProtocol.THeaderProtocolAccelerate) and iprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_BINARY_PROTOCOL)) and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastproto is not None:
      fastproto.decode(self, iprot.trans, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=0)
      return
    if (isinstance(iprot, TCompactProtocol.TCompactProtocolAccelerated) or (isinstance(iprot, THeaderProtocol.THeaderProtocolAccelerate) and iprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_COMPACT_PROTOCOL)) and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastproto is not None:
      fastproto.decode(self, iprot.trans, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=2)
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      if fid == 0:
        if ftype == TType.I32:
          self.success = iprot.readI32()
        else:
          iprot.skip(ftype)
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if (isinstance(oprot, TBinaryProtocol.TBinaryProtocolAccelerated) or (isinstance(oprot, THeaderProtocol.THeaderProtocolAccelerate) and oprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_BINARY_PROTOCOL)) and self.thrift_spec is not None and fastproto is not None:
      oprot.trans.write(fastproto.encode(self, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=0))
      return
    if (isinstance(oprot, TCompactProtocol.TCompactProtocolAccelerated) or (isinstance(oprot, THeaderProtocol.THeaderProtocolAccelerate) and oprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_COMPACT_PROTOCOL)) and self.thrift_spec is not None and fastproto is not None:
      oprot.trans.write(fastproto.encode(self, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=2))
      return
    oprot.writeStructBegin('func_result')
    if self.success != None:
      oprot.writeFieldBegin('success', TType.I32, 0)
      oprot.writeI32(self.success)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def readFromJson(self, json, is_text=True, **kwargs):
    relax_enum_validation = bool(kwargs.pop('relax_enum_validation', False))
    set_cls = kwargs.pop('custom_set_cls', set)
    dict_cls = kwargs.pop('custom_dict_cls', dict)
    if kwargs:
        extra_kwargs = ', '.join(kwargs.keys())
        raise ValueError(
            'Unexpected keyword arguments: ' + extra_kwargs
        )
    json_obj = json
    if is_text:
      json_obj = loads(json)
    if 'success' in json_obj and json_obj['success'] is not None:
      self.success = json_obj['success']
      if self.success > 0x7fffffff or self.success < -0x80000000:
        raise TProtocolException(TProtocolException.INVALID_DATA, 'number exceeds limit in field')

  def __repr__(self):
    L = []
    padding = ' ' * 4
    if self.success is not None:
      value = pprint.pformat(self.success, indent=0)
      value = padding.join(value.splitlines(True))
      L.append('    success=%s' % (value))
    return "%s(%s)" % (self.__class__.__name__, "\n" + ",\n".join(L) if L else '')

  def __eq__(self, other):
    if not isinstance(other, self.__class__):
      return False

    return self.__dict__ == other.__dict__ 

  def __ne__(self, other):
    return not (self == other)

  def __dir__(self):
    return (
      'success',
    )

  # Override the __hash__ function for Python3 - t10434117
  __hash__ = object.__hash__

all_structs.append(func_result)
func_result.thrift_spec = (
  (0, TType.I32, 'success', None, None, 2, ), # 0
)

func_result.thrift_struct_annotations = {
}
func_result.thrift_field_annotations = {
}

def func_result__init__(self, success=None,):
  self.success = success

func_result.__init__ = func_result__init__

def func_result__setstate__(self, state):
  state.setdefault('success', None)
  self.__dict__ = state

func_result.__getstate__ = lambda self: self.__dict__.copy()
func_result.__setstate__ = func_result__setstate__

class Client(Iface):
  _fbthrift_force_cpp_transport = False

  def __enter__(self):
    if self._fbthrift_cpp_transport:
      self._fbthrift_cpp_transport.__enter__()
    return self

  def __exit__(self, type, value, tb):
    if self._fbthrift_cpp_transport:
      self._fbthrift_cpp_transport.__exit__(type, value, tb)
    if self._iprot:
      self._iprot.trans.close()
    if self._oprot and self._iprot is not self._oprot:
      self._oprot.trans.close()

  def __init__(self, iprot=None, oprot=None, cpp_transport=None):
    self._iprot = self._oprot = iprot
    if oprot != None:
      self._oprot = oprot
    self._seqid = 0
    self._fbthrift_cpp_transport = cpp_transport

  def set_persistent_header(self, key, value):
    if self._fbthrift_cpp_transport:
      self._fbthrift_cpp_transport.set_persistent_header(key, value)
    else:
      try:
        self._oprot.trans.set_persistent_header(key, value)
      except AttributeError:
        pass

  def get_persistent_headers(self):
    if self._fbthrift_cpp_transport:
      return self._fbthrift_cpp_transport.get_persistent_headers()
    try:
      return self._oprot.trans.get_write_persistent_headers()
    except AttributeError:
      return {}

  def clear_persistent_headers(self):
    if self._fbthrift_cpp_transport:
      self._fbthrift_cpp_transport.clear_persistent_headers()
    else:
      try:
        self._oprot.trans.clear_persistent_headers()
      except AttributeError:
        pass

  def set_onetime_header(self, key, value):
    if self._fbthrift_cpp_transport:
      self._fbthrift_cpp_transport.set_onetime_header(key, value)
    else:
      try:
        self._oprot.trans.set_header(key, value)
      except AttributeError:
        pass

  def get_last_response_headers(self):
    if self._fbthrift_cpp_transport:
      return self._fbthrift_cpp_transport.get_last_response_headers()
    try:
      return self._iprot.trans.get_headers()
    except AttributeError:
      return {}

  def set_max_frame_size(self, size):
    if self._fbthrift_cpp_transport:
      pass
    else:
      try:
        self._oprot.trans.set_max_frame_size(size)
      except AttributeError:
        pass

  def func(self, arg1=None, arg2=None, arg3=None):
    """
    Parameters:
     - arg1
     - arg2
     - arg3
    """
    if (self._fbthrift_cpp_transport):
      args = func_args()
      args.arg1 = arg1
      args.arg2 = arg2
      args.arg3 = arg3
      result = self._fbthrift_cpp_transport._send_request("Service", "func", args, func_result)
      if result.success is not None:
        return result.success
      raise TApplicationException(TApplicationException.MISSING_RESULT)
    self.send_func(arg1, arg2, arg3)
    return self.recv_func()

  def send_func(self, arg1=None, arg2=None, arg3=None):
    self._oprot.writeMessageBegin('func', TMessageType.CALL, self._seqid)
    args = func_args()
    args.arg1 = arg1
    args.arg2 = arg2
    args.arg3 = arg3
    args.write(self._oprot)
    self._oprot.writeMessageEnd()
    self._oprot.trans.flush()

  def recv_func(self, ):
    (fname, mtype, rseqid) = self._iprot.readMessageBegin()
    if mtype == TMessageType.EXCEPTION:
      x = TApplicationException()
      x.read(self._iprot)
      self._iprot.readMessageEnd()
      raise x
    result = func_result()
    result.read(self._iprot)
    self._iprot.readMessageEnd()
    if result.success != None:
      return result.success
    raise TApplicationException(TApplicationException.MISSING_RESULT, "func failed: unknown result");


class Processor(Iface, TProcessor):
  _onewayMethods = ()

  def __init__(self, handler):
    TProcessor.__init__(self)
    self._handler = handler
    self._processMap = {}
    self._priorityMap = {}
    self._processMap["func"] = Processor.process_func
    self._priorityMap["func"] = TPriority.NORMAL

  def onewayMethods(self):
    l = []
    l.extend(Processor._onewayMethods)
    return tuple(l)

  @thrift_process_main()
  def process(self,): pass

  @thrift_process_method(func_args, oneway=False)
  def process_func(self, args, handler_ctx):
    result = func_result()
    try:
      result.success = self._handler.func(args.arg1, args.arg2, args.arg3)
    except:
      ex = sys.exc_info()[1]
      self._event_handler.handlerError(handler_ctx, 'func', ex)
      result = Thrift.TApplicationException(message=repr(ex))
    return result

Iface._processor_type = Processor

class ContextProcessor(ContextIface, TProcessor):
  _onewayMethods = ()

  def __init__(self, handler):
    TProcessor.__init__(self)
    self._handler = handler
    self._processMap = {}
    self._priorityMap = {}
    self._processMap["func"] = ContextProcessor.process_func
    self._priorityMap["func"] = TPriority.NORMAL

  def onewayMethods(self):
    l = []
    l.extend(ContextProcessor._onewayMethods)
    return tuple(l)

  @thrift_process_main()
  def process(self,): pass

  @thrift_process_method(func_args, oneway=False)
  def process_func(self, args, handler_ctx):
    result = func_result()
    try:
      result.success = self._handler.func(handler_ctx, args.arg1, args.arg2, args.arg3)
    except:
      ex = sys.exc_info()[1]
      self._event_handler.handlerError(handler_ctx, 'func', ex)
      result = Thrift.TApplicationException(message=repr(ex))
    return result

ContextIface._processor_type = ContextProcessor

fix_spec(all_structs)
del all_structs

