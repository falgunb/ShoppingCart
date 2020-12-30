package com.example.ui.shoppinglist

import com.example.data.db.entities.ShoppingItem

interface AddDialogeListener {
    fun onAddButtonClicked(item: ShoppingItem)
}