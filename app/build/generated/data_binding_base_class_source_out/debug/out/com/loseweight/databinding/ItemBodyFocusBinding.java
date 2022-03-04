// Generated by data binding compiler. Do not edit!
package com.loseweight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.common.view.CBTextView;
import com.loseweight.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemBodyFocusBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView imgPlan;

  @NonNull
  public final LinearLayout mContainer;

  @NonNull
  public final CBTextView tvPlanName;

  protected ItemBodyFocusBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView imgPlan, LinearLayout mContainer, CBTextView tvPlanName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgPlan = imgPlan;
    this.mContainer = mContainer;
    this.tvPlanName = tvPlanName;
  }

  @NonNull
  public static ItemBodyFocusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_body_focus, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemBodyFocusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemBodyFocusBinding>inflateInternal(inflater, R.layout.item_body_focus, root, attachToRoot, component);
  }

  @NonNull
  public static ItemBodyFocusBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_body_focus, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemBodyFocusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemBodyFocusBinding>inflateInternal(inflater, R.layout.item_body_focus, null, false, component);
  }

  public static ItemBodyFocusBinding bind(@NonNull View view) {
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
  public static ItemBodyFocusBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemBodyFocusBinding)bind(component, view, R.layout.item_body_focus);
  }
}
