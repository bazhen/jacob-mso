/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.ms.word;

import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

public class Version extends Dispatch {

  public static final String componentName = "Word.Version";

  public Version() {
    super(componentName);
  }

  /**
   * This constructor is used instead of a case operation to
   * turn a Dispatch object into a wider object - it must exist
   * in every wrapper class whose instances may be returned from
   * method calls wrapped in VT_DISPATCH Variants.
   */
  public Version(Dispatch d) {
    // take over the IDispatch pointer
    m_pDispatch = d.m_pDispatch;
    // null out the input's pointer
    d.m_pDispatch = 0;
  }

  public Version(String compName) {
    super(compName);
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type Application
   */
  public AppEvents getApplication() {
    return new AppEvents(Dispatch.get(this, "Application").toDispatch());
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getCreator() {
    return Dispatch.get(this, "Creator").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type Object
   */
  public Object getParent() {
    return Dispatch.get(this, "Parent");
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type String
   */
  public String getSavedBy() {
    return Dispatch.get(this, "SavedBy").toString();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type String
   */
  public String getComment() {
    return Dispatch.get(this, "Comment").toString();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type java.util.Date
   */
  public java.util.Date getDate() {
    return Dispatch.get(this, "Date").getJavaDate();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getIndex() {
    return Dispatch.get(this, "Index").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   */
  public void openOld() {
    Dispatch.call(this, "OpenOld");
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   */
  public void delete() {
    Dispatch.call(this, "Delete");
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type Document
   */
  public Document open() {
    return new Document(Dispatch.call(this, "Open").toDispatch());
  }

}
