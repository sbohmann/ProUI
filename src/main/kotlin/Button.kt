import javax.swing.JButton

class Button(text: String) : HasMainElement {
    override val mainElement: JButton = JButton()

    init {
        mainElement.text = text
    }
}
