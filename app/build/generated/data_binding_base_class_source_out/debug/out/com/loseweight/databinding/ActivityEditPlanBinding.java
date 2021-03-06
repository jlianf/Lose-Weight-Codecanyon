// Generated by data binding compiler. Do not edit!
package com.loseweight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.common.view.CBButtonView;
import com.loseweight.EditPlanActivity;
import com.loseweight.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityEditPlanBinding extends ViewDataBinding {
  @NonNull
  public final CBButtonView btnSave;

  @NonNull
  public final RelativeLayout llAdView;

  @NonNull
  public final LinearLayout llAdViewFacebook;

  @NonNull
  public final NestedScrollView nestedScrollView;

  @NonNull
  public final RecyclerView rvWorkOuts;

  @NonNull
  public final TopbarBinding topbar;

  @Bindable
  protected EditPlanActivity.ClickHandler mHandler;

  protected ActivityEditPlanBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CBButtonView btnSave, RelativeLayout llAdView, LinearLayout llAdViewFacebook,
      NestedScrollView nestedScrollView, RecyclerView rvWorkOuts, TopbarBinding topbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSave = btnSave;
    this.llAdView = llAdView;
    this.llAdViewFacebook = llAdViewFacebook;
    this.nestedScrollView = nestedScrollView;
    this.rvWorkOuts = rvWorkOuts;
    this.topbar = topbar;
  }

  public abstract void setHandler(@Nullable EditPlanActivity.ClickHandler handler);

  @Nullable
  public EditPlanActivity.ClickHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ActivityEditPlanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_edit_plan, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityEditPlanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityEditPlanBinding>inflateInternal(inflater, R.layout.activity_edit_plan, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityEditPlanBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_edit_plan, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityEditPlanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityEditPlanBinding>inflateInternal(inflater, R.layout.activity_edit_plan, null, false, component);
  }

  public static ActivityEditPlanBinding bind(@NonNull View view) {
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
  public static ActivityEditPlanBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityEditPlanBinding)bind(component, view, R.layout.activity_edit_plan);
  }
}
