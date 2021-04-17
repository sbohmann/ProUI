import javax.swing.JFrame
import javax.swing.SwingUtilities

class Application {
    fun run(initialize: (Application) -> Unit) {
        SwingUtilities.invokeAndWait {
            initialize(this)
        }
    }

    fun createWindow(): JFrame {
        val result = JFrame()
        result.setSize(800, 600)
        result.setLocationRelativeTo(null)
        return result
    }
}
