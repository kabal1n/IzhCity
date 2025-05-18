package com.example.izhcity_lab4.ui

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.izhcity_lab4.R
import kotlin.Int
import kotlin.String

public class CategoryFragmentDirections private constructor() {
  private data class ActionCategoryToDetail(
    public val recommendationName: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_category_to_detail

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("recommendationName", this.recommendationName)
        return result
      }
  }

  public companion object {
    public fun actionCategoryToDetail(recommendationName: String): NavDirections =
        ActionCategoryToDetail(recommendationName)
  }
}
