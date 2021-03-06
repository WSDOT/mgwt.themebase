/*
 * Copyright 2013 Daniel Kurka
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.mgwt.theme.client.uibinder;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;

import com.googlecode.mgwt.ui.client.widget.input.slider.Slider;
import com.googlecode.mgwt.ui.client.widget.input.slider.SliderAppearance;

public class SliderCustomAppearance implements SliderAppearance {

  static {
    Resources.INSTANCE.css().ensureInjected();
  }

  interface Css extends SliderCss {}

  interface Resources extends ClientBundle {

    Resources INSTANCE = GWT.create(Resources.class);

    @Source({"com/googlecode/mgwt/ui/client/widget/input/slider/slider.css", "../css/slider.css"})
    Css css();
  }

  @Override
  public SliderCss css() {
    return Resources.INSTANCE.css();
  }

  @UiTemplate("SliderBaseAppearance.ui.xml")
  interface SliderBinder extends UiBinder<Element, Slider> {
  }

  private static final SliderBinder UI_BINDER = GWT.create(SliderBinder.class);

  @Override
  public UiBinder<? extends Element, Slider> uiBinder() {
    return UI_BINDER;
  }
}
