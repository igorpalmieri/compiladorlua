/* The following code was generated by JFlex 1.6.1 */

package analyzer;

import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/Igor-Surface/git/compiladorlua/AnalisadorLexico/src/main/java/analyzer/lua_scanner.flex</tt>
 */
public class AnalisadorLexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\32\1\27\1\31\1\31\1\30\22\0\1\32\1\0\1\26"+
    "\1\24\1\0\1\2\2\0\1\41\1\42\1\2\1\2\1\50\1\13"+
    "\1\3\1\2\12\14\1\51\1\47\1\1\1\4\1\1\2\0\32\25"+
    "\1\43\1\0\1\44\1\2\1\25\1\0\1\6\1\37\1\36\1\10"+
    "\1\21\1\22\1\25\1\34\1\15\1\25\1\40\1\16\1\25\1\7"+
    "\1\11\1\35\1\25\1\12\1\23\1\17\1\20\1\25\1\33\3\25"+
    "\1\45\1\25\1\46\1\5\6\0\1\31\u1fa2\0\1\31\1\31\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\1\5\5\1\6"+
    "\1\7\7\5\1\6\1\1\1\10\2\5\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\2"+
    "\1\7\2\5\1\22\1\2\1\5\1\0\1\10\1\23"+
    "\1\24\11\5\1\0\1\25\2\5\1\26\1\27\2\5"+
    "\1\10\4\5\1\30\2\5\1\31\6\5\1\32\1\5"+
    "\1\33\5\5\1\34\1\35\2\5\1\36\1\37\1\40"+
    "\1\41\1\42\2\5\1\43";

  private static int [] zzUnpackAction() {
    int [] result = new int[98];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\52\0\124\0\52\0\176\0\124\0\124\0\250"+
    "\0\322\0\374\0\u0126\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8"+
    "\0\u0222\0\u024c\0\u0276\0\u02a0\0\u02ca\0\52\0\u02f4\0\52"+
    "\0\u031e\0\u0348\0\52\0\52\0\52\0\52\0\52\0\52"+
    "\0\52\0\52\0\52\0\u0372\0\u039c\0\u03c6\0\u03f0\0\u02ca"+
    "\0\u02ca\0\u041a\0\u039c\0\u0444\0\u02ca\0\u02ca\0\u046e\0\u0498"+
    "\0\u04c2\0\u04ec\0\u0516\0\u0540\0\u056a\0\u0594\0\u05be\0\u02f4"+
    "\0\52\0\u05e8\0\u0612\0\52\0\u02ca\0\u063c\0\u0666\0\u0690"+
    "\0\u06ba\0\u06e4\0\u070e\0\u0738\0\u02ca\0\u0762\0\u078c\0\u02ca"+
    "\0\u07b6\0\u07e0\0\u080a\0\u0834\0\u085e\0\u0888\0\u02ca\0\u08b2"+
    "\0\u08dc\0\u0906\0\u0930\0\u095a\0\u0984\0\u09ae\0\u02ca\0\u02ca"+
    "\0\u09d8\0\u0a02\0\u02ca\0\u02ca\0\u02ca\0\u02ca\0\u02ca\0\u0a2c"+
    "\0\u0a56\0\u02ca";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[98];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\25\1\27\2\30"+
    "\1\2\1\30\1\31\3\25\1\32\1\25\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\56\0"+
    "\1\4\50\0\1\44\10\0\1\45\43\0\1\25\1\46"+
    "\3\25\1\0\10\25\1\0\1\25\5\0\6\25\17\0"+
    "\5\25\1\0\1\25\1\47\6\25\1\0\1\25\5\0"+
    "\6\25\17\0\3\25\1\50\1\25\1\0\10\25\1\0"+
    "\1\25\5\0\6\25\17\0\4\25\1\51\1\0\10\25"+
    "\1\0\1\25\5\0\6\25\17\0\5\25\1\0\5\25"+
    "\1\52\2\25\1\0\1\25\5\0\6\25\14\0\1\53"+
    "\7\0\1\54\1\16\40\0\1\53\10\0\1\16\43\0"+
    "\1\25\1\55\3\25\1\0\6\25\1\56\1\25\1\0"+
    "\1\25\5\0\6\25\17\0\3\25\1\57\1\25\1\0"+
    "\10\25\1\0\1\25\5\0\6\25\17\0\4\25\1\60"+
    "\1\0\10\25\1\0\1\25\5\0\1\25\1\61\4\25"+
    "\17\0\1\25\1\62\3\25\1\0\10\25\1\0\1\25"+
    "\5\0\6\25\17\0\1\25\1\63\3\25\1\0\2\25"+
    "\1\64\5\25\1\0\1\25\5\0\6\25\17\0\1\65"+
    "\2\25\1\66\1\25\1\0\4\25\1\67\3\25\1\0"+
    "\1\25\5\0\6\25\17\0\5\25\1\0\10\25\1\0"+
    "\1\25\5\0\6\25\11\0\26\70\1\71\23\70\6\0"+
    "\5\25\1\0\10\25\1\0\1\25\5\0\1\25\1\72"+
    "\4\25\17\0\4\25\1\73\1\0\10\25\1\0\1\25"+
    "\5\0\6\25\14\0\1\74\62\0\1\45\43\0\2\25"+
    "\1\51\2\25\1\0\10\25\1\0\1\25\5\0\6\25"+
    "\17\0\5\25\1\0\2\25\1\75\5\25\1\0\1\25"+
    "\5\0\6\25\17\0\5\25\1\0\3\25\1\76\4\25"+
    "\1\0\1\25\5\0\2\25\1\77\3\25\11\0\27\100"+
    "\3\0\20\100\6\0\5\25\1\0\10\25\1\0\1\25"+
    "\5\0\3\25\1\101\2\25\17\0\5\25\1\0\4\25"+
    "\1\102\3\25\1\0\1\25\5\0\6\25\17\0\5\25"+
    "\1\0\5\25\1\103\2\25\1\0\1\25\5\0\6\25"+
    "\17\0\5\25\1\0\3\25\1\104\4\25\1\0\1\25"+
    "\5\0\6\25\17\0\2\25\1\105\2\25\1\0\10\25"+
    "\1\0\1\25\5\0\6\25\17\0\5\25\1\0\7\25"+
    "\1\106\1\0\1\25\5\0\6\25\17\0\5\25\1\0"+
    "\2\25\1\107\5\25\1\0\1\25\5\0\6\25\17\0"+
    "\4\25\1\110\1\0\10\25\1\0\1\25\5\0\6\25"+
    "\17\0\1\25\1\111\3\25\1\0\10\25\1\0\1\25"+
    "\5\0\6\25\17\0\5\25\1\0\1\25\1\112\6\25"+
    "\1\0\1\25\5\0\6\25\17\0\5\25\1\0\5\25"+
    "\1\113\2\25\1\0\1\25\5\0\6\25\17\0\5\25"+
    "\1\0\4\25\1\114\3\25\1\0\1\25\5\0\6\25"+
    "\17\0\5\25\1\0\5\25\1\115\2\25\1\0\1\25"+
    "\5\0\6\25\11\0\27\100\1\0\22\100\6\0\1\116"+
    "\4\25\1\0\10\25\1\0\1\25\5\0\6\25\17\0"+
    "\5\25\1\0\5\25\1\75\2\25\1\0\1\25\5\0"+
    "\6\25\17\0\1\25\1\117\3\25\1\0\10\25\1\0"+
    "\1\25\5\0\6\25\17\0\5\25\1\0\1\25\1\120"+
    "\6\25\1\0\1\25\5\0\6\25\17\0\5\25\1\0"+
    "\5\25\1\121\2\25\1\0\1\25\5\0\6\25\17\0"+
    "\5\25\1\0\7\25\1\102\1\0\1\25\5\0\6\25"+
    "\17\0\5\25\1\0\10\25\1\0\1\25\5\0\3\25"+
    "\1\122\2\25\17\0\5\25\1\0\2\25\1\123\5\25"+
    "\1\0\1\25\5\0\6\25\17\0\1\124\4\25\1\0"+
    "\10\25\1\0\1\25\5\0\6\25\17\0\4\25\1\125"+
    "\1\0\10\25\1\0\1\25\5\0\6\25\17\0\1\126"+
    "\4\25\1\0\10\25\1\0\1\25\5\0\6\25\17\0"+
    "\5\25\1\0\2\25\1\127\5\25\1\0\1\25\5\0"+
    "\6\25\17\0\5\25\1\0\2\25\1\130\5\25\1\0"+
    "\1\25\5\0\6\25\17\0\5\25\1\0\1\25\1\131"+
    "\6\25\1\0\1\25\5\0\6\25\17\0\5\25\1\0"+
    "\3\25\1\132\4\25\1\0\1\25\5\0\6\25\17\0"+
    "\5\25\1\0\5\25\1\133\2\25\1\0\1\25\5\0"+
    "\6\25\17\0\5\25\1\0\10\25\1\0\1\25\5\0"+
    "\5\25\1\134\17\0\1\25\1\135\3\25\1\0\10\25"+
    "\1\0\1\25\5\0\6\25\17\0\5\25\1\0\3\25"+
    "\1\136\4\25\1\0\1\25\5\0\6\25\17\0\5\25"+
    "\1\0\6\25\1\137\1\25\1\0\1\25\5\0\6\25"+
    "\17\0\5\25\1\0\1\25\1\140\6\25\1\0\1\25"+
    "\5\0\6\25\17\0\3\25\1\141\1\25\1\0\10\25"+
    "\1\0\1\25\5\0\6\25\17\0\1\25\1\142\3\25"+
    "\1\0\10\25\1\0\1\25\5\0\6\25\11\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2688];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\21\1\1\11\1\1\1\11"+
    "\2\1\11\11\7\1\1\0\14\1\1\0\1\11\2\1"+
    "\1\11\46\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[98];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    private LUAToken createToken(int type, String value, int start) {
        LUAToken token = new LUAToken(type, value, start);
        return token;
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalisadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 172) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
              {
                return new Symbol( sym.EOF , createToken(sym.EOF, yytext(), yycolumn));
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { throw new RuntimeException("Caractere inv�lido " + yytext());
            }
          case 36: break;
          case 2: 
            { return new Symbol(sym.BINOP, createToken(sym.BINOP, yytext(), yycolumn));
            }
          case 37: break;
          case 3: 
            { return new Symbol(sym.PONTO, createToken(sym.PONTO, yytext(), yycolumn));
            }
          case 38: break;
          case 4: 
            { return new Symbol(sym.ATRIBUICAO, createToken(sym.ATRIBUICAO, yytext(), yycolumn));
            }
          case 39: break;
          case 5: 
            { return new Symbol(sym.NAME, createToken(sym.NAME, yytext(), yycolumn));
            }
          case 40: break;
          case 6: 
            { return new Symbol(sym.UNOP, createToken(sym.UNOP, yytext(), yycolumn));
            }
          case 41: break;
          case 7: 
            { return new Symbol(sym.NUMBER, createToken(sym.NUMBER, yytext(), yycolumn));
            }
          case 42: break;
          case 8: 
            { 
            }
          case 43: break;
          case 9: 
            { return new Symbol(sym.APAR, createToken(sym.APAR, yytext(), yycolumn));
            }
          case 44: break;
          case 10: 
            { return new Symbol(sym.FPAR, createToken(sym.FPAR, yytext(), yycolumn));
            }
          case 45: break;
          case 11: 
            { return new Symbol(sym.ACOL, createToken(sym.ACOL, yytext(), yycolumn));
            }
          case 46: break;
          case 12: 
            { return new Symbol(sym.FCOL, createToken(sym.FCOL, yytext(), yycolumn));
            }
          case 47: break;
          case 13: 
            { return new Symbol(sym.ACHA, createToken(sym.ACHA, yytext(), yycolumn));
            }
          case 48: break;
          case 14: 
            { return new Symbol(sym.FCHA, createToken(sym.FCHA, yytext(), yycolumn));
            }
          case 49: break;
          case 15: 
            { return new Symbol(sym.PVIRGULA, createToken(sym.PVIRGULA, yytext(), yycolumn));
            }
          case 50: break;
          case 16: 
            { return new Symbol(sym.VIRGULA, createToken(sym.VIRGULA, yytext(), yycolumn));
            }
          case 51: break;
          case 17: 
            { return new Symbol(sym.DPONTOS, createToken(sym.DPONTOS, yytext(), yycolumn));
            }
          case 52: break;
          case 18: 
            { return new Symbol(sym.DO, createToken(sym.DO, yytext(), yycolumn));
            }
          case 53: break;
          case 19: 
            { return new Symbol(sym.IN, createToken(sym.IN, yytext(), yycolumn));
            }
          case 54: break;
          case 20: 
            { return new Symbol(sym.IF, createToken(sym.IF, yytext(), yycolumn));
            }
          case 55: break;
          case 21: 
            { return new Symbol(sym.STRING, createToken(sym.STRING, yytext(), yycolumn));
            }
          case 56: break;
          case 22: 
            { return new Symbol(sym.TPONTOS, createToken(sym.TPONTOS, yytext(), yycolumn));
            }
          case 57: break;
          case 23: 
            { return new Symbol(sym.VALUE, createToken(sym.VALUE, yytext(), yycolumn));
            }
          case 58: break;
          case 24: 
            { return new Symbol(sym.END, createToken(sym.END, yytext(), yycolumn));
            }
          case 59: break;
          case 25: 
            { return new Symbol(sym.FOR, createToken(sym.FOR, yytext(), yycolumn));
            }
          case 60: break;
          case 26: 
            { return new Symbol(sym.THEN, createToken(sym.THEN, yytext(), yycolumn));
            }
          case 61: break;
          case 27: 
            { return new Symbol(sym.ELSE, createToken(sym.ELSE, yytext(), yycolumn));
            }
          case 62: break;
          case 28: 
            { return new Symbol(sym.LOCAL, createToken(sym.LOCAL, yytext(), yycolumn));
            }
          case 63: break;
          case 29: 
            { return new Symbol(sym.UNTIL, createToken(sym.UNTIL, yytext(), yycolumn));
            }
          case 64: break;
          case 30: 
            { return new Symbol(sym.WHILE, createToken(sym.WHILE, yytext(), yycolumn));
            }
          case 65: break;
          case 31: 
            { return new Symbol(sym.BREAK, createToken(sym.BREAK, yytext(), yycolumn));
            }
          case 66: break;
          case 32: 
            { return new Symbol(sym.RETURN, createToken(sym.RETURN, yytext(), yycolumn));
            }
          case 67: break;
          case 33: 
            { return new Symbol(sym.REPEAT, createToken(sym.REPEAT, yytext(), yycolumn));
            }
          case 68: break;
          case 34: 
            { return new Symbol(sym.ELSEIF, createToken(sym.ELSEIF, yytext(), yycolumn));
            }
          case 69: break;
          case 35: 
            { return new Symbol(sym.FUNCTION, createToken(sym.FUNCTION, yytext(), yycolumn));
            }
          case 70: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
