/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.ms.word;

import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

public class HeadingStyles extends Dispatch {

  public static final String componentName = "Word.HeadingStyles";

  public HeadingStyles() {
    super(componentName);
  }

  /**
   * This constructor is used instead of a case operation to
   * turn a Dispatch object into a wider object - it must exist
   * in every wrapper class whose instances may be returned from
   * method calls wrapped in VT_DISPATCH Variants.
   */
  public HeadingStyles(Dispatch d) {
    // take over the IDispatch pointer
    m_pDispatch = d.m_pDispatch;
    // null out the input's pointer
    d.m_pDispatch = 0;
  }

  public HeadingStyles(String compName) {
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
   * @return the result is of type Variant
   */
  public Variant get_NewEnum() {
    return Dispatch.get(this, "_NewEnum");
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getCount() {
    return Dispatch.get(this, "Count").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param index an input-parameter of type int
   * @return the result is of type HeadingStyle
   */
  public HeadingStyle item(int index) {
    return new HeadingStyle(Dispatch.call(this, "Item", new Variant(index)).toDispatch());
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param style an input-parameter of type Variant
   * @param level an input-parameter of type short
   * @return the result is of type HeadingStyle
   */
  public HeadingStyle add(Variant style, short level) {
    return new HeadingStyle(Dispatch.call(this, "Add", style, new Variant(level)).toDispatch());
  }

}
