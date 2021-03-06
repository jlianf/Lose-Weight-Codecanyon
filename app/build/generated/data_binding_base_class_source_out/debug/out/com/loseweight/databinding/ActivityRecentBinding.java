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
import androidx.recyclerview.widget.RecyclerView;
import com.loseweight.R;
import com.loseweight.RecentActivity;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityRecentBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout llAdView;

  @NonNull
  public final LinearLayout llAdViewFacebook;

  @NonNull
  public final RecyclerView rvRecent;

  @NonNull
  public final TopbarBinding topbar;

  @Bindable
  protected RecentActivity.ClickHandler mHandler;

  protected ActivityRecentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RelativeLayout llAdView, LinearLayout llAdViewFacebook, RecyclerView rvRecent,
      TopbarBinding topbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.llAdView = llAdView;
    this.llAdViewFacebook = llAdViewFacebook;
    this.rvRecent = rvRecent;
    this.topbar = topbar;
  }

  public abstract void setHandler(@Nullable RecentActivity.ClickHandler handler);

  @Nullable
  public RecentActivity.ClickHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ActivityRecentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_recent, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRecentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityRecentBinding>inflateInternal(inflater, R.layout.activity_recent, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityRecentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_recent, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRecentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityRecentBinding>inflateInternal(inflater, R.layout.activity_recent, null, false, component);
  }

  public static ActivityRecentBinding bind(@NonNull View view) {
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
  public static ActivityRecentBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityRecentBinding)bind(component, view, R.layout.activity_recent);
  }
}
