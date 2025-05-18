package com.example.izhcity_lab4.ui

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class CategoryFragmentArgs(
  public val categoryName: String,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("categoryName", this.categoryName)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("categoryName", this.categoryName)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CategoryFragmentArgs {
      bundle.setClassLoader(CategoryFragmentArgs::class.java.classLoader)
      val __categoryName : String?
      if (bundle.containsKey("categoryName")) {
        __categoryName = bundle.getString("categoryName")
        if (__categoryName == null) {
          throw IllegalArgumentException("Argument \"categoryName\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"categoryName\" is missing and does not have an android:defaultValue")
      }
      return CategoryFragmentArgs(__categoryName)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): CategoryFragmentArgs {
      val __categoryName : String?
      if (savedStateHandle.contains("categoryName")) {
        __categoryName = savedStateHandle["categoryName"]
        if (__categoryName == null) {
          throw IllegalArgumentException("Argument \"categoryName\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"categoryName\" is missing and does not have an android:defaultValue")
      }
      return CategoryFragmentArgs(__categoryName)
    }
  }
}
