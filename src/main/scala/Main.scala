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
import scalafx.scene.shape.Line
import scalafx.collections.ObservableBuffer
import scalafx.scene.Node


object LaunchGame extends JFXApp3 {
  
  var score = 0

  // Set up initial variables for start and end positions of mouse drag
  var startX = 0.0
  var startY = 0.0
  var velocityX = 0.0
  var velocityY = 0.0
  val friction = 0.99
  var canLaunch = false

  val trajectoryPreview = ObservableBuffer[Circle]() // Holds trajectory points

  val circleRadius = 10
  val circle = new Circle {
    centerX = 500
    centerY = 350
    radius = circleRadius
    fill = rgb(223, 255, 0)
  }

  override def start(): Unit = {

    stage = new JFXApp3.PrimaryStage {
      width = 1200
      height = 800
      scene = new Scene {
        title = "Launch Game"
        fill = Black

        val startButton = new Button("Start Game")
        startButton.layoutX = 550
        startButton.layoutY = 350
        
        val startLabel = new Label("Launch The Ball")
        startLabel.layoutX = 450
        startLabel.layoutY = 100
        startLabel.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        startLabel.setTextFill(color(0.5, 0, 0))

        content = List(startButton, startLabel)
        
        var scoreLabel = new Label("Score: " + score)
        scoreLabel.layoutX = 30
        scoreLabel.layoutY = 700
        scoreLabel.setFont(Font.font("Arial", FontWeight.BOLD, 36))
        scoreLabel.setTextFill(color(1, 0, 1))
        
        startButton.onMouseClicked = (click : MouseEvent) => {
          content.removeAll()
          content = List(circle, scoreLabel) ++ trajectoryPreview.toList.map(_.asInstanceOf[Node])
        }

        onMousePressed = (mousePress : MouseEvent) => {
          if (Math.pow(mousePress.x - circle.centerX(), 2) + Math.pow(mousePress.y - circle.centerY(), 2) <= Math.pow(circleRadius, 2)) {
            startX = mousePress.x
            startY = mousePress.y
            canLaunch = true
            velocityX = 0
            velocityY = 0
          }
        }

        onMouseDragged = (mouseDragged: MouseEvent) => {
          if (canLaunch) {
            val dragVelocityX = (mouseDragged.x - startX) * 0.1
            val dragVelocityY = (mouseDragged.y - startY) * 0.1
            updateTrajectoryPreview(circle.centerX(), circle.centerY(), dragVelocityX, dragVelocityY)
          }
        }

        onMouseReleased = (mouseReleased: MouseEvent) => {
          if(canLaunch){
            velocityX = (mouseReleased.x - startX) * 0.1
            velocityY = (mouseReleased.y - startY) * 0.1
            canLaunch = false
            clearTrajectoryPreview()
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
      velocityX = -velocityX * 0.9 // Reverse X direction and slow
      circle.centerX = Math.max(circleRadius, Math.min(circle.centerX(), stage.scene().width() - circleRadius))
    }

    if (circle.centerY() <= circleRadius || circle.centerY() >= stage.scene().height() - circleRadius) {
      velocityY = -velocityY * 0.9 // Reverse Y direction
      circle.centerY = Math.max(circleRadius, Math.min(circle.centerY(), stage.scene().height() - circleRadius))
    }
  }

  timer.start()
  }

    // Function to update the trajectory preview
    def updateTrajectoryPreview(startX: Double, startY: Double, initialVx: Double, initialVy: Double): Unit = {
      clearTrajectoryPreview() // Clear existing trajectory points
      var x = startX
      var y = startY
      var velocityX = initialVx
      var velocityY = initialVy
      val timeStep = 0.2
  
      // Generate points along the trajectory
      for (_ <- 1 to 30) {
        x = x + (velocityX * timeStep)
        y = y + (velocityY * timeStep)
        velocityY = velocityY + (0.1 * timeStep)
        velocityX *= friction
        velocityY *= friction
  
        // Create a small circle to represent a point in the trajectory
        val point = new Circle {
          radius = 25
          fill = Color.White
          centerX = x
          centerY = y
        }
        
        println(point)
        trajectoryPreview += point
      }
    }
  
    // Function to clear the trajectory preview
    def clearTrajectoryPreview(): Unit = {
      trajectoryPreview.clear()
    }
}
