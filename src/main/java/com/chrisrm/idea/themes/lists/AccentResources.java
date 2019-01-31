/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 Chris Magnussen and Elior Boukhobza
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 *
 */

package com.chrisrm.idea.themes.lists;

import com.google.common.collect.Sets;
import org.jetbrains.annotations.NonNls;

import java.util.Collections;
import java.util.Set;

public enum AccentResources {
  DEFAULT;

  @SuppressWarnings("DuplicateStringLiteralInspection")
  @NonNls
  public static final Set<String> ACCENT_RESOURCES = Collections.unmodifiableSet(
      Sets.newHashSet(
          "ActionButton.hoverBackground",
          "ActionButton.hoverBorderColor",
          "Button.darcula.defaultFocusedOutlineColor",
          "Button.darcula.focusedOutlineColor",
          "Button.darcula.outlineDefaultEndColor",
          "Button.darcula.outlineDefaultStartColor",
          "Button.darcula.outlineEndColor",
          "Button.darcula.outlineStartColor",
          "Button.default.focusedBorderColor",
          "Button.default.startBorderColor",
          "Button.default.endBorderColor",
          "Button.default.focusColor",
          "Button.endBorderColor",
          "Button.focusedBorderColor",
          "Button.startBorderColor",
          "CheckBox.darcula.backgroundColor1.selected",
          "CheckBox.darcula.backgroundColor2.selected",
          "CheckBox.darcula.borderColor.selected",
          "CheckBox.darcula.disabledBorderColor.selected",
          "CheckBox.darcula.focused.backgroundColor1.selected",
          "CheckBox.darcula.focused.backgroundColor2.selected",
          "CheckBox.darcula.focusedArmed.backgroundColor1.selected",
          "CheckBox.darcula.focusedArmed.backgroundColor2.selected",
          "CompletionPopup.matchForeground",
          "CompletionPopup.matchSelectedForeground",
          "CompletionPopup.matchSelectionForeground",
          "Component.focusColor",
          "Component.focusedBorderColor",
          "Counter.background",
          "EditorPane.caretForeground",
          "EditorTabs.active.underlineColor",
          "Focus.borderColor",
          "Focus.color",
          "Focus.Color",
          "Focus.defaultButtonBorderColor",
          "FormattedTextField.caretForeground",
          "Git.Log.Ref.LocalBranch",
          "Hg.Log.Ref.Branch",
          "Hyperlink.linkColor",
          "Label.errorForeground",
          "Link.activeForeground",
          "Link.hoverForeground",
          "Link.pressedForeground",
          "Link.visitedForeground",
          "link.foreground",
          "link.hover.foreground",
          "link.pressed.foreground",
          "link.visited.foreground",
          "material.tab.borderColor",
          "NavBar.selectedColor",
          "Notification.errorForeground",
          "Notification.Error.foreground",
          "Notification.linkForeground", // deprecated
          "Notification.Link.foreground", //deprecated
          "Notification.ToolWindow.errorForeground",
          "Notification.ToolWindow.infoForeground", // deprecated
          "Notification.ToolWindow.informativeForeground",
          "Notification.ToolWindow.warningForeground",
          "Notification.ToolWindowError.foreground",
          "Notification.ToolWindowInfo.foreground",
          "Notification.ToolWindowWarning.foreground",
          "ParameterInfo.highlightedColor", //deprecated
          "ParameterInfo.currentParameterForeground",
          "PasswordField.caretForeground",
          "Plugins.tagForeground",
          "Popup.Advertiser.foreground",
          "ProgressBar.foreground",
          "ProgressBar.indeterminateStartColor",
          "ProgressBar.indeterminateEndColor",
          "ProgressBar.progressColor",
          "RadioButton.darcula.selectionDisabledShadowColor", // deprecated
          "RadioButton.darcula.selectionEnabledColor", // deprecated
          "RadioButton.darcula.selectionEnabledShadowColor", // deprecated
          "RadioButton.selectionDisabledShadowColor",
          "RadioButton.selectionEnabledColor",
          "RadioButton.selectionEnabledShadowColor",
          "RadioButton.focusColor",
          "ScrollBar.Thumb.Hovered.background", // deprecated
          "ScrollBar.Thumb.NonOpaque.Hovered.background", // deprecated
          "SearchEverywhere.Advertiser.foreground",
          "SearchMatch.endBackground",
          "SearchMatch.endColor",
          "SearchMatch.startBackground",
          "SearchMatch.startColor",
          "Slider.thumb",
          "ComboBox.darcula.hoveredArrowButtonForeground",
          "TabbedPane.selectedСolor",
          "TextArea.caretForeground",
          "TextField.caretForeground",
          "TextField.selectedSeparatorColor",
          "TextPane.caretForeground",
          "ToggleButton.on.foreground", // deprecated
          "ToggleButton.on.background", // deprecated
          "ToggleButton.onBackground",
          "ToggleButton.onForeground"
      ));

  @NonNls
  public static final Set<String> ACCENT_EXTRA_RESOURCES = Collections.unmodifiableSet(
      Sets.newHashSet(
          "Button.focus",
          "Button.default.startBackground",
          "Button.default.endBackground"
      ));

  @NonNls
  public static final Set<String> SCROLLBAR_RESOURCES = Collections.unmodifiableSet(
      Sets.newHashSet(
          "ScrollBar.thumbColor",
          "ScrollBar.thumbBorderColor",
          "ScrollBar.Transparent.thumbColor",
          "ScrollBar.Transparent.thumbBorderColor",
          "ScrollBar.Mac.thumbColor",
          "ScrollBar.Mac.thumbBorderColor",
          "ScrollBar.Mac.Transparent.thumbColor",
          "ScrollBar.Mac.Transparent.thumbBorderColor"
      )
  );

  @NonNls
  public static final Set<String> SCROLLBAR_HOVER_RESOURCES = Collections.unmodifiableSet(
      Sets.newHashSet(
          "ScrollBar.hoverThumbColor",
          "ScrollBar.hoverThumbBorderColor",
          "ScrollBar.Transparent.hoverThumbColor",
          "ScrollBar.Transparent.hoverThumbBorderColor",
          "ScrollBar.Mac.hoverThumbColor",
          "ScrollBar.Mac.hoverThumbBorderColor",
          "ScrollBar.Mac.Transparent.hoverThumbColor",
          "ScrollBar.Mac.Transparent.hoverThumbBorderColor"
      )
  );
}
