//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.13 at 12:00:05 PM BRT 
//


package com.ibm.rqm.xml.bind.testsuitelog;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ibm.rqm.xml.bind.testsuitelog package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Testcasesfailed_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "testcasesfailed");
    private final static QName _Testcasespermfailed_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "testcasespermfailed");
    private final static QName _Testcasespassed_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "testcasespassed");
    private final static QName _Testcasespaused_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "testcasespaused");
    private final static QName _Testcasesnotstarted_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "testcasesnotstarted");
    private final static QName _Endtime_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "endtime");
    private final static QName _Weight_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "weight");
    private final static QName _Testcasesblocked_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "testcasesblocked");
    private final static QName _Testcasesinprogress_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "testcasesinprogress");
    private final static QName _IsCurrent_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "isCurrent");
    private final static QName _Pointsfailed_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "pointsfailed");
    private final static QName _Testcasesdeferred_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "testcasesdeferred");
    private final static QName _Starttime_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "starttime");
    private final static QName _Pointsinconclusive_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "pointsinconclusive");
    private final static QName _Testcasestotal_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "testcasestotal");
    private final static QName _Testcasesinconclusive_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "testcasesinconclusive");
    private final static QName _Testcasespartiallyblocked_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "testcasespartiallyblocked");
    private final static QName _Pointsblocked_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "pointsblocked");
    private final static QName _Testcaseserror_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "testcaseserror");
    private final static QName _Pointspassed_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "pointspassed");
    private final static QName _Pointsattempted_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "pointsattempted");
    private final static QName _Testcasesincomplete_QNAME = new QName("http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", "testcasesincomplete");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ibm.rqm.xml.bind.testsuitelog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Testplanstateatexecution }
     * 
     */
    public Testplanstateatexecution createTestplanstateatexecution() {
        return new Testplanstateatexecution();
    }

    /**
     * Create an instance of {@link Suiteelements }
     * 
     */
    public Suiteelements createSuiteelements() {
        return new Suiteelements();
    }

    /**
     * Create an instance of {@link Testsuitestateatexecution }
     * 
     */
    public Testsuitestateatexecution createTestsuitestateatexecution() {
        return new Testsuitestateatexecution();
    }

    /**
     * Create an instance of {@link Suiteelements.Suiteelement.Remotescript }
     * 
     */
    public Suiteelements.Suiteelement.Remotescript createSuiteelementsSuiteelementRemotescript() {
        return new Suiteelements.Suiteelement.Remotescript();
    }

    /**
     * Create an instance of {@link Suiteelements.Suiteelement }
     * 
     */
    public Suiteelements.Suiteelement createSuiteelementsSuiteelement() {
        return new Suiteelements.Suiteelement();
    }

    /**
     * Create an instance of {@link Suiteelements.Suiteelement.Executionworkitem }
     * 
     */
    public Suiteelements.Suiteelement.Executionworkitem createSuiteelementsSuiteelementExecutionworkitem() {
        return new Suiteelements.Suiteelement.Executionworkitem();
    }

    /**
     * Create an instance of {@link Suiteelements.Suiteelement.Testscript }
     * 
     */
    public Suiteelements.Suiteelement.Testscript createSuiteelementsSuiteelementTestscript() {
        return new Suiteelements.Suiteelement.Testscript();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "testcasesfailed")
    public JAXBElement<Integer> createTestcasesfailed(Integer value) {
        return new JAXBElement<Integer>(_Testcasesfailed_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "testcasespermfailed")
    public JAXBElement<Integer> createTestcasespermfailed(Integer value) {
        return new JAXBElement<Integer>(_Testcasespermfailed_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "testcasespassed")
    public JAXBElement<Integer> createTestcasespassed(Integer value) {
        return new JAXBElement<Integer>(_Testcasespassed_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "testcasespaused")
    public JAXBElement<Integer> createTestcasespaused(Integer value) {
        return new JAXBElement<Integer>(_Testcasespaused_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "testcasesnotstarted")
    public JAXBElement<Integer> createTestcasesnotstarted(Integer value) {
        return new JAXBElement<Integer>(_Testcasesnotstarted_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "endtime")
    public JAXBElement<XMLGregorianCalendar> createEndtime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Endtime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "weight")
    public JAXBElement<Integer> createWeight(Integer value) {
        return new JAXBElement<Integer>(_Weight_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "testcasesblocked")
    public JAXBElement<Integer> createTestcasesblocked(Integer value) {
        return new JAXBElement<Integer>(_Testcasesblocked_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "testcasesinprogress")
    public JAXBElement<Integer> createTestcasesinprogress(Integer value) {
        return new JAXBElement<Integer>(_Testcasesinprogress_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "isCurrent")
    public JAXBElement<Boolean> createIsCurrent(Boolean value) {
        return new JAXBElement<Boolean>(_IsCurrent_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "pointsfailed")
    public JAXBElement<Integer> createPointsfailed(Integer value) {
        return new JAXBElement<Integer>(_Pointsfailed_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "testcasesdeferred")
    public JAXBElement<Integer> createTestcasesdeferred(Integer value) {
        return new JAXBElement<Integer>(_Testcasesdeferred_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "starttime")
    public JAXBElement<XMLGregorianCalendar> createStarttime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Starttime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "pointsinconclusive")
    public JAXBElement<Integer> createPointsinconclusive(Integer value) {
        return new JAXBElement<Integer>(_Pointsinconclusive_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "testcasestotal")
    public JAXBElement<Integer> createTestcasestotal(Integer value) {
        return new JAXBElement<Integer>(_Testcasestotal_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "testcasesinconclusive")
    public JAXBElement<Integer> createTestcasesinconclusive(Integer value) {
        return new JAXBElement<Integer>(_Testcasesinconclusive_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "testcasespartiallyblocked")
    public JAXBElement<Integer> createTestcasespartiallyblocked(Integer value) {
        return new JAXBElement<Integer>(_Testcasespartiallyblocked_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "pointsblocked")
    public JAXBElement<Integer> createPointsblocked(Integer value) {
        return new JAXBElement<Integer>(_Pointsblocked_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "testcaseserror")
    public JAXBElement<Integer> createTestcaseserror(Integer value) {
        return new JAXBElement<Integer>(_Testcaseserror_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "pointspassed")
    public JAXBElement<Integer> createPointspassed(Integer value) {
        return new JAXBElement<Integer>(_Pointspassed_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "pointsattempted")
    public JAXBElement<Integer> createPointsattempted(Integer value) {
        return new JAXBElement<Integer>(_Pointsattempted_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/tsl/v0.1/", name = "testcasesincomplete")
    public JAXBElement<Integer> createTestcasesincomplete(Integer value) {
        return new JAXBElement<Integer>(_Testcasesincomplete_QNAME, Integer.class, null, value);
    }

}