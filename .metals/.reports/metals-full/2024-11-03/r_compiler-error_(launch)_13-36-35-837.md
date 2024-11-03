file:///C:/Users/parke/OneDrive/Desktop/Launch/launch/src/main/scala/Main.scala
### java.lang.IndexOutOfBoundsException: -1 is out of bounds (min 0, max 2)

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.12
Classpath:
<WORKSPACE>\.bloop\launch\bloop-bsp-clients-classes\classes-Metals-RlCOCw5fTR2sNhUe151nUA== [exists ], <HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.10.3\semanticdb-javac-0.10.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-parser-combinators_2.13\2.3.0\scala-parser-combinators_2.13-2.3.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalafx\scalafx_2.13\16.0.0-R24\scalafx_2.13-16.0.0-R24.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-base\16\javafx-base-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-controls\16\javafx-controls-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-fxml\16\javafx-fxml-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-graphics\16\javafx-graphics-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-media\16\javafx-media-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-swing\16\javafx-swing-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-web\16\javafx-web-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-reflect\2.13.12\scala-reflect-2.13.12.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-graphics\16\javafx-graphics-16.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-controls\16\javafx-controls-16.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-base\16\javafx-base-16.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-media\16\javafx-media-16.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb


action parameters:
uri: file:///C:/Users/parke/OneDrive/Desktop/Launch/launch/src/main/scala/Main.scala
text:
```scala
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
import scalafx.scene.text.t


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
        startLabel.layoutX = 250
        startLabel.layoutY = 100
        startLabel.setFont(Font.font("Arial", FontWeight.BOLD, 36.0));
        startLabel.setTextFill(color(0.5, 0.5, 0))

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

```



#### Error stacktrace:

```
scala.collection.mutable.ArrayBuffer.apply(ArrayBuffer.scala:106)
	scala.reflect.internal.Types$Type.findMemberInternal$1(Types.scala:1030)
	scala.reflect.internal.Types$Type.findMember(Types.scala:1035)
	scala.reflect.internal.Types$Type.memberBasedOnName(Types.scala:661)
	scala.reflect.internal.Types$Type.nonLocalMember(Types.scala:652)
	scala.tools.nsc.typechecker.Contexts$ImportInfo.importedSelectedSymbol(Contexts.scala:1926)
	scala.tools.nsc.typechecker.Contexts$SymbolLookup.apply(Contexts.scala:1523)
	scala.tools.nsc.typechecker.Contexts$Context.lookupSymbol(Contexts.scala:1286)
	scala.tools.nsc.typechecker.Typers$Typer.typedIdent$2(Typers.scala:5572)
	scala.tools.nsc.typechecker.Typers$Typer.typedIdentOrWildcard$1(Typers.scala:5631)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6095)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6153)
	scala.tools.nsc.typechecker.Typers$Typer.typedSelectOrSuperCall$1(Typers.scala:6251)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6098)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6153)
	scala.tools.nsc.typechecker.Namers$Namer.scala$tools$nsc$typechecker$Namers$Namer$$importSig(Namers.scala:1867)
	scala.tools.nsc.typechecker.Namers$Namer$ImportTypeCompleter.completeImpl(Namers.scala:910)
	scala.tools.nsc.typechecker.Namers$LockingTypeCompleter.complete(Namers.scala:2123)
	scala.tools.nsc.typechecker.Namers$LockingTypeCompleter.complete$(Namers.scala:2121)
	scala.tools.nsc.typechecker.Namers$TypeCompleterBase.complete(Namers.scala:2116)
	scala.reflect.internal.Symbols$Symbol.completeInfo(Symbols.scala:1565)
	scala.reflect.internal.Symbols$Symbol.info(Symbols.scala:1537)
	scala.reflect.internal.Symbols$Symbol.initialize(Symbols.scala:1726)
	scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:3311)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$8(Typers.scala:3470)
	scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3470)
	scala.tools.nsc.typechecker.Typers$Typer.typedPackageDef$1(Typers.scala:5743)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6063)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6153)
	scala.tools.nsc.typechecker.Analyzer$typerFactory$TyperPhase.apply(Analyzer.scala:124)
	scala.tools.nsc.Global$GlobalPhase.applyPhase(Global.scala:480)
	scala.tools.nsc.interactive.Global$TyperRun.applyPhase(Global.scala:1370)
	scala.tools.nsc.interactive.Global$TyperRun.typeCheck(Global.scala:1363)
	scala.tools.nsc.interactive.Global.typeCheck(Global.scala:680)
	scala.meta.internal.pc.Compat.$anonfun$runOutline$1(Compat.scala:57)
	scala.collection.IterableOnceOps.foreach(IterableOnce.scala:576)
	scala.collection.IterableOnceOps.foreach$(IterableOnce.scala:574)
	scala.collection.AbstractIterable.foreach(Iterable.scala:933)
	scala.meta.internal.pc.Compat.runOutline(Compat.scala:49)
	scala.meta.internal.pc.Compat.runOutline(Compat.scala:35)
	scala.meta.internal.pc.Compat.runOutline$(Compat.scala:33)
	scala.meta.internal.pc.MetalsGlobal.runOutline(MetalsGlobal.scala:36)
	scala.meta.internal.pc.ScalaCompilerWrapper.compiler(ScalaCompilerAccess.scala:19)
	scala.meta.internal.pc.ScalaCompilerWrapper.compiler(ScalaCompilerAccess.scala:14)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticTokens$1(ScalaPresentationCompiler.scala:185)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: -1 is out of bounds (min 0, max 2)