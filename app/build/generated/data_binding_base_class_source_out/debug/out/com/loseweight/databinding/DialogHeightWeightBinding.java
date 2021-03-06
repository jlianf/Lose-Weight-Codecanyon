// Generated by data binding compiler. Do not edit!
package com.loseweight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.common.view.CEditTextView;
import com.common.view.CTextView;
import com.loseweight.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogHeightWeightBinding extends ViewDataBinding {
  @NonNull
  public final Button btnCancel;

  @NonNull
  public final Button btnNext;

  @NonNull
  public final CEditTextView editHeightCM;

  @NonNull
  public final CEditTextView editHeightFT;

  @NonNull
  public final CEditTextView editHeightIn;

  @NonNull
  public final CEditTextView editWeight;

  @NonNull
  public final LinearLayout llInch;

  @NonNull
  public final CTextView tvCM;

  @NonNull
  public final CTextView tvIN;

  @NonNull
  public final CTextView tvKG;

  @NonNull
  public final CTextView tvLB;

  protected DialogHeightWeightBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnCancel, Button btnNext, CEditTextView editHeightCM, CEditTextView editHeightFT,
      CEditTextView editHeightIn, CEditTextView editWeight, LinearLayout llInch, CTextView tvCM,
      CTextView tvIN, CTextView tvKG, CTextView tvLB) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnCancel = btnCancel;
    this.btnNext = btnNext;
    this.editHeightCM = editHeightCM;
    this.editHeightFT = editHeightFT;
    this.editHeightIn = editHeightIn;
    this.editWeight = editWeight;
    this.llInch = llInch;
    this.tvCM = tvCM;
    this.tvIN = tvIN;
    this.tvKG = tvKG;
    this.tvLB = tvLB;
  }

  @NonNull
  public static DialogHeightWeightBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_height_weight, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogHeightWeightBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogHeightWeightBinding>inflateInternal(inflater, R.layout.dialog_height_weight, root, attachToRoot, component);
  }

  @NonNull
  public static DialogHeightWeightBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_height_weight, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogHeightWeightBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogHeightWeightBinding>inflateInternal(inflater, R.layout.dialog_height_weight, null, false, component);
  }

  public static DialogHeightWeightBinding bind(@NonNull View view) {
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
  public static DialogHeightWeightBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogHeightWeightBinding)bind(component, view, R.layout.dialog_height_weight);
  }
}
