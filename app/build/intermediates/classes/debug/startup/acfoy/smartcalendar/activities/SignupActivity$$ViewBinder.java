// Generated code from Butter Knife. Do not modify!
package startup.acfoy.smartcalendar.activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SignupActivity$$ViewBinder<T extends startup.acfoy.smartcalendar.activities.SignupActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492975, "field '_nameText'");
    target._nameText = finder.castView(view, 2131492975, "field '_nameText'");
    view = finder.findRequiredView(source, 2131492969, "field '_emailText'");
    target._emailText = finder.castView(view, 2131492969, "field '_emailText'");
    view = finder.findRequiredView(source, 2131492970, "field '_passwordText'");
    target._passwordText = finder.castView(view, 2131492970, "field '_passwordText'");
    view = finder.findRequiredView(source, 2131492976, "field '_signupButton'");
    target._signupButton = finder.castView(view, 2131492976, "field '_signupButton'");
    view = finder.findRequiredView(source, 2131492977, "field '_loginLink'");
    target._loginLink = finder.castView(view, 2131492977, "field '_loginLink'");
  }

  @Override public void unbind(T target) {
    target._nameText = null;
    target._emailText = null;
    target._passwordText = null;
    target._signupButton = null;
    target._loginLink = null;
  }
}
