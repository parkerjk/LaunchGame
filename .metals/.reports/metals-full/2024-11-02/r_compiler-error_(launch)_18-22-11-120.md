file:///C:/Users/parke/OneDrive/Desktop/Launch/launch/src/main/scala/Main.scala
### scala.reflect.internal.FatalError: 
  ThisType(method checkCollision) for sym which is not a class
     while compiling: file:///C:/Users/parke/OneDrive/Desktop/Launch/launch/src/main/scala/Main.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.13.12
    compiler version: version 2.13.12
  reconstructed args: -classpath <WORKSPACE>\.bloop\launch\bloop-bsp-clients-classes\classes-Metals-GGDHvvT8SReZkWk_O1j2cg==;<HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.10.3\semanticdb-javac-0.10.3.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-parser-combinators_2.13\2.3.0\scala-parser-combinators_2.13-2.3.0.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalafx\scalafx_2.13\16.0.0-R24\scalafx_2.13-16.0.0-R24.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-base\16\javafx-base-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-controls\16\javafx-controls-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-fxml\16\javafx-fxml-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-graphics\16\javafx-graphics-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-media\16\javafx-media-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-swing\16\javafx-swing-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-web\16\javafx-web-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-reflect\2.13.12\scala-reflect-2.13.12.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-graphics\16\javafx-graphics-16.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-controls\16\javafx-controls-16.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-base\16\javafx-base-16.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-media\16\javafx-media-16.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Ident(potat_CURSOR_o)
       tree position: line 31 of file:///C:/Users/parke/OneDrive/Desktop/Launch/launch/src/main/scala/Main.scala
            tree tpe: <error>
              symbol: value <error: <none>>
   symbol definition: val <error: <none>>: <error> (a TermSymbol)
      symbol package: <empty>
       symbol owners: value <error: <none>> -> method launchProjectile -> object LaunchGame
           call site: <none> in <none>

== Source file context for tree position ==

    28   def launchProjectile(x: Double, y: Double): Unit = {
    29     // Create and add a new projectile to the game
    30     val newPotato = new Potatoe(x, y) // Placeholder constructor
    31     potat_CURSOR_o = newProjectile :: projectiles
    32     // Additional logic to handle projectile launch
    33   }
    34 

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.12
Classpath:
<WORKSPACE>\.bloop\launch\bloop-bsp-clients-classes\classes-Metals-GGDHvvT8SReZkWk_O1j2cg== [exists ], <HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.10.3\semanticdb-javac-0.10.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-parser-combinators_2.13\2.3.0\scala-parser-combinators_2.13-2.3.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalafx\scalafx_2.13\16.0.0-R24\scalafx_2.13-16.0.0-R24.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-base\16\javafx-base-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-controls\16\javafx-controls-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-fxml\16\javafx-fxml-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-graphics\16\javafx-graphics-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-media\16\javafx-media-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-swing\16\javafx-swing-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-web\16\javafx-web-16-win.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-reflect\2.13.12\scala-reflect-2.13.12.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-graphics\16\javafx-graphics-16.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-controls\16\javafx-controls-16.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-base\16\javafx-base-16.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-media\16\javafx-media-16.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb


