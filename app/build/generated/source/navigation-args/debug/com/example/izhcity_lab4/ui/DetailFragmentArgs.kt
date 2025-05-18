package com.example.izhcity_lab4.ui

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class DetailFragmentArgs(
  public val recommendationName: String,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("recommendationName", this.recommendationName)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("recommendationName", this.recommendationName)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DetailFragmentArgs {
      bundle.setClassLoader(DetailFragmentArgs::class.java.classLoader)
      val __recommendationName : String?
      if (bundle.containsKey("recommendationName")) {
        __recommendationName = bundle.getString("recommendationName")
        if (__recommendationName == null) {
          throw IllegalArgumentException("Argument \"recommendationName\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"recommendationName\" is missing and does not have an android:defaultValue")
      }
      return DetailFragmentArgs(__recommendationName)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): DetailFragmentArgs {
      val __recommendationName : String?
      if (savedStateHandle.contains("recommendationName")) {
        __recommendationName = savedStateHandle["recommendationName"]
        if (__recommendationName == null) {
          throw IllegalArgumentException("Argument \"recommendationName\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"recommendationName\" is missing and does not have an android:defaultValue")
      }
      return DetailFragmentArgs(__recommendationName)
    }
  }
}
