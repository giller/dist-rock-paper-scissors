package RockPaperScissors;

/**
* RockPaperScissors/GameHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from RockPaperScissors.idl
* Thursday, April 2, 2015 7:44:39 PM IST
*/

public final class GameHolder implements org.omg.CORBA.portable.Streamable
{
  public RockPaperScissors.Game value = null;

  public GameHolder ()
  {
  }

  public GameHolder (RockPaperScissors.Game initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RockPaperScissors.GameHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RockPaperScissors.GameHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RockPaperScissors.GameHelper.type ();
  }

}
