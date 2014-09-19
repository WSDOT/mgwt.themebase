package com.googlecode.mgwt.theme.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;

import com.googlecode.mgwt.ui.client.widget.header.HeaderAbstractAppearance;

public class HeaderCustomAppearance extends HeaderAbstractAppearance {

  static {
    Resources.INSTANCE.cssPanel().ensureInjected();
    Resources.INSTANCE.cssTitle().ensureInjected();
  }

  interface CssPanel extends HeaderPanelCss {}
  interface CssTitle extends HeaderTitleCss {}

  interface Resources extends ClientBundle {

    Resources INSTANCE = GWT.create(Resources.class);

    @Source({"com/googlecode/mgwt/ui/client/widget/header/header.css", "css/header.css"})
    CssPanel cssPanel();

    @Source({
        "com/googlecode/mgwt/ui/client/widget/header/header-title.css", "css/header-title.css"})
    CssTitle cssTitle();
  }

  @Override
  public HeaderPanelCss cssPanel() {
    return Resources.INSTANCE.cssPanel();
  }

  @Override
  public HeaderTitleCss cssTitle() {
    return Resources.INSTANCE.cssTitle();
  }
}
