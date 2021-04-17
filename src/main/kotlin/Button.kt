import javax.swing.JButton

class Button(text: String) : Control {
    override val mainElement: JButton = JButton()

    init {
        mainElement.text = text
    }
}
