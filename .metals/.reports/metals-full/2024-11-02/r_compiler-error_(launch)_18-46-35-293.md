file:///C:/Users/parke/OneDrive/Desktop/Launch/launch/src/main/scala/Main.scala
### scala.reflect.internal.FatalError: 
  unexpected tree: class scala.reflect.internal.Trees$Template
Scene(800, 600) {
  def <init>(): <$anon: scalafx.scene.Scene> = {
    super.<init>();
    ()
  };
  fill = Color.LightBlue;
  private[this] val <content: error>: <error> = {
    final class $anon extends StackPane {
      def <init>(): <$anon: scalafx.scene.layout.StackPane> = {
        super.<init>();
        ()
      };
      <empty>
    };
    new $anon()
  }
}
     while compiling: file:///C:/Users/parke/OneDrive/Desktop/Launch/launch/src/main/scala/Main.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.13.12
    compiler version: version 2.13.12
  reconstructed args: -classpath <WORKSPACE>\.bloop\launch\bloop-bsp-clients-classes\classes-Metals-GGDHvvT8SReZkWk_O1j2cg==;<HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.10.3\semanticdb-javac-0.10.3.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-parser-combinators_2.13\2.3.0\scala-parser-combinators_2.13-2.3.0.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalafx\scalafx_2.13\16.0.0-R24\scalafx_2.13-16.0.0-R24.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-base\16\javafx-base-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-controls\16\javafx-controls-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-fxml\16\javafx-fxml-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-graphics\16\javafx-graphics-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-media\16\javafx-media-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-swing\16\javafx-swing-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-web\16\javafx-web-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-reflect\2.13.12\scala-reflect-2.13.12.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-graphics\16\javafx-graphics-16.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-controls\16\javafx-controls-16.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-base\16\javafx-base-16.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-media\16\javafx-media-16.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Template(value <local $anon>)
       tree position: line 22 of file:///C:/Users/parke/OneDrive/Desktop/Launch/launch/src/main/scala/Main.scala
              symbol: value <local $anon>
   symbol definition: val <local $anon>: <notype> (a TermSymbol)
      symbol package: <empty>
       symbol owners: value <local $anon> -> <$anon: scalafx.scene.Scene> -> value <local $anon> -> <$anon: scalafx.application.JFXApp.PrimaryStage> -> value <local LaunchGame> -> object LaunchGame
           call site: <none> in <none>

