/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.ms.word;

import com.jacob.com.Dispatch;

public class IApplicationEvents extends Dispatch {

  public static final String componentName = "Word.IApplicationEvents";

  public IApplicationEvents() {
    super(componentName);
  }

  /**
   * This constructor is used instead of a case operation to
   * turn a Dispatch object into a wider object - it must exist
   * in every wrapper class whose instances may be returned from
   * method calls wrapped in VT_DISPATCH Variants.
   */
  public IApplicationEvents(Dispatch d) {
    // take over the IDispatch pointer
    m_pDispatch = d.m_pDispatch;
    // null out the input's pointer
    d.m_pDispatch = 0;
  }

  public IApplicationEvents(String compName) {
    super(compName);
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   */
  public void startup() {
    Dispatch.call(this, "Startup");
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   */
  public void quit() {
    Dispatch.call(this, "Quit");
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   */
  public void documentChange() {
    Dispatch.call(this, "DocumentChange");
  }

}
