// Generated by data binding compiler. Do not edit!
package com.loseweight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.common.view.CBButtonView;
import com.loseweight.R;
import com.loseweight.RestDayActivity;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityRestDayBinding extends ViewDataBinding {
  @NonNull
  public final CBButtonView btnFinish;

  @NonNull
  public final RelativeLayout llAdView;

  @NonNull
  public final LinearLayout llAdViewFacebook;

  @NonNull
  public final TopbarBinding topbar;

  @Bindable
  protected RestDayActivity.ClickHandler mHandler;

  protected ActivityRestDayBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CBButtonView btnFinish, RelativeLayout llAdView, LinearLayout llAdViewFacebook,
      TopbarBinding topbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnFinish = btnFinish;
    this.llAdView = llAdView;
    this.llAdViewFacebook = llAdViewFacebook;
    this.topbar = topbar;
  }

  public abstract void setHandler(@Nullable RestDayActivity.ClickHandler handler);

  @Nullable
  public RestDayActivity.ClickHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ActivityRestDayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_rest_day, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRestDayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityRestDayBinding>inflateInternal(inflater, R.layout.activity_rest_day, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityRestDayBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_rest_day, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRestDayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityRestDayBinding>inflateInternal(inflater, R.layout.activity_rest_day, null, false, component);
  }

  public static ActivityRestDayBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityRestDayBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityRestDayBinding)bind(component, view, R.layout.activity_rest_day);
  }
}