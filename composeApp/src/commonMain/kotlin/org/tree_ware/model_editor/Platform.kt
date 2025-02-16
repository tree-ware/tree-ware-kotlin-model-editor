package org.treeWare.modelEditor

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform