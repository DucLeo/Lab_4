fun main() {
    println(
        "w,a,s,d - Move\n" +
                "pause - Save game\n" +
                "exit - Quit game\n"
    )
    val model = Model()
    ConsoleUI(model)
    Controller(model)
}