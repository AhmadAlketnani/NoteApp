package com.plcoding.cleanarchitecturenoteapp.feature_note.persentation.add_edit_note

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