action parameters:
offset: 887
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
  
  var potatoes: List[Potatoe] = List()
  var targets: List[Target] = List()
  var isGameOver: Boolean = false

  //Create Main Game Stage
  stage = new JFXApp.PrimaryStage {
    title = "Launch Game"
    scene = new Scene(800, 600) {
      fill = Color.LightBlue
      content = new StackPane {
        //TODO
        //Add Game Elements
      }
    }
  }

    // Method to launch a projectile
  def launchProjectile(x: Double, y: Double): Unit = {
    // Create and add a new projectile to the game
    val newPotato = new Potatoe(x, y) // Placeholder constructor
    potat@@o = newProjectile :: projectiles
    // Additional logic to handle projectile launch
  }

  // Method to update game logic
  def updateGame(): Unit = {
    // Update positions, check collisions, and handle game state
    potatoes.foreach(_.update())
    targets.foreach(_.checkCollision(potatoes))
    // Check for game over conditions
  }

  // Animation timer to refresh the game state
  val gameLoop = AnimationTimer { time =>
    if (!isGameOver) {
      updateGame()
    }
  }

  // Start the game loop
  gameLoop.start()

  // Define the Target class
  class Target(var x: Double, var y: Double) {
    // Add properties for size, hit points, etc.

    // Method to check collisions with projectiles
    def checkCollision(projectiles: List[Potato]): Unit = {
      // Logic to check for collisions and handle hits
    }
  }

    // Define the Projectile class
  class Potato(var x: Double, var y: Double) {
    // Add properties for velocity, size, etc.
    val radius = 10
    val shape = new Circle(radius) {
      fill = Color.Red
    }

    // Method to update the projectile's position
    def update(): Unit = {
      // Logic to move the projectile based on velocity and gravity
    }

    // Method to render the projectile in the scene
    def render(): Unit = {
      // Add shape to the scene
    }
  }
}
```



#### Error stacktrace:

```
scala.reflect.internal.Reporting.abort(Reporting.scala:70)
	scala.reflect.internal.Reporting.abort$(Reporting.scala:66)
	scala.reflect.internal.SymbolTable.abort(SymbolTable.scala:28)
	scala.reflect.internal.Types$ThisType.<init>(Types.scala:1394)
	scala.reflect.internal.Types$UniqueThisType.<init>(Types.scala:1414)
	scala.reflect.internal.Types$ThisType$.apply(Types.scala:1418)
	scala.meta.internal.pc.AutoImportsProvider$$anonfun$autoImports$3.applyOrElse(AutoImportsProvider.scala:75)
	scala.meta.internal.pc.AutoImportsProvider$$anonfun$autoImports$3.applyOrElse(AutoImportsProvider.scala:60)
	scala.collection.immutable.List.collect(List.scala:267)
	scala.meta.internal.pc.AutoImportsProvider.autoImports(AutoImportsProvider.scala:60)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$autoImports$1(ScalaPresentationCompiler.scala:306)
```
#### Short summary: 

scala.reflect.internal.FatalError: 
  ThisType(method checkCollision) for sym which is not a class
     while compiling: file:///C:/Users/parke/OneDrive/Desktop/Launch/launch/src/main/scala/Main.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.13.12
    compiler version: version 2.13.12
  reconstructed args: -classpath <WORKSPACE>\.bloop\launch\bloop-bsp-clients-classes\classes-Metals-GGDHvvT8SReZkWk_O1j2cg==;<HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.10.3\semanticdb-javac-0.10.3.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-parser-combinators_2.13\2.3.0\scala-parser-combinators_2.13-2.3.0.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalafx\scalafx_2.13\16.0.0-R24\scalafx_2.13-16.0.0-R24.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-base\16\javafx-base-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-controls\16\javafx-controls-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-fxml\16\javafx-fxml-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-graphics\16\javafx-graphics-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-media\16\javafx-media-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-swing\16\javafx-swing-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-web\16\javafx-web-16-win.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-reflect\2.13.12\scala-reflect-2.13.12.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-graphics\16\javafx-graphics-16.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-controls\16\javafx-controls-16.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-base\16\javafx-base-16.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\openjfx\javafx-media\16\javafx-media-16.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Ident(potat_CURSOR_o)
       tree position: line 31 of file:///C:/Users/parke/OneDrive/Desktop/Launch/launch/src/main/scala/Main.scala
            tree tpe: <error>
              symbol: value <error: <none>>
   symbol definition: val <error: <none>>: <error> (a TermSymbol)
      symbol package: <empty>
       symbol owners: value <error: <none>> -> method launchProjectile -> object LaunchGame
           call site: <none> in <none>

== Source file context for tree position ==

    28   def launchProjectile(x: Double, y: Double): Unit = {
    29     // Create and add a new projectile to the game
    30     val newPotato = new Potatoe(x, y) // Placeholder constructor
    31     potat_CURSOR_o = newProjectile :: projectiles
    32     // Additional logic to handle projectile launch
    33   }
    34 