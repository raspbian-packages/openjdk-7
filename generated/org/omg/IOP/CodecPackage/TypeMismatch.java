package org.omg.IOP.CodecPackage;


/**
* org/omg/IOP/CodecPackage/TypeMismatch.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Wednesday, February 26, 2020 5:14:34 AM GMT
*/

public final class TypeMismatch extends org.omg.CORBA.UserException
{

  public TypeMismatch ()
  {
    super(TypeMismatchHelper.id());
  } // ctor


  public TypeMismatch (String $reason)
  {
    super(TypeMismatchHelper.id() + "  " + $reason);
  } // ctor

} // class TypeMismatch
