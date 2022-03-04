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
import com.loseweight.R;
import com.loseweight.VoiceOptionActivity;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityVoiceOptionsBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout llAdView;

  @NonNull
  public final LinearLayout llAdViewFacebook;

  @NonNull
  public final TopbarBinding topbar;

  @Bindable
  protected VoiceOptionActivity.ClickHandler mHandler;

  protected ActivityVoiceOptionsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RelativeLayout llAdView, LinearLayout llAdViewFacebook, TopbarBinding topbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.llAdView = llAdView;
    this.llAdViewFacebook = llAdViewFacebook;
    this.topbar = topbar;
  }

  public abstract void setHandler(@Nullable VoiceOptionActivity.ClickHandler handler);

  @Nullable
  public VoiceOptionActivity.ClickHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ActivityVoiceOptionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_voice_options, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityVoiceOptionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityVoiceOptionsBinding>inflateInternal(inflater, R.layout.activity_voice_options, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityVoiceOptionsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_voice_options, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityVoiceOptionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityVoiceOptionsBinding>inflateInternal(inflater, R.layout.activity_voice_options, null, false, component);
  }

  public static ActivityVoiceOptionsBinding bind(@NonNull View view) {
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
  public static ActivityVoiceOptionsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityVoiceOptionsBinding)bind(component, view, R.layout.activity_voice_options);
  }
}
