package $package$

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.effect._
import scalafx.scene.layout.HBox
import scalafx.scene.paint.Color._
import scalafx.scene.paint.{LinearGradient, Stops}
import scalafx.scene.text.Text

object HelloScalaFX extends JFXApp {
  stage = new PrimaryStage {
    title = "ScalaFX Hello World"
    width = 650
    height = 450
    scene = new Scene {
      fill = Black
      content = new HBox {
        children = Seq(new Text {
          text = "Scala"
          style = "-fx-font-size: 100pt"
          fill = new LinearGradient(
            endX = 0,
            stops = Stops(PaleGreen, SeaGreen))
        }, new Text {
          text = "FX"
          style = "-fx-font-size: 100pt"
          fill = new LinearGradient(
            endX = 0,
            stops = Stops(Cyan, DodgerBlue))
          effect = new DropShadow {
            color = DodgerBlue
            radius = 25
            spread = 0.25
          }
        })
        effect = new Reflection {
          fraction = 0.5
          topOffset = -5.0
          bottomOpacity = 0.75
          input = new Lighting {
            light = new Light.Distant {
              elevation = 60
            }
          }
        }
      }
    }
  }
}

