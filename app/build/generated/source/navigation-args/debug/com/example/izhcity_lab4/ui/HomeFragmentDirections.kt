package com.example.izhcity_lab4.ui

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.izhcity_lab4.R
import kotlin.Int
import kotlin.String

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeToCategory(
    public val categoryName: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_home_to_category

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("categoryName", this.categoryName)
        return result
      }
  }

  public companion object {
    public fun actionHomeToCategory(categoryName: String): NavDirections =
        ActionHomeToCategory(categoryName)
  }
}
