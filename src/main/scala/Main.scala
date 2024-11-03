import scalafx.application.JFXApp3
import scalafx.scene.Scene
import scalafx.scene.layout.StackPane
import scalafx.scene.paint.Color._
import scalafx.scene.shape.Circle
import scalafx.animation.AnimationTimer
import scalafx.scene.input.MouseEvent
import scalafx.Includes._
import scalafx.event.EventHandler
import scalafx.scene.shape.Rectangle
import scalafx.scene.text.Text
import scalafx.scene.control.Button
import scalafx.event.ActionEvent
import scalafx.scene.control.Label
import scalafx.scene.paint.Color
import scalafx.scene.text.Font
import scalafx.scene.text.Text
import scalafx.scene.text.FontWeight


object LaunchGame extends JFXApp3 {
  
  // Set up initial variables for start and end positions of mouse drag
  var startX = 0.0
  var startY = 0.0
  var velocityX = 0.0
  var velocityY = 0.0

  val friction = 0.99

  var canLaunch = false

  val circleRadius = 15
  val circle = new Circle {
    centerX = 250
    centerY = 350
    radius = circleRadius
    fill = White
  }

  override def start(): Unit = {

    stage = new JFXApp3.PrimaryStage {
      width = 600
      height = 800
      scene = new Scene {
        title = "Launch Game"
        fill = Black

        val startButton = new Button("Start Game")
        startButton.layoutX = 250
        startButton.layoutY = 350
        
        val startLabel = new Label("Launch The Ball")
        startLabel.layoutX = 150
        startLabel.layoutY = 100
        startLabel.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        startLabel.setTextFill(color(0.5, 0, 0))

        content = List(startButton, startLabel)

        startButton.onMouseClicked = (click : MouseEvent) => {
          content.removeAll()
          content = circle
        }

        onMousePressed = (mousePress : MouseEvent) => {
          if (Math.pow(mousePress.x - circle.centerX(), 2) + Math.pow(mousePress.y - circle.centerY(), 2) <= Math.pow(circleRadius, 2)) {
            startX = mousePress.x
            startY = mousePress.y
            canLaunch = true
          }
        }

        onMouseReleased = (mouseReleased: MouseEvent) => {
          if(canLaunch){
            velocityX = (mouseReleased.x - startX) * 0.1
            velocityY = (mouseReleased.y - startY) * 0.1
            canLaunch = false
          }
        }
      }
    }

    // Update the position of the circle
  val timer = AnimationTimer { _ =>
    circle.centerX = circle.centerX() + velocityX
    circle.centerY = circle.centerY() + velocityY
    velocityY += 0.1 // Simulate gravity

    //Lose momentum
    velocityX *= friction
    velocityY *= friction

    // Check for screen boundaries and reverse velocity if the circle hits the edge
    if (circle.centerX() <= circleRadius || circle.centerX() >= stage.scene().width() - circleRadius) {
      velocityX = -velocityX // Reverse X direction
      circle.centerX = Math.max(circleRadius, Math.min(circle.centerX(), stage.scene().width() - circleRadius))
    }

    if (circle.centerY() <= circleRadius || circle.centerY() >= stage.scene().height() - circleRadius) {
      velocityY = -velocityY // Reverse Y direction
      circle.centerY = Math.max(circleRadius, Math.min(circle.centerY(), stage.scene().height() - circleRadius))
    }
  }

  timer.start()
  }
}
