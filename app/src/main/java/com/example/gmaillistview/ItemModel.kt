package com.example.gmaillistview

data class ItemModel(val title: String, val desc: String, val date: String, val image: Int) {
    var selected: Boolean = false
}
