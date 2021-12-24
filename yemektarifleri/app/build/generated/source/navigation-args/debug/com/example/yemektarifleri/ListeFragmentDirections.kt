package com.example.yemektarifleri

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class ListeFragmentDirections private constructor() {
  public companion object {
    public fun actionListeFragmentToTarifFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_listeFragment_to_tarifFragment)
  }
}
