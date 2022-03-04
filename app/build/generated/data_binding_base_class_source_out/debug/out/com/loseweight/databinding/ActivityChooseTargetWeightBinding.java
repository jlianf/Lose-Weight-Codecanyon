// Generated by data binding compiler. Do not edit!
package com.loseweight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.common.view.CBButtonView;
import com.common.view.CTextView;
import com.common.view.numberpicker.NumberPicker;
import com.loseweight.R;
import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityChooseTargetWeightBinding extends ViewDataBinding {
  @NonNull
  public final CBButtonView btnNext;

  @NonNull
  public final AppCompatImageView imgBack;

  @NonNull
  public final NumberPicker npWeight;

  @NonNull
  public final NumberPicker npWeightUnit;

  @NonNull
  public final CTextView tvSkip;

  @Bindable
  protected Boolean mIsLoading;

  protected ActivityChooseTargetWeightBinding(Object _bindingComponent, View _root,
      int _localFieldCount, CBButtonView btnNext, AppCompatImageView imgBack, NumberPicker npWeight,
      NumberPicker npWeightUnit, CTextView tvSkip) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnNext = btnNext;
    this.imgBack = imgBack;
    this.npWeight = npWeight;
    this.npWeightUnit = npWeightUnit;
    this.tvSkip = tvSkip;
  }

  public abstract void setIsLoading(@Nullable Boolean isLoading);

  @Nullable
  public Boolean getIsLoading() {
    return mIsLoading;
  }

  @NonNull
  public static ActivityChooseTargetWeightBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_choose_target_weight, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityChooseTargetWeightBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityChooseTargetWeightBinding>inflateInternal(inflater, R.layout.activity_choose_target_weight, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityChooseTargetWeightBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_choose_target_weight, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityChooseTargetWeightBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityChooseTargetWeightBinding>inflateInternal(inflater, R.layout.activity_choose_target_weight, null, false, component);
  }

  public static ActivityChooseTargetWeightBinding bind(@NonNull View view) {
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
  public static ActivityChooseTargetWeightBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityChooseTargetWeightBinding)bind(component, view, R.layout.activity_choose_target_weight);
  }
}