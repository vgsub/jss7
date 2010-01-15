/*
 * The Java Call Control API for CAMEL 2
 *
 * The source code contained in this file is in in the public domain.
 * It can be used in any project or product without prior permission,
 * license or royalty payments. There is  NO WARRANTY OF ANY KIND,
 * EXPRESS, IMPLIED OR STATUTORY, INCLUDING, WITHOUT LIMITATION,
 * THE IMPLIED WARRANTY OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE,
 * AND DATA ACCURACY.  We do not warrant or make any representations
 * regarding the use of the software or the  results thereof, including
 * but not limited to the correctness, accuracy, reliability or
 * usefulness of the software.
 */

package org.mobicents.ss7.sccp.parameter;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

/**
 * 
 * @author Oleg Kulikov
 */
public interface GlobalTitle {

	public void decode(InputStream in) throws IOException;

	public void encode(OutputStream in) throws IOException;

	public int getTranslationType();

	public void setTranslationType(int translationType);

	public int getNumberingPlan();

	public void setNumberingPlan(int numberingPlan);

	public int getEncodingScheme();

	public void setEncodingScheme(int encodingScheme);

	public int getNatureOfAddress();

	public void setNatureOfAddress(int natureOfAddress);

	public String getDigits();

	public void setDigits(String digits);

}
