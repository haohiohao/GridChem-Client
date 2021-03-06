/*Copyright (c) 2004,University of Illinois at Urbana-Champaign.  All rights reserved.

Developed by:
Chemistry and Computational Biology Group

NCSA, University of Illinois at Urbana-Champaign

http://ncsa.uiuc.edu/GridChem

Permission is hereby granted, free of charge, to any person 
obtaining a copy of this software and associated documentation
files (the "Software") to deal with the Software without
restriction, including without limitation the rights to use, 
copy, modify, merge, publish, distribute, sublicense, and/or 
sell copies of the Software, and to permit persons to whom 
the Software is furnished to do so, subject to the following 
conditions:
1. Redistributions of source code must retain the above copyright notice, 
   this list of conditions and the following disclaimers.
2. Redistributions in binary form must reproduce the above copyright notice, 
   this list of conditions and the following disclaimers in the documentation
   and/or other materials provided with the distribution.
3. Neither the names of Chemistry and Computational Biology Group , NCSA, 
   University of Illinois at Urbana-Champaign, nor the names of its contributors 
   may be used to endorse or promote products derived from this Software without 
   specific prior written permission.
    
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF 
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  
IN NO EVENT SHALL THE CONTRIBUTORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, 
DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, 
ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER 
DEALINGS WITH THE SOFTWARE.

*/

//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Wed Jan 26 23:09:54 CST 2005
//----------------------------------------------------

package org.gridchem.client;
import org.gridchem.client.*;
import org.gridchem.client.common.Settings;

import java_cup.runtime.*;

/** CUP v0.10k generated parser.
  * @version Wed Jan 26 23:09:54 CST 2005
  */
