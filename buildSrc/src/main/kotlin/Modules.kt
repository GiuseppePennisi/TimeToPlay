object Modules {

    val mobileFeatures: Set<String>
        get() = setOf()

    const val sharedInterfaces = ":shared-interfaces"
    const val testImplementation = ":test-implementation"
    const val kotlinExtensions = ":extensions-kotlin"
    const val androidExtensions = ":extensions-android"
    const val core = ":core"
    const val navigation = ":navigation"
}