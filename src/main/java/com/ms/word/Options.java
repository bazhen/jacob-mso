/**
 * JacobGen generated file --- do not edit
 *
 * (http://www.sourceforge.net/projects/jacob-project */
package com.ms.word;

import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

public class Options extends Dispatch {

  public static final String componentName = "Word.Options";

  public Options() {
    super(componentName);
  }

  /**
   * This constructor is used instead of a case operation to
   * turn a Dispatch object into a wider object - it must exist
   * in every wrapper class whose instances may be returned from
   * method calls wrapped in VT_DISPATCH Variants.
   */
  public Options(Dispatch d) {
    // take over the IDispatch pointer
    m_pDispatch = d.m_pDispatch;
    // null out the input's pointer
    d.m_pDispatch = 0;
  }

  public Options(String compName) {
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
   * @return the result is of type boolean
   */
  public boolean getAllowAccentedUppercase() {
    return Dispatch.get(this, "AllowAccentedUppercase").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param allowAccentedUppercase an input-parameter of type boolean
   */
  public void setAllowAccentedUppercase(boolean allowAccentedUppercase) {
    Dispatch.put(this, "AllowAccentedUppercase", new Variant(allowAccentedUppercase));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getWPHelp() {
    return Dispatch.get(this, "WPHelp").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param wPHelp an input-parameter of type boolean
   */
  public void setWPHelp(boolean wPHelp) {
    Dispatch.put(this, "WPHelp", new Variant(wPHelp));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getWPDocNavKeys() {
    return Dispatch.get(this, "WPDocNavKeys").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param wPDocNavKeys an input-parameter of type boolean
   */
  public void setWPDocNavKeys(boolean wPDocNavKeys) {
    Dispatch.put(this, "WPDocNavKeys", new Variant(wPDocNavKeys));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getPagination() {
    return Dispatch.get(this, "Pagination").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param pagination an input-parameter of type boolean
   */
  public void setPagination(boolean pagination) {
    Dispatch.put(this, "Pagination", new Variant(pagination));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getBlueScreen() {
    return Dispatch.get(this, "BlueScreen").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param blueScreen an input-parameter of type boolean
   */
  public void setBlueScreen(boolean blueScreen) {
    Dispatch.put(this, "BlueScreen", new Variant(blueScreen));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getEnableSound() {
    return Dispatch.get(this, "EnableSound").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param enableSound an input-parameter of type boolean
   */
  public void setEnableSound(boolean enableSound) {
    Dispatch.put(this, "EnableSound", new Variant(enableSound));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getConfirmConversions() {
    return Dispatch.get(this, "ConfirmConversions").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param confirmConversions an input-parameter of type boolean
   */
  public void setConfirmConversions(boolean confirmConversions) {
    Dispatch.put(this, "ConfirmConversions", new Variant(confirmConversions));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getUpdateLinksAtOpen() {
    return Dispatch.get(this, "UpdateLinksAtOpen").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param updateLinksAtOpen an input-parameter of type boolean
   */
  public void setUpdateLinksAtOpen(boolean updateLinksAtOpen) {
    Dispatch.put(this, "UpdateLinksAtOpen", new Variant(updateLinksAtOpen));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getSendMailAttach() {
    return Dispatch.get(this, "SendMailAttach").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param sendMailAttach an input-parameter of type boolean
   */
  public void setSendMailAttach(boolean sendMailAttach) {
    Dispatch.put(this, "SendMailAttach", new Variant(sendMailAttach));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getMeasurementUnit() {
    return Dispatch.get(this, "MeasurementUnit").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param measurementUnit an input-parameter of type int
   */
  public void setMeasurementUnit(int measurementUnit) {
    Dispatch.put(this, "MeasurementUnit", new Variant(measurementUnit));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getButtonFieldClicks() {
    return Dispatch.get(this, "ButtonFieldClicks").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param buttonFieldClicks an input-parameter of type int
   */
  public void setButtonFieldClicks(int buttonFieldClicks) {
    Dispatch.put(this, "ButtonFieldClicks", new Variant(buttonFieldClicks));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getShortMenuNames() {
    return Dispatch.get(this, "ShortMenuNames").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param shortMenuNames an input-parameter of type boolean
   */
  public void setShortMenuNames(boolean shortMenuNames) {
    Dispatch.put(this, "ShortMenuNames", new Variant(shortMenuNames));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getRTFInClipboard() {
    return Dispatch.get(this, "RTFInClipboard").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param rTFInClipboard an input-parameter of type boolean
   */
  public void setRTFInClipboard(boolean rTFInClipboard) {
    Dispatch.put(this, "RTFInClipboard", new Variant(rTFInClipboard));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getUpdateFieldsAtPrint() {
    return Dispatch.get(this, "UpdateFieldsAtPrint").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param updateFieldsAtPrint an input-parameter of type boolean
   */
  public void setUpdateFieldsAtPrint(boolean updateFieldsAtPrint) {
    Dispatch.put(this, "UpdateFieldsAtPrint", new Variant(updateFieldsAtPrint));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getPrintProperties() {
    return Dispatch.get(this, "PrintProperties").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param printProperties an input-parameter of type boolean
   */
  public void setPrintProperties(boolean printProperties) {
    Dispatch.put(this, "PrintProperties", new Variant(printProperties));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getPrintFieldCodes() {
    return Dispatch.get(this, "PrintFieldCodes").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param printFieldCodes an input-parameter of type boolean
   */
  public void setPrintFieldCodes(boolean printFieldCodes) {
    Dispatch.put(this, "PrintFieldCodes", new Variant(printFieldCodes));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getPrintComments() {
    return Dispatch.get(this, "PrintComments").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param printComments an input-parameter of type boolean
   */
  public void setPrintComments(boolean printComments) {
    Dispatch.put(this, "PrintComments", new Variant(printComments));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getPrintHiddenText() {
    return Dispatch.get(this, "PrintHiddenText").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param printHiddenText an input-parameter of type boolean
   */
  public void setPrintHiddenText(boolean printHiddenText) {
    Dispatch.put(this, "PrintHiddenText", new Variant(printHiddenText));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getEnvelopeFeederInstalled() {
    return Dispatch.get(this, "EnvelopeFeederInstalled").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getUpdateLinksAtPrint() {
    return Dispatch.get(this, "UpdateLinksAtPrint").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param updateLinksAtPrint an input-parameter of type boolean
   */
  public void setUpdateLinksAtPrint(boolean updateLinksAtPrint) {
    Dispatch.put(this, "UpdateLinksAtPrint", new Variant(updateLinksAtPrint));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getPrintBackground() {
    return Dispatch.get(this, "PrintBackground").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param printBackground an input-parameter of type boolean
   */
  public void setPrintBackground(boolean printBackground) {
    Dispatch.put(this, "PrintBackground", new Variant(printBackground));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getPrintDrawingObjects() {
    return Dispatch.get(this, "PrintDrawingObjects").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param printDrawingObjects an input-parameter of type boolean
   */
  public void setPrintDrawingObjects(boolean printDrawingObjects) {
    Dispatch.put(this, "PrintDrawingObjects", new Variant(printDrawingObjects));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type String
   */
  public String getDefaultTray() {
    return Dispatch.get(this, "DefaultTray").toString();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param defaultTray an input-parameter of type String
   */
  public void setDefaultTray(String defaultTray) {
    Dispatch.put(this, "DefaultTray", defaultTray);
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getDefaultTrayID() {
    return Dispatch.get(this, "DefaultTrayID").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param defaultTrayID an input-parameter of type int
   */
  public void setDefaultTrayID(int defaultTrayID) {
    Dispatch.put(this, "DefaultTrayID", new Variant(defaultTrayID));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getCreateBackup() {
    return Dispatch.get(this, "CreateBackup").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param createBackup an input-parameter of type boolean
   */
  public void setCreateBackup(boolean createBackup) {
    Dispatch.put(this, "CreateBackup", new Variant(createBackup));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAllowFastSave() {
    return Dispatch.get(this, "AllowFastSave").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param allowFastSave an input-parameter of type boolean
   */
  public void setAllowFastSave(boolean allowFastSave) {
    Dispatch.put(this, "AllowFastSave", new Variant(allowFastSave));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getSavePropertiesPrompt() {
    return Dispatch.get(this, "SavePropertiesPrompt").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param savePropertiesPrompt an input-parameter of type boolean
   */
  public void setSavePropertiesPrompt(boolean savePropertiesPrompt) {
    Dispatch.put(this, "SavePropertiesPrompt", new Variant(savePropertiesPrompt));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getSaveNormalPrompt() {
    return Dispatch.get(this, "SaveNormalPrompt").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param saveNormalPrompt an input-parameter of type boolean
   */
  public void setSaveNormalPrompt(boolean saveNormalPrompt) {
    Dispatch.put(this, "SaveNormalPrompt", new Variant(saveNormalPrompt));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getSaveInterval() {
    return Dispatch.get(this, "SaveInterval").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param saveInterval an input-parameter of type int
   */
  public void setSaveInterval(int saveInterval) {
    Dispatch.put(this, "SaveInterval", new Variant(saveInterval));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getBackgroundSave() {
    return Dispatch.get(this, "BackgroundSave").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param backgroundSave an input-parameter of type boolean
   */
  public void setBackgroundSave(boolean backgroundSave) {
    Dispatch.put(this, "BackgroundSave", new Variant(backgroundSave));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getInsertedTextMark() {
    return Dispatch.get(this, "InsertedTextMark").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param insertedTextMark an input-parameter of type int
   */
  public void setInsertedTextMark(int insertedTextMark) {
    Dispatch.put(this, "InsertedTextMark", new Variant(insertedTextMark));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getDeletedTextMark() {
    return Dispatch.get(this, "DeletedTextMark").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param deletedTextMark an input-parameter of type int
   */
  public void setDeletedTextMark(int deletedTextMark) {
    Dispatch.put(this, "DeletedTextMark", new Variant(deletedTextMark));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getRevisedLinesMark() {
    return Dispatch.get(this, "RevisedLinesMark").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param revisedLinesMark an input-parameter of type int
   */
  public void setRevisedLinesMark(int revisedLinesMark) {
    Dispatch.put(this, "RevisedLinesMark", new Variant(revisedLinesMark));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getInsertedTextColor() {
    return Dispatch.get(this, "InsertedTextColor").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param insertedTextColor an input-parameter of type int
   */
  public void setInsertedTextColor(int insertedTextColor) {
    Dispatch.put(this, "InsertedTextColor", new Variant(insertedTextColor));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getDeletedTextColor() {
    return Dispatch.get(this, "DeletedTextColor").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param deletedTextColor an input-parameter of type int
   */
  public void setDeletedTextColor(int deletedTextColor) {
    Dispatch.put(this, "DeletedTextColor", new Variant(deletedTextColor));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getRevisedLinesColor() {
    return Dispatch.get(this, "RevisedLinesColor").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param revisedLinesColor an input-parameter of type int
   */
  public void setRevisedLinesColor(int revisedLinesColor) {
    Dispatch.put(this, "RevisedLinesColor", new Variant(revisedLinesColor));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param path an input-parameter of type int
   * @return the result is of type String
   */
  public String getDefaultFilePath(int path) {
    return Dispatch.call(this, "DefaultFilePath", new Variant(path)).toString();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param path an input-parameter of type int
   */
  public void setDefaultFilePath(int path) {
    Dispatch.put(this, "DefaultFilePath", new Variant(path));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getOvertype() {
    return Dispatch.get(this, "Overtype").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param overtype an input-parameter of type boolean
   */
  public void setOvertype(boolean overtype) {
    Dispatch.put(this, "Overtype", new Variant(overtype));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getReplaceSelection() {
    return Dispatch.get(this, "ReplaceSelection").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param replaceSelection an input-parameter of type boolean
   */
  public void setReplaceSelection(boolean replaceSelection) {
    Dispatch.put(this, "ReplaceSelection", new Variant(replaceSelection));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAllowDragAndDrop() {
    return Dispatch.get(this, "AllowDragAndDrop").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param allowDragAndDrop an input-parameter of type boolean
   */
  public void setAllowDragAndDrop(boolean allowDragAndDrop) {
    Dispatch.put(this, "AllowDragAndDrop", new Variant(allowDragAndDrop));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoWordSelection() {
    return Dispatch.get(this, "AutoWordSelection").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoWordSelection an input-parameter of type boolean
   */
  public void setAutoWordSelection(boolean autoWordSelection) {
    Dispatch.put(this, "AutoWordSelection", new Variant(autoWordSelection));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getINSKeyForPaste() {
    return Dispatch.get(this, "INSKeyForPaste").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param iNSKeyForPaste an input-parameter of type boolean
   */
  public void setINSKeyForPaste(boolean iNSKeyForPaste) {
    Dispatch.put(this, "INSKeyForPaste", new Variant(iNSKeyForPaste));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getSmartCutPaste() {
    return Dispatch.get(this, "SmartCutPaste").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param smartCutPaste an input-parameter of type boolean
   */
  public void setSmartCutPaste(boolean smartCutPaste) {
    Dispatch.put(this, "SmartCutPaste", new Variant(smartCutPaste));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getTabIndentKey() {
    return Dispatch.get(this, "TabIndentKey").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param tabIndentKey an input-parameter of type boolean
   */
  public void setTabIndentKey(boolean tabIndentKey) {
    Dispatch.put(this, "TabIndentKey", new Variant(tabIndentKey));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type String
   */
  public String getPictureEditor() {
    return Dispatch.get(this, "PictureEditor").toString();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param pictureEditor an input-parameter of type String
   */
  public void setPictureEditor(String pictureEditor) {
    Dispatch.put(this, "PictureEditor", pictureEditor);
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAnimateScreenMovements() {
    return Dispatch.get(this, "AnimateScreenMovements").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param animateScreenMovements an input-parameter of type boolean
   */
  public void setAnimateScreenMovements(boolean animateScreenMovements) {
    Dispatch.put(this, "AnimateScreenMovements", new Variant(animateScreenMovements));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getVirusProtection() {
    return Dispatch.get(this, "VirusProtection").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param virusProtection an input-parameter of type boolean
   */
  public void setVirusProtection(boolean virusProtection) {
    Dispatch.put(this, "VirusProtection", new Variant(virusProtection));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getRevisedPropertiesMark() {
    return Dispatch.get(this, "RevisedPropertiesMark").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param revisedPropertiesMark an input-parameter of type int
   */
  public void setRevisedPropertiesMark(int revisedPropertiesMark) {
    Dispatch.put(this, "RevisedPropertiesMark", new Variant(revisedPropertiesMark));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getRevisedPropertiesColor() {
    return Dispatch.get(this, "RevisedPropertiesColor").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param revisedPropertiesColor an input-parameter of type int
   */
  public void setRevisedPropertiesColor(int revisedPropertiesColor) {
    Dispatch.put(this, "RevisedPropertiesColor", new Variant(revisedPropertiesColor));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getSnapToGrid() {
    return Dispatch.get(this, "SnapToGrid").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param snapToGrid an input-parameter of type boolean
   */
  public void setSnapToGrid(boolean snapToGrid) {
    Dispatch.put(this, "SnapToGrid", new Variant(snapToGrid));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getSnapToShapes() {
    return Dispatch.get(this, "SnapToShapes").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param snapToShapes an input-parameter of type boolean
   */
  public void setSnapToShapes(boolean snapToShapes) {
    Dispatch.put(this, "SnapToShapes", new Variant(snapToShapes));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type float
   */
  public float getGridDistanceHorizontal() {
    return Dispatch.get(this, "GridDistanceHorizontal").changeType(Variant.VariantFloat).getFloat();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param gridDistanceHorizontal an input-parameter of type float
   */
  public void setGridDistanceHorizontal(float gridDistanceHorizontal) {
    Dispatch.put(this, "GridDistanceHorizontal", new Variant(gridDistanceHorizontal));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type float
   */
  public float getGridDistanceVertical() {
    return Dispatch.get(this, "GridDistanceVertical").changeType(Variant.VariantFloat).getFloat();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param gridDistanceVertical an input-parameter of type float
   */
  public void setGridDistanceVertical(float gridDistanceVertical) {
    Dispatch.put(this, "GridDistanceVertical", new Variant(gridDistanceVertical));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type float
   */
  public float getGridOriginHorizontal() {
    return Dispatch.get(this, "GridOriginHorizontal").changeType(Variant.VariantFloat).getFloat();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param gridOriginHorizontal an input-parameter of type float
   */
  public void setGridOriginHorizontal(float gridOriginHorizontal) {
    Dispatch.put(this, "GridOriginHorizontal", new Variant(gridOriginHorizontal));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type float
   */
  public float getGridOriginVertical() {
    return Dispatch.get(this, "GridOriginVertical").changeType(Variant.VariantFloat).getFloat();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param gridOriginVertical an input-parameter of type float
   */
  public void setGridOriginVertical(float gridOriginVertical) {
    Dispatch.put(this, "GridOriginVertical", new Variant(gridOriginVertical));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getInlineConversion() {
    return Dispatch.get(this, "InlineConversion").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param inlineConversion an input-parameter of type boolean
   */
  public void setInlineConversion(boolean inlineConversion) {
    Dispatch.put(this, "InlineConversion", new Variant(inlineConversion));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getIMEAutomaticControl() {
    return Dispatch.get(this, "IMEAutomaticControl").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param iMEAutomaticControl an input-parameter of type boolean
   */
  public void setIMEAutomaticControl(boolean iMEAutomaticControl) {
    Dispatch.put(this, "IMEAutomaticControl", new Variant(iMEAutomaticControl));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatApplyHeadings() {
    return Dispatch.get(this, "AutoFormatApplyHeadings").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatApplyHeadings an input-parameter of type boolean
   */
  public void setAutoFormatApplyHeadings(boolean autoFormatApplyHeadings) {
    Dispatch.put(this, "AutoFormatApplyHeadings", new Variant(autoFormatApplyHeadings));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatApplyLists() {
    return Dispatch.get(this, "AutoFormatApplyLists").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatApplyLists an input-parameter of type boolean
   */
  public void setAutoFormatApplyLists(boolean autoFormatApplyLists) {
    Dispatch.put(this, "AutoFormatApplyLists", new Variant(autoFormatApplyLists));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatApplyBulletedLists() {
    return Dispatch.get(this, "AutoFormatApplyBulletedLists").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatApplyBulletedLists an input-parameter of type boolean
   */
  public void setAutoFormatApplyBulletedLists(boolean autoFormatApplyBulletedLists) {
    Dispatch.put(this, "AutoFormatApplyBulletedLists", new Variant(autoFormatApplyBulletedLists));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatApplyOtherParas() {
    return Dispatch.get(this, "AutoFormatApplyOtherParas").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatApplyOtherParas an input-parameter of type boolean
   */
  public void setAutoFormatApplyOtherParas(boolean autoFormatApplyOtherParas) {
    Dispatch.put(this, "AutoFormatApplyOtherParas", new Variant(autoFormatApplyOtherParas));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatReplaceQuotes() {
    return Dispatch.get(this, "AutoFormatReplaceQuotes").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatReplaceQuotes an input-parameter of type boolean
   */
  public void setAutoFormatReplaceQuotes(boolean autoFormatReplaceQuotes) {
    Dispatch.put(this, "AutoFormatReplaceQuotes", new Variant(autoFormatReplaceQuotes));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatReplaceSymbols() {
    return Dispatch.get(this, "AutoFormatReplaceSymbols").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatReplaceSymbols an input-parameter of type boolean
   */
  public void setAutoFormatReplaceSymbols(boolean autoFormatReplaceSymbols) {
    Dispatch.put(this, "AutoFormatReplaceSymbols", new Variant(autoFormatReplaceSymbols));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatReplaceOrdinals() {
    return Dispatch.get(this, "AutoFormatReplaceOrdinals").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatReplaceOrdinals an input-parameter of type boolean
   */
  public void setAutoFormatReplaceOrdinals(boolean autoFormatReplaceOrdinals) {
    Dispatch.put(this, "AutoFormatReplaceOrdinals", new Variant(autoFormatReplaceOrdinals));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatReplaceFractions() {
    return Dispatch.get(this, "AutoFormatReplaceFractions").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatReplaceFractions an input-parameter of type boolean
   */
  public void setAutoFormatReplaceFractions(boolean autoFormatReplaceFractions) {
    Dispatch.put(this, "AutoFormatReplaceFractions", new Variant(autoFormatReplaceFractions));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatReplacePlainTextEmphasis() {
    return Dispatch.get(this, "AutoFormatReplacePlainTextEmphasis").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatReplacePlainTextEmphasis an input-parameter of type boolean
   */
  public void setAutoFormatReplacePlainTextEmphasis(boolean autoFormatReplacePlainTextEmphasis) {
    Dispatch.put(this, "AutoFormatReplacePlainTextEmphasis", new Variant(autoFormatReplacePlainTextEmphasis));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatPreserveStyles() {
    return Dispatch.get(this, "AutoFormatPreserveStyles").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatPreserveStyles an input-parameter of type boolean
   */
  public void setAutoFormatPreserveStyles(boolean autoFormatPreserveStyles) {
    Dispatch.put(this, "AutoFormatPreserveStyles", new Variant(autoFormatPreserveStyles));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeApplyHeadings() {
    return Dispatch.get(this, "AutoFormatAsYouTypeApplyHeadings").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeApplyHeadings an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeApplyHeadings(boolean autoFormatAsYouTypeApplyHeadings) {
    Dispatch.put(this, "AutoFormatAsYouTypeApplyHeadings", new Variant(autoFormatAsYouTypeApplyHeadings));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeApplyBorders() {
    return Dispatch.get(this, "AutoFormatAsYouTypeApplyBorders").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeApplyBorders an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeApplyBorders(boolean autoFormatAsYouTypeApplyBorders) {
    Dispatch.put(this, "AutoFormatAsYouTypeApplyBorders", new Variant(autoFormatAsYouTypeApplyBorders));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeApplyBulletedLists() {
    return Dispatch.get(this, "AutoFormatAsYouTypeApplyBulletedLists").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeApplyBulletedLists an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeApplyBulletedLists(boolean autoFormatAsYouTypeApplyBulletedLists) {
    Dispatch.put(this, "AutoFormatAsYouTypeApplyBulletedLists", new Variant(autoFormatAsYouTypeApplyBulletedLists));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeApplyNumberedLists() {
    return Dispatch.get(this, "AutoFormatAsYouTypeApplyNumberedLists").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeApplyNumberedLists an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeApplyNumberedLists(boolean autoFormatAsYouTypeApplyNumberedLists) {
    Dispatch.put(this, "AutoFormatAsYouTypeApplyNumberedLists", new Variant(autoFormatAsYouTypeApplyNumberedLists));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeReplaceQuotes() {
    return Dispatch.get(this, "AutoFormatAsYouTypeReplaceQuotes").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeReplaceQuotes an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeReplaceQuotes(boolean autoFormatAsYouTypeReplaceQuotes) {
    Dispatch.put(this, "AutoFormatAsYouTypeReplaceQuotes", new Variant(autoFormatAsYouTypeReplaceQuotes));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeReplaceSymbols() {
    return Dispatch.get(this, "AutoFormatAsYouTypeReplaceSymbols").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeReplaceSymbols an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeReplaceSymbols(boolean autoFormatAsYouTypeReplaceSymbols) {
    Dispatch.put(this, "AutoFormatAsYouTypeReplaceSymbols", new Variant(autoFormatAsYouTypeReplaceSymbols));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeReplaceOrdinals() {
    return Dispatch.get(this, "AutoFormatAsYouTypeReplaceOrdinals").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeReplaceOrdinals an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeReplaceOrdinals(boolean autoFormatAsYouTypeReplaceOrdinals) {
    Dispatch.put(this, "AutoFormatAsYouTypeReplaceOrdinals", new Variant(autoFormatAsYouTypeReplaceOrdinals));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeReplaceFractions() {
    return Dispatch.get(this, "AutoFormatAsYouTypeReplaceFractions").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeReplaceFractions an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeReplaceFractions(boolean autoFormatAsYouTypeReplaceFractions) {
    Dispatch.put(this, "AutoFormatAsYouTypeReplaceFractions", new Variant(autoFormatAsYouTypeReplaceFractions));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeReplacePlainTextEmphasis() {
    return Dispatch.get(this, "AutoFormatAsYouTypeReplacePlainTextEmphasis").changeType(Variant.VariantBoolean).
            getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeReplacePlainTextEmphasis an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeReplacePlainTextEmphasis(boolean autoFormatAsYouTypeReplacePlainTextEmphasis) {
    Dispatch.put(this, "AutoFormatAsYouTypeReplacePlainTextEmphasis",
                 new Variant(autoFormatAsYouTypeReplacePlainTextEmphasis));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeFormatListItemBeginning() {
    return Dispatch.get(this, "AutoFormatAsYouTypeFormatListItemBeginning").changeType(Variant.VariantBoolean).
            getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeFormatListItemBeginning an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeFormatListItemBeginning(boolean autoFormatAsYouTypeFormatListItemBeginning) {
    Dispatch.put(this, "AutoFormatAsYouTypeFormatListItemBeginning",
                 new Variant(autoFormatAsYouTypeFormatListItemBeginning));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeDefineStyles() {
    return Dispatch.get(this, "AutoFormatAsYouTypeDefineStyles").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeDefineStyles an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeDefineStyles(boolean autoFormatAsYouTypeDefineStyles) {
    Dispatch.put(this, "AutoFormatAsYouTypeDefineStyles", new Variant(autoFormatAsYouTypeDefineStyles));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatPlainTextWordMail() {
    return Dispatch.get(this, "AutoFormatPlainTextWordMail").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatPlainTextWordMail an input-parameter of type boolean
   */
  public void setAutoFormatPlainTextWordMail(boolean autoFormatPlainTextWordMail) {
    Dispatch.put(this, "AutoFormatPlainTextWordMail", new Variant(autoFormatPlainTextWordMail));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeReplaceHyperlinks() {
    return Dispatch.get(this, "AutoFormatAsYouTypeReplaceHyperlinks").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeReplaceHyperlinks an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeReplaceHyperlinks(boolean autoFormatAsYouTypeReplaceHyperlinks) {
    Dispatch.put(this, "AutoFormatAsYouTypeReplaceHyperlinks", new Variant(autoFormatAsYouTypeReplaceHyperlinks));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatReplaceHyperlinks() {
    return Dispatch.get(this, "AutoFormatReplaceHyperlinks").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatReplaceHyperlinks an input-parameter of type boolean
   */
  public void setAutoFormatReplaceHyperlinks(boolean autoFormatReplaceHyperlinks) {
    Dispatch.put(this, "AutoFormatReplaceHyperlinks", new Variant(autoFormatReplaceHyperlinks));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getDefaultHighlightColorIndex() {
    return Dispatch.get(this, "DefaultHighlightColorIndex").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param defaultHighlightColorIndex an input-parameter of type int
   */
  public void setDefaultHighlightColorIndex(int defaultHighlightColorIndex) {
    Dispatch.put(this, "DefaultHighlightColorIndex", new Variant(defaultHighlightColorIndex));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getDefaultBorderLineStyle() {
    return Dispatch.get(this, "DefaultBorderLineStyle").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param defaultBorderLineStyle an input-parameter of type int
   */
  public void setDefaultBorderLineStyle(int defaultBorderLineStyle) {
    Dispatch.put(this, "DefaultBorderLineStyle", new Variant(defaultBorderLineStyle));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getCheckSpellingAsYouType() {
    return Dispatch.get(this, "CheckSpellingAsYouType").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param checkSpellingAsYouType an input-parameter of type boolean
   */
  public void setCheckSpellingAsYouType(boolean checkSpellingAsYouType) {
    Dispatch.put(this, "CheckSpellingAsYouType", new Variant(checkSpellingAsYouType));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getCheckGrammarAsYouType() {
    return Dispatch.get(this, "CheckGrammarAsYouType").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param checkGrammarAsYouType an input-parameter of type boolean
   */
  public void setCheckGrammarAsYouType(boolean checkGrammarAsYouType) {
    Dispatch.put(this, "CheckGrammarAsYouType", new Variant(checkGrammarAsYouType));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getIgnoreInternetAndFileAddresses() {
    return Dispatch.get(this, "IgnoreInternetAndFileAddresses").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param ignoreInternetAndFileAddresses an input-parameter of type boolean
   */
  public void setIgnoreInternetAndFileAddresses(boolean ignoreInternetAndFileAddresses) {
    Dispatch.put(this, "IgnoreInternetAndFileAddresses", new Variant(ignoreInternetAndFileAddresses));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getShowReadabilityStatistics() {
    return Dispatch.get(this, "ShowReadabilityStatistics").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param showReadabilityStatistics an input-parameter of type boolean
   */
  public void setShowReadabilityStatistics(boolean showReadabilityStatistics) {
    Dispatch.put(this, "ShowReadabilityStatistics", new Variant(showReadabilityStatistics));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getIgnoreUppercase() {
    return Dispatch.get(this, "IgnoreUppercase").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param ignoreUppercase an input-parameter of type boolean
   */
  public void setIgnoreUppercase(boolean ignoreUppercase) {
    Dispatch.put(this, "IgnoreUppercase", new Variant(ignoreUppercase));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getIgnoreMixedDigits() {
    return Dispatch.get(this, "IgnoreMixedDigits").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param ignoreMixedDigits an input-parameter of type boolean
   */
  public void setIgnoreMixedDigits(boolean ignoreMixedDigits) {
    Dispatch.put(this, "IgnoreMixedDigits", new Variant(ignoreMixedDigits));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getSuggestFromMainDictionaryOnly() {
    return Dispatch.get(this, "SuggestFromMainDictionaryOnly").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param suggestFromMainDictionaryOnly an input-parameter of type boolean
   */
  public void setSuggestFromMainDictionaryOnly(boolean suggestFromMainDictionaryOnly) {
    Dispatch.put(this, "SuggestFromMainDictionaryOnly", new Variant(suggestFromMainDictionaryOnly));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getSuggestSpellingCorrections() {
    return Dispatch.get(this, "SuggestSpellingCorrections").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param suggestSpellingCorrections an input-parameter of type boolean
   */
  public void setSuggestSpellingCorrections(boolean suggestSpellingCorrections) {
    Dispatch.put(this, "SuggestSpellingCorrections", new Variant(suggestSpellingCorrections));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getDefaultBorderLineWidth() {
    return Dispatch.get(this, "DefaultBorderLineWidth").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param defaultBorderLineWidth an input-parameter of type int
   */
  public void setDefaultBorderLineWidth(int defaultBorderLineWidth) {
    Dispatch.put(this, "DefaultBorderLineWidth", new Variant(defaultBorderLineWidth));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getCheckGrammarWithSpelling() {
    return Dispatch.get(this, "CheckGrammarWithSpelling").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param checkGrammarWithSpelling an input-parameter of type boolean
   */
  public void setCheckGrammarWithSpelling(boolean checkGrammarWithSpelling) {
    Dispatch.put(this, "CheckGrammarWithSpelling", new Variant(checkGrammarWithSpelling));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getDefaultOpenFormat() {
    return Dispatch.get(this, "DefaultOpenFormat").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param defaultOpenFormat an input-parameter of type int
   */
  public void setDefaultOpenFormat(int defaultOpenFormat) {
    Dispatch.put(this, "DefaultOpenFormat", new Variant(defaultOpenFormat));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getPrintDraft() {
    return Dispatch.get(this, "PrintDraft").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param printDraft an input-parameter of type boolean
   */
  public void setPrintDraft(boolean printDraft) {
    Dispatch.put(this, "PrintDraft", new Variant(printDraft));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getPrintReverse() {
    return Dispatch.get(this, "PrintReverse").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param printReverse an input-parameter of type boolean
   */
  public void setPrintReverse(boolean printReverse) {
    Dispatch.put(this, "PrintReverse", new Variant(printReverse));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getMapPaperSize() {
    return Dispatch.get(this, "MapPaperSize").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param mapPaperSize an input-parameter of type boolean
   */
  public void setMapPaperSize(boolean mapPaperSize) {
    Dispatch.put(this, "MapPaperSize", new Variant(mapPaperSize));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeApplyTables() {
    return Dispatch.get(this, "AutoFormatAsYouTypeApplyTables").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeApplyTables an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeApplyTables(boolean autoFormatAsYouTypeApplyTables) {
    Dispatch.put(this, "AutoFormatAsYouTypeApplyTables", new Variant(autoFormatAsYouTypeApplyTables));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatApplyFirstIndents() {
    return Dispatch.get(this, "AutoFormatApplyFirstIndents").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatApplyFirstIndents an input-parameter of type boolean
   */
  public void setAutoFormatApplyFirstIndents(boolean autoFormatApplyFirstIndents) {
    Dispatch.put(this, "AutoFormatApplyFirstIndents", new Variant(autoFormatApplyFirstIndents));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatMatchParentheses() {
    return Dispatch.get(this, "AutoFormatMatchParentheses").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatMatchParentheses an input-parameter of type boolean
   */
  public void setAutoFormatMatchParentheses(boolean autoFormatMatchParentheses) {
    Dispatch.put(this, "AutoFormatMatchParentheses", new Variant(autoFormatMatchParentheses));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatReplaceFarEastDashes() {
    return Dispatch.get(this, "AutoFormatReplaceFarEastDashes").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatReplaceFarEastDashes an input-parameter of type boolean
   */
  public void setAutoFormatReplaceFarEastDashes(boolean autoFormatReplaceFarEastDashes) {
    Dispatch.put(this, "AutoFormatReplaceFarEastDashes", new Variant(autoFormatReplaceFarEastDashes));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatDeleteAutoSpaces() {
    return Dispatch.get(this, "AutoFormatDeleteAutoSpaces").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatDeleteAutoSpaces an input-parameter of type boolean
   */
  public void setAutoFormatDeleteAutoSpaces(boolean autoFormatDeleteAutoSpaces) {
    Dispatch.put(this, "AutoFormatDeleteAutoSpaces", new Variant(autoFormatDeleteAutoSpaces));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeApplyFirstIndents() {
    return Dispatch.get(this, "AutoFormatAsYouTypeApplyFirstIndents").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeApplyFirstIndents an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeApplyFirstIndents(boolean autoFormatAsYouTypeApplyFirstIndents) {
    Dispatch.put(this, "AutoFormatAsYouTypeApplyFirstIndents", new Variant(autoFormatAsYouTypeApplyFirstIndents));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeApplyDates() {
    return Dispatch.get(this, "AutoFormatAsYouTypeApplyDates").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeApplyDates an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeApplyDates(boolean autoFormatAsYouTypeApplyDates) {
    Dispatch.put(this, "AutoFormatAsYouTypeApplyDates", new Variant(autoFormatAsYouTypeApplyDates));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeApplyClosings() {
    return Dispatch.get(this, "AutoFormatAsYouTypeApplyClosings").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeApplyClosings an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeApplyClosings(boolean autoFormatAsYouTypeApplyClosings) {
    Dispatch.put(this, "AutoFormatAsYouTypeApplyClosings", new Variant(autoFormatAsYouTypeApplyClosings));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeMatchParentheses() {
    return Dispatch.get(this, "AutoFormatAsYouTypeMatchParentheses").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeMatchParentheses an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeMatchParentheses(boolean autoFormatAsYouTypeMatchParentheses) {
    Dispatch.put(this, "AutoFormatAsYouTypeMatchParentheses", new Variant(autoFormatAsYouTypeMatchParentheses));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeReplaceFarEastDashes() {
    return Dispatch.get(this, "AutoFormatAsYouTypeReplaceFarEastDashes").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeReplaceFarEastDashes an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeReplaceFarEastDashes(boolean autoFormatAsYouTypeReplaceFarEastDashes) {
    Dispatch.put(this, "AutoFormatAsYouTypeReplaceFarEastDashes", new Variant(autoFormatAsYouTypeReplaceFarEastDashes));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeDeleteAutoSpaces() {
    return Dispatch.get(this, "AutoFormatAsYouTypeDeleteAutoSpaces").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeDeleteAutoSpaces an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeDeleteAutoSpaces(boolean autoFormatAsYouTypeDeleteAutoSpaces) {
    Dispatch.put(this, "AutoFormatAsYouTypeDeleteAutoSpaces", new Variant(autoFormatAsYouTypeDeleteAutoSpaces));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeInsertClosings() {
    return Dispatch.get(this, "AutoFormatAsYouTypeInsertClosings").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeInsertClosings an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeInsertClosings(boolean autoFormatAsYouTypeInsertClosings) {
    Dispatch.put(this, "AutoFormatAsYouTypeInsertClosings", new Variant(autoFormatAsYouTypeInsertClosings));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeAutoLetterWizard() {
    return Dispatch.get(this, "AutoFormatAsYouTypeAutoLetterWizard").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeAutoLetterWizard an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeAutoLetterWizard(boolean autoFormatAsYouTypeAutoLetterWizard) {
    Dispatch.put(this, "AutoFormatAsYouTypeAutoLetterWizard", new Variant(autoFormatAsYouTypeAutoLetterWizard));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoFormatAsYouTypeInsertOvers() {
    return Dispatch.get(this, "AutoFormatAsYouTypeInsertOvers").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoFormatAsYouTypeInsertOvers an input-parameter of type boolean
   */
  public void setAutoFormatAsYouTypeInsertOvers(boolean autoFormatAsYouTypeInsertOvers) {
    Dispatch.put(this, "AutoFormatAsYouTypeInsertOvers", new Variant(autoFormatAsYouTypeInsertOvers));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getDisplayGridLines() {
    return Dispatch.get(this, "DisplayGridLines").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param displayGridLines an input-parameter of type boolean
   */
  public void setDisplayGridLines(boolean displayGridLines) {
    Dispatch.put(this, "DisplayGridLines", new Variant(displayGridLines));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getMatchFuzzyCase() {
    return Dispatch.get(this, "MatchFuzzyCase").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param matchFuzzyCase an input-parameter of type boolean
   */
  public void setMatchFuzzyCase(boolean matchFuzzyCase) {
    Dispatch.put(this, "MatchFuzzyCase", new Variant(matchFuzzyCase));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getMatchFuzzyByte() {
    return Dispatch.get(this, "MatchFuzzyByte").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param matchFuzzyByte an input-parameter of type boolean
   */
  public void setMatchFuzzyByte(boolean matchFuzzyByte) {
    Dispatch.put(this, "MatchFuzzyByte", new Variant(matchFuzzyByte));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getMatchFuzzyHiragana() {
    return Dispatch.get(this, "MatchFuzzyHiragana").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param matchFuzzyHiragana an input-parameter of type boolean
   */
  public void setMatchFuzzyHiragana(boolean matchFuzzyHiragana) {
    Dispatch.put(this, "MatchFuzzyHiragana", new Variant(matchFuzzyHiragana));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getMatchFuzzySmallKana() {
    return Dispatch.get(this, "MatchFuzzySmallKana").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param matchFuzzySmallKana an input-parameter of type boolean
   */
  public void setMatchFuzzySmallKana(boolean matchFuzzySmallKana) {
    Dispatch.put(this, "MatchFuzzySmallKana", new Variant(matchFuzzySmallKana));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getMatchFuzzyDash() {
    return Dispatch.get(this, "MatchFuzzyDash").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param matchFuzzyDash an input-parameter of type boolean
   */
  public void setMatchFuzzyDash(boolean matchFuzzyDash) {
    Dispatch.put(this, "MatchFuzzyDash", new Variant(matchFuzzyDash));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getMatchFuzzyIterationMark() {
    return Dispatch.get(this, "MatchFuzzyIterationMark").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param matchFuzzyIterationMark an input-parameter of type boolean
   */
  public void setMatchFuzzyIterationMark(boolean matchFuzzyIterationMark) {
    Dispatch.put(this, "MatchFuzzyIterationMark", new Variant(matchFuzzyIterationMark));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getMatchFuzzyKanji() {
    return Dispatch.get(this, "MatchFuzzyKanji").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param matchFuzzyKanji an input-parameter of type boolean
   */
  public void setMatchFuzzyKanji(boolean matchFuzzyKanji) {
    Dispatch.put(this, "MatchFuzzyKanji", new Variant(matchFuzzyKanji));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getMatchFuzzyOldKana() {
    return Dispatch.get(this, "MatchFuzzyOldKana").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param matchFuzzyOldKana an input-parameter of type boolean
   */
  public void setMatchFuzzyOldKana(boolean matchFuzzyOldKana) {
    Dispatch.put(this, "MatchFuzzyOldKana", new Variant(matchFuzzyOldKana));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getMatchFuzzyProlongedSoundMark() {
    return Dispatch.get(this, "MatchFuzzyProlongedSoundMark").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param matchFuzzyProlongedSoundMark an input-parameter of type boolean
   */
  public void setMatchFuzzyProlongedSoundMark(boolean matchFuzzyProlongedSoundMark) {
    Dispatch.put(this, "MatchFuzzyProlongedSoundMark", new Variant(matchFuzzyProlongedSoundMark));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getMatchFuzzyDZ() {
    return Dispatch.get(this, "MatchFuzzyDZ").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param matchFuzzyDZ an input-parameter of type boolean
   */
  public void setMatchFuzzyDZ(boolean matchFuzzyDZ) {
    Dispatch.put(this, "MatchFuzzyDZ", new Variant(matchFuzzyDZ));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getMatchFuzzyBV() {
    return Dispatch.get(this, "MatchFuzzyBV").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param matchFuzzyBV an input-parameter of type boolean
   */
  public void setMatchFuzzyBV(boolean matchFuzzyBV) {
    Dispatch.put(this, "MatchFuzzyBV", new Variant(matchFuzzyBV));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getMatchFuzzyTC() {
    return Dispatch.get(this, "MatchFuzzyTC").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param matchFuzzyTC an input-parameter of type boolean
   */
  public void setMatchFuzzyTC(boolean matchFuzzyTC) {
    Dispatch.put(this, "MatchFuzzyTC", new Variant(matchFuzzyTC));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getMatchFuzzyHF() {
    return Dispatch.get(this, "MatchFuzzyHF").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param matchFuzzyHF an input-parameter of type boolean
   */
  public void setMatchFuzzyHF(boolean matchFuzzyHF) {
    Dispatch.put(this, "MatchFuzzyHF", new Variant(matchFuzzyHF));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getMatchFuzzyZJ() {
    return Dispatch.get(this, "MatchFuzzyZJ").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param matchFuzzyZJ an input-parameter of type boolean
   */
  public void setMatchFuzzyZJ(boolean matchFuzzyZJ) {
    Dispatch.put(this, "MatchFuzzyZJ", new Variant(matchFuzzyZJ));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getMatchFuzzyAY() {
    return Dispatch.get(this, "MatchFuzzyAY").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param matchFuzzyAY an input-parameter of type boolean
   */
  public void setMatchFuzzyAY(boolean matchFuzzyAY) {
    Dispatch.put(this, "MatchFuzzyAY", new Variant(matchFuzzyAY));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getMatchFuzzyKiKu() {
    return Dispatch.get(this, "MatchFuzzyKiKu").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param matchFuzzyKiKu an input-parameter of type boolean
   */
  public void setMatchFuzzyKiKu(boolean matchFuzzyKiKu) {
    Dispatch.put(this, "MatchFuzzyKiKu", new Variant(matchFuzzyKiKu));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getMatchFuzzyPunctuation() {
    return Dispatch.get(this, "MatchFuzzyPunctuation").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param matchFuzzyPunctuation an input-parameter of type boolean
   */
  public void setMatchFuzzyPunctuation(boolean matchFuzzyPunctuation) {
    Dispatch.put(this, "MatchFuzzyPunctuation", new Variant(matchFuzzyPunctuation));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getMatchFuzzySpace() {
    return Dispatch.get(this, "MatchFuzzySpace").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param matchFuzzySpace an input-parameter of type boolean
   */
  public void setMatchFuzzySpace(boolean matchFuzzySpace) {
    Dispatch.put(this, "MatchFuzzySpace", new Variant(matchFuzzySpace));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getApplyFarEastFontsToAscii() {
    return Dispatch.get(this, "ApplyFarEastFontsToAscii").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param applyFarEastFontsToAscii an input-parameter of type boolean
   */
  public void setApplyFarEastFontsToAscii(boolean applyFarEastFontsToAscii) {
    Dispatch.put(this, "ApplyFarEastFontsToAscii", new Variant(applyFarEastFontsToAscii));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getConvertHighAnsiToFarEast() {
    return Dispatch.get(this, "ConvertHighAnsiToFarEast").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param convertHighAnsiToFarEast an input-parameter of type boolean
   */
  public void setConvertHighAnsiToFarEast(boolean convertHighAnsiToFarEast) {
    Dispatch.put(this, "ConvertHighAnsiToFarEast", new Variant(convertHighAnsiToFarEast));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getPrintOddPagesInAscendingOrder() {
    return Dispatch.get(this, "PrintOddPagesInAscendingOrder").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param printOddPagesInAscendingOrder an input-parameter of type boolean
   */
  public void setPrintOddPagesInAscendingOrder(boolean printOddPagesInAscendingOrder) {
    Dispatch.put(this, "PrintOddPagesInAscendingOrder", new Variant(printOddPagesInAscendingOrder));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getPrintEvenPagesInAscendingOrder() {
    return Dispatch.get(this, "PrintEvenPagesInAscendingOrder").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param printEvenPagesInAscendingOrder an input-parameter of type boolean
   */
  public void setPrintEvenPagesInAscendingOrder(boolean printEvenPagesInAscendingOrder) {
    Dispatch.put(this, "PrintEvenPagesInAscendingOrder", new Variant(printEvenPagesInAscendingOrder));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getDefaultBorderColorIndex() {
    return Dispatch.get(this, "DefaultBorderColorIndex").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param defaultBorderColorIndex an input-parameter of type int
   */
  public void setDefaultBorderColorIndex(int defaultBorderColorIndex) {
    Dispatch.put(this, "DefaultBorderColorIndex", new Variant(defaultBorderColorIndex));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getEnableMisusedWordsDictionary() {
    return Dispatch.get(this, "EnableMisusedWordsDictionary").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param enableMisusedWordsDictionary an input-parameter of type boolean
   */
  public void setEnableMisusedWordsDictionary(boolean enableMisusedWordsDictionary) {
    Dispatch.put(this, "EnableMisusedWordsDictionary", new Variant(enableMisusedWordsDictionary));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAllowCombinedAuxiliaryForms() {
    return Dispatch.get(this, "AllowCombinedAuxiliaryForms").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param allowCombinedAuxiliaryForms an input-parameter of type boolean
   */
  public void setAllowCombinedAuxiliaryForms(boolean allowCombinedAuxiliaryForms) {
    Dispatch.put(this, "AllowCombinedAuxiliaryForms", new Variant(allowCombinedAuxiliaryForms));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getHangulHanjaFastConversion() {
    return Dispatch.get(this, "HangulHanjaFastConversion").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param hangulHanjaFastConversion an input-parameter of type boolean
   */
  public void setHangulHanjaFastConversion(boolean hangulHanjaFastConversion) {
    Dispatch.put(this, "HangulHanjaFastConversion", new Variant(hangulHanjaFastConversion));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getCheckHangulEndings() {
    return Dispatch.get(this, "CheckHangulEndings").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param checkHangulEndings an input-parameter of type boolean
   */
  public void setCheckHangulEndings(boolean checkHangulEndings) {
    Dispatch.put(this, "CheckHangulEndings", new Variant(checkHangulEndings));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getEnableHangulHanjaRecentOrdering() {
    return Dispatch.get(this, "EnableHangulHanjaRecentOrdering").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param enableHangulHanjaRecentOrdering an input-parameter of type boolean
   */
  public void setEnableHangulHanjaRecentOrdering(boolean enableHangulHanjaRecentOrdering) {
    Dispatch.put(this, "EnableHangulHanjaRecentOrdering", new Variant(enableHangulHanjaRecentOrdering));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getMultipleWordConversionsMode() {
    return Dispatch.get(this, "MultipleWordConversionsMode").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param multipleWordConversionsMode an input-parameter of type int
   */
  public void setMultipleWordConversionsMode(int multipleWordConversionsMode) {
    Dispatch.put(this, "MultipleWordConversionsMode", new Variant(multipleWordConversionsMode));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param commandKeyHelp an input-parameter of type Variant
   * @param docNavigationKeys an input-parameter of type Variant
   * @param mouseSimulation an input-parameter of type Variant
   * @param demoGuidance an input-parameter of type Variant
   * @param demoSpeed an input-parameter of type Variant
   * @param helpType an input-parameter of type Variant
   */
  public void setWPHelpOptions(Variant commandKeyHelp, Variant docNavigationKeys, Variant mouseSimulation,
                               Variant demoGuidance, Variant demoSpeed, Variant helpType) {
    Dispatch.call(this, "SetWPHelpOptions", commandKeyHelp, docNavigationKeys, mouseSimulation, demoGuidance, demoSpeed,
                  helpType);
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param commandKeyHelp an input-parameter of type Variant
   * @param docNavigationKeys an input-parameter of type Variant
   * @param mouseSimulation an input-parameter of type Variant
   * @param demoGuidance an input-parameter of type Variant
   * @param demoSpeed an input-parameter of type Variant
   */
  public void setWPHelpOptions(Variant commandKeyHelp, Variant docNavigationKeys, Variant mouseSimulation,
                               Variant demoGuidance, Variant demoSpeed) {
    Dispatch.call(this, "SetWPHelpOptions", commandKeyHelp, docNavigationKeys, mouseSimulation, demoGuidance, demoSpeed);
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param commandKeyHelp an input-parameter of type Variant
   * @param docNavigationKeys an input-parameter of type Variant
   * @param mouseSimulation an input-parameter of type Variant
   * @param demoGuidance an input-parameter of type Variant
   */
  public void setWPHelpOptions(Variant commandKeyHelp, Variant docNavigationKeys, Variant mouseSimulation,
                               Variant demoGuidance) {
    Dispatch.call(this, "SetWPHelpOptions", commandKeyHelp, docNavigationKeys, mouseSimulation, demoGuidance);
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param commandKeyHelp an input-parameter of type Variant
   * @param docNavigationKeys an input-parameter of type Variant
   * @param mouseSimulation an input-parameter of type Variant
   */
  public void setWPHelpOptions(Variant commandKeyHelp, Variant docNavigationKeys, Variant mouseSimulation) {
    Dispatch.call(this, "SetWPHelpOptions", commandKeyHelp, docNavigationKeys, mouseSimulation);
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param commandKeyHelp an input-parameter of type Variant
   * @param docNavigationKeys an input-parameter of type Variant
   */
  public void setWPHelpOptions(Variant commandKeyHelp, Variant docNavigationKeys) {
    Dispatch.call(this, "SetWPHelpOptions", commandKeyHelp, docNavigationKeys);
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param commandKeyHelp an input-parameter of type Variant
   */
  public void setWPHelpOptions(Variant commandKeyHelp) {
    Dispatch.call(this, "SetWPHelpOptions", commandKeyHelp);
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   */
  public void setWPHelpOptions() {
    Dispatch.call(this, "SetWPHelpOptions");
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getDefaultBorderColor() {
    return Dispatch.get(this, "DefaultBorderColor").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param defaultBorderColor an input-parameter of type int
   */
  public void setDefaultBorderColor(int defaultBorderColor) {
    Dispatch.put(this, "DefaultBorderColor", new Variant(defaultBorderColor));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAllowPixelUnits() {
    return Dispatch.get(this, "AllowPixelUnits").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param allowPixelUnits an input-parameter of type boolean
   */
  public void setAllowPixelUnits(boolean allowPixelUnits) {
    Dispatch.put(this, "AllowPixelUnits", new Variant(allowPixelUnits));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getUseCharacterUnit() {
    return Dispatch.get(this, "UseCharacterUnit").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param useCharacterUnit an input-parameter of type boolean
   */
  public void setUseCharacterUnit(boolean useCharacterUnit) {
    Dispatch.put(this, "UseCharacterUnit", new Variant(useCharacterUnit));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAllowCompoundNounProcessing() {
    return Dispatch.get(this, "AllowCompoundNounProcessing").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param allowCompoundNounProcessing an input-parameter of type boolean
   */
  public void setAllowCompoundNounProcessing(boolean allowCompoundNounProcessing) {
    Dispatch.put(this, "AllowCompoundNounProcessing", new Variant(allowCompoundNounProcessing));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAutoKeyboardSwitching() {
    return Dispatch.get(this, "AutoKeyboardSwitching").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param autoKeyboardSwitching an input-parameter of type boolean
   */
  public void setAutoKeyboardSwitching(boolean autoKeyboardSwitching) {
    Dispatch.put(this, "AutoKeyboardSwitching", new Variant(autoKeyboardSwitching));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getDocumentViewDirection() {
    return Dispatch.get(this, "DocumentViewDirection").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param documentViewDirection an input-parameter of type int
   */
  public void setDocumentViewDirection(int documentViewDirection) {
    Dispatch.put(this, "DocumentViewDirection", new Variant(documentViewDirection));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getArabicNumeral() {
    return Dispatch.get(this, "ArabicNumeral").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param arabicNumeral an input-parameter of type int
   */
  public void setArabicNumeral(int arabicNumeral) {
    Dispatch.put(this, "ArabicNumeral", new Variant(arabicNumeral));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getMonthNames() {
    return Dispatch.get(this, "MonthNames").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param monthNames an input-parameter of type int
   */
  public void setMonthNames(int monthNames) {
    Dispatch.put(this, "MonthNames", new Variant(monthNames));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getCursorMovement() {
    return Dispatch.get(this, "CursorMovement").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param cursorMovement an input-parameter of type int
   */
  public void setCursorMovement(int cursorMovement) {
    Dispatch.put(this, "CursorMovement", new Variant(cursorMovement));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getVisualSelection() {
    return Dispatch.get(this, "VisualSelection").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param visualSelection an input-parameter of type int
   */
  public void setVisualSelection(int visualSelection) {
    Dispatch.put(this, "VisualSelection", new Variant(visualSelection));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getShowDiacritics() {
    return Dispatch.get(this, "ShowDiacritics").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param showDiacritics an input-parameter of type boolean
   */
  public void setShowDiacritics(boolean showDiacritics) {
    Dispatch.put(this, "ShowDiacritics", new Variant(showDiacritics));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getShowControlCharacters() {
    return Dispatch.get(this, "ShowControlCharacters").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param showControlCharacters an input-parameter of type boolean
   */
  public void setShowControlCharacters(boolean showControlCharacters) {
    Dispatch.put(this, "ShowControlCharacters", new Variant(showControlCharacters));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAddControlCharacters() {
    return Dispatch.get(this, "AddControlCharacters").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param addControlCharacters an input-parameter of type boolean
   */
  public void setAddControlCharacters(boolean addControlCharacters) {
    Dispatch.put(this, "AddControlCharacters", new Variant(addControlCharacters));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAddBiDirectionalMarksWhenSavingTextFile() {
    return Dispatch.get(this, "AddBiDirectionalMarksWhenSavingTextFile").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param addBiDirectionalMarksWhenSavingTextFile an input-parameter of type boolean
   */
  public void setAddBiDirectionalMarksWhenSavingTextFile(boolean addBiDirectionalMarksWhenSavingTextFile) {
    Dispatch.put(this, "AddBiDirectionalMarksWhenSavingTextFile", new Variant(addBiDirectionalMarksWhenSavingTextFile));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getStrictInitialAlefHamza() {
    return Dispatch.get(this, "StrictInitialAlefHamza").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param strictInitialAlefHamza an input-parameter of type boolean
   */
  public void setStrictInitialAlefHamza(boolean strictInitialAlefHamza) {
    Dispatch.put(this, "StrictInitialAlefHamza", new Variant(strictInitialAlefHamza));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getStrictFinalYaa() {
    return Dispatch.get(this, "StrictFinalYaa").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param strictFinalYaa an input-parameter of type boolean
   */
  public void setStrictFinalYaa(boolean strictFinalYaa) {
    Dispatch.put(this, "StrictFinalYaa", new Variant(strictFinalYaa));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getHebrewMode() {
    return Dispatch.get(this, "HebrewMode").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param hebrewMode an input-parameter of type int
   */
  public void setHebrewMode(int hebrewMode) {
    Dispatch.put(this, "HebrewMode", new Variant(hebrewMode));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getArabicMode() {
    return Dispatch.get(this, "ArabicMode").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param arabicMode an input-parameter of type int
   */
  public void setArabicMode(int arabicMode) {
    Dispatch.put(this, "ArabicMode", new Variant(arabicMode));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAllowClickAndTypeMouse() {
    return Dispatch.get(this, "AllowClickAndTypeMouse").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param allowClickAndTypeMouse an input-parameter of type boolean
   */
  public void setAllowClickAndTypeMouse(boolean allowClickAndTypeMouse) {
    Dispatch.put(this, "AllowClickAndTypeMouse", new Variant(allowClickAndTypeMouse));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getUseGermanSpellingReform() {
    return Dispatch.get(this, "UseGermanSpellingReform").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param useGermanSpellingReform an input-parameter of type boolean
   */
  public void setUseGermanSpellingReform(boolean useGermanSpellingReform) {
    Dispatch.put(this, "UseGermanSpellingReform", new Variant(useGermanSpellingReform));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getInterpretHighAnsi() {
    return Dispatch.get(this, "InterpretHighAnsi").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param interpretHighAnsi an input-parameter of type int
   */
  public void setInterpretHighAnsi(int interpretHighAnsi) {
    Dispatch.put(this, "InterpretHighAnsi", new Variant(interpretHighAnsi));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getAddHebDoubleQuote() {
    return Dispatch.get(this, "AddHebDoubleQuote").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param addHebDoubleQuote an input-parameter of type boolean
   */
  public void setAddHebDoubleQuote(boolean addHebDoubleQuote) {
    Dispatch.put(this, "AddHebDoubleQuote", new Variant(addHebDoubleQuote));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getUseDiffDiacColor() {
    return Dispatch.get(this, "UseDiffDiacColor").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param useDiffDiacColor an input-parameter of type boolean
   */
  public void setUseDiffDiacColor(boolean useDiffDiacColor) {
    Dispatch.put(this, "UseDiffDiacColor", new Variant(useDiffDiacColor));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type int
   */
  public int getDiacriticColorVal() {
    return Dispatch.get(this, "DiacriticColorVal").changeType(Variant.VariantInt).getInt();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param diacriticColorVal an input-parameter of type int
   */
  public void setDiacriticColorVal(int diacriticColorVal) {
    Dispatch.put(this, "DiacriticColorVal", new Variant(diacriticColorVal));
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @return the result is of type boolean
   */
  public boolean getOptimizeForWord97byDefault() {
    return Dispatch.get(this, "OptimizeForWord97byDefault").changeType(Variant.VariantBoolean).getBoolean();
  }

  /**
   * Wrapper for calling the ActiveX-Method with input-parameter(s).
   * @param optimizeForWord97byDefault an input-parameter of type boolean
   */
  public void setOptimizeForWord97byDefault(boolean optimizeForWord97byDefault) {
    Dispatch.put(this, "OptimizeForWord97byDefault", new Variant(optimizeForWord97byDefault));
  }

}