== Source file context for tree position ==

    19   // Entry point for the application
    20   stage = new JFXApp.PrimaryStage {
    21     title = "Launch Game"
    22     scene = new Scene(800, 600) {
    23       fill = Color.LightBlue
    24       val content = new StackPane {
    25         // Add game elements (projectiles, targets, etc.) here

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.12
Classpath:
<WORKSPACE>\.bloop\launch\bloop-bsp-clients-classes\classes-Metals-GGDHvvT8SReZkWk_O1j2cg== [exists ], <HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.10.3\semanticdb-javac-0.10.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-parser-combinators_2.13\2.3.0\scala-parser-combinators_2.13-2.3.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalafx\scalafx_2.13\16.0.0-R24\scalafx_2.13-16.0.0-R24.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-base\16\javafx-base-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-controls\16\javafx-controls-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-fxml\16\javafx-fxml-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-graphics\16\javafx-graphics-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-media\16\javafx-media-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-swing\16\javafx-swing-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-web\16\javafx-web-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-reflect\2.13.12\scala-reflect-2.13.12.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-graphics\16\javafx-graphics-16.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-controls\16\javafx-controls-16.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-base\16\javafx-base-16.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-media\16\javafx-media-16.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb


action parameters:
offset: 810
uri: file:///C:/Users/parke/OneDrive/Desktop/Launch/launch/src/main/scala/Main.scala
text:
```scala
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.layout.StackPane
import scalafx.scene.paint.Color
import scalafx.scene.shape.Circle
import scalafx.animation.AnimationTimer
import scalafx.scene.input.MouseEvent

object LaunchGame extends JFXApp {

  // Game variables
  var projectiles: List[Projectile] = List()
  var targets: List[Target] = List()
  var isGameOver: Boolean = false

  // Define a StackPane for rendering
  val gamePane = new StackPane()

  // Entry point for the application
  stage = new JFXApp.PrimaryStage {
    title = "Launch Game"
    scene = new Scene(800, 600) {
      fill = Color.LightBlue
      val content = new StackPane {
        // Add game elements (projectiles, targets, etc.) here
      }

      // Handle mouse c@@lick for launching projectiles
      
      //onMousePressed = (event: MouseEvent) => {
        // Launch a projectile when the mouse is pressed
      //  launchProjectile(event.getX, event.getY)
      //}
    }
  }

  // Method to launch a projectile
  def launchProjectile(startX: Double, startY: Double): Unit = {
    val newProjectile = new Projectile(startX, startY)
    projectiles = newProjectile :: projectiles
    newProjectile.render(content.asInstanceOf[StackPane])
  }

  // Method to update game logic
  def updateGame(): Unit = {
  projectiles.foreach { projectile =>
    // Example update logic, adjust as necessary for your game
    projectile.update(projectile.x + 1, projectile.y + 1) // Move right and down
  }
  // Check for collisions and other game logic
}

  // Animation timer to refresh the game state
  val gameLoop = AnimationTimer { time =>
    if (!isGameOver) {
      updateGame()
    }
  }

  // Start the game loop
  gameLoop.start()

  // Define the Projectile class
  class Projectile(var x: Double, var y: Double) {
    // Add properties for velocity, size, etc.
    
    val shape = new Circle {
      centerX = x
      centerY = y
      radius = 10
      fill = Color.Red
    }

    // Method to render the projectile in the scene
     def update(newX: Double, newY: Double): Unit = {
      x = newX
      y = newY
      shape.centerX = x
      shape.centerY = y
    } 

    // Method to render the projectile in the scene
    def render(stackPane: StackPane): Unit = {
      stackPane.children.add(shape)
    }
  }

  // Define the Target class
  class Target(var x: Double, var y: Double) {
    // Add properties for size, hit points, etc.

    // Method to check collisions with projectiles
    def checkCollision(projectiles: List[Projectile]): Unit = {
      // Logic to check for collisions and handle hits
    }
  }

}

```



#### Error stacktrace:

```
scala.reflect.internal.Reporting.abort(Reporting.scala:70)
	scala.reflect.internal.Reporting.abort$(Reporting.scala:66)
	scala.reflect.internal.SymbolTable.abort(SymbolTable.scala:28)
	scala.tools.nsc.typechecker.Typers$Typer.typedOutsidePatternMode$1(Typers.scala:6090)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6107)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6153)
	scala.tools.nsc.typechecker.Typers$Typer.typedQualifier(Typers.scala:6251)
	scala.meta.internal.pc.PcDefinitionProvider.definitionTypedTreeAt(PcDefinitionProvider.scala:164)
	scala.meta.internal.pc.PcDefinitionProvider.definition(PcDefinitionProvider.scala:68)
	scala.meta.internal.pc.PcDefinitionProvider.definition(PcDefinitionProvider.scala:16)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$definition$1(ScalaPresentationCompiler.scala:393)
```
#### Short summary: 

scala.reflect.internal.FatalError: 
  unexpected tree: class scala.reflect.internal.Trees$Template
Scene(800, 600) {
  def <init>(): <$anon: scalafx.scene.Scene> = {
    super.<init>();
    ()
  };
  fill = Color.LightBlue;
  private[this] val <content: error>: <error> = {
    final class $anon extends StackPane {
      def <init>(): <$anon: scalafx.scene.layout.StackPane> = {
        super.<init>();
        ()
      };
      <empty>
    };
    new $anon()
  }
}
     while compiling: file:///C:/Users/parke/OneDrive/Desktop/Launch/launch/src/main/scala/Main.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.13.12
    compiler version: version 2.13.12
  reconstructed args: -classpath <WORKSPACE>\.bloop\launch\bloop-bsp-clients-classes\classes-Metals-GGDHvvT8SReZkWk_O1j2cg==;<HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.10.3\semanticdb-javac-0.10.3.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-parser-combinators_2.13\2.3.0\scala-parser-combinators_2.13-2.3.0.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalafx\scalafx_2.13\16.0.0-R24\scalafx_2.13-16.0.0-R24.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-base\16\javafx-base-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-controls\16\javafx-controls-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-fxml\16\javafx-fxml-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-graphics\16\javafx-graphics-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-media\16\javafx-media-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-swing\16\javafx-swing-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-web\16\javafx-web-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-reflect\2.13.12\scala-reflect-2.13.12.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-graphics\16\javafx-graphics-16.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-controls\16\javafx-controls-16.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-base\16\javafx-base-16.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-media\16\javafx-media-16.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Template(value <local $anon>)
       tree position: line 22 of file:///C:/Users/parke/OneDrive/Desktop/Launch/launch/src/main/scala/Main.scala
              symbol: value <local $anon>
   symbol definition: val <local $anon>: <notype> (a TermSymbol)
      symbol package: <empty>
       symbol owners: value <local $anon> -> <$anon: scalafx.scene.Scene> -> value <local $anon> -> <$anon: scalafx.application.JFXApp.PrimaryStage> -> value <local LaunchGame> -> object LaunchGame
           call site: <none> in <none>

== Source file context for tree position ==

    19   // Entry point for the application
    20   stage = new JFXApp.PrimaryStage {
    21     title = "Launch Game"
    22     scene = new Scene(800, 600) {
    23       fill = Color.LightBlue
    24       val content = new StackPane {
    25         // Add game elements (projectiles, targets, etc.) here