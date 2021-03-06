package com.codingwithmitch.food2forkcompose.network.response

import com.codingwithmitch.food2forkcompose.network.model.RecipeEntity
import com.google.gson.annotations.SerializedName

class RecipeSearchResponse(

    @SerializedName("count")
    var count: Int,

    @SerializedName("results")
    var recipes: List<RecipeEntity>,
)



