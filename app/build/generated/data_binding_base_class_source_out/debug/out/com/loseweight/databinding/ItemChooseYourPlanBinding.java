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
import com.common.view.CMTextView;
import com.loseweight.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemChooseYourPlanBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout container;

  @NonNull
  public final AppCompatImageView ivCheck;

  @NonNull
  public final AppCompatImageView ivIcon;

  @NonNull
  public final CMTextView tvTitle;

  protected ItemChooseYourPlanBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout container, AppCompatImageView ivCheck, AppCompatImageView ivIcon,
      CMTextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.container = container;
    this.ivCheck = ivCheck;
    this.ivIcon = ivIcon;
    this.tvTitle = tvTitle;
  }

  @NonNull
  public static ItemChooseYourPlanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_choose_your_plan, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemChooseYourPlanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemChooseYourPlanBinding>inflateInternal(inflater, R.layout.item_choose_your_plan, root, attachToRoot, component);
  }

  @NonNull
  public static ItemChooseYourPlanBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_choose_your_plan, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemChooseYourPlanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemChooseYourPlanBinding>inflateInternal(inflater, R.layout.item_choose_your_plan, null, false, component);
  }

  public static ItemChooseYourPlanBinding bind(@NonNull View view) {
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
  public static ItemChooseYourPlanBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemChooseYourPlanBinding)bind(component, view, R.layout.item_choose_your_plan);
  }
}
