package openllet.core.datatypes.types.datetime;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.XMLGregorianCalendar;
import openllet.core.datatypes.RestrictedDatatype;
import openllet.core.utils.ATermUtils;
import openllet.core.utils.Namespaces;

/**
 * <p>
 * Title: <code>xsd:date</code>
 * </p>
 * <p>
 * Description: Singleton implementation of <code>xsd:date</code> datatype. This implementation diverges from the XML Schema specification because
 * <ol>
 * <li>the value space is disjoint from the value space of other timeline based datatypes (e.g., xsd:dateTime)</li>
 * <li>values are treated as points, not as intervals</li>
 * </ol>
 * </p>
 * <p>
 * Copyright: Copyright (c) 2009
 * </p>
 * <p>
 * Company: Clark & Parsia, LLC. <http://www.clarkparsia.com>
 * </p>
 *
 * @author Mike Smith
 */
public class XSDDate extends AbstractTimelineDatatype
{

	private static final XSDDate instance;

	static
	{
		instance = new XSDDate();
	}

	public static XSDDate getInstance()
	{
		return instance;
	}

	private final RestrictedTimelineDatatype dataRange;

	private XSDDate()
	{
		super(ATermUtils.makeTermAppl(Namespaces.XSD + "date"), DatatypeConstants.DATE);

		dataRange = new RestrictedTimelineDatatype(this, DatatypeConstants.DATE, false);
	}

	@Override
	public RestrictedDatatype<XMLGregorianCalendar> asDataRange()
	{
		return dataRange;
	}
}