public class MP2to5dParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public MP2to5dParser() {super();}

  /** Constructor which sets the default scanner. */
  public MP2to5dParser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\016\000\002\003\004\000\002\002\004\000\002\003" +
    "\003\000\002\004\004\000\002\004\004\000\002\004\004" +
    "\000\002\004\004\000\002\004\004\000\002\004\004\000" +
    "\002\004\004\000\002\004\004\000\002\004\004\000\002" +
    "\004\004\000\002\004\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\033\000\030\004\017\005\014\006\004\007\016\010" +
    "\020\011\013\012\011\013\012\014\015\015\010\016\006" +
    "\001\002\000\004\025\035\001\002\000\032\002\034\004" +
    "\017\005\014\006\004\007\016\010\020\011\013\012\011" +
    "\013\012\014\015\015\010\016\006\001\002\000\004\025" +
    "\032\001\002\000\032\002\uffff\004\uffff\005\uffff\006\uffff" +
    "\007\uffff\010\uffff\011\uffff\012\uffff\013\uffff\014\uffff\015" +
    "\uffff\016\uffff\001\002\000\004\025\031\001\002\000\004" +
    "\025\030\001\002\000\004\025\027\001\002\000\004\025" +
    "\026\001\002\000\004\025\025\001\002\000\004\025\024" +
    "\001\002\000\004\025\023\001\002\000\004\025\022\001" +
    "\002\000\004\025\021\001\002\000\032\002\ufffa\004\ufffa" +
    "\005\ufffa\006\ufffa\007\ufffa\010\ufffa\011\ufffa\012\ufffa\013" +
    "\ufffa\014\ufffa\015\ufffa\016\ufffa\001\002\000\032\002\ufffe" +
    "\004\ufffe\005\ufffe\006\ufffe\007\ufffe\010\ufffe\011\ufffe\012" +
    "\ufffe\013\ufffe\014\ufffe\015\ufffe\016\ufffe\001\002\000\032" +
    "\002\ufffb\004\ufffb\005\ufffb\006\ufffb\007\ufffb\010\ufffb\011" +
    "\ufffb\012\ufffb\013\ufffb\014\ufffb\015\ufffb\016\ufffb\001\002" +
    "\000\032\002\ufff6\004\ufff6\005\ufff6\006\ufff6\007\ufff6\010" +
    "\ufff6\011\ufff6\012\ufff6\013\ufff6\014\ufff6\015\ufff6\016\ufff6" +
    "\001\002\000\032\002\ufffd\004\ufffd\005\ufffd\006\ufffd\007" +
    "\ufffd\010\ufffd\011\ufffd\012\ufffd\013\ufffd\014\ufffd\015\ufffd" +
    "\016\ufffd\001\002\000\032\002\ufff9\004\ufff9\005\ufff9\006" +
    "\ufff9\007\ufff9\010\ufff9\011\ufff9\012\ufff9\013\ufff9\014\ufff9" +
    "\015\ufff9\016\ufff9\001\002\000\032\002\ufff7\004\ufff7\005" +
    "\ufff7\006\ufff7\007\ufff7\010\ufff7\011\ufff7\012\ufff7\013\ufff7" +
    "\014\ufff7\015\ufff7\016\ufff7\001\002\000\032\002\ufff8\004" +
    "\ufff8\005\ufff8\006\ufff8\007\ufff8\010\ufff8\011\ufff8\012\ufff8" +
    "\013\ufff8\014\ufff8\015\ufff8\016\ufff8\001\002\000\032\002" +
    "\ufff5\004\ufff5\005\ufff5\006\ufff5\007\ufff5\010\ufff5\011\ufff5" +
    "\012\ufff5\013\ufff5\014\ufff5\015\ufff5\016\ufff5\001\002\000" +
    "\032\002\ufff4\004\ufff4\005\ufff4\006\ufff4\007\ufff4\010\ufff4" +
    "\011\ufff4\012\ufff4\013\ufff4\014\ufff4\015\ufff4\016\ufff4\001" +
    "\002\000\032\002\001\004\001\005\001\006\001\007\001" +
    "\010\001\011\001\012\001\013\001\014\001\015\001\016" +
    "\001\001\002\000\004\002\000\001\002\000\032\002\ufffc" +
    "\004\ufffc\005\ufffc\006\ufffc\007\ufffc\010\ufffc\011\ufffc\012" +
    "\ufffc\013\ufffc\014\ufffc\015\ufffc\016\ufffc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\033\000\006\003\004\004\006\001\001\000\002\001" +
    "\001\000\004\004\032\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$MP2to5dParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$MP2to5dParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$MP2to5dParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
 if(Settings.DEBUG) System.out.println("CUP:mp2to5d:  entry"); 
    }

 ///public static boolean DEBUG = false; 
}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$MP2to5dParser$actions {
  private final MP2to5dParser parser;

  /** Constructor */
  CUP$MP2to5dParser$actions(MP2to5dParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$MP2to5dParser$do_action(
    int                        CUP$MP2to5dParser$act_num,
    java_cup.runtime.lr_parser CUP$MP2to5dParser$parser,
    java.util.Stack            CUP$MP2to5dParser$stack,
    int                        CUP$MP2to5dParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$MP2to5dParser$result;

      /* select the action based on the action number */
      switch (CUP$MP2to5dParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // element ::= UMP4_SDTQ FLOAT 
            {
              Object RESULT = null;
		int fleft = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).value;
		 if(Settings.DEBUG) System.out.println("CUP:mp2to5d:  MP4 correction UMP4(SDTQ)"+f);
           ParseMP2to5.put("MP4 correction UMP4(SDTQ)", f); 
              CUP$MP2to5dParser$result = new java_cup.runtime.Symbol(2/*element*/, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right, RESULT);
            }
          return CUP$MP2to5dParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // element ::= UMP4_SDQ FLOAT 
            {
              Object RESULT = null;
		int fleft = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).value;
		 if(Settings.DEBUG) System.out.println("CUP:mp2to5d:  MP4 correction UMP4(SDQ)"+f);
           ParseMP2to5.put("MP4 correction UMP4(SDQ)", f); 
              CUP$MP2to5dParser$result = new java_cup.runtime.Symbol(2/*element*/, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right, RESULT);
            }
          return CUP$MP2to5dParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // element ::= UMP4_DQ FLOAT 
            {
              Object RESULT = null;
		int fleft = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).value;
		 if(Settings.DEBUG) System.out.println("CUP:mp2to5d:  MP4 correction UMP4(DQ)"+f);
	   ParseMP2to5.put("MP4 correction UMP4(DQ)", f); 
              CUP$MP2to5dParser$result = new java_cup.runtime.Symbol(2/*element*/, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right, RESULT);
            }
          return CUP$MP2to5dParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // element ::= EUMP3 FLOAT 
            {
              Object RESULT = null;
		int fleft = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).value;
		 if(Settings.DEBUG) System.out.println("CUP:mp2to5d:  MP3 correction EUMP3"+f);
	   ParseMP2to5.put("MP3 correction EUMP3", f); 
              CUP$MP2to5dParser$result = new java_cup.runtime.Symbol(2/*element*/, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right, RESULT);
            }
          return CUP$MP2to5dParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // element ::= E4_SDTQ FLOAT 
            {
              Object RESULT = null;
		int fleft = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).value;
		 if(Settings.DEBUG) System.out.println("CUP:mp2to5d:  E4(SDTQ)"+f);
	   ParseMP2to5.put("E4(SDTQ)", f); 
              CUP$MP2to5dParser$result = new java_cup.runtime.Symbol(2/*element*/, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right, RESULT);
            }
          return CUP$MP2to5dParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // element ::= E4_SDQ FLOAT 
            {
              Object RESULT = null;
		int fleft = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).value;
		 if(Settings.DEBUG) System.out.println("CUP:mp2to5d:  E4(SDQ)"+f);
	   ParseMP2to5.put("E4(SDQ)", f); 
              CUP$MP2to5dParser$result = new java_cup.runtime.Symbol(2/*element*/, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right, RESULT);
            }
          return CUP$MP2to5dParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // element ::= E4_DQ FLOAT 
            {
              Object RESULT = null;
		int fleft = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).value;
		 if(Settings.DEBUG) System.out.println("CUP:mp2to5d:  E4(DQ)"+f);
	   ParseMP2to5.put("E4(DQ)", f); 
              CUP$MP2to5dParser$result = new java_cup.runtime.Symbol(2/*element*/, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right, RESULT);
            }
          return CUP$MP2to5dParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // element ::= E3 FLOAT 
            {
              Object RESULT = null;
		int fleft = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).value;
		 if(Settings.DEBUG) System.out.println("CUP:mp2to5d:  E3"+f);
	   ParseMP2to5.put("E3", f); 
              CUP$MP2to5dParser$result = new java_cup.runtime.Symbol(2/*element*/, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right, RESULT);
            }
          return CUP$MP2to5dParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // element ::= MP4_T FLOAT 
            {
              Object RESULT = null;
		int fleft = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).value;
		 if(Settings.DEBUG) System.out.println("CUP:mp2to5d:  MP4(T)"+f);
	   ParseMP2to5.put("MP4(T)", f); 
              CUP$MP2to5dParser$result = new java_cup.runtime.Symbol(2/*element*/, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right, RESULT);
            }
          return CUP$MP2to5dParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // element ::= EUMP2 FLOAT 
            {
              Object RESULT = null;
		int fleft = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).value;
		 if(Settings.DEBUG) System.out.println("CUP:mp2to5d:  MP2 energy EUMP2"+f);
           ParseMP2to5.put("MP2 energy EUMP2", f); 
              CUP$MP2to5dParser$result = new java_cup.runtime.Symbol(2/*element*/, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right, RESULT);
            }
          return CUP$MP2to5dParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // element ::= E2 FLOAT 
            {
              Object RESULT = null;
		int fleft = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).value;
		 if(Settings.DEBUG) System.out.println("CUP:mp2to5d:  E2"+f);
           ParseMP2to5.put("E2", f); 
              CUP$MP2to5dParser$result = new java_cup.runtime.Symbol(2/*element*/, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right, RESULT);
            }
          return CUP$MP2to5dParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // startpt ::= element 
            {
              Object RESULT = null;

              CUP$MP2to5dParser$result = new java_cup.runtime.Symbol(1/*startpt*/, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right, RESULT);
            }
          return CUP$MP2to5dParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= startpt EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-1)).value;
		RESULT = start_val;
              CUP$MP2to5dParser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$MP2to5dParser$parser.done_parsing();
          return CUP$MP2to5dParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // startpt ::= startpt element 
            {
              Object RESULT = null;

              CUP$MP2to5dParser$result = new java_cup.runtime.Symbol(1/*startpt*/, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MP2to5dParser$stack.elementAt(CUP$MP2to5dParser$top-0)).right, RESULT);
            }
          return CUP$MP2to5dParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

