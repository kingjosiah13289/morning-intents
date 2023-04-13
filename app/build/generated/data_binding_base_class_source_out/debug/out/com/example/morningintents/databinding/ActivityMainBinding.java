// Generated by view binder compiler. Do not edit!
package com.example.morningintents.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.morningintents.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnCall;

  @NonNull
  public final Button btnCamera;

  @NonNull
  public final Button btnEmail;

  @NonNull
  public final Button btnMpesa;

  @NonNull
  public final Button btnShare;

  @NonNull
  public final Button btnSms;

  @NonNull
  public final Button btnWebsite;

  @NonNull
  public final Button mBtnMap;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnCall,
      @NonNull Button btnCamera, @NonNull Button btnEmail, @NonNull Button btnMpesa,
      @NonNull Button btnShare, @NonNull Button btnSms, @NonNull Button btnWebsite,
      @NonNull Button mBtnMap) {
    this.rootView = rootView;
    this.btnCall = btnCall;
    this.btnCamera = btnCamera;
    this.btnEmail = btnEmail;
    this.btnMpesa = btnMpesa;
    this.btnShare = btnShare;
    this.btnSms = btnSms;
    this.btnWebsite = btnWebsite;
    this.mBtnMap = mBtnMap;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_call;
      Button btnCall = ViewBindings.findChildViewById(rootView, id);
      if (btnCall == null) {
        break missingId;
      }

      id = R.id.btn_Camera;
      Button btnCamera = ViewBindings.findChildViewById(rootView, id);
      if (btnCamera == null) {
        break missingId;
      }

      id = R.id.btn_Email;
      Button btnEmail = ViewBindings.findChildViewById(rootView, id);
      if (btnEmail == null) {
        break missingId;
      }

      id = R.id.btn_mpesa;
      Button btnMpesa = ViewBindings.findChildViewById(rootView, id);
      if (btnMpesa == null) {
        break missingId;
      }

      id = R.id.btn_share;
      Button btnShare = ViewBindings.findChildViewById(rootView, id);
      if (btnShare == null) {
        break missingId;
      }

      id = R.id.btn_Sms;
      Button btnSms = ViewBindings.findChildViewById(rootView, id);
      if (btnSms == null) {
        break missingId;
      }

      id = R.id.btn_website;
      Button btnWebsite = ViewBindings.findChildViewById(rootView, id);
      if (btnWebsite == null) {
        break missingId;
      }

      id = R.id.mBtnMap;
      Button mBtnMap = ViewBindings.findChildViewById(rootView, id);
      if (mBtnMap == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btnCall, btnCamera, btnEmail,
          btnMpesa, btnShare, btnSms, btnWebsite, mBtnMap);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}