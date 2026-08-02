package com.codesrahul.playnox.domain.model

enum class HomeSection(val displayName: String, val subtitle: String) {
    SHORTCUTS("Shortcuts", "Video Feed & Recycle Bin quick actions"),
    HISTORY("Watch History", "Recently watched videos & continue watching"),
    DETAILS("Library Details", "Folder & video statistics, storage analyzer")
}
