import java.util.function.Consumer
import javax.swing.JFrame
import javax.swing.SwingUtilities

class Application {
    fun run(initialize: Consumer<Application>) {
        SwingUtilities.invokeAndWait {
            initialize.accept(this)
        }
    }

    fun createWindow(): JFrame {
        val result = JFrame()
        result.setSize(800, 600)
        result.setLocationRelativeTo(null)
        return result
    }
}
