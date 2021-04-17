fun main() {
    Application().run{ application ->
        val window = application.createWindow()
        window.isVisible = true
        window.contentPane.add(Button("Hi! :D").mainElement)
    }
}
